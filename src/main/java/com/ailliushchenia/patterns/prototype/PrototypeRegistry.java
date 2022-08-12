package com.ailliushchenia.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private final Map<String, Prototype> prototypeStore = new HashMap<>();

    public void addPrototype(String id, Prototype prototype){
        prototypeStore.put(id, prototype);
    }

    public Prototype getPrototype(String id){
        return prototypeStore.get(id).clone();
    }
}
