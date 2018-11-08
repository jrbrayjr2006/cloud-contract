package com.jaydot2.stream.cloud.contract.cloudcontract.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class FitnessRequest {

    @Value("${fitness.exercise: pushups}")
    @JsonProperty
    private String exerciseName;

    @Value("${fitness.description: description}")
    @JsonProperty
    private String exerciseDescription;

    public FitnessRequest(String exerciseName, String exerciseDescription) {
        this.exerciseName = exerciseName;
        this.exerciseDescription = exerciseDescription;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getExerciseDescription() {
        return exerciseDescription;
    }

    public void setExerciseDescription(String exerciseDescription) {
        this.exerciseDescription = exerciseDescription;
    }
}
