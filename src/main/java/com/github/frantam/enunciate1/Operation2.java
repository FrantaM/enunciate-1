package com.github.frantam.enunciate1;

import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonSubTypes({
        @JsonSubTypes.Type(Operation2A.class),
        @JsonSubTypes.Type(Operation2B.class)
})
public interface Operation2 {
}
