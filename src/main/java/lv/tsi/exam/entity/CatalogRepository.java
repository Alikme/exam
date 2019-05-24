package lv.tsi.exam.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogRepository extends JpaRepository<CatalogEntity, Long> {
    List<CatalogEntity> findByTitle(String title);
}
