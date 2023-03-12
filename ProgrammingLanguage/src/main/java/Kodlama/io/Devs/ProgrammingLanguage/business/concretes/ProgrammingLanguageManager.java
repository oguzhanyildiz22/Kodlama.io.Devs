package Kodlama.io.Devs.ProgrammingLanguage.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.ProgrammingLanguage.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.ProgrammingLanguage.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.ProgrammingLanguage.entities.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;
	private List<ProgrammingLanguage> programmingLanguages;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository,
			List<ProgrammingLanguage> programmingLanguages) {

		this.programmingLanguageRepository = programmingLanguageRepository;
		this.programmingLanguages = programmingLanguages;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return programmingLanguageRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		for (ProgrammingLanguage i : programmingLanguages) {
			if (!(i.getName().isEmpty())) {
				if (i.getName().equals(programmingLanguage.getName())) {
					throw new Exception("bu isim daha önce eklenmiş.");
				}
				programmingLanguageRepository.add(programmingLanguage);
			}
			throw new Exception("bu alan boş olamaz.");

		}

	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.delete(programmingLanguage);

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage, ProgrammingLanguage newprogrammingLanguage) {
		programmingLanguageRepository.update(programmingLanguage, newprogrammingLanguage);

	}

	@Override
	public ProgrammingLanguage getById(int id) {

		return programmingLanguageRepository.getById(id);
	}

}
