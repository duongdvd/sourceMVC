package com.hachinet.web.controller;

import com.hachinet.model.entity.TestEntity;
import com.hachinet.service.TestService;
import com.hachinet.web.form.TestForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Home {
    @Autowired
    TestService testService;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String Home(ModelMap modelMap) {
        TestEntity testEntity = testService.findbyId(1);
        modelMap.addAttribute("datatest",testEntity);

        return "Home/test";
    }

    @RequestMapping(value = {"getdata"}, method = RequestMethod.POST)
    public String GetData(@ModelAttribute("datatest") TestForm testForm, ModelMap modelMap){
        System.out.println(testForm.getAddress());
        System.out.println(testForm.getPhone());

        modelMap.addAttribute("datatest",testForm);
        return "Home/test";
    }

    @RequestMapping(value = {"/FixFood"}, method = RequestMethod.GET)
    public String FixFood(){
        return "Home/index";
    }
}
