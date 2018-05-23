package com.samsung;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static com.samsung.Application.jsonString;

@Controller
public class GetListContacts {
    @RequestMapping(method = RequestMethod.POST, value = "/get_list")
    @ResponseBody
    String sayHello(){
        System.out.println("got");
        return String.format(jsonString);
    }
}
