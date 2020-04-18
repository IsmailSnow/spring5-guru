

package com.isi.work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**  @Author Salmi Ismail**/


@Controller
@RequestMapping("/vets")
public class VetController {

	
	@RequestMapping({"","/index","/index.html"})
	public String listVets() {
		return "vets/index";
	}
	
}

