package com.jaydot2.stream.cloud.contract.cloudcontract.transform;

import com.jaydot2.stream.cloud.contract.cloudcontract.event.FitnessEvent;
import com.jaydot2.stream.cloud.contract.cloudcontract.event.FitnessRequestEvent;
import com.jaydot2.stream.cloud.contract.cloudcontract.request.FitnessRequest;
import org.springframework.stereotype.Component;

@Component
public class FitnessRequestTransformer {

    public FitnessEvent transformRequestToEvent(FitnessRequest fitnessRequest) {
        FitnessEvent event = new FitnessEvent();
        return event;
    }
}
