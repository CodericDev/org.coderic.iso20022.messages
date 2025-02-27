//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:53:44 PM COT 
//


package org.coderic.iso20022.messages.catp;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DetailedAmount18 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetailedAmount18"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ImpliedCurrencyAndAmount"/&gt;
 *         &lt;element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ActiveCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="ChrgAcctTo" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="Labl" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max70Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedAmount18", propOrder = {
    "amt",
    "ccy",
    "chrgAcctTo",
    "labl"
})
public class DetailedAmount18 {

    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "ChrgAcctTo")
    protected Boolean chrgAcctTo;
    @XmlElement(name = "Labl")
    protected String labl;

    /**
     * Obtiene el valor de la propiedad amt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Define el valor de la propiedad amt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Obtiene el valor de la propiedad ccy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Define el valor de la propiedad ccy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Obtiene el valor de la propiedad chrgAcctTo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChrgAcctTo() {
        return chrgAcctTo;
    }

    /**
     * Define el valor de la propiedad chrgAcctTo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChrgAcctTo(Boolean value) {
        this.chrgAcctTo = value;
    }

    /**
     * Obtiene el valor de la propiedad labl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabl() {
        return labl;
    }

    /**
     * Define el valor de la propiedad labl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabl(String value) {
        this.labl = value;
    }

}
