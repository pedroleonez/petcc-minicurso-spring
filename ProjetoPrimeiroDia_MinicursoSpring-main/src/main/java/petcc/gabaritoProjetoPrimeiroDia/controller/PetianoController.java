package petcc.gabaritoProjetoPrimeiroDia.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import petcc.gabaritoProjetoPrimeiroDia.repository.PetianoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import petcc.gabaritoProjetoPrimeiroDia.model.Petiano;

@RestController
@RequestMapping("/petianos")
public class PetianoController {

    @Autowired
    public PetianoRepository repository;

    @GetMapping("/get")
    public List<Petiano> getPetianos() {
        return repository.findAll();
    }

    @PostMapping("/post")
    public Petiano createPetiano(@RequestBody Petiano pet) {
        return this.repository.save(pet);
    }

    @GetMapping("/getFilter")
    public List<Petiano> filterPetianos(@RequestParam String curso) {
        return this.repository.findByCurso(curso);
    }
}
