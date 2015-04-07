package org.hdl.anima.demo.simple.game.model;
/**
 * 
 * @author qiuhd
 *
 */
public class User {

	private String account;
	private String password;
	private String nickName;
	private boolean login;
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	public void setLogin(boolean login) {
		this.login = login;
	}
}
