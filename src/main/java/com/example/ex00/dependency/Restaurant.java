package com.example.ex00.dependency;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Getter
@RequiredArgsConstructor
@Component
public class Restaurant {
    private final Chef chef;
}
