package com.bulentyilmaz.surveyApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bulentyilmaz.surveyApp.Model.TuttugunuzTakim;

@Repository
public interface TuttugunuzTakimRepository extends JpaRepository<TuttugunuzTakim, Long> {

	TuttugunuzTakim findByTuttuguTakim(String tuttuguTakim);
	TuttugunuzTakim findByid(long id);
	
}
