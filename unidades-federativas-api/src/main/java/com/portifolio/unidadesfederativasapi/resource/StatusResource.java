package com.portifolio.unidadesfederativasapi.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/unidades-federativas")
public class StatusResource {

    @GetMapping(value = "/status")
    ResponseEntity<?> getStatusApplication() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
