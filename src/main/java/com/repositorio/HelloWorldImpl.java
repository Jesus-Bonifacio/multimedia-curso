
package com.repositorio;

import javax.jws.WebService;

@WebService(endpointInterface = "com.repositorio.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

