package com.jaydot2.stream.cloud.contract.cloudcontract.handler;

import com.jaydot2.stream.cloud.contract.cloudcontract.event.FitnessEvent;
import com.jaydot2.stream.cloud.contract.cloudcontract.event.FitnessRequestEvent;
import com.jaydot2.stream.cloud.contract.cloudcontract.request.FitnessRequest;
import com.jaydot2.stream.cloud.contract.cloudcontract.transform.FitnessRequestTransformer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class FitnessMessageHandlerTest {

    @Mock
    FitnessRequestTransformer mockFitnessRequestTransformer;

    FitnessMessageHandler fitnessMessageHandler;

    @BeforeEach
    void setUp() {
        fitnessMessageHandler = new FitnessMessageHandler(mockFitnessRequestTransformer);
    }

    @Test
    @DisplayName("Given a FitnessMessageHandler, when the FitnessMessageHander receives a message, then the message must be sent to a tranformer")
    void shouldTransformMessage() {
        // Given
        FitnessRequestEvent fitnessRequestEvent = new FitnessRequestEvent("situps", 10, 3);
        FitnessRequest request = new FitnessRequest("situps", "3 sets of 10 reps");
        FitnessEvent fitnessEvent = new FitnessEvent();
        // When
        when(mockFitnessRequestTransformer.transformRequestToEvent(request)).thenReturn(fitnessEvent);
        fitnessMessageHandler.processFitnessRequest(request);
        // Then
        verify(mockFitnessRequestTransformer).transformRequestToEvent(request);
    }
}
