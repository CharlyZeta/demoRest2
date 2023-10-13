package ar.gerardo.demorest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cursos", collectionResourceRel = "cursos")
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
