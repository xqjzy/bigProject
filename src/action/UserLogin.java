package action;


import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;

import com.opensymphony.xwork2.ActionContext;

import bean.Users;
import iservice.ILogin;
import iservice.IRegister;

/*
 *create by 123
 *Dec 22, 2017
 */
public class UserLogin {
	private static final long serialVersionUID = 1L;
	
	private ILogin ilogin;//����springע��
	private Users user;//�ӱ��л��ֵ
	public ILogin getIlogin() {
		return ilogin;
	}
	public void setIlogin(ILogin ilogin) {
		this.ilogin = ilogin;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}

	public String login() throws Exception{
		System.out.println("�û���¼");

		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("hh", "bbbbbbbbbbbb");
		System.out.println(session.getAttribute("hh"));
        //session.setMaxInactiveInterval(60);
		if(ilogin.login(user)) {
			return "success";
		}else {
			return "fail";
		}
	}
}