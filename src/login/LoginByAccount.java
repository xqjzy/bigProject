package login;

import java.util.List;

import bean.Student;
import dao.IndexDao;


//����IndexServiceImpl(ʵ����)ʵ��IndexService�ӿ�
public class LoginByAccount implements ILogin {

    //daoʵ��ʹ��ע�뷽ʽ
    private IndexDao id;
    //����ע��ʹ��
    public void setId(IndexDao id) {
        this.id = id;
    }



	@Override
	public boolean LoginByAccount(Student stu) {
        //����Ӧ�ñ�дҵ���߼��Ĵ��룬
        //������û��ҵ���߼����Ͳ���д��
        
        //�������ݿ�Ĵ��룬���������service��һ��
        //����dao���������ݿ�
      //  List<BookCard> myBookCardList = id.getAllBookCard();
        
        //����������ҵ���߼��������������Ӷ�һ��ѡ��Ƿ����
        //��������Ҫ
        //....
        return id.loginByAccount(stu);
	}

}
