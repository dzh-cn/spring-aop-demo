package com.dzh.utils;

import com.google.gson.Gson;

/**
 * @author: dongzhihua
 * @time: 2019/3/24 17:16:02
 */
public class GsonUtil {
    static Gson gson = new Gson();

    public static String toStr(Object obj) {
        return gson.toJson(obj);
    }

    public static <T> T fromStr(String str, Class<T> type) {
        return gson.fromJson(str, type);
    }
}
