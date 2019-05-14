package com.yzculturemdedia.pms.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yzculturemdedia.pms.bean.User;
import com.yzculturemdedia.pms.mapper.UserDao;

@RestController
public class UserController {
	@Resource
	private UserDao ud;
	
	@RequestMapping("/getuser.action")
    public List<User> getUser(){
    	 return ud.findAll();
    }
	
	@RequestMapping("/save.action")
    public User saveUser(User user){
    	 return ud.save( user);
    }
}
