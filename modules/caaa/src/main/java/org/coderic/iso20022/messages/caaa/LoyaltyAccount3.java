//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:27 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LoyaltyAccount3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyAccount3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LltyId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text"/&gt;
 *         &lt;element name="NtryMd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}CardDataReading8Code" minOccurs="0"/&gt;
 *         &lt;element name="IdTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}CardIdentificationType1Code" minOccurs="0"/&gt;
 *         &lt;element name="Brnd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Prvdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="OwnrNm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max45Text" minOccurs="0"/&gt;
 *         &lt;element name="Unit" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}AmountUnit1Code" minOccurs="0"/&gt;
 *         &lt;element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ActiveCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyAccount3", propOrder = {
    "lltyId",
    "ntryMd",
    "idTp",
    "brnd",
    "prvdr",
    "ownrNm",
    "unit",
    "ccy",
    "bal"
})
public class LoyaltyAccount3 {

    @XmlElement(name = "LltyId", required = true)
    protected String lltyId;
    @XmlElement(name = "NtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading8Code ntryMd;
    @XmlElement(name = "IdTp")
    @XmlSchemaType(name = "string")
    protected CardIdentificationType1Code idTp;
    @XmlElement(name = "Brnd")
    protected String brnd;
    @XmlElement(name = "Prvdr")
    protected String prvdr;
    @XmlElement(name = "OwnrNm")
    protected String ownrNm;
    @XmlElement(name = "Unit")
    @XmlSchemaType(name = "string")
    protected AmountUnit1Code unit;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Bal")
    protected BigDecimal bal;

    /**
     * Obtiene el valor de la propiedad lltyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLltyId() {
        return lltyId;
    }

    /**
     * Define el valor de la propiedad lltyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLltyId(String value) {
        this.lltyId = value;
    }

    /**
     * Obtiene el valor de la propiedad ntryMd.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading8Code }
     *     
     */
    public CardDataReading8Code getNtryMd() {
        return ntryMd;
    }

    /**
     * Define el valor de la propiedad ntryMd.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading8Code }
     *     
     */
    public void setNtryMd(CardDataReading8Code value) {
        this.ntryMd = value;
    }

    /**
     * Obtiene el valor de la propiedad idTp.
     * 
     * @return
     *     possible object is
     *     {@link CardIdentificationType1Code }
     *     
     */
    public CardIdentificationType1Code getIdTp() {
        return idTp;
    }

    /**
     * Define el valor de la propiedad idTp.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIdentificationType1Code }
     *     
     */
    public void setIdTp(CardIdentificationType1Code value) {
        this.idTp = value;
    }

    /**
     * Obtiene el valor de la propiedad brnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnd() {
        return brnd;
    }

    /**
     * Define el valor de la propiedad brnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrnd(String value) {
        this.brnd = value;
    }

    /**
     * Obtiene el valor de la propiedad prvdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdr() {
        return prvdr;
    }

    /**
     * Define el valor de la propiedad prvdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvdr(String value) {
        this.prvdr = value;
    }

    /**
     * Obtiene el valor de la propiedad ownrNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnrNm() {
        return ownrNm;
    }

    /**
     * Define el valor de la propiedad ownrNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnrNm(String value) {
        this.ownrNm = value;
    }

    /**
     * Obtiene el valor de la propiedad unit.
     * 
     * @return
     *     possible object is
     *     {@link AmountUnit1Code }
     *     
     */
    public AmountUnit1Code getUnit() {
        return unit;
    }

    /**
     * Define el valor de la propiedad unit.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountUnit1Code }
     *     
     */
    public void setUnit(AmountUnit1Code value) {
        this.unit = value;
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
     * Obtiene el valor de la propiedad bal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBal() {
        return bal;
    }

    /**
     * Define el valor de la propiedad bal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBal(BigDecimal value) {
        this.bal = value;
    }

}
