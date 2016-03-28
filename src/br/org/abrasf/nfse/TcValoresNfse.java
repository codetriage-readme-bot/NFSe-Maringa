//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.24 at 01:57:35 PM BRT 
//


package br.org.abrasf.nfse;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tcValoresNfse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tcValoresNfse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseCalculo" type="{http://www.abrasf.org.br/nfse.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="Aliquota" type="{http://www.abrasf.org.br/nfse.xsd}tsAliquota" minOccurs="0"/>
 *         &lt;element name="ValorIss" type="{http://www.abrasf.org.br/nfse.xsd}tsValor" minOccurs="0"/>
 *         &lt;element name="ValorLiquidoNfse" type="{http://www.abrasf.org.br/nfse.xsd}tsValor"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tcValoresNfse", propOrder = {
    "baseCalculo",
    "aliquota",
    "valorIss",
    "valorLiquidoNfse"
})
public class TcValoresNfse {

    @XmlElement(name = "BaseCalculo")
    protected BigDecimal baseCalculo;
    @XmlElement(name = "Aliquota")
    protected BigDecimal aliquota;
    @XmlElement(name = "ValorIss")
    protected BigDecimal valorIss;
    @XmlElement(name = "ValorLiquidoNfse", required = true)
    protected BigDecimal valorLiquidoNfse;

    /**
     * Gets the value of the baseCalculo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseCalculo() {
        return baseCalculo;
    }

    /**
     * Sets the value of the baseCalculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseCalculo(BigDecimal value) {
        this.baseCalculo = value;
    }

    /**
     * Gets the value of the aliquota property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAliquota() {
        return aliquota;
    }

    /**
     * Sets the value of the aliquota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAliquota(BigDecimal value) {
        this.aliquota = value;
    }

    /**
     * Gets the value of the valorIss property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorIss() {
        return valorIss;
    }

    /**
     * Sets the value of the valorIss property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorIss(BigDecimal value) {
        this.valorIss = value;
    }

    /**
     * Gets the value of the valorLiquidoNfse property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorLiquidoNfse() {
        return valorLiquidoNfse;
    }

    /**
     * Sets the value of the valorLiquidoNfse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorLiquidoNfse(BigDecimal value) {
        this.valorLiquidoNfse = value;
    }

}
