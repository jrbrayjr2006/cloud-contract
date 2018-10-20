package com.jaydot2.stream.cloud.contract.cloudcontract.handler;

import com.jaydot2.stream.cloud.contract.cloudcontract.event.FitnessEvent;
import com.jaydot2.stream.cloud.contract.cloudcontract.event.FitnessRequestEvent;
import com.jaydot2.stream.cloud.contract.cloudcontract.request.FitnessRequest;
import com.jaydot2.stream.cloud.contract.cloudcontract.stream.Processor;
import com.jaydot2.stream.cloud.contract.cloudcontract.stream.Sink;
import com.jaydot2.stream.cloud.contract.cloudcontract.transform.FitnessRequestTransformer;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class FitnessMessageHandler {

    FitnessRequestTransformer fitnessRequestTransformer;

    public FitnessMessageHandler(FitnessRequestTransformer fitnessRequestTransformer) {
        this.fitnessRequestTransformer = fitnessRequestTransformer;
    }

    @StreamListener(Processor.FITNESS_INPUT_CHANNEL)
    public void processFitnessRequest(FitnessRequest fitnessRequest) {
        FitnessEvent fitnessEvent = fitnessRequestTransformer.transformRequestToEvent(fitnessRequest);
    }

    @SendTo(Sink.FITNESS_OUTPUT_CHANNEL)
    public FitnessEvent sendFitnessInformation(FitnessRequest request) {
        FitnessEvent fitnessEvent = fitnessRequestTransformer.transformRequestToEvent(request);
        return fitnessEvent;
    }
}
