package cinema.repository;

import cinema.entity.Filial;
import cinema.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface RoomRepository extends JpaRepository <Room, Integer> {
    Set<Room> findByFilial(Filial f);
}
