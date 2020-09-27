package cn.cdw.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author DW-CHEN
 * 自定义的日期类型转换器，将一个String类型日期格式转换为Date日期类型格式
 */
public class DateConverter implements Converter<String, Date> {

    public Date convert(String s) {
        DateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parseDate = null;
        try {
            parseDate = DateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parseDate;
    }
}
