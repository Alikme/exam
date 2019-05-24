package lv.tsi.exam.resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class LibraryResourceTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getAllUsers() throws Exception{
        mockMvc.perform(get("/library/json/users")).andExpect(status().isOk())
                .andExpect(content()
                        .string("[{\"id\":1,\"name\":\"Kezik\",\"bookId\":2},{\"id\":2,\"name\":\"Arka\",\"bookId\":1},{\"id\":3,\"name\":\"Doni\",\"bookId\":2},{\"id\":4,\"name\":\"Nikitos\",\"bookId\":1}]"));
    }

    @Test
    public void getAllUsersByBook() throws Exception {
        mockMvc.perform(get("/library/json/users/byBook/2")).andExpect(status().isOk())
                .andExpect(content()
                        .string("[{\"id\":1,\"name\":\"Kezik\",\"bookId\":2},{\"id\":3,\"name\":\"Doni\",\"bookId\":2}]"));
    }
}