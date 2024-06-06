package kg.mega.house_new.repos;

import kg.mega.house_new.models.Dictionary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DictionaryRepo extends JpaRepository<Dictionary, Long> {
}
