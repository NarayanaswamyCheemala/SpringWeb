/*
 * Copyright 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.naray.SpringWeb.jsp;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.naray.SpringWeb.jsp.entity.User;
import com.naray.SpringWeb.jsp.service.UserService;

@Controller
public class WelcomeController {

	@Autowired
	UserService service;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", "Naray this is my first application");
		return "welcome";
	}
	
	
	 @RequestMapping(value = "/register", method = RequestMethod.GET)
	  public String showRegister(HttpServletRequest request, HttpServletResponse response) {
	    //ModelAndView mav = new ModelAndView("register");
	    return "register";
	  }
	 
	 @RequestMapping(value="/save",method = RequestMethod.POST)  
	    public String save(@ModelAttribute("usr") User usr){  
	        service.save(usr);  
	        return "success";//will redirect to viewemp request mapping  
	    } 
	 
	 
	 

}
