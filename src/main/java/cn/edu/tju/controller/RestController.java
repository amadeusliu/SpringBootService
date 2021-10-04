package cn.edu.tju.controller;

import cn.edu.tju.domain.Userinfo;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RestController {
    public static void main(String[] args) {

      /*
        String url="http://localhost:8811/getUser?username=hi&password=amadeus";
        Userinfo userinfo=new RestTemplate().getForObject(url,Userinfo.class);
        System.out.println(userinfo);
        */

      /*
        String url="http://localhost:8811/getUser?username={0}&password={1}";
        Object[] params={"user01","password01"};
        Userinfo userinfo=new RestTemplate().getForObject(url,Userinfo.class,params);
        System.out.println(userinfo);
        */

//        String url="http://localhost:8811/getUser?username={0}&password={1}";
//        Object[] params={"user01","password01"};
//        Userinfo userinfo=new RestTemplate().getForObject(url,Userinfo.class,params);
//        System.out.println(userinfo);

//        String url="http://localhost:8811/getUser2/{0}/{1}";
//        Object[] params={"user02","password02"};
//        Userinfo userinfo=new RestTemplate().getForObject(url,Userinfo.class,params);
//        System.out.println(userinfo);

//        String url="http://localhost:8811/getUser2/{0}/{1}";
//        Object[] params={"user02","password02"};
//       ResponseEntity responseEntity =new RestTemplate().getForEntity(url,Userinfo.class,params);
//        System.out.println(responseEntity.getHeaders());
//        System.out.println(responseEntity.getBody());

//        String url="http://localhost:8811/getUser?username={username}&password={password}";
//        Map map=new HashMap<>();
//        map.put("username","amadeusliu");
//        map.put("password","pwd8888");
//        Userinfo userinfo=new RestTemplate().getForObject(url,Userinfo.class,map);
//        System.out.println(userinfo);

/*
        String url="http://localhost:8811/getUser2/{username}/{password}";
        Map map=new HashMap<>();
        map.put("username","amadeusliu");
        map.put("password","pwd9999");
        Userinfo userinfo=new RestTemplate().getForObject(url,Userinfo.class,map);
        System.out.println(userinfo);
*/

/*        String url="http://localhost:8811/getUser3";

        Map map=new HashMap<>();
        map.put("username","amadeusliu");
        map.put("password","pwd7777");

        Userinfo userinfo0=new Userinfo("fff","ggghhh");
        Userinfo userinfo=new RestTemplate().postForObject(url,map,Userinfo.class);
        System.out.println(userinfo);*/

/*        String url="http://localhost:8811/getUser?username={0}&password={1}";
        Object[] params={"user01","password01"};
        Userinfo userinfo=new RestTemplate().postForObject(url,null,Userinfo.class,params);
        System.out.println(userinfo);*/


   /*     String url="http://localhost:8811/getUser?username={username}&password={password}";

        Map map=new HashMap<>();
        map.put("username","amadeusliu");
        map.put("password","pwd09876");
        Userinfo userinfo=new RestTemplate().postForObject(url,null,Userinfo.class,map);
        System.out.println(userinfo);*/


 /*         String url="http://localhost:8811/getUser4";
        Userinfo userinfo0=new Userinfo("fff","ggghhh");
        Userinfo userinfo=new RestTemplate().postForObject(url,userinfo0,Userinfo.class);
        System.out.println(userinfo);*/

   /*     String url="http://localhost:8811/getUser4";

        Map map=new HashMap<>();
        map.put("username","amadeusliu");
        map.put("password","pwd7777");

        Userinfo userinfo0=new Userinfo("fff","ggghhh");
        Userinfo userinfo=new RestTemplate().postForObject(url,map,Userinfo.class);
        System.out.println(userinfo);*/


/*        String url="http://localhost:8811/getUser4";

        LinkedMultiValueMap map=new LinkedMultiValueMap();

        map.add("username","amadeusliu");
        map.add("password","pwd7777");

        Userinfo userinfo=new RestTemplate().postForObject(url,map,Userinfo.class);
        System.out.println(userinfo);*/


  //这种方法传不过去参数
     /*   String url="http://localhost:8811/getUser4";

        Map map=new HashMap();

        map.put("username","amadeusliu");
        map.put("password","pwd7777");

        Userinfo userinfo=new RestTemplate().postForObject(url,map,Userinfo.class);
        System.out.println(userinfo);*/

/*       String url="http://localhost:8811/put?username={username}&password={password}";

        Map map=new HashMap();

        map.put("username","chopin");
        map.put("password","pwd7777");

        new RestTemplate().put(url,null,map);
        System.out.println("it is over......");*/

        String url="http://localhost:8811/delete?username={username}&password={password}";

        Map map=new HashMap();

        map.put("username","chopin9090");
        map.put("password","pwd7777");

        new RestTemplate().delete(url,map);
        System.out.println("it is over......");








    }
}
