package sport.api.dezoem.stadiums;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import sport.api.api.StadiumsApi;
import sport.api.model.Stadium;

import java.net.URI;
import java.util.List;

@RestController
public class StadiumController implements StadiumsApi{

    private final StadiumService stadiumService;

    public StadiumController(StadiumService stadiumService) {
        this.stadiumService = stadiumService;
    }

    @Override
    public ResponseEntity<List<Stadium>> getStadiums() {
        return ResponseEntity.ok(this.stadiumService.getAllStadiums());
    }

    @Override
    public ResponseEntity<Stadium> addStadium(Stadium stadium) {
        return ResponseEntity.created(URI.create("")).body(this.stadiumService.addStadium(stadium));
    }

}
