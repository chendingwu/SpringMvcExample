package cn.cdw.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author DW-CHEN
 * 注解方式自定义异常处理器
 */
@Component
@ControllerAdvice
public class MyException {
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public String exception1() {
        return "EXCEPTION,ArithmeticException...";
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String allException(Exception e) {
        return "EXCEPTION：" + e;
    }
}
