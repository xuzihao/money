package cn.banana.money.service;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.banana.money.dao.UserDao;
import cn.banana.money.dao.User;


@Service
public class LoginService {
	private static final Logger log = Logger.getLogger(LoginService.class);  
	@Autowired
	private UserDao userDao;
	
	 public boolean login(String username, String password){
		 
		 User user= userDao.getUserByID(1);
		 log.debug(user);
		 
		 if(username.equals(user.getName())){
			 return true;
		 }else{
			 return false;
		 }
		 
		
	 }

}
