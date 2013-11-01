package com.skylark95.junitparams.example;

public abstract class Regex {
    
    private final String regex;

    public Regex(String regex)  {
        this.regex = regex;
    }
    
    public boolean matches(String value) {
        return value != null && value.matches(regex);
    }

}
