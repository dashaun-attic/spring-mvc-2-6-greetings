package dev.dashaun.greetings;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(GreetingController.class)
class GreetingControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void greetingWithTrailingSlashReturnsDefaultName() throws Exception {
        mockMvc.perform(get("/greeting/"))
                .andExpect(status().isOk())
                .andExpect(content().string(Matchers.containsString("Hello, World!")));
    }

    @Test
    void greetingWithTrailingSlashAndNameParamOverridesDefault() throws Exception {
        mockMvc.perform(get("/greeting/").param("name", "User"))
                .andExpect(status().isOk())
                .andExpect(content().string(Matchers.containsString("Hello, User!")));
    }

    @Test
    void greetingWithoutTrailingSlashReturnsDefaultName() throws Exception {
        mockMvc.perform(get("/greeting"))
                .andExpect(status().isOk())
                .andExpect(content().string(Matchers.containsString("Hello, World!")));
    }

    @Test
    void greetingWithoutTrailingSlashAndNameParamOverridesDefault() throws Exception {
        mockMvc.perform(get("/greeting").param("name", "User"))
                .andExpect(status().isOk())
                .andExpect(content().string(Matchers.containsString("Hello, User!")));
    }

}
