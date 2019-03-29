package com.springcloud.article.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.article.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/posts")
@RestController
public class ArticleController {

    /**
     * 暂时就写了一个首页模块，没有访问别的模块的需求，就不开ribbon的负载均衡了
     */
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand()
    @GetMapping("/shares/q")
    public JSONObject findById(Integer pageNo,String title) {
//        return	this.restTemplate.getForObject("http://想调⽤的服务在eureka	server上的名 称/"	+	id,	User.class);
        JSONObject json = new JSONObject();
        json.put("status",200);
        json.put("msg","成功");
        JSONObject data = new JSONObject();
        data.put("empty",false);
        data.put("first",true);
        data.put("last",false);
        data.put("number",0);
        data.put("numberOfElements",10);
        data.put("size",10);
        data.put("totalElements",24);
        data.put("totalPages",3);
        JSONObject sort = new JSONObject();
        sort.put("empty",false);
        sort.put("sorted",true);
        sort.put("unsorted",false);
        JSONObject pageable = new JSONObject();
        pageable.put("sort",sort);
        pageable.put("offset",0);
        pageable.put("pageNumber",0);
        pageable.put("pageSize",10);
        pageable.put("paged",true);
        pageable.put("unpaged",false);
        data.put("unpaged",pageable);
        data.put("sort",sort);
        JSONArray content = new JSONArray();
        for(int i =1;i<=10;i++){
            Article article = new Article();
            article.setId("a"+i);
            article.setAuthor("林鹏韬"+i);
            article.setBuyCount(60+i);
            article.setCover("imgs/cover.jpeg");
            article.setCreateTime("2019-03-24 11:16:06");
            article.setIsOriginal(true);
            article.setPrice(0);
            article.setShow(true);
            article.setSummary("测试评语测试评语"+i);
            article.setTitle("测试书籍"+i);
            article.setType("share");
            article.setUpdateTime("2019-03-24 11:16:06");
            article.setUserId(i+"");
            content.add(article);
        }
        data.put("content",content);
        json.put("data",data);
        return json;
    }

    @HystrixCommand()
    @GetMapping("/shares/{id}")
    public JSONObject findById(@PathVariable String id) {
        JSONObject json = new JSONObject();
        json.put("status",200);
        json.put("msg","成功");
        Article article = new Article();
        article.setId("a");
        article.setAuthor("林鹏韬");
        article.setBuyCount(60);
        article.setCover("imgs/cover.jpeg");
        article.setCreateTime("2019-03-24 11:16:06");
        article.setIsOriginal(true);
        article.setPrice(0);
        article.setShow(true);
        article.setSummary("测试评语测试评语");
        article.setTitle("测试书籍");
        article.setType("share");
        article.setUpdateTime("2019-03-24 11:16:06");
        article.setUserId(id);
        json.put("data",article);
        return json;
    }
}
