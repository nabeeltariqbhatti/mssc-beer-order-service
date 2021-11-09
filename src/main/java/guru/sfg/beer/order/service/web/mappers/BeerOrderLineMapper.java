package guru.sfg.beer.order.service.web.mappers;

import guru.sfg.beer.order.service.domain.BeerOrderLine;
import guru.sfg.beer.order.service.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;
import org.mapstruct.ObjectFactory;

@Mapper(uses = {DateMapper.class})
public interface BeerOrderLineMapper {
    @ObjectFactory
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    @ObjectFactory
    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
