package com.jaydot2.stream.cloud.contract.cloudcontract.controller;

import com.jaydot2.stream.cloud.contract.cloudcontract.request.FitnessRequest;
import com.jaydot2.stream.cloud.contract.cloudcontract.response.FitnessResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@Slf4j
@RestController
public class FitnessController {

    @RequestMapping( value = "/send",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public FitnessResponse saveMyExercise(FitnessRequest request) {
        FitnessResponse response = new FitnessResponse();
        log.debug("response object: " + response.getExerciseTime());
        response.setExerciseTime(LocalTime.now().toString());
        return response;
    }
}
