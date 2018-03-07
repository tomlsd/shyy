package pfjt.shyy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller

@RequestMapping("/simplemenu")
public class SimpleMenuController {
    @RequestMapping("/index")
    public String indexlei()
    {
        return "/menu/simple";
    }

    @RequestMapping("/button")
    public String menubuttonlei()
    {
        return "/menu/menubutton";
    }

    @RequestMapping("/complexlayout")
    public String complexlayoutlei()
    {
        return "/menu/complexlayout";
    }

    @RequestMapping("/autotab")
    public String autotablei()
    {
        return "/menu/autotab";
    }
    @RequestMapping("/xp")
    public String xplei()
    {
        return "/menu/xppanle";
    }

//    取得选中行数据
    @RequestMapping("/datagrid")
    public String datagridlei()
    {
     return "/menu/getdatagrid";


    }

    //    数据网格 - 添加查询功能
    @RequestMapping("/datagridsearch")
    public String datagridsearchlei()
    {
        return "/menu/datagridsearch";


    }
}
