package cinema.controller;

import cinema.entity.Filial;
import cinema.entity.Room;
import cinema.repository.FilialRepository;
import cinema.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilialController {
    @Autowired
    FilialRepository filialRepo;
    @Autowired
    RoomRepository roomRepo;

    @GetMapping("/filials")
    public List<Filial> getAll() {
        return filialRepo.findAll();
    }

    @PostMapping("/filials")
    public Filial addFilial(@RequestBody Filial filial) {
        filialRepo.save(filial);
        for (Room r : filial.getRooms()) {
            r.setFilial(filial);
            roomRepo.save(r);
        }
        return filial;
    }
}
