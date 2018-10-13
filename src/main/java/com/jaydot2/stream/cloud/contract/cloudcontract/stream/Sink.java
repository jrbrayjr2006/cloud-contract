package com.jaydot2.stream.cloud.contract.cloudcontract.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface Sink {

    public static final String FITNESS_OUTPUT_CHANNEL = "fitness-output-channel";

    @Output(FITNESS_OUTPUT_CHANNEL)
    public MessageChannel output();
}
