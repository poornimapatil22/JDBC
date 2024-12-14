package com.xworkz.xworkzAdminDetails.controller;

import com.xworkz.xworkzAdminDetails.dto.XworkzDto;
import com.xworkz.xworkzAdminDetails.service.XworkzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
@RequestMapping("/")
public class XworkzController {
    public XworkzController(){
        System.out.println("const of xworkz controller");
    }

    @Autowired
    XworkzService xworkzService;

    @RequestMapping(value = "/enter", method = {RequestMethod.GET, RequestMethod.POST})
    public String xworkzController(XworkzDto xworkzDto, Model model) {
        System.out.println("xworkz controller method");
        if (xworkzService.validAndSave(xworkzDto)) {
            System.out.println("login successful");
            model.addAttribute("Successmessage", "User Login is Success");
            return "Success.jsp";
        } else {
            System.err.println("login cancel");
            model.addAttribute("msg", "User Login Cancel!");
            model.addAttribute("message", xworkzDto);
            return "XworkzLoginForm.jsp";
        }
    }

}
