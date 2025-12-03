package sport.api.dezoem.stadiums;

import org.springframework.stereotype.Service;
import sport.api.model.Stadium;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StadiumService {

    private final StadiumRepository stadiumRepository;
    private final StadiumMapper stadiumMapper;

    public StadiumService(StadiumRepository stadiumRepository, StadiumMapper stadiumMapper) {
        this.stadiumRepository = stadiumRepository;
        this.stadiumMapper = stadiumMapper;
    }

    public List<Stadium> getAllStadiums() {
        return stadiumRepository.findAll()
                .stream()
                .map(stadiumMapper::toModel)
                .collect(Collectors.toList());
    }

    public Stadium addStadium(Stadium stadium) {
        var entity = stadiumMapper.toEntity(stadium);
        var saved = stadiumRepository.save(entity);
        return stadiumMapper.toModel(saved);
    }
}
