//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 03:09:32 PM COT 
//


package org.coderic.model.iso20022.caaa;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PostalAddress22 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PostalAddress22"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdrTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}AddressType2Code" minOccurs="0"/&gt;
 *         &lt;element name="Dept" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="SubDept" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="AdrLine" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max70Text" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="StrtNm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="BldgNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max16Text" minOccurs="0"/&gt;
 *         &lt;element name="PstCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max16Text" minOccurs="0"/&gt;
 *         &lt;element name="TwnNm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="CtrySubDvsn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="CtryCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Min2Max3AlphaText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress22", propOrder = {
    "adrTp",
    "dept",
    "subDept",
    "adrLine",
    "strtNm",
    "bldgNb",
    "pstCd",
    "twnNm",
    "ctrySubDvsn",
    "ctryCd"
})
public class PostalAddress22 {

    @XmlElement(name = "AdrTp")
    @XmlSchemaType(name = "string")
    protected AddressType2Code adrTp;
    @XmlElement(name = "Dept")
    protected String dept;
    @XmlElement(name = "SubDept")
    protected String subDept;
    @XmlElement(name = "AdrLine")
    protected List<String> adrLine;
    @XmlElement(name = "StrtNm")
    protected String strtNm;
    @XmlElement(name = "BldgNb")
    protected String bldgNb;
    @XmlElement(name = "PstCd")
    protected String pstCd;
    @XmlElement(name = "TwnNm")
    protected String twnNm;
    @XmlElement(name = "CtrySubDvsn")
    protected List<String> ctrySubDvsn;
    @XmlElement(name = "CtryCd")
    protected String ctryCd;

    /**
     * Obtiene el valor de la propiedad adrTp.
     * 
     * @return
     *     possible object is
     *     {@link AddressType2Code }
     *     
     */
    public AddressType2Code getAdrTp() {
        return adrTp;
    }

    /**
     * Define el valor de la propiedad adrTp.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType2Code }
     *     
     */
    public void setAdrTp(AddressType2Code value) {
        this.adrTp = value;
    }

    /**
     * Obtiene el valor de la propiedad dept.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept() {
        return dept;
    }

    /**
     * Define el valor de la propiedad dept.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDept(String value) {
        this.dept = value;
    }

    /**
     * Obtiene el valor de la propiedad subDept.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDept() {
        return subDept;
    }

    /**
     * Define el valor de la propiedad subDept.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDept(String value) {
        this.subDept = value;
    }

    /**
     * Gets the value of the adrLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the adrLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdrLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdrLine() {
        if (adrLine == null) {
            adrLine = new ArrayList<String>();
        }
        return this.adrLine;
    }

    /**
     * Obtiene el valor de la propiedad strtNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtNm() {
        return strtNm;
    }

    /**
     * Define el valor de la propiedad strtNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrtNm(String value) {
        this.strtNm = value;
    }

    /**
     * Obtiene el valor de la propiedad bldgNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldgNb() {
        return bldgNb;
    }

    /**
     * Define el valor de la propiedad bldgNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldgNb(String value) {
        this.bldgNb = value;
    }

    /**
     * Obtiene el valor de la propiedad pstCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstCd() {
        return pstCd;
    }

    /**
     * Define el valor de la propiedad pstCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstCd(String value) {
        this.pstCd = value;
    }

    /**
     * Obtiene el valor de la propiedad twnNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwnNm() {
        return twnNm;
    }

    /**
     * Define el valor de la propiedad twnNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwnNm(String value) {
        this.twnNm = value;
    }

    /**
     * Gets the value of the ctrySubDvsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ctrySubDvsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrySubDvsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCtrySubDvsn() {
        if (ctrySubDvsn == null) {
            ctrySubDvsn = new ArrayList<String>();
        }
        return this.ctrySubDvsn;
    }

    /**
     * Obtiene el valor de la propiedad ctryCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryCd() {
        return ctryCd;
    }

    /**
     * Define el valor de la propiedad ctryCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryCd(String value) {
        this.ctryCd = value;
    }

}
