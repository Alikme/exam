package lv.tsi.exam.entity;

import java.util.List;

import lv.tsi.exam.entity.CatalogRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends JpaRepository<CatalogEntity, Long> {
    List<CatalogEntity> findByTitle(String categoryName);
}