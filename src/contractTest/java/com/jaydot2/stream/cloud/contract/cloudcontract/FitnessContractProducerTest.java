package com.jaydot2.stream.cloud.contract.cloudcontract;

import com.jaydot2.stream.cloud.contract.cloudcontract.event.FitnessEvent;
import com.jaydot2.stream.cloud.contract.cloudcontract.handler.FitnessMessageHandler;
import com.jaydot2.stream.cloud.contract.cloudcontract.request.FitnessRequest;
import com.jaydot2.stream.cloud.contract.cloudcontract.stream.Sink;
import com.jaydot2.stream.cloud.contract.cloudcontract.transform.FitnessRequestTransformer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest( classes = SpringBootApplication.class ,webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMessageVerifier
@PropertySource("classpath:application.yml")
public abstract class FitnessContractProducerTest {

    @MockBean
    FitnessRequestTransformer mockRequestTransformer;

    @Autowired
    private FitnessMessageHandler handler;

    @Autowired
    private Sink output;

    public void sendExerciseInfo() {
        FitnessEvent fitnessEvent = new FitnessEvent();
        fitnessEvent.setExerciseName("pushups");
        fitnessEvent.setNumberOfReps(10);
        fitnessEvent.setNumberOfSets(3);
        Message<FitnessEvent> message = MessageBuilder.withPayload(fitnessEvent).build();
        output.output().send(message);
    }
}
