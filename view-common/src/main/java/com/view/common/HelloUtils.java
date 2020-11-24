package com.view.common;

import org.springframework.stereotype.Component;

/**
 * @author Bamboo
 */
@Component
public class HelloUtils {


    public  String hello() {
        return "from HelloUtils --hello";
    }

}
