<<<<<<< HEAD
package com.spring.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface MemberController {
	
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public ModelAndView addMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public ModelAndView removeMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public ModelAndView modMember(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView updateMember(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
=======
package com.spring.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface MemberController {
	
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public ModelAndView addMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public ModelAndView removeMember(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public ModelAndView modMember(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public ModelAndView updateMember(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
>>>>>>> afb31d9b9f65a8144dd12a3fb4853ed97ec5c837
