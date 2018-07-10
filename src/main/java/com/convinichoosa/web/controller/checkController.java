package com.convinichoosa.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.convinichoosa.business.domain.Name;
import com.convinichoosa.business.repository.CheckRepository;

@Controller
public class checkController {
	
	@Autowired
	private CheckRepository checkRepository;
	
	@RequestMapping(value = "/", method= RequestMethod.GET)
	public ModelAndView check(ModelAndView mav) {
		mav.setViewName("/check/index");
		return mav;
	}
	
	@RequestMapping (value = "check/index", method = RequestMethod.POST)
	public ModelAndView createData(Name newName, ModelAndView mav) {
		checkRepository.saveAndFlush(newName);
		mav.setViewName("check/complete");
		return mav;
		
	}

}
