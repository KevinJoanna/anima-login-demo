package org.hdl.anima.demo.simple.game.action;

import java.io.IOException;

import org.hdl.anima.common.io.Encodeable;
import org.hdl.anima.common.io.OutputArchive;
/**
 * 
 * @author qiuhd
 *
 */
public class RegisterResp extends Encodeable {

	private String account;
	
	@Override
	public void encode(OutputArchive output) throws IOException {
		output.writeString(this.account);
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
}
