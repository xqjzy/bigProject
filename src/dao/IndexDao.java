package dao;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import bean.Student;

public class IndexDao implements IDao{
    //��SSH��������Ҫʹ��ĳ��ʵ������ô�Ͷ�������һ������Ȼ��
    //�������set����������springע�������
    //ʵ�ֲ�Ҫ��ע���ʵ������������Լ���ô��������������˭    
  


	@Override
	public boolean loginByAccount(Student stu) {
		
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        //��ȡsession
        Session session = sessionFactory.openSession();
        
        Student stu1 = (Student) session.get(Student.class, 2);
       
        session.close();
        //�ر�session
        //�ر�sessionFactory
        sessionFactory.close();
        if(stu1.getUserName().equals(stu.getUserName()) && stu1.getPassword().equals(stu.getPassword())) {
        	return true;
        }else {
        	return false;
        }
        //���浱ʹ��JPA��ʱ��EntityManager ������ Session
/*        Query query = session.createQuery("from BookCard");
        */
	}

}
