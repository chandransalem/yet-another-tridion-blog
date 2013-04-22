
package com.sdltridion.contentmanager.coreservice._2012;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sdltridion.contentmanager.r6.PredefinedBatchOperation;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParsePredefinedBatchOperationResult" type="{http://www.sdltridion.com/ContentManager/R6}PredefinedBatchOperation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parsePredefinedBatchOperationResult"
})
@XmlRootElement(name = "ParsePredefinedBatchOperationResponse")
public class ParsePredefinedBatchOperationResponse {

    @XmlElement(name = "ParsePredefinedBatchOperationResult", nillable = true)
    protected PredefinedBatchOperation parsePredefinedBatchOperationResult;

    /**
     * Gets the value of the parsePredefinedBatchOperationResult property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedBatchOperation }
     *     
     */
    public PredefinedBatchOperation getParsePredefinedBatchOperationResult() {
        return parsePredefinedBatchOperationResult;
    }

    /**
     * Sets the value of the parsePredefinedBatchOperationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedBatchOperation }
     *     
     */
    public void setParsePredefinedBatchOperationResult(PredefinedBatchOperation value) {
        this.parsePredefinedBatchOperationResult = value;
    }

}
