package com.example.sampledeploymentproject.controller;

import com.example.sampledeploymentproject.dto.Output;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/output", method = RequestMethod.GET)
    public Output getOutput() {
        Output output = new Output();
        output.setMessage("This is a test message");
        return output;
    }

}
