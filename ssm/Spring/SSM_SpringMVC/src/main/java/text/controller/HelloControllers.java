package text.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import text.bean.user;


import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

import java.util.UUID;

/**
 * name: 吳世祥
 * Date: 2019/6/3 19:31
 * Content:
 */
@Controller
@RequestMapping("/hallo")
public class HelloControllers {

    @RequestMapping(value = "/testajax")
    //使用@RequestBody获取ajax的json
    @ResponseBody
    public user testajax(@RequestBody user us) {
        System.out.println(us.toString());
        //做响应
        us.setName("吴世祥");
        us.setPassword("wushixiang");
        return us;
    }

    @RequestMapping(value = "/testfile")
    public void testfile(HttpServletRequest request, MultipartFile flie) {
        //判断是否有该文件夹
        String path = request.getSession().getServletContext().getRealPath("/file/");
        System.out.println(path);
        File fi = new File(path);
        if (!fi.exists()) {
            fi.mkdirs();
        }
        //将上传文件名改成唯一
        String fliename = flie.getOriginalFilename();
        String uid = UUID.randomUUID().toString().replace("-", "");
        fliename = uid + "_" + fliename;
        //上传
        try {
            flie.transferTo(new File(path, fliename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("上传成功");
    }

    @RequestMapping(value = "/testfiles")
    public void testfiles(MultipartFile flie) {
        System.out.println("跨服上传");
        //定义跨服务器上传路径
        String ulr = "http://localhost:9090/flie";

        //将上传文件名改成唯一
        String fliename = flie.getOriginalFilename();
        String uid = UUID.randomUUID().toString().replace("-", "");
        fliename = uid + "_" + fliename;
        //跨服务器上传
        //创建客户端对象
        Client client = Client.create();

        //和图片服务器连接
        WebResource webResource = client.resource(ulr + "/" + fliename);
        //上传
        try {
            webResource.put(flie.getBytes());
        } catch (
                IOException e) {
            e.printStackTrace();
        }


        System.out.println("上传成功");
    }
}
