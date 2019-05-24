package lv.tsi.exam.Entity;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends JpaRepository<CatEntity, Long> {
    List<CatEntity> findByTitle(String categoryName);

}