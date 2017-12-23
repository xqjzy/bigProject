package service;

import bean.Users;
import idao.UsersIDao;
import iservice.ILogin;

/*
 *create by 123
 *Dec 22, 2017
 */
public class Login implements ILogin{
	UsersIDao ui;//spring×¢Èë
	public UsersIDao getUi() {
		return ui;
	}
	public void setUi(UsersIDao ui) {
		this.ui = ui;
	}
	public boolean login(Users user) {
		if(ui.login(user)) {
			return true;
		}else {
			return false;
		}
	}

}
