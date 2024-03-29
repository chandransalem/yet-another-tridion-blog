package net.mitza.rel.core;

import net.mitza.rel.base.AdapterTag;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.tridion.tcdl.OutputDocument;
import com.tridion.tcdl.TCDLTransformerException;
import com.tridion.tcdl.Tag;
import com.tridion.tcdl.TransformContext;

/*
 * Simple conditional tag, which evalutes its body if the supplied condition is true
 * 
 * <c:if test="expr">
 *     Do something
 * </c:if>
 */
public class IfTag extends AdapterTag {

	private static Logger log = LoggerFactory.getLogger(IfTag.class);

	private String test; // conditional expression evaluating to boolean value

	@Override
	public int doStartTag(Tag tag, StringBuffer tagBody, TransformContext context, OutputDocument target)
			throws TCDLTransformerException {
		super.doStartTag(tag, tagBody, context, target);
		if (shouldSkipEvaluation(context)) { // if current tag is nested
			shouldBuildOriginalTag = true;
			return Tag.CONTINUE_TAG_EVALUATION;
		}

		boolean condition = evaluateCondition(test, context);
		if (condition) {
			setSkipEvaluation(context);
			return Tag.CONTINUE_TAG_EVALUATION;
		} else {
			return Tag.SKIP_TAG;
		}
	}

	@Override
	public String doEndTag(Tag tag, StringBuffer tagBody, TransformContext context, OutputDocument target)
			throws TCDLTransformerException {
		if (shouldBuildOriginalTag) { // if current tag is nested
			return buildOriginalTag(tag, tagBody, context, target);
		}

		removeSkipEvaluation(context);
		String body = evaluateBody(tagBody.toString(), context);
		log.debug("Appending tag body to output '{}'", body);

		return body.toString();
	}

	public void setRequiredTest(String test) {
		this.test = test;
	}
}
