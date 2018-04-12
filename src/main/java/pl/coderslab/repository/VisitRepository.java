package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.entity.Visit;


public interface VisitRepository extends JpaRepository<Visit, Long> {


}
