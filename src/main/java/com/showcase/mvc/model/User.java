package com.showcase.mvc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by vinni on 1/15/15.
 */
@AllArgsConstructor
public class User {
    @Setter
    @Getter
    private Integer idUser;
    @Setter
    @Getter
    private String name;
}
