package com.liwinon.interviewform.service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface mainService {
    Map<String,String> saveinfo(HttpServletRequest request);
    //Map<String,String> saveWorks(HttpServletRequest request);
}
