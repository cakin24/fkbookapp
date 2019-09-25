package org.fkit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**   
 * @Description: 
 * <br>网站：<a href="http://www.fkit.org">疯狂Java</a> 
 * @author 肖文吉	36750064@qq.com   
 * @version V1.0   
 */

/**
 * 页面跳转控制器
 * */
@Controller
public class FormController{

	@RequestMapping(value="/loginForm")
	 public String loginForm(){
		// 跳转页面
		return "loginForm";
	}

}

