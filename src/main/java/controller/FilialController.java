package controller;

import entity.Filial;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FilialController {
    @GetMapping("/filials")
    public List<Filial> getAll() {
        List<Filial> filials = new ArrayList<>() {{
            add(new Filial(1, "First", "1"));
            add(new Filial(2, "Second", "2"));
        }};
        return filials;
    }

    @PostMapping("/filials")
    public Filial addFilial() {
        return null;
    }
}
