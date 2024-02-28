package com.example;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World: " + new Gson().toJson(new World("earth","3.14")));
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Setter
    @Getter
    public static class World {
        private String name;
        private String dimension;
    }
}
