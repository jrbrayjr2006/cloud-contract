package com.jaydot2.stream.cloud.contract.cloudcontract;


import com.jaydot2.stream.cloud.contract.cloudcontract.stream.Processor;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.StubFinder;
import org.springframework.cloud.contract.stubrunner.StubRunner;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.cloud.stream.test.binder.MessageCollector;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = {"com.example:http-server:+:stubs:8080"}, stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class FitnessContractConsumerTest {

    @Autowired
    StubRunner stubRunner;

    @Autowired
    StubFinder stubFinder;

    @Autowired
    Processor processor;


    @Autowired
    MessageCollector collector;

    @Test
    @Ignore
    public void shouldReceiveMessageTest() {
        stubFinder.trigger("some-trigger");

        Message<?> message = null; //TODO
    }
}
