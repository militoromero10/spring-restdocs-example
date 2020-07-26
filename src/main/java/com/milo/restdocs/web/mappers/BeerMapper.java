package com.milo.restdocs.web.mappers;

import com.milo.restdocs.domain.Beer;
import com.milo.restdocs.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}