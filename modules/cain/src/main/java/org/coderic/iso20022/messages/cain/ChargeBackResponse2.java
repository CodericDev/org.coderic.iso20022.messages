//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:53:05 PM COT 
//


package org.coderic.iso20022.messages.cain;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ChargeBackResponse2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChargeBackResponse2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Environment29"/&gt;
 *         &lt;element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Context16"/&gt;
 *         &lt;element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Transaction154"/&gt;
 *         &lt;element name="PrcgRslt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}ProcessingResult15"/&gt;
 *         &lt;element name="PrtctdData" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}ProtectedData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeBackResponse2", propOrder = {
    "envt",
    "cntxt",
    "tx",
    "prcgRslt",
    "prtctdData",
    "splmtryData"
})
public class ChargeBackResponse2 {

    @XmlElement(name = "Envt", required = true)
    protected Environment29 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected Context16 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected Transaction154 tx;
    @XmlElement(name = "PrcgRslt", required = true)
    protected ProcessingResult15 prcgRslt;
    @XmlElement(name = "PrtctdData")
    protected List<ProtectedData1> prtctdData;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtiene el valor de la propiedad envt.
     * 
     * @return
     *     possible object is
     *     {@link Environment29 }
     *     
     */
    public Environment29 getEnvt() {
        return envt;
    }

    /**
     * Define el valor de la propiedad envt.
     * 
     * @param value
     *     allowed object is
     *     {@link Environment29 }
     *     
     */
    public void setEnvt(Environment29 value) {
        this.envt = value;
    }

    /**
     * Obtiene el valor de la propiedad cntxt.
     * 
     * @return
     *     possible object is
     *     {@link Context16 }
     *     
     */
    public Context16 getCntxt() {
        return cntxt;
    }

    /**
     * Define el valor de la propiedad cntxt.
     * 
     * @param value
     *     allowed object is
     *     {@link Context16 }
     *     
     */
    public void setCntxt(Context16 value) {
        this.cntxt = value;
    }

    /**
     * Obtiene el valor de la propiedad tx.
     * 
     * @return
     *     possible object is
     *     {@link Transaction154 }
     *     
     */
    public Transaction154 getTx() {
        return tx;
    }

    /**
     * Define el valor de la propiedad tx.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction154 }
     *     
     */
    public void setTx(Transaction154 value) {
        this.tx = value;
    }

    /**
     * Obtiene el valor de la propiedad prcgRslt.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResult15 }
     *     
     */
    public ProcessingResult15 getPrcgRslt() {
        return prcgRslt;
    }

    /**
     * Define el valor de la propiedad prcgRslt.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResult15 }
     *     
     */
    public void setPrcgRslt(ProcessingResult15 value) {
        this.prcgRslt = value;
    }

    /**
     * Gets the value of the prtctdData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the prtctdData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtctdData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProtectedData1 }
     * 
     * 
     */
    public List<ProtectedData1> getPrtctdData() {
        if (prtctdData == null) {
            prtctdData = new ArrayList<ProtectedData1>();
        }
        return this.prtctdData;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
