package action;
/*
 *create by 乔莹
 *Dec 22, 2017
 */

import bean.Users;
import iservice.IRegister;

public class UserRegister {
	private static final long serialVersionUID = 1L;
	
	private IRegister iregister;//利用spring注入
	private Users user;//从表单中获得值
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
		System.out.println("注册用户");
		if(iregister.register(user)) {
			return "success";
		}else {
			return "fail";
		}
	}
}
