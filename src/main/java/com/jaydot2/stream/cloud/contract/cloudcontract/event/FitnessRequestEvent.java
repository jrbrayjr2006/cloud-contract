package com.jaydot2.stream.cloud.contract.cloudcontract.event;

import java.util.Objects;

public class FitnessRequestEvent {

    private String exerciseName;
    private Integer numberOfReps;
    private Integer numberOfSets;

    public FitnessRequestEvent(String exerciseName, Integer numberOfReps, Integer numberOfSets) {
        this.exerciseName = exerciseName;
        this.numberOfReps = numberOfReps;
        this.numberOfSets = numberOfSets;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public Integer getNumberOfReps() {
        return numberOfReps;
    }

    public void setNumberOfReps(Integer numberOfReps) {
        this.numberOfReps = numberOfReps;
    }

    public Integer getNumberOfSets() {
        return numberOfSets;
    }

    public void setNumberOfSets(Integer numberOfSets) {
        this.numberOfSets = numberOfSets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FitnessRequestEvent)) return false;
        FitnessRequestEvent that = (FitnessRequestEvent) o;
        return Objects.equals(exerciseName, that.exerciseName) &&
                Objects.equals(numberOfReps, that.numberOfReps) &&
                Objects.equals(numberOfSets, that.numberOfSets);
    }

    @Override
    public int hashCode() {

        return Objects.hash(exerciseName, numberOfReps, numberOfSets);
    }
}
