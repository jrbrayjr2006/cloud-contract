package com.jaydot2.stream.cloud.contract.cloudcontract.transform;

import com.jaydot2.stream.cloud.contract.cloudcontract.event.FitnessEvent;
import com.jaydot2.stream.cloud.contract.cloudcontract.event.FitnessRequestEvent;
import org.springframework.stereotype.Component;

@Component
public class FitnessRequestTransformer {

    public FitnessEvent transformRequestToEvent(FitnessRequestEvent fitnessRequestEvent) {
        return null;
    }
}
