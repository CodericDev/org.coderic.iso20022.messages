//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 03:09:54 PM COT 
//


package org.coderic.model.iso20022.sese;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BuyInDeferral1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="BuyInDeferral1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEFY"/&gt;
 *     &lt;enumeration value="DEFN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BuyInDeferral1Code")
@XmlEnum
public enum BuyInDeferral1Code {

    DEFY,
    DEFN;

    public String value() {
        return name();
    }

    public static BuyInDeferral1Code fromValue(String v) {
        return valueOf(v);
    }

}
