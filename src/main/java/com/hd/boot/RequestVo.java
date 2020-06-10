package com.hd.boot;

import com.google.gson.JsonObject;
import lombok.Data;

@Data
public class RequestVo {

    private JsonObject obj;
    private String field;

}
