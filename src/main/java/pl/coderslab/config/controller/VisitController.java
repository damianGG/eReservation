package pl.coderslab.config.controller;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.entity.Visit;
import pl.coderslab.repository.VisitRepository;

@Controller
@RequestMapping("/visit")
public class VisitController {

	@Autowired
	VisitRepository visitRepo;

	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("visit", new Visit());
		return "visitForm";
	}

	@PostMapping("/add")
	public String save(@Valid @ModelAttribute Visit visit, BindingResult res) {
		
		visitRepo.save(visit);
		return "redirect:/visit/add";
	}

	@RequestMapping("/all")
	public String all(Model model) {
		model.addAttribute("employees", visitRepo.findAll());
		return "visitAll";	
	}

}
