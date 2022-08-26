package com.hcd.mappedinterceptor.domain;

import java.util.UUID;

public record Joke(String id, String text) {

    public Joke(String text) {
        this(UUID.randomUUID().toString(), text);
    }
}
