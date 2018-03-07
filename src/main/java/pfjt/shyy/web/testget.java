package pfjt.shyy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/get")
public class testget {
//    @RequestMapping(value = "/lei/{name1}", method = RequestMethod.GET)
    @RequestMapping("/lei")
    public String testlei()
    {
        return "{\"name\": \"雷舜东\",\"age\": 23}";
    }

    @RequestMapping("/idlei")
    public String testGetId(@RequestParam("xm") String xm,@RequestParam("age") int age)
    {
//        System.out.println("ID: " + id);
//        System.out.println("hello");
//       return "{\"name\": id,\"age\": 23}";
        //System.out.println("ID: " + id);
       // return xm+age;
        String srtlei="xm:" +xm+","+"age:"+age;
        return "{" +srtlei+"}";
    }

    @RequestMapping("/idlei2")
    public String testGetId2(@RequestParam("xm") String xm,@RequestParam("age") int age)
    {
//        System.out.println("ID: " + id);
//        System.out.println("hello");
//       return "{\"name\": id,\"age\": 23}";
        //System.out.println("ID: " + id);
        // return xm+age;
        String srtlei="xm:" +xm+","+"age:"+age;
        return "{" +srtlei+"}";
    }



}
