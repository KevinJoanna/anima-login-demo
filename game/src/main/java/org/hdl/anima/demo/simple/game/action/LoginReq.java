package org.hdl.anima.demo.simple.game.action;

import java.io.IOException;

import org.hdl.anima.common.io.Decodeable;
import org.hdl.anima.common.io.InputArchive;
/**
 * Login request parameter
 * @author qiuhd
 *
 */
public class LoginReq extends Decodeable{
	
	private String account;
	private String pwd;
	
	@Override
	public void decode(InputArchive input) throws IOException {
		this.account = input.readString();
		this.pwd = input.readString();
	}

	public String getAccount() {
		return account;
	}

	public String getPwd() {
		return pwd;
	}
}
