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

import pl.coderslab.entity.Event;
import pl.coderslab.repository.EventRepository;



@Controller
@RequestMapping("/event")
public class EventController {
	
	
	
	@Autowired
	EventRepository eventRepository;
	
	@GetMapping("/add")
	public String register(Model m) {
		m.addAttribute("event", new Event());
		return "add";
	}
	
	@PostMapping("/add")
	public String registert(@Valid @ModelAttribute Event event, BindingResult br) {
		this.eventRepository.save(event);
		return "allEvents";
	}

}
