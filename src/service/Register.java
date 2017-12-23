package service;

import bean.Users;
import idao.UsersIDao;
import iservice.IRegister;

/*
 *create by 乔莹
 *Dec 22, 2017
 */
public class Register implements IRegister{//IRegister接口实现类

	//利用spring注入
	UsersIDao uidao;
	public UsersIDao getUidao() {
		return uidao;
	}
	public void setUidao(UsersIDao uidao) {
		this.uidao = uidao;
	}

	@Override
	public boolean register(Users user) {
		System.out.println(uidao.isExists(user));
		if(!uidao.isExists(user)) {
			uidao.insertUser(user);
			return true;
		}else {
			return false;
		}
	}

}
