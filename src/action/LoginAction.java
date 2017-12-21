package action;



import com.opensymphony.xwork2.ActionSupport;

import bean.Student;
import login.ILogin;


public class LoginAction extends ActionSupport{
	    
	private static final long serialVersionUID = 1L;

	// ����ILogin�������������������ʵ�����ʵ����
	private ILogin login = null;

	// ���set()����
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
		System.out.println("\n\n��¼");
		if(login.LoginByAccount(this.stu)) {
			return "success";
		}else {
			return "fail";
		}
	}
}
