
package com.sdltridion.contentmanager.coreservice._2012;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="BatchUndoCheckOutResult" type="{http://www.sdltridion.com/ContentManager/R6}TcmUri" minOccurs="0"/>
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
    "batchUndoCheckOutResult"
})
@XmlRootElement(name = "BatchUndoCheckOutResponse")
public class BatchUndoCheckOutResponse {

    @XmlElement(name = "BatchUndoCheckOutResult", nillable = true)
    protected String batchUndoCheckOutResult;

    /**
     * Gets the value of the batchUndoCheckOutResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchUndoCheckOutResult() {
        return batchUndoCheckOutResult;
    }

    /**
     * Sets the value of the batchUndoCheckOutResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchUndoCheckOutResult(String value) {
        this.batchUndoCheckOutResult = value;
    }

}
