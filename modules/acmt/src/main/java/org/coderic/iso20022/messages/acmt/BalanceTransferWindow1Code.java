//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:14 PM COT 
//


package org.coderic.iso20022.messages.acmt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BalanceTransferWindow1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="BalanceTransferWindow1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DAYH"/&gt;
 *     &lt;enumeration value="EARL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BalanceTransferWindow1Code")
@XmlEnum
public enum BalanceTransferWindow1Code {

    DAYH,
    EARL;

    public String value() {
        return name();
    }

    public static BalanceTransferWindow1Code fromValue(String v) {
        return valueOf(v);
    }

}
