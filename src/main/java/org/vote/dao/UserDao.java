/**
 * 
 */
package org.vote.dao;

import org.hibernate.HibernateException;
import org.vote.model.User;

/**
*
* 项目名称：voteSSH-maven Maven Webapp
* 类名称：UserDao
* 类描述：
* 创建人：ASUS
* 创建时间：2018年4月15日 下午11:47:57
* @version
*
*/
public interface UserDao {
	
	 User userLogin(User user)throws HibernateException;
	 void userChangePassword(User user)throws HibernateException;
	 void userUpdataLogintime(User user)throws HibernateException;

}
