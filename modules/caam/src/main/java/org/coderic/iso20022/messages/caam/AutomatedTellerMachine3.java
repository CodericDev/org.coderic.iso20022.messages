//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:40 PM COT 
//


package org.coderic.iso20022.messages.caam;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AutomatedTellerMachine3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AutomatedTellerMachine3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max35Text"/&gt;
 *         &lt;element name="AddtlId" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Lctn" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}PostalAddress17" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomatedTellerMachine3", propOrder = {
    "id",
    "addtlId",
    "seqNb",
    "lctn"
})
public class AutomatedTellerMachine3 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "AddtlId")
    protected String addtlId;
    @XmlElement(name = "SeqNb")
    protected String seqNb;
    @XmlElement(name = "Lctn")
    protected PostalAddress17 lctn;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlId() {
        return addtlId;
    }

    /**
     * Define el valor de la propiedad addtlId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlId(String value) {
        this.addtlId = value;
    }

    /**
     * Obtiene el valor de la propiedad seqNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNb() {
        return seqNb;
    }

    /**
     * Define el valor de la propiedad seqNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNb(String value) {
        this.seqNb = value;
    }

    /**
     * Obtiene el valor de la propiedad lctn.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress17 }
     *     
     */
    public PostalAddress17 getLctn() {
        return lctn;
    }

    /**
     * Define el valor de la propiedad lctn.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress17 }
     *     
     */
    public void setLctn(PostalAddress17 value) {
        this.lctn = value;
    }

}
