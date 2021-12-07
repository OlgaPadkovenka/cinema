package cinema.controller;

import cinema.entity.Filial;
import cinema.entity.Room;
import cinema.entity.Seance;
import cinema.repository.CinemaRepository;
import cinema.repository.FilialRepository;
import cinema.repository.RoomRepository;
import cinema.repository.SeanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

//	GET /seanсes?date=?&filial=? - выводит список сеансов в филиале в определённую дату
@RestController
public class SeanceController {
    @Autowired
    SeanceRepository seanceRepository;
    @Autowired
    CinemaRepository cinemaRepository;
    @Autowired
    RoomRepository roomRepository;

    @GetMapping("/seances")
    public List<Seance> getAll(
            @RequestParam @DateTimeFormat(pattern = "dd.MM.yyyy") Date date,
            @RequestParam Integer filial) {
        // return filialRepository.findById(filial).orElseThrow().getRooms();
        System.out.println(date);
        return seanceRepository.findByDateAndFilial(date, filial);
    }

    @PostMapping("/seances")
    public Seance addSeance(@RequestBody Seance seance) {
        if (seance.getCinema().getId() == null) {
            cinemaRepository.save(seance.getCinema());
        }
        Room room = roomRepository.getById(seance.getRoom().getId());
        seance.setRoom(room);
        seanceRepository.save(seance);
        return seance;
    }
}
