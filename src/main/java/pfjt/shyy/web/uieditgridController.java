package pfjt.shyy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/uieditgrid")
public class uieditgridController {
    @RequestMapping("/editgrid")
    public String editgridlei()
    {
        return "/editgrid/editegridindex";
    }





}
