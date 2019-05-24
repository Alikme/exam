package lv.tsi.exam;

import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class MovieControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getMovie_found() throws Exception {
        String expectedJson = new JSONObject()
                .put("id", 4)
                .put("title", "Pulp Fiction")
                .toString();

        mvc.perform(get("/movies/{id}", 4))
                .andExpect(status().isOk())
                .andExpect(content().json(expectedJson));
    }

    @Test
    public void getMovie_notFound() throws Exception {
        mvc.perform(get("/movies/{id}", 100500))
                .andExpect(status().isNotFound());
    }

}