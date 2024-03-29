package com.sungjoonhong.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JspController {
	
	@RequestMapping("/jsp")
    public String jsp() throws Exception {
        return "main";
    }

    //mapping abcd.jsp
    @RequestMapping("/abcd")
    public String abcd() throws Exception {
        return "abcd";
    }
    
    
    //ResponseBody shows return data
    @RequestMapping("/abcd2")
    public @ResponseBody String abcd2() throws Exception {
        return "abcd2";
    }
    
    @RequestMapping("/mav")
    public ModelAndView mav() throws Exception{
        ModelAndView mav = new ModelAndView("mav");
        
        mav.addObject("key", "fruits");
        
        List<String> fruitList = new ArrayList<String>();
        
        fruitList.add("apple");
        fruitList.add("orange");
        fruitList.add("banana");
         
        mav.addObject("value", fruitList);
        
        return mav;
    }


}
