//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.02 at 03:27:29 PM EET 
//


package com.hesham.maven.virgo.jaxb.plan;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for plan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="plan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="attributes" type="{http://www.eclipse.org/virgo/schema/plan}attributesType"/>
 *         &lt;/sequence>
 *         &lt;sequence maxOccurs="unbounded">
 *           &lt;element name="artifact" type="{http://www.eclipse.org/virgo/schema/plan}artifactType"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="\d+(\.\d+(\.\d+(\.([\w_-])+)?)?)?"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="scoped" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="atomic" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="provisioning" type="{http://www.w3.org/2001/XMLSchema}string" default="inherit" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan", namespace = "http://www.eclipse.org/virgo/schema/plan", propOrder = {
    "attributes",
    "artifact"
})
public class Plan {

    @XmlElement(namespace = "http://www.eclipse.org/virgo/schema/plan")
    protected AttributesType attributes;
    @XmlElement(namespace = "http://www.eclipse.org/virgo/schema/plan", required = true)
    protected List<ArtifactType> artifact;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute(required = true)
    protected String version;
    @XmlAttribute(required = true)
    protected boolean scoped;
    @XmlAttribute(required = true)
    protected boolean atomic;
    @XmlAttribute
    protected String provisioning;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link AttributesType }
     *     
     */
    public AttributesType getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributesType }
     *     
     */
    public void setAttributes(AttributesType value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the artifact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artifact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtifact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArtifactType }
     * 
     * 
     */
    public List<ArtifactType> getArtifact() {
        if (artifact == null) {
            artifact = new ArrayList<ArtifactType>();
        }
        return this.artifact;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the scoped property.
     * 
     */
    public boolean isScoped() {
        return scoped;
    }

    /**
     * Sets the value of the scoped property.
     * 
     */
    public void setScoped(boolean value) {
        this.scoped = value;
    }

    /**
     * Gets the value of the atomic property.
     * 
     */
    public boolean isAtomic() {
        return atomic;
    }

    /**
     * Sets the value of the atomic property.
     * 
     */
    public void setAtomic(boolean value) {
        this.atomic = value;
    }

    /**
     * Gets the value of the provisioning property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvisioning() {
        if (provisioning == null) {
            return "inherit";
        } else {
            return provisioning;
        }
    }

    /**
     * Sets the value of the provisioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisioning(String value) {
        this.provisioning = value;
    }

}
