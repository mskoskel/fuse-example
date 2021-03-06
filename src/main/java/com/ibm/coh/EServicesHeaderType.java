//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.08.28 at 11:19:14 AM EEST 
//


package com.ibm.coh;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for eServicesHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eServicesHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CaseID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServiceVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FormVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FormTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FormTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eServicesHeaderType", propOrder = {
    "serviceId",
    "caseID",
    "serviceVersion",
    "formVersion",
    "formTitle",
    "status",
    "formTimestamp"
})
public class EServicesHeaderType {

    @XmlElement(name = "ServiceId", required = true)
    protected String serviceId;
    @XmlElement(name = "CaseID", required = true)
    protected String caseID;
    @XmlElement(name = "ServiceVersion", required = true)
    protected String serviceVersion;
    @XmlElement(name = "FormVersion", required = true)
    protected String formVersion;
    @XmlElement(name = "FormTitle", required = true)
    protected String formTitle;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "FormTimestamp", required = true)
    protected XMLGregorianCalendar formTimestamp;
    
    //TODO: investigate
    protected boolean isNew = true;

    /**
     * Gets the value of the serviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the caseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseID() {
        return caseID;
    }

    /**
     * Sets the value of the caseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseID(String value) {
        this.caseID = value;
    }

    /**
     * Gets the value of the serviceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceVersion() {
        return serviceVersion;
    }

    /**
     * Sets the value of the serviceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceVersion(String value) {
        this.serviceVersion = value;
    }

    /**
     * Gets the value of the formVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormVersion() {
        return formVersion;
    }

    /**
     * Sets the value of the formVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormVersion(String value) {
        this.formVersion = value;
    }

    /**
     * Gets the value of the formTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormTitle() {
        return formTitle;
    }

    /**
     * Sets the value of the formTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormTitle(String value) {
        this.formTitle = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the formTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFormTimestamp() {
        return formTimestamp;
    }

    /**
     * Sets the value of the formTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFormTimestamp(XMLGregorianCalendar value) {
        this.formTimestamp = value;
    }

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
    
    

}
