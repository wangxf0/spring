package com.wxf;

import com.wxf.services.GreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
@PropertySource("classpath:config/my.properties")
public class GreetingController {
    @Value("${my.name}")
    private String myName;
    @Resource(name = "GreetingService")
    private GreetingService greetingService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        name = greetingService.hello();
        model.addAttribute("name", myName + "  " + name);
        return "greeting";
    }

}