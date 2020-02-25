package com.bulentyilmaz.surveyApp.DatabaseRegister;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bulentyilmaz.surveyApp.Model.Anketor;
import com.bulentyilmaz.surveyApp.Model.HayatinizdanMemnunmusunuz;
import com.bulentyilmaz.surveyApp.Model.TuttugunuzTakim;
import com.bulentyilmaz.surveyApp.Repository.AnketorRepository;
import com.bulentyilmaz.surveyApp.Repository.HayatinizdanMemnunmusunuzRepository;
import com.bulentyilmaz.surveyApp.Repository.TuttugunuzTakimRepository;

@Component
public class DatabaseSeeder implements CommandLineRunner {

	private AnketorRepository anketorrepository;
	private HayatinizdanMemnunmusunuzRepository hayatnizdanmemnunmusunuzrepository;
	private TuttugunuzTakimRepository tuttugunuztakimrepository;
	
	
	@Autowired
	public DatabaseSeeder(AnketorRepository anketorrepository,
			HayatinizdanMemnunmusunuzRepository hayatnizdanmemnunmusunuzrepository,
			TuttugunuzTakimRepository tuttugunuztakimrepository) {
		this.anketorrepository = anketorrepository;
		this.hayatnizdanmemnunmusunuzrepository = hayatnizdanmemnunmusunuzrepository;
		this.tuttugunuztakimrepository = tuttugunuztakimrepository;
	}



	@Override
	public void run(String... args) throws Exception {
	
		Anketor anketor=new Anketor(1, "Bülent","yilmaz","Hayatınızdan Memnunmusunuz");
		Anketor anketor2=new Anketor(2, "Ali","yilmaz","Tuttugunuz Takım");
		
		
		anketorrepository.save(anketor);
		anketorrepository.save(anketor2);
		
		
		
		
		HayatinizdanMemnunmusunuz hayatinizdanMemnunmusunuz0= new HayatinizdanMemnunmusunuz
				(1,"Ahmet","Kiliç",1,"05.08.1994",6,"Beşiktaş","Başarısızlık","Hayat","Ahmet","yeşil");
		HayatinizdanMemnunmusunuz hayatinizdanMemnunmusunuz1= new HayatinizdanMemnunmusunuz
				(2,"Süleyman","korkmaz",1,"02.05.1996",3,"aşk","Yalan Söylenilmesi","Hayatı Seviyorum","ali","mutlu");
		HayatinizdanMemnunmusunuz hayatinizdanMemnunmusunuz2= new HayatinizdanMemnunmusunuz
				(3,"Naim","süleyman",1,"05.08.1994",6,"Beşiktaş","kötülük","Hayat","Ahmet","yeşil");
		HayatinizdanMemnunmusunuz hayatinizdanMemnunmusunuz3= new HayatinizdanMemnunmusunuz
				(4,"Süleyman","korkmaz",1,"02.05.1996",3,"Aile","Yalan Söylenilmesi","Hayatı Seviyorum","ali","mutlu");
		HayatinizdanMemnunmusunuz hayatinizdanMemnunmusunuz4= new HayatinizdanMemnunmusunuz
				(5,"aliye","Kiliç",0,"05.08.1994",6,"insanlar","yanlış anlaşılma","Hayat","Ahmet","yeşil");
		HayatinizdanMemnunmusunuz hayatinizdanMemnunmusunuz5= new HayatinizdanMemnunmusunuz
				(6,"murat","korkmaz",1,"02.05.1996",3,"Aile","Yalan Söylenilmesi","Hayatı Seviyorum","ali","mutlu");
		HayatinizdanMemnunmusunuz hayatinizdanMemnunmusunuz6= new HayatinizdanMemnunmusunuz
				(1,"Ahmet","Kiliç",1,"05.08.1994",1,"Beşiktaş","Başarısızlık","Hayat","Ahmet","yeşil");
		HayatinizdanMemnunmusunuz hayatinizdanMemnunmusunuz7= new HayatinizdanMemnunmusunuz
				(2,"Süleyman","korkmaz",1,"02.05.1996",1,"aşk","Yalan Söylenilmesi","Hayatı Seviyorum","ali","mutlu");
		HayatinizdanMemnunmusunuz hayatinizdanMemnunmusunuz8= new HayatinizdanMemnunmusunuz
				(3,"Naim","süleyman",1,"05.08.1994",5,"Beşiktaş","kötülük","Hayat","Ahmet","yeşil");
		HayatinizdanMemnunmusunuz hayatinizdanMemnunmusunuz9= new HayatinizdanMemnunmusunuz
				(4,"Süleyman","korkmaz",1,"02.05.1996",4,"Aile","Yalan Söylenilmesi","Hayatı Seviyorum","ali","mutlu");
		HayatinizdanMemnunmusunuz hayatinizdanMemnunmusunuz10= new HayatinizdanMemnunmusunuz
				(5,"aliye","Kiliç",0,"05.08.1994",8,"insanlar","yanlış anlaşılma","Hayat","Ahmet","yeşil");
		HayatinizdanMemnunmusunuz hayatinizdanMemnunmusunuz11= new HayatinizdanMemnunmusunuz
				(6,"murat","korkmaz",1,"02.05.1996",19,"Aile","Yalan Söylenilmesi","Hayatı Seviyorum","ali","mutlu");
		

		hayatnizdanmemnunmusunuzrepository.save(hayatinizdanMemnunmusunuz0);
		hayatnizdanmemnunmusunuzrepository.save(hayatinizdanMemnunmusunuz1);
		hayatnizdanmemnunmusunuzrepository.save(hayatinizdanMemnunmusunuz2);
		hayatnizdanmemnunmusunuzrepository.save(hayatinizdanMemnunmusunuz3);
		hayatnizdanmemnunmusunuzrepository.save(hayatinizdanMemnunmusunuz4);
		hayatnizdanmemnunmusunuzrepository.save(hayatinizdanMemnunmusunuz5);
		hayatnizdanmemnunmusunuzrepository.save(hayatinizdanMemnunmusunuz6);
		hayatnizdanmemnunmusunuzrepository.save(hayatinizdanMemnunmusunuz7);
		hayatnizdanmemnunmusunuzrepository.save(hayatinizdanMemnunmusunuz8);
		hayatnizdanmemnunmusunuzrepository.save(hayatinizdanMemnunmusunuz9);
		hayatnizdanmemnunmusunuzrepository.save(hayatinizdanMemnunmusunuz10);
		hayatnizdanmemnunmusunuzrepository.save(hayatinizdanMemnunmusunuz11);
		
		
		
		TuttugunuzTakim tuttugunuzTakim1=new TuttugunuzTakim
				(1,"mehmet","yilmaz",1,"04.08.1990","Beşiktaş","Siyah Beyaz","ahmet","Gül");
		TuttugunuzTakim tuttugunuzTakim2=new TuttugunuzTakim
				(2,"ali","celebi",1,"11.02.1992","Fenerbahce","sari lacivert","mehmet","cam");
		TuttugunuzTakim tuttugunuzTakim3=new TuttugunuzTakim
				(3,"burak","sahin",1,"22.03.1997","galatasaray","sari kırmızı","murat","salim");
		TuttugunuzTakim tuttugunuzTakim4=new TuttugunuzTakim
				(4,"miray","erten",0,"25.04.1997","Beşiktaş","Siyah Beyaz","ali","korkmaz");
		TuttugunuzTakim tuttugunuzTakim5=new TuttugunuzTakim
				(5,"mehmet","yilmaz",1,"04.08.1990","Beşiktaş","Siyah Beyaz","ahmet","Gül");
		TuttugunuzTakim tuttugunuzTakim6=new TuttugunuzTakim
				(6,"ali","celebi",1,"11.02.1992","Fenerbahce","sari lacivert","mehmet","cam");
		TuttugunuzTakim tuttugunuzTakim7=new TuttugunuzTakim
				(7,"burak","sahin",1,"22.03.1997","galatasaray","sari kırmızı","murat","salim");
		TuttugunuzTakim tuttugunuzTakim8=new TuttugunuzTakim
				(8,"miray","erten",0,"25.04.1997","Beşiktaş","Siyah Beyaz","ali","korkmaz");
		TuttugunuzTakim tuttugunuzTakim9=new TuttugunuzTakim
				(8,"miray","erten",0,"25.04.1997","Beşiktaş","Siyah Beyaz","ali","korkmaz");
		TuttugunuzTakim tuttugunuzTakim10=new TuttugunuzTakim
				(8,"miray","erten",0,"25.04.1997","Beşiktaş","Siyah Beyaz","ali","korkmaz");
		TuttugunuzTakim tuttugunuzTakim11=new TuttugunuzTakim
				(8,"miray","erten",0,"25.04.1997","Beşiktaş","Siyah Beyaz","ali","korkmaz");
		TuttugunuzTakim tuttugunuzTakim12=new TuttugunuzTakim
				(8,"miray","erten",0,"25.04.1997","Beşiktaş","Siyah Beyaz","ali","korkmaz");
		
		
		
		tuttugunuztakimrepository.save(tuttugunuzTakim1);
		tuttugunuztakimrepository.save(tuttugunuzTakim2);
		tuttugunuztakimrepository.save(tuttugunuzTakim3);
		tuttugunuztakimrepository.save(tuttugunuzTakim4);
		tuttugunuztakimrepository.save(tuttugunuzTakim5);
		tuttugunuztakimrepository.save(tuttugunuzTakim6);
		tuttugunuztakimrepository.save(tuttugunuzTakim7);
		tuttugunuztakimrepository.save(tuttugunuzTakim8);
		tuttugunuztakimrepository.save(tuttugunuzTakim9);
		tuttugunuztakimrepository.save(tuttugunuzTakim10);
		tuttugunuztakimrepository.save(tuttugunuzTakim11);
		tuttugunuztakimrepository.save(tuttugunuzTakim12);
		
		
		
		
		
		
	}

}
