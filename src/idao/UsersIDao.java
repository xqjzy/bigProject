package idao;

import bean.Users;

/*
 *create by ��Ө
 *Dec 22, 2017
 */
public interface UsersIDao {
	//�����û�user
	public void insertUser(Users user);
	
	//��ѯ�û�user�Ƿ����
	public boolean isExists(Users user);
	
	//��¼
	public boolean login(Users user);
}
