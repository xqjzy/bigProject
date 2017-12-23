package iservice;

import bean.Users;

public interface IRegister {
	//根据用户名，密码注册
	boolean register(Users user);
}
