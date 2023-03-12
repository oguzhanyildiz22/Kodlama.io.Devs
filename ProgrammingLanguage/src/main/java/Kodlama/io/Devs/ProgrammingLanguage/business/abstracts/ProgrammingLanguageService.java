package Kodlama.io.Devs.ProgrammingLanguage.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.ProgrammingLanguage.entities.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	List<ProgrammingLanguage> getAll();

	void add(ProgrammingLanguage programmingLanguage) throws Exception;

	void delete(ProgrammingLanguage programmingLanguage);

	void update(ProgrammingLanguage programmingLanguage, ProgrammingLanguage newprogrammingLanguage);

	ProgrammingLanguage getById(int id);
}
