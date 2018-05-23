//package com.samsung;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class GetMyNameController {
//
//    @RequestMapping(method = RequestMethod.GET, value = "/hello")
//    @ResponseBody
//    String sayHello(@RequestParam("name")String name,
//                    @RequestParam("surname") String surname){
//        String emptyHello = "Hi, %s %s, want to sleep";
//        return String.format(emptyHello,name,surname);
//    }
//}
