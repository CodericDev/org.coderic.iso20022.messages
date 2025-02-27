//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:53:34 PM COT 
//


package org.coderic.iso20022.messages.casr;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResultData7 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResultData7"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rslt" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}Response8Code" minOccurs="0"/&gt;
 *         &lt;element name="OthrRslt" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RsltDtls" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}ISO8583ResponseCode"/&gt;
 *         &lt;element name="OthrRsltDtls" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TempScrCardDataReusePrtd" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="AddtlRsltInf" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultData7", propOrder = {
    "rslt",
    "othrRslt",
    "rsltDtls",
    "othrRsltDtls",
    "tempScrCardDataReusePrtd",
    "addtlRsltInf"
})
public class ResultData7 {

    @XmlElement(name = "Rslt")
    @XmlSchemaType(name = "string")
    protected Response8Code rslt;
    @XmlElement(name = "OthrRslt")
    protected String othrRslt;
    @XmlElement(name = "RsltDtls", required = true)
    protected String rsltDtls;
    @XmlElement(name = "OthrRsltDtls")
    protected String othrRsltDtls;
    @XmlElement(name = "TempScrCardDataReusePrtd")
    protected Boolean tempScrCardDataReusePrtd;
    @XmlElement(name = "AddtlRsltInf")
    protected List<AdditionalData1> addtlRsltInf;

    /**
     * Obtiene el valor de la propiedad rslt.
     * 
     * @return
     *     possible object is
     *     {@link Response8Code }
     *     
     */
    public Response8Code getRslt() {
        return rslt;
    }

    /**
     * Define el valor de la propiedad rslt.
     * 
     * @param value
     *     allowed object is
     *     {@link Response8Code }
     *     
     */
    public void setRslt(Response8Code value) {
        this.rslt = value;
    }

    /**
     * Obtiene el valor de la propiedad othrRslt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRslt() {
        return othrRslt;
    }

    /**
     * Define el valor de la propiedad othrRslt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrRslt(String value) {
        this.othrRslt = value;
    }

    /**
     * Obtiene el valor de la propiedad rsltDtls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsltDtls() {
        return rsltDtls;
    }

    /**
     * Define el valor de la propiedad rsltDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsltDtls(String value) {
        this.rsltDtls = value;
    }

    /**
     * Obtiene el valor de la propiedad othrRsltDtls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRsltDtls() {
        return othrRsltDtls;
    }

    /**
     * Define el valor de la propiedad othrRsltDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrRsltDtls(String value) {
        this.othrRsltDtls = value;
    }

    /**
     * Obtiene el valor de la propiedad tempScrCardDataReusePrtd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempScrCardDataReusePrtd() {
        return tempScrCardDataReusePrtd;
    }

    /**
     * Define el valor de la propiedad tempScrCardDataReusePrtd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTempScrCardDataReusePrtd(Boolean value) {
        this.tempScrCardDataReusePrtd = value;
    }

    /**
     * Gets the value of the addtlRsltInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlRsltInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRsltInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlRsltInf() {
        if (addtlRsltInf == null) {
            addtlRsltInf = new ArrayList<AdditionalData1>();
        }
        return this.addtlRsltInf;
    }

}
