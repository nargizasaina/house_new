package kg.mega.house_new.controllers;

import kg.mega.house_new.models.Dictionary;
import kg.mega.house_new.services.DictionaryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dictionary")
public class DictionaryController {
    private final DictionaryService dictionaryService;

    public DictionaryController(DictionaryService dictionaryService) {
        this.dictionaryService = dictionaryService;
    }

    @GetMapping("/")
    public List<Dictionary> getAllDictionaries(){
        return dictionaryService.getAll();
    }
}
