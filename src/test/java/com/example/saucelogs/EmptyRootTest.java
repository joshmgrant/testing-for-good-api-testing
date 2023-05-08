package com.example.saucelogs;

import com.example.saucelogs.sauce.Sauce;
import com.example.saucelogs.sauce.SauceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class EmptyRootTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SauceService service;

    @Test
    public void shouldBeOk() throws Exception {
        this.mockMvc.perform(get("/")).andExpect(status().is(404));
    }
}
