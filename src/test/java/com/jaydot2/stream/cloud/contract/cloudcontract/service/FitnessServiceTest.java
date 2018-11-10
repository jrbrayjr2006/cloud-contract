package com.jaydot2.stream.cloud.contract.cloudcontract.service;

import com.jaydot2.stream.cloud.contract.cloudcontract.handler.FitnessMessageHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FitnessServiceTest {

    @Mock
    FitnessMessageHandler mockFitnessMessageHandler;

    @BeforeEach
    void setUp() {
    }
}