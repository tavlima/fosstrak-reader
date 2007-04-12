/*
 * Copyright (C) 2007 ETH Zurich
 *
 * This file is part of Accada (www.accada.org).
 *
 * Accada is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1, as published by the Free Software Foundation.
 *
 * Accada is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with Accada; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301  USA
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b26-ea3 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.05 at 05:26:35 PM CEST 
//


package org.accada.reader.rprm.core.msg.reply;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

import org.accada.reader.rprm.core.msg.reply.AddressReturnType;
import org.accada.reader.rprm.core.msg.reply.BooleanReturnType;
import org.accada.reader.rprm.core.msg.reply.DataSelectorListParamType;
import org.accada.reader.rprm.core.msg.reply.DataSelectorListReturnType;
import org.accada.reader.rprm.core.msg.reply.DataSelectorReply;
import org.accada.reader.rprm.core.msg.reply.DataSelectorReturnType;
import org.accada.reader.rprm.core.msg.reply.EPC;
import org.accada.reader.rprm.core.msg.reply.EpcReturnType;
import org.accada.reader.rprm.core.msg.reply.ErrorType;
import org.accada.reader.rprm.core.msg.reply.EventTimeType;
import org.accada.reader.rprm.core.msg.reply.EventTypeListParamType;
import org.accada.reader.rprm.core.msg.reply.EventTypeListReturnValue;
import org.accada.reader.rprm.core.msg.reply.EventTypeReply;
import org.accada.reader.rprm.core.msg.reply.FieldNameListParamType;
import org.accada.reader.rprm.core.msg.reply.FieldNameListReturnType;
import org.accada.reader.rprm.core.msg.reply.FieldNameReply;
import org.accada.reader.rprm.core.msg.reply.HexStringListType;
import org.accada.reader.rprm.core.msg.reply.HexStringReturnType;
import org.accada.reader.rprm.core.msg.reply.IntReturnType;
import org.accada.reader.rprm.core.msg.reply.NoParamType;
import org.accada.reader.rprm.core.msg.reply.NotificationChannelListParamType;
import org.accada.reader.rprm.core.msg.reply.NotificationChannelListReturnType;
import org.accada.reader.rprm.core.msg.reply.NotificationChannelReply;
import org.accada.reader.rprm.core.msg.reply.NotificationChannelReturnType;
import org.accada.reader.rprm.core.msg.reply.ObjectFactory;
import org.accada.reader.rprm.core.msg.reply.ReadPointListParamType;
import org.accada.reader.rprm.core.msg.reply.ReadPointListReturnType;
import org.accada.reader.rprm.core.msg.reply.ReadPointReply;
import org.accada.reader.rprm.core.msg.reply.ReadPointReturnType;
import org.accada.reader.rprm.core.msg.reply.ReadReportType;
import org.accada.reader.rprm.core.msg.reply.ReaderDeviceReply;
import org.accada.reader.rprm.core.msg.reply.ReaderTimeType;
import org.accada.reader.rprm.core.msg.reply.Reply;
import org.accada.reader.rprm.core.msg.reply.SourceInfoType;
import org.accada.reader.rprm.core.msg.reply.SourceListParamType;
import org.accada.reader.rprm.core.msg.reply.SourceListReturnType;
import org.accada.reader.rprm.core.msg.reply.SourceReply;
import org.accada.reader.rprm.core.msg.reply.SourceReturnType;
import org.accada.reader.rprm.core.msg.reply.StringListParamType;
import org.accada.reader.rprm.core.msg.reply.StringListReturnType;
import org.accada.reader.rprm.core.msg.reply.StringReturnType;
import org.accada.reader.rprm.core.msg.reply.TagEventType;
import org.accada.reader.rprm.core.msg.reply.TagFieldListParamType;
import org.accada.reader.rprm.core.msg.reply.TagFieldListReturnType;
import org.accada.reader.rprm.core.msg.reply.TagFieldReply;
import org.accada.reader.rprm.core.msg.reply.TagFieldReturnType;
import org.accada.reader.rprm.core.msg.reply.TagFieldValueListParamType;
import org.accada.reader.rprm.core.msg.reply.TagFieldValueParamType;
import org.accada.reader.rprm.core.msg.reply.TagSelectorListParamType;
import org.accada.reader.rprm.core.msg.reply.TagSelectorListReturnType;
import org.accada.reader.rprm.core.msg.reply.TagSelectorReply;
import org.accada.reader.rprm.core.msg.reply.TagSelectorReturnType;
import org.accada.reader.rprm.core.msg.reply.TagType;
import org.accada.reader.rprm.core.msg.reply.TimeStampReturnType;
import org.accada.reader.rprm.core.msg.reply.TriggerListParamType;
import org.accada.reader.rprm.core.msg.reply.TriggerListReturnType;
import org.accada.reader.rprm.core.msg.reply.TriggerReply;
import org.accada.reader.rprm.core.msg.reply.TriggerReturnType;
import org.accada.reader.rprm.core.msg.reply.TriggerTypeListReturnType;
import org.accada.reader.rprm.core.msg.reply.TriggerTypeReply;
import org.accada.reader.rprm.core.msg.reply.TriggerTypeReturnType;
import org.accada.reader.rprm.core.msg.reply.TriggerValueReturnType;
import org.accada.reader.rprm.core.msg.reply.NotificationChannelReply.ReadQueuedData;
import org.accada.reader.rprm.core.msg.reply.ReadReportType.SourceReport;
import org.accada.reader.rprm.core.msg.reply.SourceReply.RawReadIDs;
import org.accada.reader.rprm.core.msg.reply.SourceReply.Read;
import org.accada.reader.rprm.core.msg.reply.SourceReply.ReadIDs;
import org.accada.reader.rprm.core.msg.reply.TagEventType.EventTriggers;
import org.accada.reader.rprm.core.msg.reply.TriggerTypeListReturnType.ReturnValue;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.accada.reader.msg.reply package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HexStringListTypeListValue_QNAME = new QName("", "value");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.accada.reader.msg.reply
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NoParamType }
     * 
     */
    public NoParamType createNoParamType() {
        return new NoParamType();
    }

    /**
     * Create an instance of {@link TriggerTypeListReturnType }
     * 
     */
    public TriggerTypeListReturnType createTriggerTypeListReturnType() {
        return new TriggerTypeListReturnType();
    }

    /**
     * Create an instance of {@link EventTypeListParamType }
     * 
     */
    public EventTypeListParamType createEventTypeListParamType() {
        return new EventTypeListParamType();
    }

    /**
     * Create an instance of {@link EventTriggers }
     * 
     */
    public EventTriggers createTagEventTypeEventTriggers() {
        return new EventTriggers();
    }

    /**
     * Create an instance of {@link SourceInfoType }
     * 
     */
    public SourceInfoType createSourceInfoType() {
        return new SourceInfoType();
    }

    /**
     * Create an instance of {@link org.accada.reader.rprm.core.msg.reply.SourceListParamType.List }
     * 
     */
    public org.accada.reader.rprm.core.msg.reply.SourceListParamType.List createSourceListParamTypeList() {
        return new org.accada.reader.rprm.core.msg.reply.SourceListParamType.List();
    }

    /**
     * Create an instance of {@link org.accada.reader.rprm.core.msg.reply.HexStringListType.List }
     * 
     */
    public org.accada.reader.rprm.core.msg.reply.HexStringListType.List createHexStringListTypeList() {
        return new org.accada.reader.rprm.core.msg.reply.HexStringListType.List();
    }

    /**
     * Create an instance of {@link StringListReturnType }
     * 
     */
    public StringListReturnType createStringListReturnType() {
        return new StringListReturnType();
    }

    /**
     * Create an instance of {@link DataSelectorReply }
     * 
     */
    public DataSelectorReply createDataSelectorReply() {
        return new DataSelectorReply();
    }

    /**
     * Create an instance of {@link TagFieldReturnType }
     * 
     */
    public TagFieldReturnType createTagFieldReturnType() {
        return new TagFieldReturnType();
    }

    /**
     * Create an instance of {@link ReaderDeviceReply }
     * 
     */
    public ReaderDeviceReply createReaderDeviceReply() {
        return new ReaderDeviceReply();
    }

    /**
     * Create an instance of {@link TriggerTypeReply }
     * 
     */
    public TriggerTypeReply createTriggerTypeReply() {
        return new TriggerTypeReply();
    }

    /**
     * Create an instance of {@link TagFieldReply }
     * 
     */
    public TagFieldReply createTagFieldReply() {
        return new TagFieldReply();
    }

    /**
     * Create an instance of {@link EventTypeReply }
     * 
     */
    public EventTypeReply createEventTypeReply() {
        return new EventTypeReply();
    }

    /**
     * Create an instance of {@link org.accada.reader.rprm.core.msg.reply.FieldNameListParamType.List }
     * 
     */
    public org.accada.reader.rprm.core.msg.reply.FieldNameListParamType.List createFieldNameListParamTypeList() {
        return new org.accada.reader.rprm.core.msg.reply.FieldNameListParamType.List();
    }

    /**
     * Create an instance of {@link ReturnValue }
     * 
     */
    public ReturnValue createTriggerTypeListReturnTypeReturnValue() {
        return new ReturnValue();
    }

    /**
     * Create an instance of {@link StringListParamType }
     * 
     */
    public StringListParamType createStringListParamType() {
        return new StringListParamType();
    }

    /**
     * Create an instance of {@link TagFieldListParamType }
     * 
     */
    public TagFieldListParamType createTagFieldListParamType() {
        return new TagFieldListParamType();
    }

    /**
     * Create an instance of {@link TriggerValueReturnType }
     * 
     */
    public TriggerValueReturnType createTriggerValueReturnType() {
        return new TriggerValueReturnType();
    }

    /**
     * Create an instance of {@link NotificationChannelReply }
     * 
     */
    public NotificationChannelReply createNotificationChannelReply() {
        return new NotificationChannelReply();
    }

    /**
     * Create an instance of {@link TriggerListReturnType }
     * 
     */
    public TriggerListReturnType createTriggerListReturnType() {
        return new TriggerListReturnType();
    }

    /**
     * Create an instance of {@link FieldNameListParamType }
     * 
     */
    public FieldNameListParamType createFieldNameListParamType() {
        return new FieldNameListParamType();
    }

    /**
     * Create an instance of {@link DataSelectorListReturnType }
     * 
     */
    public DataSelectorListReturnType createDataSelectorListReturnType() {
        return new DataSelectorListReturnType();
    }

    /**
     * Create an instance of {@link ReadQueuedData }
     * 
     */
    public ReadQueuedData createNotificationChannelReplyReadQueuedData() {
        return new ReadQueuedData();
    }

    /**
     * Create an instance of {@link Read }
     * 
     */
    public Read createSourceReplyRead() {
        return new Read();
    }

    /**
     * Create an instance of {@link org.accada.reader.rprm.core.msg.reply.DataSelectorListParamType.List }
     * 
     */
    public org.accada.reader.rprm.core.msg.reply.DataSelectorListParamType.List createDataSelectorListParamTypeList() {
        return new org.accada.reader.rprm.core.msg.reply.DataSelectorListParamType.List();
    }

    /**
     * Create an instance of {@link EventTimeType }
     * 
     */
    public EventTimeType createEventTimeType() {
        return new EventTimeType();
    }

    /**
     * Create an instance of {@link org.accada.reader.rprm.core.msg.reply.TagFieldListParamType.List }
     * 
     */
    public org.accada.reader.rprm.core.msg.reply.TagFieldListParamType.List createTagFieldListParamTypeList() {
        return new org.accada.reader.rprm.core.msg.reply.TagFieldListParamType.List();
    }

    /**
     * Create an instance of {@link SourceListReturnType }
     * 
     */
    public SourceListReturnType createSourceListReturnType() {
        return new SourceListReturnType();
    }

    /**
     * Create an instance of {@link TagSelectorListParamType }
     * 
     */
    public TagSelectorListParamType createTagSelectorListParamType() {
        return new TagSelectorListParamType();
    }

    /**
     * Create an instance of {@link org.accada.reader.rprm.core.msg.reply.TriggerTypeListReturnType.ReturnValue.List }
     * 
     */
    public org.accada.reader.rprm.core.msg.reply.TriggerTypeListReturnType.ReturnValue.List createTriggerTypeListReturnTypeReturnValueList() {
        return new org.accada.reader.rprm.core.msg.reply.TriggerTypeListReturnType.ReturnValue.List();
    }

    /**
     * Create an instance of {@link ReadPointListParamType }
     * 
     */
    public ReadPointListParamType createReadPointListParamType() {
        return new ReadPointListParamType();
    }

    /**
     * Create an instance of {@link TagSelectorReply }
     * 
     */
    public TagSelectorReply createTagSelectorReply() {
        return new TagSelectorReply();
    }

    /**
     * Create an instance of {@link ReadIDs }
     * 
     */
    public ReadIDs createSourceReplyReadIDs() {
        return new ReadIDs();
    }

    /**
     * Create an instance of {@link StringReturnType }
     * 
     */
    public StringReturnType createStringReturnType() {
        return new StringReturnType();
    }

    /**
     * Create an instance of {@link SourceListParamType }
     * 
     */
    public SourceListParamType createSourceListParamType() {
        return new SourceListParamType();
    }

    /**
     * Create an instance of {@link ReaderTimeType }
     * 
     */
    public ReaderTimeType createReaderTimeType() {
        return new ReaderTimeType();
    }

    /**
     * Create an instance of {@link FieldNameReply }
     * 
     */
    public FieldNameReply createFieldNameReply() {
        return new FieldNameReply();
    }

    /**
     * Create an instance of {@link org.accada.reader.rprm.core.msg.reply.NotificationChannelListParamType.List }
     * 
     */
    public org.accada.reader.rprm.core.msg.reply.NotificationChannelListParamType.List createNotificationChannelListParamTypeList() {
        return new org.accada.reader.rprm.core.msg.reply.NotificationChannelListParamType.List();
    }

    /**
     * Create an instance of {@link DataSelectorReturnType }
     * 
     */
    public DataSelectorReturnType createDataSelectorReturnType() {
        return new DataSelectorReturnType();
    }

    /**
     * Create an instance of {@link BooleanReturnType }
     * 
     */
    public BooleanReturnType createBooleanReturnType() {
        return new BooleanReturnType();
    }

    /**
     * Create an instance of {@link EPC }
     * 
     */
    public EPC createEPC() {
        return new EPC();
    }

    /**
     * Create an instance of {@link HexStringListType }
     * 
     */
    public HexStringListType createHexStringListType() {
        return new HexStringListType();
    }

    /**
     * Create an instance of {@link EpcReturnType }
     * 
     */
    public EpcReturnType createEpcReturnType() {
        return new EpcReturnType();
    }

    /**
     * Create an instance of {@link org.accada.reader.rprm.core.msg.reply.ReadPointListParamType.List }
     * 
     */
    public org.accada.reader.rprm.core.msg.reply.ReadPointListParamType.List createReadPointListParamTypeList() {
        return new org.accada.reader.rprm.core.msg.reply.ReadPointListParamType.List();
    }

    /**
     * Create an instance of {@link ReadPointReturnType }
     * 
     */
    public ReadPointReturnType createReadPointReturnType() {
        return new ReadPointReturnType();
    }

    /**
     * Create an instance of {@link TimeStampReturnType }
     * 
     */
    public TimeStampReturnType createTimeStampReturnType() {
        return new TimeStampReturnType();
    }

    /**
     * Create an instance of {@link RawReadIDs }
     * 
     */
    public RawReadIDs createSourceReplyRawReadIDs() {
        return new RawReadIDs();
    }

    /**
     * Create an instance of {@link EventTypeListReturnValue }
     * 
     */
    public EventTypeListReturnValue createEventTypeListReturnValue() {
        return new EventTypeListReturnValue();
    }

    /**
     * Create an instance of {@link TriggerTypeReturnType }
     * 
     */
    public TriggerTypeReturnType createTriggerTypeReturnType() {
        return new TriggerTypeReturnType();
    }

    /**
     * Create an instance of {@link SourceReport }
     * 
     */
    public SourceReport createReadReportTypeSourceReport() {
        return new SourceReport();
    }

    /**
     * Create an instance of {@link NotificationChannelListReturnType }
     * 
     */
    public NotificationChannelListReturnType createNotificationChannelListReturnType() {
        return new NotificationChannelListReturnType();
    }

    /**
     * Create an instance of {@link SourceReturnType }
     * 
     */
    public SourceReturnType createSourceReturnType() {
        return new SourceReturnType();
    }

    /**
     * Create an instance of {@link org.accada.reader.rprm.core.msg.reply.StringListParamType.List }
     * 
     */
    public org.accada.reader.rprm.core.msg.reply.StringListParamType.List createStringListParamTypeList() {
        return new org.accada.reader.rprm.core.msg.reply.StringListParamType.List();
    }

    /**
     * Create an instance of {@link TriggerReturnType }
     * 
     */
    public TriggerReturnType createTriggerReturnType() {
        return new TriggerReturnType();
    }

    /**
     * Create an instance of {@link FieldNameListReturnType }
     * 
     */
    public FieldNameListReturnType createFieldNameListReturnType() {
        return new FieldNameListReturnType();
    }

    /**
     * Create an instance of {@link Reply }
     * 
     */
    public Reply createReply() {
        return new Reply();
    }

    /**
     * Create an instance of {@link NotificationChannelListParamType }
     * 
     */
    public NotificationChannelListParamType createNotificationChannelListParamType() {
        return new NotificationChannelListParamType();
    }

    /**
     * Create an instance of {@link org.accada.reader.rprm.core.msg.reply.TagSelectorListParamType.List }
     * 
     */
    public org.accada.reader.rprm.core.msg.reply.TagSelectorListParamType.List createTagSelectorListParamTypeList() {
        return new org.accada.reader.rprm.core.msg.reply.TagSelectorListParamType.List();
    }

    /**
     * Create an instance of {@link org.accada.reader.rprm.core.msg.reply.TriggerListParamType.List }
     * 
     */
    public org.accada.reader.rprm.core.msg.reply.TriggerListParamType.List createTriggerListParamTypeList() {
        return new org.accada.reader.rprm.core.msg.reply.TriggerListParamType.List();
    }

    /**
     * Create an instance of {@link TagFieldValueListParamType }
     * 
     */
    public TagFieldValueListParamType createTagFieldValueListParamType() {
        return new TagFieldValueListParamType();
    }

    /**
     * Create an instance of {@link ReadReportType }
     * 
     */
    public ReadReportType createReadReportType() {
        return new ReadReportType();
    }

    /**
     * Create an instance of {@link IntReturnType }
     * 
     */
    public IntReturnType createIntReturnType() {
        return new IntReturnType();
    }

    /**
     * Create an instance of {@link TagSelectorListReturnType }
     * 
     */
    public TagSelectorListReturnType createTagSelectorListReturnType() {
        return new TagSelectorListReturnType();
    }

    /**
     * Create an instance of {@link TagFieldListReturnType }
     * 
     */
    public TagFieldListReturnType createTagFieldListReturnType() {
        return new TagFieldListReturnType();
    }

    /**
     * Create an instance of {@link AddressReturnType }
     * 
     */
    public AddressReturnType createAddressReturnType() {
        return new AddressReturnType();
    }

    /**
     * Create an instance of {@link TagEventType }
     * 
     */
    public TagEventType createTagEventType() {
        return new TagEventType();
    }

    /**
     * Create an instance of {@link TriggerReply }
     * 
     */
    public TriggerReply createTriggerReply() {
        return new TriggerReply();
    }

    /**
     * Create an instance of {@link ReadPointListReturnType }
     * 
     */
    public ReadPointListReturnType createReadPointListReturnType() {
        return new ReadPointListReturnType();
    }

    /**
     * Create an instance of {@link TriggerListParamType }
     * 
     */
    public TriggerListParamType createTriggerListParamType() {
        return new TriggerListParamType();
    }

    /**
     * Create an instance of {@link HexStringReturnType }
     * 
     */
    public HexStringReturnType createHexStringReturnType() {
        return new HexStringReturnType();
    }

    /**
     * Create an instance of {@link TagSelectorReturnType }
     * 
     */
    public TagSelectorReturnType createTagSelectorReturnType() {
        return new TagSelectorReturnType();
    }

    /**
     * Create an instance of {@link TagFieldValueParamType }
     * 
     */
    public TagFieldValueParamType createTagFieldValueParamType() {
        return new TagFieldValueParamType();
    }

    /**
     * Create an instance of {@link org.accada.reader.rprm.core.msg.reply.TagFieldValueListParamType.List }
     * 
     */
    public org.accada.reader.rprm.core.msg.reply.TagFieldValueListParamType.List createTagFieldValueListParamTypeList() {
        return new org.accada.reader.rprm.core.msg.reply.TagFieldValueListParamType.List();
    }

    /**
     * Create an instance of {@link SourceReply }
     * 
     */
    public SourceReply createSourceReply() {
        return new SourceReply();
    }

    /**
     * Create an instance of {@link org.accada.reader.rprm.core.msg.reply.EventTypeListParamType.List }
     * 
     */
    public org.accada.reader.rprm.core.msg.reply.EventTypeListParamType.List createEventTypeListParamTypeList() {
        return new org.accada.reader.rprm.core.msg.reply.EventTypeListParamType.List();
    }

    /**
     * Create an instance of {@link DataSelectorListParamType }
     * 
     */
    public DataSelectorListParamType createDataSelectorListParamType() {
        return new DataSelectorListParamType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link TagType }
     * 
     */
    public TagType createTagType() {
        return new TagType();
    }

    /**
     * Create an instance of {@link NotificationChannelReturnType }
     * 
     */
    public NotificationChannelReturnType createNotificationChannelReturnType() {
        return new NotificationChannelReturnType();
    }

    /**
     * Create an instance of {@link ReadPointReply }
     * 
     */
    public ReadPointReply createReadPointReply() {
        return new ReadPointReply();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value", scope = org.accada.reader.rprm.core.msg.reply.HexStringListType.List.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    public JAXBElement<byte[]> createHexStringListTypeListValue(byte[] value) {
        return new JAXBElement<byte[]>(_HexStringListTypeListValue_QNAME, byte[].class, org.accada.reader.rprm.core.msg.reply.HexStringListType.List.class, ((byte[]) value));
    }

}
