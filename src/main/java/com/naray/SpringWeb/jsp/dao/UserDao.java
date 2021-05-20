/**
 * 
 */
package com.naray.SpringWeb.jsp.dao;

import org.springframework.stereotype.Service;

import com.naray.SpringWeb.jsp.entity.User;

/**
 * @author naray
 *
 */
@Service
public interface UserDao {

	void save(User usr);
	

}
