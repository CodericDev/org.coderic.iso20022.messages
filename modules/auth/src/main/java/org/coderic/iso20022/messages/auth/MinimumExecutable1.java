//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:22 PM COT 
//


package org.coderic.iso20022.messages.auth;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MinimumExecutable1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MinimumExecutable1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sz" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}FinancialInstrumentQuantity25Choice" minOccurs="0"/&gt;
 *         &lt;element name="FrstExctnOnly" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}TrueFalseIndicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MinimumExecutable1", propOrder = {
    "sz",
    "frstExctnOnly"
})
public class MinimumExecutable1 {

    @XmlElement(name = "Sz")
    protected FinancialInstrumentQuantity25Choice sz;
    @XmlElement(name = "FrstExctnOnly")
    protected Boolean frstExctnOnly;

    /**
     * Obtiene el valor de la propiedad sz.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public FinancialInstrumentQuantity25Choice getSz() {
        return sz;
    }

    /**
     * Define el valor de la propiedad sz.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public void setSz(FinancialInstrumentQuantity25Choice value) {
        this.sz = value;
    }

    /**
     * Obtiene el valor de la propiedad frstExctnOnly.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFrstExctnOnly() {
        return frstExctnOnly;
    }

    /**
     * Define el valor de la propiedad frstExctnOnly.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFrstExctnOnly(Boolean value) {
        this.frstExctnOnly = value;
    }

}
