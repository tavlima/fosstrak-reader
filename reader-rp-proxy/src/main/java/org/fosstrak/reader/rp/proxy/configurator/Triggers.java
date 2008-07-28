/*
 * Copyright (C) 2007 ETH Zurich
 *
 * This file is part of Fosstrak (www.fosstrak.org).
 *
 * Fosstrak is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 *
 * Fosstrak is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Fosstrak; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.21 at 05:25:46 PM CEST 
//


package org.fosstrak.reader.rp.proxy.configurator;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Triggers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Triggers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="continuousTrigger" type="{}ContinuousTriggerConfiguration"/>
 *         &lt;element name="timerTrigger" type="{}TimerTriggerConfiguration"/>
 *         &lt;element name="ioEdgeTrigger" type="{}IOEdgeTriggerConfiguration"/>
 *         &lt;element name="ioValueTrigger" type="{}IOValueTriggerConfiguration"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Triggers", propOrder = {
    "continuousTriggerOrTimerTriggerOrIoEdgeTrigger"
})
public class Triggers {

    @XmlElements({
        @XmlElement(name = "continuousTrigger", type = ContinuousTriggerConfiguration.class),
        @XmlElement(name = "timerTrigger", type = TimerTriggerConfiguration.class),
        @XmlElement(name = "ioEdgeTrigger", type = IOEdgeTriggerConfiguration.class),
        @XmlElement(name = "ioValueTrigger", type = IOValueTriggerConfiguration.class)
    })
    protected List<Object> continuousTriggerOrTimerTriggerOrIoEdgeTrigger;

    /**
     * Gets the value of the continuousTriggerOrTimerTriggerOrIoEdgeTrigger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the continuousTriggerOrTimerTriggerOrIoEdgeTrigger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContinuousTriggerOrTimerTriggerOrIoEdgeTrigger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContinuousTriggerConfiguration }
     * {@link TimerTriggerConfiguration }
     * {@link IOEdgeTriggerConfiguration }
     * {@link IOValueTriggerConfiguration }
     * 
     * 
     */
    public List<Object> getContinuousTriggerOrTimerTriggerOrIoEdgeTrigger() {
        if (continuousTriggerOrTimerTriggerOrIoEdgeTrigger == null) {
            continuousTriggerOrTimerTriggerOrIoEdgeTrigger = new ArrayList<Object>();
        }
        return this.continuousTriggerOrTimerTriggerOrIoEdgeTrigger;
    }

}
