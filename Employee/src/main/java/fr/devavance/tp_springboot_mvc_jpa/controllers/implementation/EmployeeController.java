package fr.devavance.tp_springboot_mvc_jpa.controllers.implementation;

import fr.devavance.tp_springboot_mvc_jpa.entity.Employee;
import fr.devavance.tp_springboot_mvc_jpa.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @Autowired
    IEmployeeRepository employeeDAO;

    public EmployeeController(IEmployeeRepository employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @RequestMapping("/employees")
    public String findAllEmployee(Model model) {
        model.addAttribute("employees", employeeDAO.findAll());
        model.addAttribute("employee", new Employee());
        return "view_home";
    }

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("employees", employeeDAO.findAll());
        model.addAttribute("employee", new Employee());
        return "view_home";
    }

    @PostMapping("/addemployee")
    public String addEmployee(Employee employee) {
        employeeDAO.save(employee);
        return "redirect:/employees";
    }

    @RequestMapping(value = "employee/{id}")
    public String displayEmployee(@PathVariable(name = "id") Long id, Model model) {
        Employee employee = employeeDAO.findById(id).orElse(null);
        model.addAttribute("employee", employee);
        return "view_employee";
    }



}