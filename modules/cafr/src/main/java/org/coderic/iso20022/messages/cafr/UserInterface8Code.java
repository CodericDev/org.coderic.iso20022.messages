//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:53:01 PM COT 
//


package org.coderic.iso20022.messages.cafr;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UserInterface8Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="UserInterface8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DSPU"/&gt;
 *     &lt;enumeration value="FILE"/&gt;
 *     &lt;enumeration value="LOGF"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UserInterface8Code")
@XmlEnum
public enum UserInterface8Code {

    DSPU,
    FILE,
    LOGF,
    OTHP,
    OTHN;

    public String value() {
        return name();
    }

    public static UserInterface8Code fromValue(String v) {
        return valueOf(v);
    }

}
