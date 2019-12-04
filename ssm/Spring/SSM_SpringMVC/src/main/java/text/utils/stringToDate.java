package text.utils;


import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * name: 吳世祥
 * Date: 2019/5/22 23:37
 * 自定义转换器
 * Content:
 */
public class stringToDate implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        if (source == null) {
            throw new RuntimeException("没有传入值");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return df.parse(source);
        } catch (Exception e) {
            throw new RuntimeException("转换失败");
        }


    }
}
