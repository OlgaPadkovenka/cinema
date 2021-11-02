package controller;

import entity.Filial;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {

    @GetMapping("/rooms")
    public List<Filial> getFilialRooms(@RequestParam Integer filial) {
        return null;
    }

}
