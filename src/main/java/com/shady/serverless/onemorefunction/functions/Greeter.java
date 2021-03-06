package com.shady.serverless.onemorefunction.functions;

import java.util.function.Function;

public class Greeter implements Function<String, String> {

    @Override
    public String apply(String s) {
        return "Hello " + s + ", and welcome to The Grand Budapest Hotel!!";
    }
}