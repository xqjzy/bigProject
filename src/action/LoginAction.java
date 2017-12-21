package action;



import com.opensymphony.xwork2.ActionSupport;

import bean.Student;
import login.ILogin;


public class LoginAction extends ActionSupport{
	    
	private static final long serialVersionUID = 1L;

	// 声明ILogin，但不给它创建具体的实现类的实例，
	private ILogin login = null;

	// 添加set()方法
	public void setLogin(ILogin login) {
		this.login = login;
	}

	private Student stu;

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	public String login() throws Exception{
		System.out.println("\n\n登录");
		if(login.LoginByAccount(this.stu)) {
			return "success";
		}else {
			return "fail";
		}
	}
}
