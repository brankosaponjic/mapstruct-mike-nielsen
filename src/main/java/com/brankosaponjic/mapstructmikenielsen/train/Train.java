package com.brankosaponjic.mapstructmikenielsen.train;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Train {
    private String model;
    private Float maxSpeed;
}
