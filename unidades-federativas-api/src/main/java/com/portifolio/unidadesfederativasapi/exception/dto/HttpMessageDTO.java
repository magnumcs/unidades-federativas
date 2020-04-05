package com.portifolio.unidadesfederativasapi.exception.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class HttpMessageDTO {

    private String message;
    private String cause;
    private Date data;

}
