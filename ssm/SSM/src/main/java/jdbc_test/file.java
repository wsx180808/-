package jdbc_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @name:吴世祥
 * @Date：2019/4/3
 */
public class file {
    public static void main(String[] args) throws IOException {
        File file = new File("G:\\项目\\新建文件夹\\新建文本文档.txt");
        FileInputStream input = new FileInputStream(file);
        byte[] by = new byte[1024];
        int rea = input.read(by);
        System.out.println(new String(by,"GBK"));


    }
}
