//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:27 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LocationCategory4Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="LocationCategory4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABRD"/&gt;
 *     &lt;enumeration value="NMDC"/&gt;
 *     &lt;enumeration value="FIXD"/&gt;
 *     &lt;enumeration value="VIRT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationCategory4Code")
@XmlEnum
public enum LocationCategory4Code {

    ABRD,
    NMDC,
    FIXD,
    VIRT;

    public String value() {
        return name();
    }

    public static LocationCategory4Code fromValue(String v) {
        return valueOf(v);
    }

}
