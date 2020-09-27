package cn.cdw.exception.advice;

import cn.cdw.exception.BusinessException;
import cn.cdw.exception.SystemException;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author DW-CHEN
 * 自定义异常处理器类型
 */
@Component
@ControllerAdvice
public class MyExceptionAdvice {

    @ExceptionHandler(BusinessException.class) //处理业务异常方法
    public String doBusinessException(Exception e, Model model) {
        model.addAttribute("msg","出现了业务异常："+e);
        return "error.jsp";
    }

    @ExceptionHandler(SystemException.class) //处理系统异常方法
    public String doSystemException(Exception e, Model model) {
        model.addAttribute("msg", e);
        return "error.jsp";
    }

    @ExceptionHandler(Exception.class)
    public String doException(Exception e, Model model) {
        model.addAttribute("msg", e);
        return "error.jsp";
    }

}
