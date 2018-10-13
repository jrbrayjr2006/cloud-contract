package com.jaydot2.stream.cloud.contract.cloudcontract;

import com.jaydot2.stream.cloud.contract.cloudcontract.stream.Sink;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMessageVerifier
public abstract class FitnessContractProducerTest {

    @Autowired
    Sink output;


}
