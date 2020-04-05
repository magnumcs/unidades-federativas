package com.portifolio.unidadesfederativasapi.service;

import com.portifolio.unidadesfederativasapi.model.UnidadeFederativa;
import com.portifolio.unidadesfederativasapi.repository.UnidadeFederativaRepository;
import com.portifolio.unidadesfederativasapi.service.inpl.UnidadeFederativaServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.*;
import static com.portifolio.unidadesfederativasapi.mock.UnidadeFederativaMock.*;

import java.util.List;

@RunWith(MockitoJUnitRunner.Silent.class)
public class UnidadeFederativaServiceTest {

    @InjectMocks
    private UnidadeFederativaServiceImpl unidadeFederativaService;

    @Mock
    private UnidadeFederativaRepository unidadeFederativaRepository;


    @Test
    public void deveListarAsUnidadesFederativas() {
        // Dado
        List<UnidadeFederativa> unidadesFederativas = unidadesFederativasLista();

        // Quando
        when(unidadeFederativaService.listarUnidadesFederativas()).thenReturn(unidadesFederativas);

        // Entao
        Assert.assertEquals(4, unidadesFederativas.size());
    }

}
