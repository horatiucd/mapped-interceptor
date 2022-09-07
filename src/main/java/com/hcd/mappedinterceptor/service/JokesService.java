package com.hcd.mappedinterceptor.service;

import com.hcd.mappedinterceptor.domain.Joke;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JokesService {
    private final List<Joke> jokes = new ArrayList<>();

    public JokesService() {
        jokes.addAll(List.of(new Joke("If Chuck Norris coughs on you, you owe him 50 bucks."),
                new Joke("Chuck Norris can make a slinky go up the stairs."),
                new Joke("Ice has Chuck Norris running through its veins.")));
    }

    public List<Joke> getJokes() {
        return jokes;
    }
}
