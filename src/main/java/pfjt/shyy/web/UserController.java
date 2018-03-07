package pfjt.shyy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pfjt.shyy.entity.User;
import pfjt.shyy.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
  //  @Resource
@Autowired
    UserService userService;

@RequestMapping("/list")
    public String list(Model model){
    List<User> users=userService.getUserList();
model.addAttribute("users",users);
return "user/list";

}

//    @RequestMapping("/hello")
//    public String hehe() {
//
//        return "/user/test";
//    }
@RequestMapping("/hello")
public String hehe(Model model,long id) {
    User user= userService.findUserById(id);
    model.addAttribute("user",user);

    return "/user/userEdit";
}

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "user/userAdd";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(User user) {
        userService.save(user);
        return "redirect:list";
    }
@RequestMapping("delete")
    public String delete(long id){
        userService.delete(id);
        return "redirect:list";
    }
@RequestMapping("/toEdit")
    public String toEdit(Model model,Long id){

       User user= userService.findUserById(id);
      model.addAttribute("user",user);
      return "/user/userEdit";
}

    @RequestMapping("/edit")
    public String edit(User user) {
        userService.save(user);
        return "redirect:list";
    }

}
