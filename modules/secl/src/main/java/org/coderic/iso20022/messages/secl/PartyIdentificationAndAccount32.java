//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:54:13 PM COT 
//


package org.coderic.iso20022.messages.secl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartyIdentificationAndAccount32 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentificationAndAccount32"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PtyId" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}PartyIdentification33Choice"/&gt;
 *         &lt;element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="PrcgId" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="PrcgDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}DateAndDateTimeChoice" minOccurs="0"/&gt;
 *         &lt;element name="SubAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SubAccount1" minOccurs="0"/&gt;
 *         &lt;element name="CtctPrsn" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}ContactIdentification2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount32", propOrder = {
    "ptyId",
    "acctId",
    "prcgId",
    "prcgDt",
    "subAcctDtls",
    "ctctPrsn"
})
public class PartyIdentificationAndAccount32 {

    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification33Choice ptyId;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "PrcgId")
    protected String prcgId;
    @XmlElement(name = "PrcgDt")
    protected DateAndDateTimeChoice prcgDt;
    @XmlElement(name = "SubAcctDtls")
    protected SubAccount1 subAcctDtls;
    @XmlElement(name = "CtctPrsn")
    protected ContactIdentification2 ctctPrsn;

    /**
     * Obtiene el valor de la propiedad ptyId.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public PartyIdentification33Choice getPtyId() {
        return ptyId;
    }

    /**
     * Define el valor de la propiedad ptyId.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public void setPtyId(PartyIdentification33Choice value) {
        this.ptyId = value;
    }

    /**
     * Obtiene el valor de la propiedad acctId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Define el valor de la propiedad acctId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Obtiene el valor de la propiedad prcgId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcgId() {
        return prcgId;
    }

    /**
     * Define el valor de la propiedad prcgId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcgId(String value) {
        this.prcgId = value;
    }

    /**
     * Obtiene el valor de la propiedad prcgDt.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getPrcgDt() {
        return prcgDt;
    }

    /**
     * Define el valor de la propiedad prcgDt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setPrcgDt(DateAndDateTimeChoice value) {
        this.prcgDt = value;
    }

    /**
     * Obtiene el valor de la propiedad subAcctDtls.
     * 
     * @return
     *     possible object is
     *     {@link SubAccount1 }
     *     
     */
    public SubAccount1 getSubAcctDtls() {
        return subAcctDtls;
    }

    /**
     * Define el valor de la propiedad subAcctDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccount1 }
     *     
     */
    public void setSubAcctDtls(SubAccount1 value) {
        this.subAcctDtls = value;
    }

    /**
     * Obtiene el valor de la propiedad ctctPrsn.
     * 
     * @return
     *     possible object is
     *     {@link ContactIdentification2 }
     *     
     */
    public ContactIdentification2 getCtctPrsn() {
        return ctctPrsn;
    }

    /**
     * Define el valor de la propiedad ctctPrsn.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactIdentification2 }
     *     
     */
    public void setCtctPrsn(ContactIdentification2 value) {
        this.ctctPrsn = value;
    }

}
