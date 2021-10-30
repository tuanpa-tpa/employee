package com.employeemanager.employee.employee.controller;

import com.employeemanager.employee.employee.model.Employee;
import com.employeemanager.employee.employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/list")
    public String findAll(Model model) {
        model.addAttribute("listEmployees", employeeService.findAll());
        return "index";
    }

    @GetMapping("/list/{theId}")
    public String findById(@PathVariable int theId, Model model) {
        Employee employee = employeeService.findById(theId);
        if (employee != null) {
            model.addAttribute("listEmployees", employee);
        } else {
            throw new RuntimeException("not find employee id " + theId);
        }
        return "index";
    }

    @GetMapping("/list/add")
    public String addEmployee(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute Employee employee){
        employeeService.save(employee);
        return "redirect:/list";
    }

    @GetMapping("/list/update/{theId}")
    public String updateEmployee(@PathVariable(value = "theId") int theId, Model model) {
        Employee employee = employeeService.findById(theId);
        model.addAttribute("employee", employee);
        return "update_employee";
    }

    @GetMapping("list/delete/{theId}")
    public String deleteEmployee(@PathVariable(value = "theId") int theId) {
        employeeService.deleteById(theId);
        return "redirect:/list";
    }

}
