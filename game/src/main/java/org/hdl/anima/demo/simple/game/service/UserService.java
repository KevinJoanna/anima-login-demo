package org.hdl.anima.demo.simple.game.service;

import org.hdl.anima.demo.simple.game.model.User;

/**
 * User service 
 * @author qiuhd
 *
 */
public class UserService {
	
	public static class InternalClass {
		public final static UserService INSTANCE = new UserService();
	}
	
	public static UserService getInstance() {return InternalClass.INSTANCE;}
	
	/**
	 * 
	 * @param account
	 * @param pwd
	 * @param nickName
	 * @return
	 */
	public void register(User user) {
		UserStore.getInstance().addUser(user);
	}
	/**
	 * 
	 * @param account
	 * @return
	 */
	public boolean isExist(String account) {
		User user = UserStore.getInstance().getUser(account);
		return user == null ? false : true;
	}
	
	public User getUser(String account) {
		return UserStore.getInstance().getUser(account);
	}
}
