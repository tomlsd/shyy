package pfjt.shyy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/school")
public class CourseController {
    @RequestMapping("/course")
    public String courselei()
    {
     return "/schoolcourse/index";
    }
}

