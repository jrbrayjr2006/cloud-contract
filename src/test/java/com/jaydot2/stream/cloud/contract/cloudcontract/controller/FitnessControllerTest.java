package com.jaydot2.stream.cloud.contract.cloudcontract.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jaydot2.stream.cloud.contract.cloudcontract.controller.FitnessController;
import com.jaydot2.stream.cloud.contract.cloudcontract.request.FitnessRequest;
import com.jaydot2.stream.cloud.contract.cloudcontract.response.FitnessResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.fasterxml.jackson.core.JsonProcessingException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
class FitnessControllerTest {

    MockMvc mockMvc;

    FitnessController controller;

    @BeforeEach
    void setUp() {
        controller = new FitnessController();
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    void saveMyExercise() throws Exception {
        FitnessRequest request = new FitnessRequest("some-exercise", "some-exercise-description");
        mockMvc.perform(post("/send").content(marshallJson(request)).contentType(MediaType.APPLICATION_JSON_VALUE).accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andReturn().getResponse();
    }

    @DisplayName("Given a fitness request, when the request is posted, a fitness response should be returned")
    @Test
    void shouldReturnFitnessResponse() {
        // Given
        FitnessRequest request = new FitnessRequest("some-exercise", "some-description");
        // When
        FitnessResponse actualResponse = controller.saveMyExercise(request);
        // Then
        assertNotNull(actualResponse);
    }

    private String marshallJson(FitnessRequest request) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            final String json = mapper.writeValueAsString(request);
            return json;
        } catch(JsonProcessingException jpe) {
            jpe.getStackTrace();
        }
        fail("Exception thrown!");
        return null;
    }
}