package web04;

public class JDBCUtil {
	
	public static JDBCUtil instance = new JDBCUtil();
	
	private JDBCUtil() {
		
	}
	
	public void GetConnection() {
		System.out.println("�õ�һ�����ݿ�����");
	}
	
	public static void main(String[] args) {
		JDBCUtil.instance.GetConnection();
		
		JDBCUtil util = new JDBCUtil();
		util.GetConnection();
	}
}
