

package com.isi.work.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**  @Author Salmi Ismail**/

@Controller
@RequestMapping("/owners")
public class OwnerController {

	@RequestMapping({"","/index","/index.html"})
    public String listOwners(){

        return "owners/index";
    }
}

