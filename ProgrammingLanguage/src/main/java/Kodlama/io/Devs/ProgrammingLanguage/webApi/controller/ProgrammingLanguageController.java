package Kodlama.io.Devs.ProgrammingLanguage.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.ProgrammingLanguage.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.ProgrammingLanguage.entities.ProgrammingLanguage;

@RestController
@RequestMapping("/api/ProgrammingLanguage")
public class ProgrammingLanguageController {

	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
		super();
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {

		return programmingLanguageService.getAll();
	}

	@GetMapping("/add")
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		programmingLanguageService.add(programmingLanguage);

	}

	@GetMapping("/delete")
	public void delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.delete(programmingLanguage);

	}


	@GetMapping("/update")
	public void update(ProgrammingLanguage programmingLanguage, ProgrammingLanguage newprogrammingLanguage) {
		programmingLanguageService.update(programmingLanguage, newprogrammingLanguage);

	}

	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(int id) {

		return programmingLanguageService.getById(id);
	}
}
