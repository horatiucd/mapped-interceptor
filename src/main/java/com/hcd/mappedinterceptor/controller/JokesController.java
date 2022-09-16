package com.hcd.mappedinterceptor.controller;

import com.hcd.mappedinterceptor.service.JokesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
class JokesController {

    private final JokesService jokesService;

    @GetMapping("/jokes")
    String getJokes(Model model) {
        log.info("getJokes - Render all jokes.");
        model.addAttribute("jokes", jokesService.getJokes());
        return "jokes";
    }
}
