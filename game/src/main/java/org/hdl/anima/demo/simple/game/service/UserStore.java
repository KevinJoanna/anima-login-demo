package org.hdl.anima.demo.simple.game.service;

import java.util.Map;

import org.hdl.anima.demo.simple.game.model.User;
import org.jboss.netty.util.internal.ConcurrentHashMap;
/**
 * User store
 * @author qiuhd
 *
 */
public class UserStore {
	
	public static class InternalClass {
		public final static UserStore INSTANCE = new UserStore();
	}
	
	public static UserStore getInstance() {return InternalClass.INSTANCE;}
	
	
	private Map<String,User> userCache = new ConcurrentHashMap<String, User>();
	
	public void addUser(User user) {
		if (user == null) {
			throw new NullPointerException("user == null");
		}
		this.userCache.put(user.getAccount(), user);
	}
	
	public User getUser(String account) {
		return userCache.get(account);
	}
	
	public void removeUser(String account) {
		userCache.remove(account);
	}
	
}
