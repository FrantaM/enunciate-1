package com.github.frantam.enunciate1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;

public class Response {
    @JsonProperty
    @JsonSubTypes({
            @JsonSubTypes.Type(Operation1A.class),
            @JsonSubTypes.Type(Operation1B.class)
    })
    public Operation1 operation1;
    @JsonProperty
    public Operation2 operation2;
}
