package dao;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import bean.Student;

public class IndexDao implements IDao{
    //在SSH的设计理念：要使用某个实例，那么就定义声明一个对象，然后
    //给它添加set方法（用于spring注入进来）
    //实现不要关注这个实例来自于那里，以及怎么创建，或者它是谁    
  


	@Override
	public boolean loginByAccount(Student stu) {
		
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        //获取session
        Session session = sessionFactory.openSession();
        
        Student stu1 = (Student) session.get(Student.class, 2);
       
        session.close();
        //关闭session
        //关闭sessionFactory
        sessionFactory.close();
        if(stu1.getUserName().equals(stu.getUserName()) && stu1.getPassword().equals(stu.getPassword())) {
        	return true;
        }else {
        	return false;
        }
        //后面当使用JPA的时候，EntityManager 类似于 Session
/*        Query query = session.createQuery("from BookCard");
        */
	}

}
