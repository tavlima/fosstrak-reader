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

package org.accada.reader.rp.proxy.msg.stubs.serializers.text;
/**
 * Tokens used for the serializing text commands
 * @author Andreas
 *
 */
public interface TextTokens {
	public static final String READERDEVICE = "ReaderDevice";
	public static final String RD = "RD";
	public static final String SOURCE = "Source";
	public static final String SRC = "SRC";
	public static final String READPOINT = "ReadPoint";
	public static final String RP = "RP";
	public static final String TAGSELECTOR = "TagSelector";
	public static final String RF = "RF";
	public static final String DATASELECTOR = "DataSelector";
	public static final String DS = "DS";
	public static final String NOTIFICATIONCHANNEL = "NotificationChannel";
	public static final String NC = "NC";
	public static final String TRIGGER = "Trigger";
	public static final String TRG = "TRG";
	public static final String COMMANDCHANNEL = "CommandChannel";
	public static final String CC = "CC";
	public static final String EVENTTYPE = "EventType";
	public static final String ET ="ET";
	public static final String TRIGGERTYPE = "TriggerType";
	public static final String TT = "TT";
	public static final String FIELDNAME = "FieldName";
	public static final String FN = "FN";
	public static final String IOPORTS = "IOPorts";
	public static final String IOP = "IOP";
	public static final String TAGFIELD = "TagField";
	public static final String TF = "TF";
	public static final String CMD_GETEPC = "getEPC";
	public static final String CMD_GE = "gE";
	public static final String CMD_GETMANUFACTURER = "getManufacturer";
	public static final String CMD_GMAN = "gMan";	
	public static final String CMD_GETMODEL = "getModel";
	public static final String CMD_GMOD = "gMod";
	public static final String CMD_GETHANDLE = "getHandle";
	public static final String CMD_GH = "gH";
	public static final String CMD_SETHANDLE = "setHandle";
	public static final String CMD_SH = "sH";
	public static final String CMD_GETNAME = "getName";
	public static final String CMD_GN = "gN";
	public static final String CMD_SETNAME = "setName";
	public static final String CMD_SN = "sN";
	public static final String CMD_GETROLE = "getRole";
	public static final String CMD_GR = "gR";
	public static final String CMD_SETROLE = "setRole";
	public static final String CMD_SR = "sR";
	public static final String CMD_GET_TIME_TICKS = "getTimeTicks";
	public static final String CMD_GTIC = "gTic";
	public static final String CMD_GET_TIME_UTC = "getTimeUTC";
	public static final String CMD_GUTC = "gUTC";
	public static final String CMD_SET_TIME_UTC = "setTimeUTC";
	public static final String CMD_SUTC = "sUTC";
	public static final String CMD_GET_MANUFACTURER_DESCRIPTION = "getManufacturerDescription";
	public static final String CMD_GMD = "gMD";
	public static final String CMD_GET_CURRENT_SOURCE = "getCurrentSource";
	public static final String CMD_GCS = "gCS";
	public static final String CMD_SET_CURRENT_SOURCE = "setCurrentSource";
	public static final String CMD_SCS = "sCS";
	public static final String CMD_GET_CURRENT_DATA_SELECTOR = "getCurrentDataSelector";
	public static final String CMD_GCDS = "gCDS";
	public static final String CMD_SET_CURRENT_DATA_SELECTOR = "setCurrentDataSelector";
	public static final String CMD_SCDS = "sCDS";
	public static final String CMD_REMOVE_SOURCES = "removeSources";
	public static final String CMD_RSRC = "rSRC";
	public static final String CMD_REMOVE_ALL_SOURCES = "removeAllSources";
	public static final String CMD_RASRC = "raSRC";
	public static final String CMD_GET_SOURCE = "getSource";
	public static final String CMD_GSRC = "gSRC";
	public static final String CMD_GET_ALL_SOURCES = "getAllSources";
	public static final String CMD_GASRC = "gaSRC";
	public static final String CMD_REMOVE_DATA_SELECTORS = "removeDataSelectors";
	public static final String CMD_RDS = "rDS";
	public static final String CMD_REMOVE_ALL_DATA_SELECTORS = "removeAllDataSelectors";
	public static final String CMD_RADS = "raDS";
	public static final String CMD_GET_DATA_SELECTOR = "getDataSelector";
	public static final String CMD_GDS = "gDS";
	public static final String CMD_GET_ALL_DATA_SELECTORS = "getAllDataSelectors";
	public static final String CMD_GADS = "gaDS";
	public static final String CMD_REMOVE_NOTIFICATION_CHANNELS = "removeNotificationChannels";
	public static final String CMD_RNC = "rNC";
	public static final String CMD_REMOVE_ALL_NOTIFICATION_CHANNELS = "removeAllNotificationChannels";
	public static final String CMD_RANC = "raNC";
	public static final String CMD_GET_NOTIFICATION_CHANNEL = "getNotificationChannel";
	public static final String CMD_GNC = "gNC";
	public static final String CMD_GET_ALL_NOTIFICATION_CHANNELS = "getAllNotificationChannels";
	public static final String CMD_GANC = "gaNC";
	public static final String CMD_REMOVE_TRIGGERS = "removeTriggers";
	public static final String CMD_RTRG = "rTRG";
	public static final String CMD_REMOVE_ALL_TRIGGERS = "removeAllTriggers";
	public static final String CMD_RATRG = "raTRG";
	public static final String CMD_GET_TRIGGER = "getTrigger";
	public static final String CMD_GTRG = "gTRG";
	public static final String CMD_GET_ALL_TRIGGERS = "getAllTriggers";
	public static final String CMD_GATRG = "gaTRG";
	public static final String CMD_REMOVE_TAG_SELECTORS = "removeTagSelectors";
	public static final String CMD_RTS = "rTS";
	public static final String CMD_REMOVE_ALL_TAG_SELECTORS = "removeAllTagSelectors";
	public static final String CMD_RATS = "raTS";
	public static final String CMD_GET_TAG_SELECTOR = "getTagSelector";
	public static final String CMD_GTS = "gTS";
	public static final String CMD_GET_ALL_TAG_SELECTORS = "getAllTagSelectors";
	public static final String CMD_GATS = "gaTS";
	public static final String CMD_REMOVE_TAG_FIELDS = "removeTagFields";
	public static final String CMD_RTF = "rTF";
	public static final String CMD_REMOVE_ALL_TAG_FIELDS = "removeAllTagFields";
	public static final String CMD_RATF = "raTF";
	public static final String CMD_GET_TAG_FIELD = "getTagField";
	public static final String CMD_GTF = "gTF";
	public static final String CMD_GET_ALL_TAG_FIELDS = "getAllTagFields";
	public static final String CMD_GATF = "gaTF";
	public static final String CMD_RESET_TO_DEFAULT_SETTINGS = "resetToDefaultSettings";
	public static final String CMD_RESET = "reset";
	public static final String CMD_REBOOT = "reboot";
	public static final String CMD_BOOT = "boot";
	public static final String CMD_GOODBYE = "goodbye";
	public static final String CMD_BYE = "bye";
	public static final String CMD_GET_READ_POINT = "getReadPoint";
	public static final String CMD_GRP = "gRP";
	public static final String CMD_GET_ALL_READ_POINTS = "getAllReadPoints";
	public static final String CMD_GARP = "gaRP";
	public static final String CMD_CREATE = "create";
	public static final String CMD_C = "c";
	public static final String CMD_IS_FIXED = "isFixed";
	public static final String CMD_ISFX = "isFX";
	public static final String CMD_ADD_READ_POINTS = "addReadPoints";
	public static final String CMD_ARP = "aRP";
	public static final String CMD_REMOVE_READ_POINTS = "removeReadPoints";
	public static final String CMD_RRP = "rRP";
	public static final String CMD_REMOVE_ALL_READ_POINTS = "removeAllReadPoints";
	public static final String CMD_RARP = "raRP";
	public static final String CMD_ADD_READ_TRIGGERS = "addReadTriggers";
	public static final String CMD_ART = "aRT";
	public static final String CMD_REMOVE_READ_TRIGGERS = "removeReadTriggers";
	public static final String CMD_RRT = "rRT";
	public static final String CMD_REMOVE_ALL_READ_TRIGGERS = "removeAllReadTriggers";
	public static final String CMD_RART = "raRT";
	public static final String CMD_GET_READ_TRIGGER = "getReadTrigger";
	public static final String CMD_GRT = "gRT";
	public static final String CMD_GET_ALL_READ_TRIGGERS = "getAllReadTriggers";
	public static final String CMD_GART = "gaRT";
	public static final String CMD_ADD_TAG_SELECTORS = "addTagSelectors";
	public static final String CMD_ATS = "aTS";
	public static final String CMD_GET_GLIMPSED_TIMEOUT = "getGlimpsedTimeout";
	public static final String CMD_GGTO = "gGTO";
	public static final String CMD_SET_GLIMPSED_TIMEOUT = "setGlimpsedTimeout";
	public static final String CMD_SGTO = "sGTO";
	public static final String CMD_GET_OBSERVED_THRESHOLD = "getObservedThreshold";
	public static final String CMD_GOTH = "gOTH";
	public static final String CMD_SET_OBSERVED_THRESHOLD = "setObservedThreshold";
	public static final String CMD_SOTH = "sOTH";
	public static final String CMD_GET_OBSERVED_TIMEOUT = "getObservedTimeout";
	public static final String CMD_GOTO = "gOTO";
	public static final String CMD_SET_OBSERVED_TIMEOUT = "setObservedTimeout";
	public static final String CMD_SOTO = "sOTO";
	public static final String CMD_GET_LOST_TIMEOUT = "getLostTimeout";
	public static final String CMD_GLTO = "gLTO";
	public static final String CMD_SET_LOST_TIMEOUT = "setLostTimeout";
	public static final String CMD_SLTO = "sLTO";
	public static final String CMD_RAW_READ_IDS = "rawReadIDs";
	public static final String CMD_RRID = "rrid";
	public static final String CMD_READ_IDS = "readIDs";
	public static final String CMD_RID = "rid";
	public static final String CMD_READ = "read";
	public static final String CMD_R = "r";
	public static final String CMD_WRITE_ID = "writeID";
	public static final String CMD_WID = "wid";
	public static final String CMD_WRITE = "write";
	public static final String CMD_W = "w";
	public static final String CMD_KILL = "kill";
	public static final String CMD_K = "k";
	public static final String CMD_GET_READ_CYCLES_PER_TRIGGER = "getReadCyclesPerTrigger";
	public static final String CMD_GRCPT = "gRCPT";
	public static final String CMD_SET_READ_CYCLES_PER_TRIGGER = "setReadCyclesPerTrigger";
	public static final String CMD_SRCPT = "sRCPT";
	public static final String CMD_GET_MAX_READ_DUTY_CYCLE = "getMaxReadDutyCycles";
	public static final String CMD_GMRDC = "gMRDC";
	public static final String CMD_SET_MAX_READ_DUTY_CYCLE = "setMaxReadDutyCycles";
	public static final String CMD_SMRDC = "sMRDC";
	public static final String CMD_GET_READ_TIMEOUT = "getReadTimeout";
	public static final String CMD_GRTO = "gRTO";
	public static final String CMD_SET_READ_TIMEOUT = "setReadTimeout";
	public static final String CMD_SRTO = "sRTO";
	public static final String CMD_SET_SESSION = "setSession";
	public static final String CMD_SSS = "sSS";
	public static final String CMD_GET_SESSION = "getSession";
	public static final String CMD_GSS = "gSS";
	public static final String CMD_GET_MAX_NUMBER_SUPPORTED = "getMaxNumberSupported";
	public static final String CMD_GMAX = "gMax";
	public static final String CMD_GMX = "gMx";
	public static final String CMD_GET_TYPE = "getType";
	public static final String CMD_GT = "gT";
	public static final String CMD_GET_VALUE = "getValue";
	public static final String CMD_GV = "gV";
	public static final String CMD_FIRE = "fire";
	public static final String CMD_F = "f";
	public static final String CMD_GET_MASK = "getMask";
	public static final String CMD_GM = "gM";
	public static final String CMD_GET_INCLUSIVE_FLAG = "getInclusiveFlag";
	public static final String CMD_GIF = "gIF";
	public static final String CMD_GET_ADDRESS = "getAddress";
	public static final String CMD_GADR = "gAdr";
	public static final String CMD_GET_EFFECTIVE_ADDRESS = "getEffectiveAddress";
	public static final String CMD_GEADR = "gEAdr";
	public static final String CMD_SET_ADDRESS = "setAddress";
	public static final String CMD_SADR = "sAdr";
	public static final String CMD_SET_DATA_SELECTOR = "setDataSelector";
	public static final String CMD_SDS = "sDS";
	public static final String CMD_ADD_SOURCES = "addSources";
	public static final String CMD_ASRC = "aSRC";
	public static final String CMD_ADD_NOTIFICATION_TRIGGERS = "addNotificationTriggers";
	public static final String CMD_ANT = "aNT";
	public static final String CMD_REMOVE_NOTIFICATION_TRIGGERS = "removeNotificatonTriggers";
	public static final String CMD_RNT = "rNT";
	public static final String CMD_REMOVE_ALL_NOTIFICATION_TRIGGERS = "removeAllNotificationTriggers";
	public static final String CMD_RANT = "raNT";
	public static final String CMD_GET_NOTIFICATION_TRIGGER = "getNotificationTrigger";
	public static final String CMD_GNT = "gNT";
	public static final String CMD_GET_ALL_NOTIFICATION_TRIGGERS = "getAllNotificationTriggers";
	public static final String CMD_GANT = "gaNT";
	public static final String CMD_READ_QUEUED_DATA = "readQueuedData";
	public static final String CMD_RQD = "rqd";
	public static final String CMD_ADD_FIELD_NAMES = "addFieldNames";
	public static final String CMD_AFN = "aFN";
	public static final String CMD_REMOVE_FIELD_NAMES = "removeFieldNames";
	public static final String CMD_RFN = "rFN";
	public static final String CMD_REMOVE_ALL_FIELD_NAMES = "removeAllFieldNames";
	public static final String CMD_RAFN = "raFN";
	public static final String CMD_GET_ALL_FIELD_NAMES = "getAllFieldNames";
	public static final String CMD_GAFN = "gaFN";
	public static final String CMD_ADD_EVENT_FILTERS = "addEventFilters";
	public static final String CMD_AEF = "aEF";
	public static final String CMD_REMOVE_EVENT_FILTERS = "removeEventFilters";
	public static final String CMD_REF = "rEF";
	public static final String CMD_REMOVE_ALL_EVENT_FILTERS = "removeAllEventFilters";
	public static final String CMD_RAEF = "raEF";
	public static final String CMD_GET_ALL_EVENT_FILTERS = "getAllEventFilters";
	public static final String CMD_GAEF = "gaEF";
	public static final String CMD_ADD_TAG_FIELD_NAMES = "addTagFieldNames";
	public static final String CMD_ATFN = "aTFN";
	public static final String CMD_REMOVE_TAG_FIELD_NAMES = "removeTagFieldNames";
	public static final String CMD_RTFN = "rTFN";
	public static final String CMD_REMOVE_ALL_TAG_FIELD_NAMES = "removeAllTagFieldNames";
	public static final String CMD_RATFN = "raTFN";
	public static final String CMD_GET_ALL_TAG_FIELD_NAMES = "getAllTagFieldNames";
	public static final String CMD_GATFN = "gaTFN";
	public static final String CMD_GET_SUPPORTED_TYPES = "getSupportedTypes";
	public static final String CMD_GST = "gST";
	public static final String CMD_GET_SUPPORTED_NAMES = "getSupportedNames";
	public static final String CMD_GSN = "gSN";
	public static final String CMD_GET_TAG_FIELD_NAME = "getTagFieldName";
	public static final String CMD_GTFN = "gTFN";
	public static final String CMD_SET_TAG_FIELD_NAME = "setTagFieldName";
	public static final String CMD_STFN = "sTFN";
	public static final String CMD_GET_MEMORY_BANK = "getMemoryBank";
	public static final String CMD_GMB = "gMB";
	public static final String CMD_SET_MEMORY_BANK = "setMemoryBank";
	public static final String CMD_SMB = "sMB";
	public static final String CMD_GET_OFFSET = "getOffset";
	public static final String CMD_GOFF = "gOFF";
	public static final String CMD_SET_OFFSET = "setOffset";
	public static final String CMD_SOFF = "sOFF";
	public static final String CMD_GET_LENGTH = "getLength";
	public static final String CMD_GLEN = "gLEN";
	public static final String CMD_SET_LENGTH = "setLength";
	public static final String CMD_SLEN = "sLEN";
}
