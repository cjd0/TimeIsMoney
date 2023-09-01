package com.chrisdoyle.timeismoney;

import com.google.gson.Gson;

public class JSONHandler {

    private Gson gson;

    public JSONHandler() {
        this.gson = new Gson();
    }

    public String Serialise(Object object) {
        return gson.toJson(object);
    }

    public <T> T Deserialise(String json, Class<T> classOfT) {
        return gson.fromJson(json, classOfT);
    }
}
