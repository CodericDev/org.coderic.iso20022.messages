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
 * <p>Clase Java para CashAccountType4Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CashAccountType4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CHAR"/&gt;
 *     &lt;enumeration value="COMM"/&gt;
 *     &lt;enumeration value="TAXE"/&gt;
 *     &lt;enumeration value="CISH"/&gt;
 *     &lt;enumeration value="TRAS"/&gt;
 *     &lt;enumeration value="SACC"/&gt;
 *     &lt;enumeration value="CACC"/&gt;
 *     &lt;enumeration value="SVGS"/&gt;
 *     &lt;enumeration value="ONDP"/&gt;
 *     &lt;enumeration value="MGLD"/&gt;
 *     &lt;enumeration value="NREX"/&gt;
 *     &lt;enumeration value="MOMA"/&gt;
 *     &lt;enumeration value="LOAN"/&gt;
 *     &lt;enumeration value="SLRY"/&gt;
 *     &lt;enumeration value="ODFT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CashAccountType4Code")
@XmlEnum
public enum CashAccountType4Code {

    CASH,
    CHAR,
    COMM,
    TAXE,
    CISH,
    TRAS,
    SACC,
    CACC,
    SVGS,
    ONDP,
    MGLD,
    NREX,
    MOMA,
    LOAN,
    SLRY,
    ODFT;

    public String value() {
        return name();
    }

    public static CashAccountType4Code fromValue(String v) {
        return valueOf(v);
    }

}
