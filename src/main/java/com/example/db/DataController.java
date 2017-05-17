package com.example.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import com.example.db.entity.Cod;
import com.example.db.entity.CodRepository;

@Controller
@EnableAutoConfiguration
public class DataController {

    @Autowired
    CodRepository codRepository;

    @RequestMapping("/data")
    public String data(Model model) {
        Page<Cod> cods = codRepository.findAll(new PageRequest(0, 10));
        for (Cod cod : cods) {
            System.out.println(cod.getPk().getCodKbn() + " = " + cod.getCodName());
			model.addAttribute("val", cod.getPk().getCodKbn() + " = " + cod.getCodName());
        }
        return "home";
    }

}
