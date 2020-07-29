package com.liwinon.interviewform.controller;

import com.liwinon.interviewform.service.mainService;
import com.liwinon.interviewform.util.WordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
@RequestMapping(value = "/inform")
public class indexController {
    @Autowired
    mainService m;
    //职员
    @GetMapping(value = "/index")
    public String index(){
        return "index";
    }

    @PostMapping(value = "/save")
    @ResponseBody
    public String save(HttpServletRequest request){
        Map<String,String>data =  m.saveinfo(request);
        String path0 =  data.get("iname0");
        String path1 = data.get("postDate0");
        String path="C:\\Users\\gongchen\\Desktop\\EHR\\"+path0+"_聘用登记表_"+path1+".doc"; //要写入的地址
        WordUtil.writeFile(path,WordUtil.readFileContent("C:\\Users\\gongchen\\Desktop\\EHR\\interview-form-master\\src\\main\\resources\\F-LWN-31.2.1-R01 入职申请表（职员）.xml",data));
        return "ok";
    }
    //普工
/*    @GetMapping(value = "/works")
    public String worker(){
        return "works";
    }
    @PostMapping(value = "/saveWorks")
    @ResponseBody
    public String saveWorks(HttpServletRequest request){
        Map<String,String>data =  m.saveWorks(request);
        String path0 =  data.get("iname0");
        String path1 = data.get("iphone0");
        String path="\\\\172.60.6.66\\部门管理\\HR\\002-招聘管理\\入职登记表\\员工\\"+path0+path1+".doc"; //要写入的地址
        //String path = "D:\\DOCS\\1\\"+path0+path1+".doc";
        //String path = "D:\\DOCS\\各类需求文档,说明,报告,分析\\面试无纸化相关文档\\test\\"+path0+path1+".doc";
        WordUtil.writeFile(path,WordUtil.readWorksFileContent("D:\\DOCS\\F-LWN-31.2.2-R01入职申请表（员工）.xml",data));
        return "ok";
    }*/

}
