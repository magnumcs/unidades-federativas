package com.portifolio.unidadesfederativasapi.resource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.portifolio.unidadesfederativasapi.model.UnidadeFederativa;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static com.portifolio.unidadesfederativasapi.mock.UnidadeFederativaMock.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
@EnableAutoConfiguration
public class UnidadeFederativaResourceTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void deveSalvarUmaNovaUnidadeFederativa() throws Exception {
        UnidadeFederativa unidadeFederativaMS = unidadeFederativaMS();

        mvc.perform(MockMvcRequestBuilders
                .post("/api/unidade-federativa")
                .content(asJsonString(unidadeFederativaMS))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nome").value(unidadeFederativaMS.getNome()))
                .andExpect(jsonPath("$.sigla").value(unidadeFederativaMS.getSigla()));
    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
