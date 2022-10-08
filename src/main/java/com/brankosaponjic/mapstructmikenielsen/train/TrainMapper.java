package com.brankosaponjic.mapstructmikenielsen.train;

import com.brankosaponjic.mapstructmikenielsen.space.SpaceShip;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TrainMapper {
    TrainMapper INSTANCE = Mappers.getMapper(TrainMapper.class);

    @Mapping(source = "model", target = "name")
    @Mapping(source = "maxSpeed", target = "speed")
    SpaceShip trainToSpaceShip(Train train);
}
