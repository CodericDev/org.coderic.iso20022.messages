//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:19 PM COT 
//


package org.coderic.iso20022.messages.admi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Document complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrcgReq" type="{urn:iso:std:iso:20022:tech:xsd:admi.017.001.02}ProcessingRequestV02"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "prcgReq"
})
public class Document {

    @XmlElement(name = "PrcgReq", required = true)
    protected ProcessingRequestV02 prcgReq;

    /**
     * Obtiene el valor de la propiedad prcgReq.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingRequestV02 }
     *     
     */
    public ProcessingRequestV02 getPrcgReq() {
        return prcgReq;
    }

    /**
     * Define el valor de la propiedad prcgReq.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingRequestV02 }
     *     
     */
    public void setPrcgReq(ProcessingRequestV02 value) {
        this.prcgReq = value;
    }

}
