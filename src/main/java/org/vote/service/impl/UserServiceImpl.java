/**
 * 
 */
package org.vote.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.vote.dao.UserDao;
import org.vote.model.User;
import org.vote.service.UserService;

/**
*
* 项目名称：voteSSH-maven Maven Webapp
* 类名称：UserServicerImpl
* 类描述：用户登录
* 创建人：ASUS
* 创建时间：2018年4月15日 下午11:46:52
* @version
*
*/
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource(name="userDao")// 注入userDao
	private UserDao userDao;
	
	/* (non-Javadoc)
	 * @see org.vote.service.UserService#userLogin(org.vote.model.User)
	 * 用户进行登录操作
	 */
	@Override
	public User userLogin(User user) {
	    // TODO Auto-generated method stub
		return	userDao.userLogin(user);//调用Dao层，返回结果。
		
		
	}
	/* (non-Javadoc)
	 * @see org.vote.service.UserService#userChangePassword(org.vote.model.User)
	 * 用户修改密码
	 */
	@Override
	public void userChangePassword(User user) {
		// TODO Auto-generated method stub
		
	}

	//set And Get
	/*public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}*/

	

	
}
