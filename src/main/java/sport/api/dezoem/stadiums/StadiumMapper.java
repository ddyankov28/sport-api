package sport.api.dezoem.stadiums;

import org.mapstruct.Mapper;
import sport.api.model.Stadium;

@Mapper(componentModel = "spring")
public interface StadiumMapper {
    StadiumEntity toEntity(Stadium dto);

    Stadium toModel(StadiumEntity entity);
}
