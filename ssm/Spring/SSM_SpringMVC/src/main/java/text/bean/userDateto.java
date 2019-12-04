package text.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * name: 吳世祥
 * Date: 2019/5/22 23:03
 * Content:
 */
//方法二
public class userDateto implements Serializable {


    private Date data;

    @Override
    public String toString() {
        return "userDate{" +
                "data=" + data +
                '}';
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
