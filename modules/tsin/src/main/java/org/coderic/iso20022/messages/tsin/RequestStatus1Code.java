//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:54:30 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RequestStatus1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="RequestStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FNCD"/&gt;
 *     &lt;enumeration value="PDNG"/&gt;
 *     &lt;enumeration value="NTFD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestStatus1Code")
@XmlEnum
public enum RequestStatus1Code {

    FNCD,
    PDNG,
    NTFD;

    public String value() {
        return name();
    }

    public static RequestStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
