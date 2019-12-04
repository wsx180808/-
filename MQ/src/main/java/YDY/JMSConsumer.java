package YDY;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @name:吴世祥
 * @Date：2019/7/17
 */
//消费者
public class JMSConsumer {

    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER; // 默认的连接用户名
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD; // 默认的连接密码
    private static final String BROKEURL = ActiveMQConnection.DEFAULT_BROKER_URL; // 默认的连接地址

    public static void main(String[] args) {


        ConnectionFactory connectionFactory;//连接工厂
        Connection connection = null;//连接
        Session session;//会话
        Destination destination;//消息目的地
        MessageConsumer consumer;//消息消费者

        connectionFactory = new ActiveMQConnectionFactory(USERNAME, PASSWORD, BROKEURL);

        try {
            connection = connectionFactory.createConnection();//通过工厂获取连接
            connection.start();//启动连接
            session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);//创建session
            destination = session.createQueue("短息队列");
            consumer = session.createConsumer(destination);//创建消息消费者


            for (int i = 0; i < 11; i++) {
                TextMessage message = (TextMessage) consumer.receive(10000);
                if (message != null) {
                    System.out.println(message.getText());//获取消息
                }
            }
//拉取消息（监视器）第二种方式
//            while (true) {
//                TextMessage message = (TextMessage) consumer.receive(10000);
//                if (message != null) {
//                    System.out.println(message.getText());//获取消息
//                }
//            }
//拉取消息（监视器）第三种方式
            consumer.setMessageListener(new MyMessageListener());


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
