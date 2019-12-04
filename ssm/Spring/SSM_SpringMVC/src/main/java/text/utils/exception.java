package text.utils;

/**
 * name: 吳世祥
 * Date: 2019/6/5 20:24
 * Content:自定义异常类
 */
public class exception extends Exception {
    private String messoge;

    public exception(String messoge) {
        this.messoge = messoge;
    }

    public String getMessoge() {
        return messoge;
    }

    public void setMessoge(String messoge) {
        this.messoge = messoge;
    }
}
