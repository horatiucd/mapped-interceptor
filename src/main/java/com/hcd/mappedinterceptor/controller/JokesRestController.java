package com.hcd.mappedinterceptor.controller;

import com.hcd.mappedinterceptor.domain.Joke;
import com.hcd.mappedinterceptor.service.JokesService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jokes")
@Slf4j
@RequiredArgsConstructor
class JokesRestController {

    private final JokesService jokesService;

    @GetMapping
    ResponseEntity<List<Joke>> getJokes() {
        log.info("getJokes - Retrieve all jokes representation.");
        return ResponseEntity.ok(jokesService.getJokes());
    }
}
