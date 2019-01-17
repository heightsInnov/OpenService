
package com.ofss.fcubs.service.fcubsldservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeType2.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FeeType2">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="E"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FeeType2")
@XmlEnum
public enum FeeType2 {

    I,
    E;

    public String value() {
        return name();
    }

    public static FeeType2 fromValue(String v) {
        return valueOf(v);
    }

}
