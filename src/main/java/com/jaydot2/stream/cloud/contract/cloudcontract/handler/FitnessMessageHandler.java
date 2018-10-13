package com.jaydot2.stream.cloud.contract.cloudcontract.handler;

import com.jaydot2.stream.cloud.contract.cloudcontract.event.FitnessEvent;
import com.jaydot2.stream.cloud.contract.cloudcontract.event.FitnessRequestEvent;
import com.jaydot2.stream.cloud.contract.cloudcontract.stream.Processor;
import com.jaydot2.stream.cloud.contract.cloudcontract.transform.FitnessRequestTransformer;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class FitnessMessageHandler {

    FitnessRequestTransformer fitnessRequestTransformer;

    public FitnessMessageHandler(FitnessRequestTransformer fitnessRequestTransformer) {
        this.fitnessRequestTransformer = fitnessRequestTransformer;
    }

    @StreamListener(Processor.FITNESS_INPUT_CHANNEL)
    public void processFitnessRequest(FitnessRequestEvent fitnessRequestEvent) {
        FitnessEvent fitnessEvent = fitnessRequestTransformer.transformRequestToEvent(fitnessRequestEvent);
    }
}
