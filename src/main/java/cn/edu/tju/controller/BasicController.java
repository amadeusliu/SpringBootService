package cn.edu.tju.controller;


import com.google.gson.JsonObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @RequestMapping("/testtest")
    public String test(){
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("vdcm","33");
        jsonObject.addProperty("bdcm","4455");
        return jsonObject.toString();
    }
}
