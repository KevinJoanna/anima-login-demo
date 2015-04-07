package org.hdl.anima.demo.simple.game.action;

import java.io.IOException;

import org.hdl.anima.common.io.Decodeable;
import org.hdl.anima.common.io.InputArchive;

public class RequestObject extends Decodeable {

	private byte[] bytes;
	
	@Override
	public void decode(InputArchive input) throws IOException {
		bytes = input.readBuffer();
	}

	public byte[] getBytes() {
		return bytes;
	}
}
