package pfjt.shyy.web;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pfjt.shyy.entity.NewUser;
import pfjt.shyy.service.vo.pagerow;

import java.util.List;

@Controller
@RequestMapping(value = "/uirss")
public class rssFeedController {
@RequestMapping("/rss")
    public String rsslei(){
    return "/rssmain/rss";

}

    @RequestMapping("/rssjson")
    public String rssleinew(){
//        return "/rssmain/rss";
      return  "redirect:/data/channels.json";
//        return  "/data/channels.json";
    }


}
