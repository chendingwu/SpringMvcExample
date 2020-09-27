package cn.cdw.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author DW-CHEN
 * 自定义异常处理器
 */
@Component
public class MyException implements HandlerExceptionResolver {
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

        ModelAndView modelAndView = new ModelAndView();
        if (e instanceof ArithmeticException) {
            modelAndView.addObject("msg", "出异常了，数字处理异常...");
        }else {
            modelAndView.addObject("msg", "出异常了，其它异常：" + e);
        }
        modelAndView.setViewName("error.jsp");//跳转到异常页面
        return modelAndView;
    }
}
