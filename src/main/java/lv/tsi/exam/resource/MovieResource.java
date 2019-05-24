package lv.tsi.exam.resource;

import lv.tsi.exam.entity.CatalogRepository;
import lv.tsi.exam.entity.CatalogEntity;
import lv.tsi.exam.entity.MovieEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/catalog")
public class MovieResource {
    @Autowired
    private CatalogRepository catalogRepository;
    
    @GetMapping("/getAll")
    public List<CatalogEntity> getAllCatalogs() {
        return catalogRepository.findAll();
    }
    
    @GetMapping("/getCatalogById/{id}")
    public Optional<CatalogEntity> getMovieById(@PathVariable Long id) {
        return catalogRepository.findById(id);
    }
    
    @GetMapping("/getMoviesByCatalogName/{title}")
    public List<CatalogEntity> getMoviesByCatalog(@PathVariable String title) {
        return catalogRepository.findByTitle(title);
    }/**/

    public MovieResource() {
    }

    public MovieResource(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public CatalogRepository getCatalogRepository() {
        return catalogRepository;
    }

    public void setCatalogRepository(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }
}
