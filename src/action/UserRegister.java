package action;
/*
 *create by ��Ө
 *Dec 22, 2017
 */

import bean.Users;
import iservice.IRegister;

public class UserRegister {
	private static final long serialVersionUID = 1L;
	
	private IRegister iregister;//����springע��
	private Users user;//�ӱ��л��ֵ
	public IRegister getIregister() {
		return iregister;
	}
	public Users getUser() {
		return user;
	}
	public void setIregister(IRegister iregister) {
		this.iregister = iregister;
	}
	public void setUser(Users user) {
		this.user = user;
	}


	public String register() throws Exception{
		System.out.println("ע���û�");
		if(iregister.register(user)) {
			return "success";
		}else {
			return "fail";
		}
	}
}
