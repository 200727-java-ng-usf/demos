package com.revature.generated;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="updatedCard" type="{http://revature.com}flashCard"/>
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
    "updatedCard"
})
@XmlRootElement(name = "updateFlashCardRequest")
public class UpdateFlashCardRequest {

    @XmlElement(required = true)
    protected FlashCard updatedCard;

    /**
     * Gets the value of the updatedCard property.
     * 
     * @return
     *     possible object is
     *     {@link FlashCard }
     *     
     */
    public FlashCard getUpdatedCard() {
        return updatedCard;
    }

    /**
     * Sets the value of the updatedCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlashCard }
     *     
     */
    public void setUpdatedCard(FlashCard value) {
        this.updatedCard = value;
    }

}
