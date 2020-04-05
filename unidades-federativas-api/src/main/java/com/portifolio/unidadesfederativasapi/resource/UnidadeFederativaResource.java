package com.portifolio.unidadesfederativasapi.resource;

import com.portifolio.unidadesfederativasapi.exception.AlreadyExistsException;
import com.portifolio.unidadesfederativasapi.exception.InternaServerErrorException;
import com.portifolio.unidadesfederativasapi.exception.NotFoundException;
import com.portifolio.unidadesfederativasapi.model.UnidadeFederativa;
import com.portifolio.unidadesfederativasapi.service.UnidadeFederativaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/unidade-federativa")
public class UnidadeFederativaResource {

    private final UnidadeFederativaService unidadeFederativaService;

    @Autowired
    public UnidadeFederativaResource(UnidadeFederativaService unidadeFederativaService) {
        this.unidadeFederativaService = unidadeFederativaService;
    }

    @GetMapping
    private ResponseEntity<List<UnidadeFederativa>> listarUnidadesFederativas() {
        return ResponseEntity.ok(unidadeFederativaService.listarUnidadesFederativas());
    }

    @GetMapping(value = "/{sigla}")
    private ResponseEntity<UnidadeFederativa> buscarUnidadeFederativa(@PathVariable("sigla") String sigla) throws NotFoundException {
        return ResponseEntity.ok(unidadeFederativaService.buscarUnidadeFederativa(sigla));
    }

    @PostMapping
    private ResponseEntity<?> salvarUnidadeFederativa(@RequestBody UnidadeFederativa unidadeFederativa) throws InternaServerErrorException, AlreadyExistsException {
            return ResponseEntity.ok(unidadeFederativaService.salvarUnidadeFederativa(unidadeFederativa));
    }

    @PutMapping
    private ResponseEntity<?> removerUnidadeFederativa(@RequestBody UnidadeFederativa unidadeFederativa) throws InternaServerErrorException {
        return ResponseEntity.ok(unidadeFederativaService.editarUnidadeFederativa(unidadeFederativa));
    }

    @DeleteMapping(value = "/{id}")
    private ResponseEntity<?> removerUnidadeFederativa(@PathVariable("id") Long id) throws InternaServerErrorException {
            unidadeFederativaService.removerUnidadeFederativa(id);
            return ResponseEntity.noContent().build();
    }



}
