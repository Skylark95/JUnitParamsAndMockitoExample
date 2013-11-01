package com.skylark95.junitparams.example;

public interface RegexProvider {
    
    <T extends Regex> T provide(Class<T> regexClass);

}
