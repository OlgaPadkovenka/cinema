package cinema.controller;

import cinema.entity.Room;
import cinema.repository.FilialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class RoomController {
    @Autowired
    FilialRepository filialRepository;

    @GetMapping("/rooms")
    public Set<Room> getFilialRooms(@RequestParam Integer filial) {
        // return roomRepository.findByFilial(new Filial(filial));
        return filialRepository.findById(filial).orElseThrow().getRooms();
    }

}

