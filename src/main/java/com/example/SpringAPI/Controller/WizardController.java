package com.example.SpringAPI.Controller;


import com.example.SpringAPI.Entity.Wizard;
import com.example.SpringAPI.Repository.wizardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:8081"})
@RestController
@RequestMapping("/api")
public class WizardController {
    @Autowired
    private wizardRepository WizardRepository;

    private Wizard wizard = new Wizard();
    public WizardController(wizardRepository WizardRepository){
        this.WizardRepository = WizardRepository;

    }
    @GetMapping("/wizardList")

    public List<Wizard> getWizardList(){
        return WizardRepository.findAll();
    }

    @PostMapping("/add")
    public void addOrder(@RequestBody Wizard wizard) {

        WizardRepository.save(wizard);
    }
}
