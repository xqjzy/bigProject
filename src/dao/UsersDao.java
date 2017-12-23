package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import bean.Users;
import idao.UsersIDao;

/*
 *create by ��Ө
 *Dec 22, 2017
 */
public class UsersDao implements UsersIDao{

	@Override
	public void insertUser(Users user) {
		

        //��ȡsession
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        //����user
        Transaction tran = session.beginTransaction();
        Users user1 = new Users();
        user1.setPassword(user.getPassword());
        user1.setUsername(user.getUsername());
        System.out.println(user.getUsername());
        session.save(user1);
        tran.commit();
        
        //�ر�session
        //�ر�sessionFactory
        session.close();
        sessionFactory.close();
	}

	@Override
	public boolean isExists(Users user) {
		
        //��ȡsession
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        //hql��ѯ
        String hql = " from Users where username = '" + user.getUsername() + "'";
        System.out.println(hql);
        Query query = session.createQuery(hql);
        List list = query.list();
        
        //�ر�session
        //�ر�sessionFactory
        session.close();
        sessionFactory.close();
        if(list.size()>=1) {
        	return true;
        }else {
    		return false;
        }
	}

	@Override
	public boolean login(Users user) {
		
        //��ȡsession
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        //hql��ѯ
        String hql = " from Users where username = '" + user.getUsername() + "'  "
        		+ "and password = '" + user.getPassword() + "'"; 
        System.out.println(hql);
        Query query = session.createQuery(hql);
        List list = query.list();
        
        //�ر�session
        //�ر�sessionFactory
        session.close();
        sessionFactory.close();
        if(list.size()>=1) {
        	//��¼�ɹ�
        	return true;
        }else {
    		return false;
        }
	}

}
