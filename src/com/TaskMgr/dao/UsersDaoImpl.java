package com.TaskMgr.dao ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;
import com.TaskMgr.bean.Users;
import java.util.List;


public class UsersDaoImpl  implements UsersDao {

	private SessionFactory ssessionFactory;
	private Session session;
	public void setSessionFactory(SessionFactory session) {this.ssessionFactory=session;}
	private Session getSession() {
		session =ssessionFactory.openSession();
		return session;
	}
	
	public Users findoneuser(Users user) {
		// TODO Auto-generated method stub
	//hibernate3  List<Users> ul=	getHibernateTemplate().find("from Users where LongName = ? and password = ?",user.getLOGINNAME(),user.getPASSWORD());
		Query query= this.getSession().createQuery("from Users where LoginName = ? and password = ?");
		query.setParameter(1, user.getPASSWORD());
		query.setParameter(0, user.getLOGINNAME());		
		List<Users> ul = query.list();
		session.close();
	  if (ul !=null && ul.size()>0) {
		  return ul.get(0);
	  }
	  
		return null;
	}

}
