package com.hd.controller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.hd.boot.Person;
import com.hd.boot.RequestVo;
import net.sf.json.JSONObject;
import org.jeecgframework.poi.excel.ExcelExportUtil;
import org.jeecgframework.poi.excel.ExcelImportUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Test {

    @RequestMapping("/test")
    @ResponseBody
    public JSONObject test(){

        JSONObject json = new JSONObject();
        json.put("a","a");
        json.put("b","b");
        JSONObject json1 = new JSONObject();
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("2222");
        json1.put("c",list);
        json1.put("a","a");
        json1.put("bao","bao");
        json.put("data",json1);

        return json;
    }


}
