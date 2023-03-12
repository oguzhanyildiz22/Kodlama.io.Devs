package Kodlama.io.Devs.ProgrammingLanguage.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.ProgrammingLanguage.entities.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {

	List<ProgrammingLanguage> getAll();

	void add(ProgrammingLanguage programmingLanguage);

	void delete(ProgrammingLanguage programmingLanguage);

	void update(ProgrammingLanguage programmingLanguage, ProgrammingLanguage newprogrammingLanguage);

	ProgrammingLanguage getById(int id);
}
