package YDY;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;


/**
 * @name:吴世祥
 * @Date：2019/7/17
 */
//消息生产者
public class JVSProducer {
    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER; // 默认的连接用户名
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD; // 默认的连接密码
    private static final String BROKEURL = ActiveMQConnection.DEFAULT_BROKER_URL; // 默认的连接地址

    public static void main(String[] args) {


        ConnectionFactory connectionFactory;//连接工厂
        Connection connection = null;//连接
        Session session;//会话
        Destination destination;//消息目的地
        MessageProducer messageProducer;//消息生产者

        connectionFactory = new ActiveMQConnectionFactory(USERNAME, PASSWORD, BROKEURL);

        try {
            connection = connectionFactory.createConnection();//通过工厂获取连接
            connection.start();//启动连接
            session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);//创建session
            destination = session.createQueue("短息队列");
            messageProducer = session.createProducer(destination);//创建消息生产者

            //发送消息
            for (int i = 0; i < 10; i++) {
                TextMessage msg = session.createTextMessage("吴世祥工作室客服" + (i + 1) + "号");
                messageProducer.send(destination, msg);
            }

            session.commit();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (JMSException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

}
