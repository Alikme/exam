package lv.tsi.exam.resource;

import lv.tsi.exam.entity.CatalogRepository;
import lv.tsi.exam.entity.CatalogEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/catalog")
public class MovieResource {
    @Autowired
    private CatalogRepository catalogRepository;

    @GetMapping("/getAll")
    public List<CatalogEntity> getAllTopics() {
        return catalogRepository.findAll();
    }

    @GetMapping("/getId/{id}")
    @ResponseBody
    public Optional<CatalogEntity> getById(@PathVariable Long id) {
        return catalogRepository.findById(id);
    }

    @GetMapping("/getMovie/{movie}")
    @ResponseBody
    public List<CatalogEntity> getByMovie(@PathVariable String movie) {
        return catalogRepository.findByTitle(movie);
    }
    public MovieResource(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public MovieResource() {
    }

    public CatalogRepository getCatalogRepository() {
        return catalogRepository;
    }

    public void setCatalogRepository(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

}