package com.jaydot2.stream.cloud.contract.cloudcontract.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jaydot2.stream.cloud.contract.cloudcontract.controller.FitnessController;
import com.jaydot2.stream.cloud.contract.cloudcontract.request.FitnessRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.fasterxml.jackson.core.JsonProcessingException;

import static org.junit.jupiter.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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