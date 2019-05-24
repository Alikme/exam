package lv.tsi.exam;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getAll() throws Exception {
        mockMvc.perform(get("/catalog/getAll")).andExpect(status().isOk());
    }

    @Test
    public void getCatalogById() throws Exception {
        mockMvc.perform(get("/catalog/getCatalogById/2")).andExpect(status().isOk());
    }

    @Test
    public void getCatalogByTitle() throws Exception {
        mockMvc.perform(get("/catalog/getMoviesByCatalogName/Title1")).andExpect(status().isOk());
    }
}
