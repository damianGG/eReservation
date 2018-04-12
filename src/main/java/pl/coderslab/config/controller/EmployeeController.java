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
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepo;
	
	@Autowired
	CustomerRepository customerRepo;
	
	@GetMapping("")
	public String employeeHome() {
		return "employee";
	}

	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("employee", new Employee());
		return "employeeForm";
	}

	@PostMapping("/add")
	public String save(@Valid @ModelAttribute Employee employee, BindingResult res) {
		if (res.hasErrors()) {
			return "employeeForm";
		}
		employeeRepo.save(employee);
		return "redirect:/employee/add";
	}

	@RequestMapping("/list")
	public String all(Model model) {
		model.addAttribute("employees", employeeRepo.findAll());
		return "employeeList";
		
	}
	
	@RequestMapping("/edit")
	public String emploEdit(Model model) {
		model.addAttribute("employees", employeeRepo.findAll());
		return "employeeEdit";
		
	}
	
	
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable Long id) {
		model.addAttribute("employee", employeeRepo.findOne(id) );
		return "employeeForm";
	}
	
	@PostMapping("/edit/{id}")
	public String update(@Valid @ModelAttribute Employee employee, BindingResult res) {
		if(res.hasErrors()) {
			return "employeeRepo";
		}
		employeeRepo.save(employee);
		return "redirect:/employee/edit";
	}
	
	

	@GetMapping("/delete/{id}")
	public String delete(Model model, @PathVariable Long id) {
		employeeRepo.delete(id);
		return "redirect:/employee/edit";
	}
	
	@GetMapping("/show/{id}")
	public String show(Model model, @PathVariable Long id) {
		model.addAttribute("employee", employeeRepo.findOne(id));
		return "employeeShowInfo";
	}
	//_____________________CUSTOMER_______________________________
//	
//	@GetMapping("/addcustomer")
//	public String addCustomer(Model model) {
//		model.addAttribute("customer", new Customer());
//		model.addAttribute("employees", employeeRepo.findAll());
//		return "customerForm";
//	}
//	
//	@PostMapping("/addcustomer")
//	public String save(@Valid @ModelAttribute Customer customer, BindingResult res) {
//		if (res.hasErrors()) {
//			return "customersForm";
//		}
//		customerRepo.save(customer);
//		return "redirect:/employee/addcustomer";
//	}

}
