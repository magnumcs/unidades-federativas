package com.portifolio.unidadesfederativasapi.mock;

import com.portifolio.unidadesfederativasapi.model.UnidadeFederativa;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UnidadeFederativaMock {

    public static UnidadeFederativa unidadeFederativaSC() {
        UnidadeFederativa unidadeFederativa = new UnidadeFederativa();
        unidadeFederativa.setId(1L);
        unidadeFederativa.setNome("Santa Catarina");
        unidadeFederativa.setSigla("SC");
        unidadeFederativa.setDataRegistro(LocalDateTime.now());
        return unidadeFederativa;
    }

    public static UnidadeFederativa unidadeFederativaMS() {
        UnidadeFederativa unidadeFederativa = new UnidadeFederativa();
        unidadeFederativa.setId(2L);
        unidadeFederativa.setNome("Mato Grosso do Sul");
        unidadeFederativa.setSigla("MS");
        unidadeFederativa.setDataRegistro(LocalDateTime.now());
        return unidadeFederativa;
    }

    public static UnidadeFederativa unidadeFederativaMG() {
        UnidadeFederativa unidadeFederativa = new UnidadeFederativa();
        unidadeFederativa.setId(3L);
        unidadeFederativa.setNome("Minas Gerais");
        unidadeFederativa.setSigla("MG");
        unidadeFederativa.setDataRegistro(LocalDateTime.now());
        return unidadeFederativa;
    }

    public static UnidadeFederativa unidadeFederativaMA() {
        UnidadeFederativa unidadeFederativa = new UnidadeFederativa();
        unidadeFederativa.setId(4L);
        unidadeFederativa.setNome("Maranhão");
        unidadeFederativa.setSigla("MA");
        unidadeFederativa.setDataRegistro(LocalDateTime.now());
        return unidadeFederativa;
    }

    public static List<UnidadeFederativa> unidadesFederativasLista() {
        List<UnidadeFederativa> unidadesFederativas = new ArrayList<>();
        unidadesFederativas.add(unidadeFederativaMA());
        unidadesFederativas.add(unidadeFederativaMG());
        unidadesFederativas.add(unidadeFederativaMS());
        unidadesFederativas.add(unidadeFederativaSC());
        return unidadesFederativas;
    }

}
