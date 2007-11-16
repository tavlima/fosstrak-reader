package org.accada.reader.hal.transponder;

import org.accada.reader.hal.util.ByteBlock;

public enum RFTechnology {
	HF(0x0), UHF(0x2), UNKNOWN(0x3);

	private final int trType;

	RFTechnology(int code) {
		this.trType = code;
	}

	public int code() {
		return trType;
	}

	public static RFTechnology getType(byte trType) {
		int rfTec = (ByteBlock.byteToNumber(trType) & 0xc0) >> 6;
		for (RFTechnology t : RFTechnology.values()) {
			if (rfTec == t.code())
				return t;
		}
		return RFTechnology.UNKNOWN;
	}
}
