package pfjt.shyy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mb")
public class leiController {
    @RequestMapping("pd")
   public  String lei(){
//       return "/user/cspd";
  //return "/user/mb/index";
//        return "/fragments/layout";
//        return "/user/mbbj";
        return "/user/index";
   }

    @RequestMapping("bm")
    public  String lsd(){
//       return "/user/cspd";
        //return "/user/mb/index";
//        return "/fragments/layout";
        //return "/user/mbbm";
        return "/user/index";
    }


}
