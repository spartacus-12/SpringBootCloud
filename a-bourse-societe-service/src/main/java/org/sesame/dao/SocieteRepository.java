package org.sesame.dao;

import org.sesame.entities.Societe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface SocieteRepository extends JpaRepository<Societe, Long> {
//	@Query("select s from societe s where s.nomSociete like :mc")
  //  public Page<Societe> societeParMc(@Param("mc")String mc,Pageable pageable);
}
