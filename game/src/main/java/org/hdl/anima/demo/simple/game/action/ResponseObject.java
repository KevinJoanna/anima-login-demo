package org.hdl.anima.demo.simple.game.action;

import java.io.IOException;

import org.hdl.anima.common.io.Encodeable;
import org.hdl.anima.common.io.OutputArchive;
/**
 * 
 * @author public
 *
 */
public class ResponseObject extends Encodeable {

	private byte[] bytes;
	
	@Override
	public void encode(OutputArchive output) throws IOException {
		output.writeBuffer(bytes);
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
}
