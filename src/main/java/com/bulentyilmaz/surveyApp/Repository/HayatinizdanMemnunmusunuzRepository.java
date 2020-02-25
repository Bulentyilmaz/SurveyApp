package com.bulentyilmaz.surveyApp.Repository;

import org.springframework.stereotype.Repository;
import com.bulentyilmaz.surveyApp.Model.HayatinizdanMemnunmusunuz;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface HayatinizdanMemnunmusunuzRepository extends JpaRepository<HayatinizdanMemnunmusunuz,Long> {
	
	
	HayatinizdanMemnunmusunuz findByMutlulukOrani(int mutlulukOrani);
	HayatinizdanMemnunmusunuz findByid(long id);
	
	
}
