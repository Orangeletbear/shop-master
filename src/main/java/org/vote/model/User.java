package org.vote.model;

/**
*
* 项目名称：voteSSH-maven Maven Webapp
* 类名称：User
* 类描述：用户
* 创建人：ASUS
* 创建时间：2018年4月15日 下午9:13:30
* @version 1.0
*
*/
public class User implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer uId;       //id
	private String name;      //用户名
	private String passWd;     //密码
	private String loginTime;  //登录时间
	
	//构造方法
	public User(){
	}
	public User(String name,String passWd,String loginTime){
		this.name=name;
		this.passWd=passWd;
		this.loginTime=loginTime;	
	}
	
	//set And get
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassWd() {
		return passWd;
	}
	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	
	//toString
	public String toString(){
		return "user:{["+name+"]["+passWd+"][loginTime:"+loginTime+"]}";	
	}
}
