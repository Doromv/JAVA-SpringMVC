package com.doromv.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @author Doromv
 * @create 2022-03-04-8:47
 */
public class JsonUtils {
    public static String getJson(Object object){
        return getJson(object,"yyyy-MM-dd HH:mm:ss");
    }
    public static String getJson(Object object,String sdf){
        String valueAsString = null;
        ObjectMapper mapper = new ObjectMapper();
        ObjectMapper configure = mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleDateFormat dateFormat = new SimpleDateFormat(sdf);
        mapper.setDateFormat(dateFormat);
        try {
            valueAsString = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return valueAsString ;
    }
}
