
package com.ofss.fcubs.service.fcubsldservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YesNoType16.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="YesNoType16">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "YesNoType16")
@XmlEnum
public enum YesNoType16 {

    Y,
    N;

    public String value() {
        return name();
    }

    public static YesNoType16 fromValue(String v) {
        return valueOf(v);
    }

}
