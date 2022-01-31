package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class SampleControllerTest {
    private MockMvc mock;
    @BeforeEach
    public void prepare(){
        this.mock = MockMvcBuilders.standaloneSetup(new SampleController()).build();
    }
    @Test
    public void test_sample() throws Exception {
        System.out.println("----テストの開始----");
        this.mock.perform(MockMvcRequestBuilders.get("/sample"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("uzui : sama"));
        System.out.println("----テストの終了----");
    }
}
