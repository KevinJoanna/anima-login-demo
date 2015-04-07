package org.hdl.anima.demo.simple.game.action;

import org.hdl.anima.demo.simple.game.action.RegisterResp;

/**
 * 
 * @author qiuhd
 *
 */
public final class Constants {

	public static final class ID {
		/**
		 * 注册消息id
		 */
		public static final int REGISTER = 1;
		/**
		 * 登录消息id
		 */
		public static final int LOGIN = 2;
		/**
		 * For test
		 */
		public static final int TEST = 3;
	}
	/**
	 * 错误码
	 * @author qiuhd
	 *
	 */
	public static final class ErrorCode {
		/**
		 * 账号重复
		 */
		public static final int ACCOUNT_REPEAT = 1000;
		/**
		 * 账号为空
		 */
		public static final int ACCOUNT_IS_EMPTY = 1001;
		/**
		 * 密码为空
		 */
		public static final int PWD_IS_EMPTY = 1002;
		/**
		 * 密码确认为空
		 */
		public static final int PWD_CONFIRM_IS_EMPTY = 1003;
		/**
		 * 密码确认为空
		 */
		public static final int INPUT_PWD_NOT_EQUALS = 1004;
		/**
		 * 账号已存在
		 */
		public static final int ACCOUNT_ALREADY_EXISTS = 1005;
		/**
		 * 账号不存在
		 */
		public static final int ACCOUNT_NOT_EXISTS = 1006;
		/**
		 * 密码不正确
		 */
		public static final int PWD_NOT_CORRECT = 1007;
	}
}
