
package com.ofss.fcubs.service.fcubsldservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasAmtType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BasAmtType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="E"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BasAmtType")
@XmlEnum
public enum BasAmtType {

    O,
    E;

    public String value() {
        return name();
    }

    public static BasAmtType fromValue(String v) {
        return valueOf(v);
    }

}
