package com.example.saucelogs;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.saucelogs.sauce.Sauce;
import com.example.saucelogs.sauce.SauceController;
import com.example.saucelogs.sauce.SauceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;


@WebMvcTest(SauceController.class)
public class BasicOperationTests {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SauceService service;

    @Test
    public void shouldBeOk() throws Exception {
        when(service.findAll()).thenReturn(new ArrayList<Sauce>());
        this.mockMvc.perform(get("/api/sauces")).andExpect(status().isOk());
    }
}
