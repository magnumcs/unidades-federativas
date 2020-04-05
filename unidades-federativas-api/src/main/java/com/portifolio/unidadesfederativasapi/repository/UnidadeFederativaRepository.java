package com.portifolio.unidadesfederativasapi.repository;

import com.portifolio.unidadesfederativasapi.model.UnidadeFederativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UnidadeFederativaRepository extends JpaRepository<UnidadeFederativa, Long> {

    Optional<UnidadeFederativa> getBySigla(String sigla);

}
