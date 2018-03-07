package pfjt.shyy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dragbuy")
public class BuyDragController {
    @RequestMapping("/drag")
    public String dragBuy()
    {
        return "/drag/dragbuy";
    }
}
