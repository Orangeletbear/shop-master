/**
 * 
 */
package org.vote.dao.impl;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.vote.dao.UserDao;
import org.vote.model.User;

/**
*
* 项目名称：voteSSH-maven Maven Webapp
* 类名称：UserDaoImpl
* 类描述：
* 创建人：ASUS
* 创建时间：2018年4月15日 下午11:48:44
* @version
*
*/
@Repository(value="userDao")//@Repository对应数据访问层Bean
@Transactional
public class UserDaoImpl implements UserDao{
	
    //当需要使用sessoinFactory的时候，Spring会将sessionFactory注入进来
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;//定义一个sessionFactory
	
	/*protected SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}*/
	
	public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

	/* (non-Javadoc)
	 * @see org.vote.dao.UserDao#userLogin(org.vote.model.User)
	 * 用户登录
	 */
	@Override
	public User userLogin(User user) throws HibernateException {
		// TODO Auto-generated method stub
           //查询用户的信息
			Query query=getSession().createQuery("from User user where name=? and passWd=?");
			query.setParameter(0,user.getName());
			query.setParameter(1,user.getPassWd());
		    return (User) query.uniqueResult();//返回一个结果集;
/*		try {
			Query query=getSession().createQuery(
				      "from User user where user.name=?and user.passWd=?");
			query.setParameter(0,user.getName());
			query.setParameter(1,user.getPassWd());
			return (User) query.uniqueResult();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;*/
		
	}

	/* (non-Javadoc)
	 * @see org.vote.dao.UserDao#userChangePassword(org.vote.model.User)
	 * 用户修改密码
	 */
	@Override
	public void userChangePassword(User user) throws HibernateException {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.vote.dao.UserDao#userUpdataLogintime(org.vote.model.User)
	 * 更新用户的登录时间
	 */
	@Override
	public void userUpdataLogintime(User user) throws HibernateException {
		// TODO Auto-generated method stub
		
	}

	
	
	


}
