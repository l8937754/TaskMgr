package com.TaskMgr.dao;

import java.util.List;
import com.TaskMgr.bean.Notice;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Query;

public class NoticeImpl implements INotice{
	
	private SessionFactory sessionFactory;
	private Session session;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}
	private Session getSession() {
		session= sessionFactory.openSession();
		return session;
	}

	@Override
	public List<Notice> getalllist() {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("select Idno,ChangeNotice from Notice");
		@SuppressWarnings("unchecked")
		List <Notice> list = query.list();
		session.close();
		return list;
	}

	@Override
	public void save(Notice notice) {
		getSession().save(notice);
		// TODO Auto-generated method stub
		session.close();
	}
	@Override
	public List<Notice> findByPage(int[] noticePage) {
		
		// TODO Auto-generated method stub
		try {
	    Query query = getSession().createSQLQuery("select * from Notice").addEntity(Notice.class);
	    query.setFirstResult(noticePage[0]);
	    query.setMaxResults(noticePage[1]);
	    List<Notice> l = query.list();
	    session.close();
	    return l;
	    
		}catch(Exception e) {e.printStackTrace();
		return null;}
		
		
	}

}
