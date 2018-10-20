package com.jaydot2.stream.cloud.contract.cloudcontract.controller;

import com.jaydot2.stream.cloud.contract.cloudcontract.request.FitnessRequest;
import com.jaydot2.stream.cloud.contract.cloudcontract.response.FitnessResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FitnessController {

    @RequestMapping( value = "/send",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public FitnessResponse saveMyExercise(FitnessRequest request) {
        FitnessResponse response = new FitnessResponse();
        return null;
    }
}
