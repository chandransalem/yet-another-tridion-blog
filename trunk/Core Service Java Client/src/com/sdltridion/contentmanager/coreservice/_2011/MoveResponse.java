
package com.sdltridion.contentmanager.coreservice._2011;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sdltridion.contentmanager.r6.RepositoryLocalObjectData;


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
 *         &lt;element name="MoveResult" type="{http://www.sdltridion.com/ContentManager/R6}RepositoryLocalObjectData" minOccurs="0"/>
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
    "moveResult"
})
@XmlRootElement(name = "MoveResponse")
public class MoveResponse {

    @XmlElement(name = "MoveResult", nillable = true)
    protected RepositoryLocalObjectData moveResult;

    /**
     * Gets the value of the moveResult property.
     * 
     * @return
     *     possible object is
     *     {@link RepositoryLocalObjectData }
     *     
     */
    public RepositoryLocalObjectData getMoveResult() {
        return moveResult;
    }

    /**
     * Sets the value of the moveResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepositoryLocalObjectData }
     *     
     */
    public void setMoveResult(RepositoryLocalObjectData value) {
        this.moveResult = value;
    }

}
