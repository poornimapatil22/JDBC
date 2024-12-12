package com.xworkz.Kite.controller;

import com.xworkz.Kite.dto.KiteDto;
import com.xworkz.Kite.service.KiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/")
@Controller
public class KiteController {
    @Autowired
    KiteService kiteService;
    KiteController(){
        System.out.println("const ");
    }


    @RequestMapping(method={RequestMethod.GET ,RequestMethod.POST},value="/save")
    public String doSomething(KiteDto kiteDto){
        kiteService.validAndSave(kiteDto);
        return "index.jsp";
    }


}
