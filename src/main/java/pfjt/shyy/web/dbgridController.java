package pfjt.shyy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pfjt.shyy.entity.NewUser;
import pfjt.shyy.service.NewUserService;
import pfjt.shyy.service.UserService;
import pfjt.shyy.service.vo.indexvalue;

@Controller
@RequestMapping("/uiform")
public class dbgridController {
    @Autowired
    NewUserService newUserService;
    @RequestMapping("/dbform")
public String list(){
        return "/dbgrid/dbform";
    }
//    @RequestMapping(value = "/{index}")
//    public String listform(Model model,@PathVariable Long index){
//        System.out.println(index);
//  NewUser newUser= newUserService.getUser(index);
//  model.addAttribute("user",newUser);
//       System.out.println(index);
//    return "/dbgrid/show_form";
//    }
    @RequestMapping(value = "/{index}")
    public String listform(Model model,@PathVariable long index){
        indexvalue indexvaluelei=new indexvalue();
        indexvaluelei.setId(index);
        model.addAttribute("user",indexvaluelei);

        System.out.println(index);
        return "/dbgrid/show_form";
    }


    }


