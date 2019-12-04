package YDY;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @name:吴世祥
 * @Date：2019/7/17
 */
public class MyMessageListener implements MessageListener {
    public void onMessage(Message message) {
        try {
            TextMessage messag = (TextMessage) message;
            if (messag != null) {
                System.out.println(messag.getText());//获取消息
            }
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
