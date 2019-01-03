package com.github.beisser.spring_training.model.tools;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Tool {

    private final String id;
    private final String name;
    private final String description;

}
