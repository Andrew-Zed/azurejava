package andy.springframework.jdbc.repositories;

import andy.springframework.jdbc.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
