package pfjt.shyy.web;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pfjt.shyy.entity.NewUser;
import pfjt.shyy.service.NewUserService;
import pfjt.shyy.service.vo.pagerow;

import java.util.List;

@RestController
@RequestMapping("/uiqs")
public class uiqsController {
    @Autowired
    NewUserService newUserService;
    @RequestMapping(value = "/qs",method = RequestMethod.POST)
    public  String leiqs(pagerow pagerowslei){
        int page=pagerowslei.getPage();
        int rows=pagerowslei.getRows();
        int start=page-1;
        int total=newUserService.getRecordCount();
//        List<NewUser> newUsers= newUserService.getUserList();
        Page<NewUser> newUsers= newUserService.getUserByPage(start,rows);

        JsonObject object = new JsonObject();
        Gson gson = new GsonBuilder().create();
        JsonArray jsonArray = gson.toJsonTree(newUsers.getContent(), new TypeToken<List<NewUser>>() {}.getType()).getAsJsonArray();
       object.add("total",gson.toJsonTree(total));
        object.add("rows", jsonArray);
        System.out.println("Json string: " + object.toString());
        return object.toString();
    }



    @RequestMapping(value="/save", method = RequestMethod.POST)
    public String save(NewUser newUser) {
        System.out.println("name: " + newUser.getFirstname());
        System.out.println("email: " + newUser.getEmail());
        newUserService.save(newUser);

        JsonObject object = new JsonObject();
        object.addProperty("success", "true");
//        return "/user/index";
        return object.toString();
    }

    @RequestMapping(value="/delete", method = RequestMethod.POST)
    public String delete(long id) {

        newUserService.delete(id);

        JsonObject object = new JsonObject();
        object.addProperty("success", "true");
//        return "/user/index";
        return object.toString();
    }
    @RequestMapping(value="/{id}", method = RequestMethod.POST)
    public String update(NewUser newUser, @PathVariable Long id){
       // @RequestParam("id") long id)
       System.out.println(id);
        newUser.setId(id);
        newUserService.save(newUser);

        JsonObject object = new JsonObject();
        object.addProperty("success", "true");
//        return "/user/index";
        return object.toString();
    }


}
