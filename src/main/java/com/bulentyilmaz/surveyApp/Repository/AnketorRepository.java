package com.bulentyilmaz.surveyApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.bulentyilmaz.surveyApp.Model.Anketor;

@Repository
public interface AnketorRepository extends JpaRepository<Anketor,Long> {
 
	
	Anketor findByAnketorAdi(String anketoradi);
	Anketor findByAnketorSoyadi(String anketorsoyadi);
	Anketor findByAnketAdi(String anketAdi);
	
}
