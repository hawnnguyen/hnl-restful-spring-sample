/**
 * 
 */
package com.hnl.rest.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author hawnnguyen
 *
 */
@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {
	
	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String helloWorld(@PathVariable String name, ModelMap model) {
		model.addAttribute("name", name);
		return "list";
	}
}
