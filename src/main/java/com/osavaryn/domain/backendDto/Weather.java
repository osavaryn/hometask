package com.osavaryn.domain.backendDto;

import lombok.Data;

@Data
public class Weather {
    private Integer id;
    private String main;
    private String description;
}
