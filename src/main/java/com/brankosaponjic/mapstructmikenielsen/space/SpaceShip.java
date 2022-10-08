package com.brankosaponjic.mapstructmikenielsen.space;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShip {
    private String name;
    private Float speed;
    private Double fuel;

}
