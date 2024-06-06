package kg.mega.house_new.services.impl;

import kg.mega.house_new.models.Dictionary;
import kg.mega.house_new.repos.DictionaryRepo;
import kg.mega.house_new.services.DictionaryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    private final DictionaryRepo dictionaryRepo;

    public DictionaryServiceImpl(DictionaryRepo dictionaryRepo) {
        this.dictionaryRepo = dictionaryRepo;
    }

    @Override
    public List<Dictionary> getAll() {
        return dictionaryRepo.findAll();
    }
}
