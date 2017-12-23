package idao;

import bean.Users;

/*
 *create by 乔莹
 *Dec 22, 2017
 */
public interface UsersIDao {
	//插入用户user
	public void insertUser(Users user);
	
	//查询用户user是否存在
	public boolean isExists(Users user);
	
	//登录
	public boolean login(Users user);
}
