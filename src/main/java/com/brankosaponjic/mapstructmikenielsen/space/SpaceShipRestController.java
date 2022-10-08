package com.brankosaponjic.mapstructmikenielsen.space;

import com.brankosaponjic.mapstructmikenielsen.train.Train;
import com.brankosaponjic.mapstructmikenielsen.train.TrainMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpaceShipRestController {

    @GetMapping("/spaceship")
    public SpaceShip aSpaceShip() {
        return TrainMapper
                .INSTANCE
                .trainToSpaceShip(new Train("T14-Armata", 201.4f));
    }
}
