package fr.devavance.tp_springboot_mvc_jpa.controllers;

import ch.qos.logback.core.model.Model;
import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public interface iEmployeeController {
    @GetMapping("/employee/home")
    public String displayHome(Model model);
    @PostMapping("/employee/addemployee")
    public String addEmployee(Employee employee);

    @RequestMapping("/employees")
    public String findAllEmployee(Model model);

    public String displayEmployee(Long id,  Model model);



}
