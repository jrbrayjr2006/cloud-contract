package com.jaydot2.stream.cloud.contract.cloudcontract;

import com.jaydot2.stream.cloud.contract.cloudcontract.stream.Processor;
import com.jaydot2.stream.cloud.contract.cloudcontract.stream.Sink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(value = {Processor.class, Sink.class})
public class CloudContractApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudContractApplication.class, args);
	}
}
