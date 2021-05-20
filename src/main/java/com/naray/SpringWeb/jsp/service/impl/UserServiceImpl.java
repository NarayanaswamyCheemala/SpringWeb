/**
 * 
 */
package com.naray.SpringWeb.jsp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naray.SpringWeb.jsp.dao.UserDao;
import com.naray.SpringWeb.jsp.entity.User;
import com.naray.SpringWeb.jsp.service.UserService;

/**
 * @author naray
 *
 */
@Service
public class UserServiceImpl  implements UserService{
	
	@Autowired
	UserDao dao;

	@Override
	public void save(User usr) {
		dao.save(usr);		
	}

}
