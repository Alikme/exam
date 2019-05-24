package lv.tsi.exam.Controllers;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class JournalControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getPupilById() throws Exception {
        mockMvc.perform(get("/journal/getId/1")).andExpect(status().isOk() ); // один ученик по Id
    }

    @Test
    void getAllPupil() throws Exception {
        mockMvc.perform(get("/journal/all")).andExpect(status().isOk()); // Все ученики
    }
}