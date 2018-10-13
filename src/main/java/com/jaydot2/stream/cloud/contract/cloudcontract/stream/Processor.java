package com.jaydot2.stream.cloud.contract.cloudcontract.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Processor {

    public static final String FITNESS_INPUT_CHANNEL = "fitness-input-channel";

    @Input(Processor.FITNESS_INPUT_CHANNEL)
    public SubscribableChannel receive();
}
