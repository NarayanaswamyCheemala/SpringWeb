/**
 * 
 */
package com.naray.SpringWeb.jsp.service;

import org.springframework.stereotype.Service;

import com.naray.SpringWeb.jsp.entity.User;

/**
 * @author naray
 *
 */
@Service
public interface UserService {

	public void save(User usr);
	
	

}
