package cinema.repository;

import cinema.entity.Filial;
import cinema.entity.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface SeanceRepository extends JpaRepository<Seance, Integer> {
    @Query(
            "select s " +
              "from Seance s " +
             "where s.room.filial.id = ?2 " +
               "and s.date = ?1"
    )
    List<Seance> findByDateAndFilial(Date date, Integer filial);
}
