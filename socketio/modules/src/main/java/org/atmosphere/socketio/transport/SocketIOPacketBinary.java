package org.atmosphere.socketio.transport;

import org.atmosphere.socketio.SocketIOPacket;

public class SocketIOPacketBinary implements SocketIOPacket {

	private final byte[] data;
	public SocketIOPacketBinary(byte[] data) {
		super();
		this.data = data;
	}

	@Override
	public boolean isBinary() {
		return true;
	}

	@Override
	public byte[] getBinary() {
		return data;
	}

}
