package com.springcloud.article.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.article.entity.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/notices")
@RestController
public class notices {
    @HystrixCommand()
    @GetMapping("/newest")
    public JSONObject findById() {
        JSONObject json = new JSONObject();
        json.put("status",200);
        json.put("msg","成功");
        JSONObject data = new JSONObject();
        data.put("content","我是滚动新闻,我是滚动新闻,我是滚动新闻,我是滚动新闻,");
        data.put("createTime","2018-12-13 01:27:21");
        data.put("id","aaa");
        data.put("show",true);
        json.put("data",data);
        return json;
    }

}
