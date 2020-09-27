package cn.cdw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * @author DW-CHEN
 * 单文件上传
 */
@Controller
public class TestFileUp {

    @RequestMapping("/test1")
    public String test1(MultipartFile fileData, HttpServletRequest request) throws IOException {
        if (!fileData.isEmpty()) {
            String realPath = request.getServletContext().getRealPath("/files");
            fileData.transferTo(new File(realPath, fileData.getOriginalFilename()));//把文件上传到服务的webapp/file资源文件下
        }
        System.out.println("SUCCESS....");
        return "test.jsp";
    }
}
