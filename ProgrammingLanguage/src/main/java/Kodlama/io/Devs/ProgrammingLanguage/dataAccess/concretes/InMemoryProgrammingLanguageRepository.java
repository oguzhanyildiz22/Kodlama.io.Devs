package Kodlama.io.Devs.ProgrammingLanguage.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.ProgrammingLanguage.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.ProgrammingLanguage.entities.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
	
	List<ProgrammingLanguage> programmingLanguages;
	
	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"C#"));
		programmingLanguages.add(new ProgrammingLanguage(2,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
		
	} 

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return programmingLanguages;
		
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.add(programmingLanguage);
		
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguages.remove(programmingLanguage);
		
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage , ProgrammingLanguage newprogrammingLanguage) {
		programmingLanguages.set(programmingLanguages.indexOf(programmingLanguage), newprogrammingLanguage);
		
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		
		return  programmingLanguages.get(id);
	}

	

}
