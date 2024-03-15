//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 03:09:54 PM COT 
//


package org.coderic.model.iso20022.sese;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RejectionOrRepairReason25 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RejectionOrRepairReason25"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}RejectionAndRepairReason25Choice"/&gt;
 *         &lt;element name="AddtlRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}Max210Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionOrRepairReason25", propOrder = {
    "cd",
    "addtlRsnInf"
})
public class RejectionOrRepairReason25 {

    @XmlElement(name = "Cd", required = true)
    protected RejectionAndRepairReason25Choice cd;
    @XmlElement(name = "AddtlRsnInf")
    protected String addtlRsnInf;

    /**
     * Obtiene el valor de la propiedad cd.
     * 
     * @return
     *     possible object is
     *     {@link RejectionAndRepairReason25Choice }
     *     
     */
    public RejectionAndRepairReason25Choice getCd() {
        return cd;
    }

    /**
     * Define el valor de la propiedad cd.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionAndRepairReason25Choice }
     *     
     */
    public void setCd(RejectionAndRepairReason25Choice value) {
        this.cd = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlRsnInf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRsnInf() {
        return addtlRsnInf;
    }

    /**
     * Define el valor de la propiedad addtlRsnInf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlRsnInf(String value) {
        this.addtlRsnInf = value;
    }

}
