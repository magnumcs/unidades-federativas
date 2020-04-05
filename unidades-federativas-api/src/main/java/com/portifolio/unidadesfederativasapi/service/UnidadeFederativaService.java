package com.portifolio.unidadesfederativasapi.service;

import com.portifolio.unidadesfederativasapi.exception.AlreadyExistsException;
import com.portifolio.unidadesfederativasapi.exception.InternaServerErrorException;
import com.portifolio.unidadesfederativasapi.exception.NotFoundException;
import com.portifolio.unidadesfederativasapi.model.UnidadeFederativa;

import java.util.List;

public interface UnidadeFederativaService {

    List<UnidadeFederativa> listarUnidadesFederativas();

    UnidadeFederativa buscarUnidadeFederativa(String sigla) throws NotFoundException;

    UnidadeFederativa salvarUnidadeFederativa(UnidadeFederativa unidadeFederativa) throws InternaServerErrorException, AlreadyExistsException;

    void removerUnidadeFederativa(Long id) throws InternaServerErrorException;

    UnidadeFederativa editarUnidadeFederativa(UnidadeFederativa unidadeFederativa) throws InternaServerErrorException;

}
