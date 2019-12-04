package text.bean;

import java.io.Serializable;

/**
 * name: 吳世祥
 * Date: 2019/5/22 20:38
 * Content:
 */
public class user2 implements Serializable {
    private String aihao;
    private String aa;

    @Override
    public String toString() {
        return "user2{" +
                "aihao='" + aihao + '\'' +
                ", aa='" + aa + '\'' +
                '}';
    }

    public String getAihao() {
        return aihao;
    }

    public void setAihao(String aihao) {
        this.aihao = aihao;
    }

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }
}
