package cn.edu.tju.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import java.util.Date;

@RestController
public class TestController{

    @RequestMapping("/hello")
        public String hello(){
        return "hello , now is "+new Date();
        }

    @RequestMapping("/greet")
    public String greet(@RequestParam("name") String name){
        return "@@@@ ,  "+name;
    }

    @RequestMapping("/delay/{seconds}")
    public String delay(@PathVariable("seconds") String seconds){
        int x=Integer.parseInt(seconds)*1000;
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "slept for  "+seconds;
    }
}
