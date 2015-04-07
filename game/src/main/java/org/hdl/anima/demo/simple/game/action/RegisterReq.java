package org.hdl.anima.demo.simple.game.action;

import java.io.IOException;

import org.hdl.anima.common.io.Decodeable;
import org.hdl.anima.common.io.InputArchive;

import com.google.common.base.Ticker;
/**
 * 注册请求参数
 * @author qiuhd
 *
 */
public class RegisterReq extends Decodeable{
	
	private String account;	
	private String pwd;
	private String pwdConfirm;
	private String nickName;
	
	@Override
	public void decode(InputArchive input) throws IOException {
		this.account = input.readString();
		this.pwd = input.readString();
		this.pwdConfirm = input.readString();
		this.nickName = input.readString();
	}

	public String getAccount() {
		return account;
	}

	public String getPwd() {
		return pwd;
	}

	public String getPwdConfirm() {
		return pwdConfirm;
	}

	public String getNickName() {
		return nickName;
	}
}
