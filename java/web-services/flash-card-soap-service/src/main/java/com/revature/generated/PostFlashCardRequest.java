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
 *         &lt;element name="newCard" type="{http://revature.com}flashCard"/>
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
    "newCard"
})
@XmlRootElement(name = "postFlashCardRequest")
public class PostFlashCardRequest {

    @XmlElement(required = true)
    protected FlashCard newCard;

    /**
     * Gets the value of the newCard property.
     * 
     * @return
     *     possible object is
     *     {@link FlashCard }
     *     
     */
    public FlashCard getNewCard() {
        return newCard;
    }

    /**
     * Sets the value of the newCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlashCard }
     *     
     */
    public void setNewCard(FlashCard value) {
        this.newCard = value;
    }

}
