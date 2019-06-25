/**
 * 
 */
package org.vote.service;

import org.vote.model.User;

/**
*
* 项目名称：voteSSH-maven Maven Webapp
* 类名称：UserServicer
* 类描述：
* 创建人：ASUS
* 创建时间：2018年4月15日 下午11:45:09
* @version
*
*/
public interface UserService {
	
	public User userLogin(User user);
	public void userChangePassword(User user);

}
