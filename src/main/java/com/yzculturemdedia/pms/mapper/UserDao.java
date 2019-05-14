package com.yzculturemdedia.pms.mapper;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.yzculturemdedia.pms.bean.User;

 
public interface UserDao extends CrudRepository<User,Long> {
     User save(User user);
     
     List<User> findAll();
}
