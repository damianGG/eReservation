package pl.coderslab.config.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.coderslab.entity.Customer;
import pl.coderslab.entity.Employee;
import pl.coderslab.repository.CustomerRepository;
import pl.coderslab.repository.EmployeeRepository;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	EmployeeRepository employeeRepo;
	
	@Autowired
	CustomerRepository customerRepo;
	

	@GetMapping("")
	public String customerHome() {
		return "customerForm";
	}

	
	// ADD______NEW___________CUSTOMER______________
	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("customer", new Customer());
		model.addAttribute("employees", employeeRepo.findAll());
		return "customerForm";
	}

	
	
	@PostMapping("/add")
	public String save(@Valid @ModelAttribute Customer customer, BindingResult res) {
		if (res.hasErrors()) {
			return "customerForm";
		}
		customerRepo.save(customer);
		return "redirect:/customer/add";
	}
	
	
	//_________________________________

	@RequestMapping("/list")
	public String all(Model model) {
		model.addAttribute("customers", customerRepo.findAll());
		return "customersList";
		
	}
	
	@RequestMapping("/edit")
	public String emploEdit(Model model) {
		model.addAttribute("customers", customerRepo.findAll());
		return "customerEdit";
		
	}
	
	
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable Long id) {
		model.addAttribute("employee", customerRepo.findOne(id) );
		return "customerEdit";
	}
	
	@PostMapping("/edit/{id}")
	public String update(@Valid @ModelAttribute Customer customer, BindingResult res) {
		if(res.hasErrors()) {
			return "customerRepo";
		}
		customerRepo.save(customer);
		return "redirect:/customer/edit";
	}
	
	

	@GetMapping("/delete/{id}")
	public String delete(Model model, @PathVariable Long id) {
		employeeRepo.delete(id);
		return "redirect:/customer/edit";
	}
	
	@GetMapping("/show/{id}")
	public String show(Model model, @PathVariable Long id) {
		model.addAttribute("employee", customerRepo.findOne(id));
		return "customerShowInfo";
	}
	
	

}
