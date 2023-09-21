package andy.springframework.jdbc.repositories;


import andy.springframework.jdbc.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
