/**
 * 
 */
package org.vote.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.vote.model.User;
import org.vote.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
*
* 项目名称：voteSSH-maven Maven Webapp
* 类名称：LoginAction
* 类描述：用户登录，用户的密码的修改 用户登出
* 创建人：ASUS
* 创建时间：2018年4月15日 下午11:12:33
* @version 1.0
*
*/	
@Controller
@Scope("prototype")
public class LoginAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	@Resource(name = "userService")// 注入userService
	private UserService userService;
	
	private User user;
	/*
	 * 用户登录
	 * */
	
	public String userLogin() throws Exception{
	//判断用户当前用户是否已登录、登录是否超时
	//HttpSession session = ServletActionContext.getRequest().getSession();
    //用户登录获取提交的数据进行库是对比
	User checkuser=userService.userLogin(user);
	//该用户不存在、重新输入
	if(checkuser==null){
		return "loginFaild";//登录失败，返回登录界面
	//用户存在	
	  }else{
		//将用户信息存在session中
			//((ActionContext) session).put("session", checkuser.getuName());
	   return "SUCCESS";
	        }
	}
	
	/*
	 * 登出
	 * */
	
	public String userLoginOut(){
		return null;
		
	}
	
	/*
	 * 修改密码
	 * **/
	
	public String changePassWord(){
		return null;
		
	}

	//set And get
	/*public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}*/

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}

