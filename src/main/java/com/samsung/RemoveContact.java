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
public class RemoveContact {
    @RequestMapping(method = RequestMethod.POST, value = "/remove_contact")
    void addContact(@RequestBody Contact contact){
        System.out.println("removed");
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).getName().equals(contact.getName()) && a.get(i).getLastName().equals(contact.getLastName()) && a.get(i).getNumber().equals(contact.getNumber())){
                a.remove(i);
                break;
            }
        }
        jsonString = new Gson().toJson(new Msg(a));
    }
}
