package lv.tsi.exam.resources;



import lv.tsi.exam.Entity.CatalogRepository;
import lv.tsi.exam.Entity.CatEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/catalog")
public class UserResources {
    @Autowired
    private CatalogRepository catalogRepository;

    @GetMapping("/getAll")
    public List<CatEntity> getAllTopics() {
        return catalogRepository.findAll();
    }

    @GetMapping("/getId/(id)")
    @ResponseBody
    public Optional<CatEntity> getById(@PathVariable Long id)  {
        return catalogRepository.findById(id);
    }

    @GetMapping ("/getUser/(user)")
    @ResponseBody
    public List<CatEntity> getByUser(@PathVariable String user)
    {
        return catalogRepository.findByTitle(user);
    }




    public UserResources(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public UserResources() {
    }

    public CatalogRepository getCatalogRepository() {
        return catalogRepository;
    }

    public void setCatalogRepository(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }
}
