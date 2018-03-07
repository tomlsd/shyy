package pfjt.shyy.web;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pfjt.shyy.entity.NewUser;
import pfjt.shyy.entity.User;
import pfjt.shyy.service.NewUserService;
import pfjt.shyy.service.UserService;
import pfjt.shyy.service.vo.zcnew;

import java.util.List;

@Controller
@RequestMapping("/ui")
public class NewUserController {
    @Autowired
    NewUserService newUserService;
    @RequestMapping("/dg")
    public  String lei(){
//
        return "/user/index";
    }

//    @RequestMapping(value="/save", method = RequestMethod.POST)
//    public String save(NewUser newUser) {
////        System.out.println("name: " + newUser.getFirstname());
////        System.out.println("email: " + newUser.getEmail());
//        newUserService.save(newUser);
//
//        return "redircet /uiqs/save";
////        return "/user/index";
//    }



}
