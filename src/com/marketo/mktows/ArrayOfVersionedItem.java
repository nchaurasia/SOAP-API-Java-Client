
package com.marketo.mktows;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVersionedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVersionedItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="versionedItem" type="{http://www.marketo.com/mktows/}VersionedItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVersionedItem", propOrder = {
    "versionedItems"
})
public class ArrayOfVersionedItem {

    @XmlElement(name = "versionedItem")
    protected List<VersionedItem> versionedItems;

    /**
     * Gets the value of the versionedItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the versionedItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVersionedItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VersionedItem }
     * 
     * 
     */
    public List<VersionedItem> getVersionedItems() {
        if (versionedItems == null) {
            versionedItems = new ArrayList<VersionedItem>();
        }
        return this.versionedItems;
    }

}
