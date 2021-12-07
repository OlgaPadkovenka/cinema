package cinema.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="filial")
public class Filial {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String address;

    @OneToMany(mappedBy ="filial")
    private Set<Room> rooms;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }
}
