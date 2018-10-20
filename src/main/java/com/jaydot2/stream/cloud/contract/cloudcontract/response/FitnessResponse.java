package com.jaydot2.stream.cloud.contract.cloudcontract.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FitnessResponse {

    @JsonProperty
    private String exerciseTime;

    public FitnessResponse() {
    }

    public String getExerciseTime() {
        return exerciseTime;
    }

    public void setExerciseTime(String exerciseTime) {
        this.exerciseTime = exerciseTime;
    }
}
