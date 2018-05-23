package com.samsung;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static com.samsung.Application.a;
import static com.samsung.Application.jsonString;

@Controller
public class AddContact {
    @RequestMapping(method = RequestMethod.POST, value = "/add_contact")
    void addContact(@RequestBody Contact contact){
        a.add(contact);
        jsonString = new Gson().toJson(new Msg(a));
    }
}
