package cn.banana.money.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.banana.money.service.LoginService;


@Controller
public class MainController {
	
	@Autowired
	private LoginService service;

    @RequestMapping("login.do")
    public String login(String username,String password){
    	
    	if(service.login(username,password)){
   		 	return "success";
	   	}else{
	   		return "fail";
	   	}
    }
    
    @RequestMapping("test.do")
    public  @ResponseBody String test(String length){
    	
   		 return length;
    }
    
}