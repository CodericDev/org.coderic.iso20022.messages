//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:54:17 PM COT 
//


package org.coderic.iso20022.messages.seev;

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
 *         &lt;element name="MktClmCxlReqStsAdvc" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}MarketClaimCancellationRequestStatusAdviceV02"/&gt;
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
    "mktClmCxlReqStsAdvc"
})
public class Document {

    @XmlElement(name = "MktClmCxlReqStsAdvc", required = true)
    protected MarketClaimCancellationRequestStatusAdviceV02 mktClmCxlReqStsAdvc;

    /**
     * Obtiene el valor de la propiedad mktClmCxlReqStsAdvc.
     * 
     * @return
     *     possible object is
     *     {@link MarketClaimCancellationRequestStatusAdviceV02 }
     *     
     */
    public MarketClaimCancellationRequestStatusAdviceV02 getMktClmCxlReqStsAdvc() {
        return mktClmCxlReqStsAdvc;
    }

    /**
     * Define el valor de la propiedad mktClmCxlReqStsAdvc.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClaimCancellationRequestStatusAdviceV02 }
     *     
     */
    public void setMktClmCxlReqStsAdvc(MarketClaimCancellationRequestStatusAdviceV02 value) {
        this.mktClmCxlReqStsAdvc = value;
    }

}
