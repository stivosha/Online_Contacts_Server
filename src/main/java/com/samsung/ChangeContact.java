package com.samsung;

import com.google.gson.Gson;
import org.jboss.logging.Field;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static com.samsung.Application.a;
import static com.samsung.Application.jsonString;

@Controller
public class ChangeContact {
    @RequestMapping(method = RequestMethod.POST, value = "/change_contact")
    void addContact(@RequestBody Contact[] contact){
        System.out.println("changed");
        System.out.println(contact[0].getName());
        System.out.println(contact[1].getName());
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).getName().equals(contact[0].getName()) && a.get(i).getLastName().equals(contact[0].getLastName()) && a.get(i).getNumber().equals(contact[0].getNumber())){
                System.out.println("ok");
            a.set(i,contact[1]);
            break;
            }
        }
        //a.add(contact);
        jsonString = new Gson().toJson(new Msg(a));
    }
}
