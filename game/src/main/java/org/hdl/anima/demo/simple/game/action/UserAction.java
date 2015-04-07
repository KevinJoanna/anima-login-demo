package org.hdl.anima.demo.simple.game.action;

import org.hdl.anima.common.io.Encodeable;
import org.hdl.anima.demo.simple.game.action.Constants.ErrorCode;
import org.hdl.anima.demo.simple.game.action.Constants.ID;
import org.hdl.anima.demo.simple.game.model.User;
import org.hdl.anima.demo.simple.game.service.UserService;
import org.hdl.anima.handler.action.annotation.Action;
import org.hdl.anima.handler.action.annotation.RequestMapping;
import org.hdl.anima.protocol.Response;
import org.hdl.anima.session.BackendSession;

/**
 * 
 * @author qiuhd
 *
 */
@Action
public class UserAction {
	
	@RequestMapping(value=ID.REGISTER,param=RegisterReq.class)
	public RegisterResp register(RegisterReq req,BackendSession session,Response response) {
		RegisterResp resp = null;
		String account = req.getAccount();
		if (account == null && "".equals(account)) {
			response.setErrorCode(ErrorCode.ACCOUNT_IS_EMPTY);
			response.setErrorDes("账号不能为空");
			return null;
		}
		String pwd = req.getPwd();
		if (pwd == null && "".equals(pwd)) {
			response.setErrorCode(ErrorCode.PWD_IS_EMPTY);
			response.setErrorDes("密码不能为空");
			return resp;
		}
		String pwdConfirm = req.getPwdConfirm();
		if (pwdConfirm == null && "".equals(pwdConfirm)) {
			response.setErrorCode(ErrorCode.PWD_CONFIRM_IS_EMPTY);
			response.setErrorDes("密码确认不能为空");
			return resp;
		}
		if (!pwd.equals(pwdConfirm)) {
			response.setErrorCode(ErrorCode.INPUT_PWD_NOT_EQUALS);
			response.setErrorDes("二次密码不相同");
			return resp;
		}
		String nickName = req.getNickName();
		
		if (UserService.getInstance().isExist(account)) {
			response.setErrorCode(ErrorCode.ACCOUNT_ALREADY_EXISTS);
			response.setErrorDes("账号已存在");
			return resp;
		}
		User user = new User();
		user.setAccount(account);
		user.setPassword(pwd);
		user.setNickName(nickName);
		UserService.getInstance().register(user);
		resp = new RegisterResp();
		resp.setAccount(account);
		return resp;
	}
	
	@RequestMapping(value=ID.LOGIN,param=LoginReq.class)
	public LoginResp login(LoginReq req,BackendSession session,Response response) {
		LoginResp resp = null;
		String account = req.getAccount();
		if (account == null && "".equals(account)) {
			response.setErrorCode(ErrorCode.ACCOUNT_IS_EMPTY);
			response.setErrorDes("账号不能为空");
			return null;
		}
		
		String pwd = req.getPwd();
		if (pwd == null && "".equals(pwd)) {
			response.setErrorCode(ErrorCode.PWD_IS_EMPTY);
			response.setErrorDes("密码不能为空");
			return resp;
		}
		
		User user = UserService.getInstance().getUser(account);
		
		if (user == null) {
			response.setErrorCode(ErrorCode.ACCOUNT_NOT_EXISTS);
			response.setErrorDes("账号不存在");
			return resp;
		}
		
		if (!user.getPassword().equals(pwd)) {
			response.setErrorCode(ErrorCode.ACCOUNT_NOT_EXISTS);
			response.setErrorDes("账号不存在");
			return resp;
		}
		user.setLogin(true);
		session.setAttribute("User", user);
		resp = new LoginResp();
		resp.setAccount(account);
		return resp;
	}
}
