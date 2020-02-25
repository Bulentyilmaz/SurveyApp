package com.bulentyilmaz.surveyApp.Controller;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bulentyilmaz.surveyApp.Model.Anketor;
import com.bulentyilmaz.surveyApp.Model.HayatinizdanMemnunmusunuz;
import com.bulentyilmaz.surveyApp.Model.TuttugunuzTakim;
import com.bulentyilmaz.surveyApp.Repository.AnketorRepository;
import com.bulentyilmaz.surveyApp.Repository.HayatinizdanMemnunmusunuzRepository;
import com.bulentyilmaz.surveyApp.Repository.TuttugunuzTakimRepository;

@Controller
public class SurveyController {
	 
	private String loginErrors = "Adiniz veya soyadiniz hatalı";
	
	private AnketorRepository anketorRepository;
	private HayatinizdanMemnunmusunuzRepository hayatinizdanMemnunmusunuzRepository;
	private TuttugunuzTakimRepository tuttugunuzTakimRepository;

	@Autowired
	public SurveyController(AnketorRepository anketorRepository,
			HayatinizdanMemnunmusunuzRepository hayatinizdanMemnunmusunuzRepository,
			TuttugunuzTakimRepository tuttugunuzTakimRepository) {
		this.anketorRepository = anketorRepository;
		this.hayatinizdanMemnunmusunuzRepository = hayatinizdanMemnunmusunuzRepository;
		this.tuttugunuzTakimRepository = tuttugunuzTakimRepository;
	}
	
	 @RequestMapping(value = "/")
	    public String getAnketor(){
	        return "redirect:/Anketler";
	        
	    }
	
	 @RequestMapping("/Anketler")
	    public String getAnketler(Model model, HttpSession session)
	    {
		 	
	        model.addAttribute("anketors",anketorRepository.findAll()); 
	        return "AnketorAnaSayfa";
	    }
	
	 
	 
	 @RequestMapping(value = {"/anket/katil/{anketorid}"}, method= RequestMethod.GET)
	    public String getAnketDoldur(Model model,HttpSession session,
	    		@PathVariable(name="anketorid")String id)
	    {
		 System.out.println(id);
		  long anket_id=Long.parseLong(id);
		  
	      
		  HayatinizdanMemnunmusunuz hmForm=new HayatinizdanMemnunmusunuz();
		  TuttugunuzTakim ttForm = new TuttugunuzTakim();
		  SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
	      Date today = new Date();
	      model.addAttribute("today",format.format(today));
	      
	    if(anket_id==2) {
	    	 model.addAttribute("ttform",ttForm);
	    	 return "TuttugunuzTakımEkle";
	    }else {
	    	 model.addAttribute("hmform",hmForm);
	    	return "HayatınızdanMemnunmusunuzEkle";
	    }
	     
	    }
	 
	 
	 
	 @RequestMapping(value = {"/hguncelle/{anketid}"}, method= RequestMethod.GET)
	    public ModelAndView getAnketGuncelle(Model model,HttpSession session,
	    		@PathVariable(name="anketid")String id) {
		 System.out.println(id);
		  long anket_id=Long.parseLong(id);
		  ModelAndView modelAndView = new ModelAndView("HayatınızdanMemnunmusunuzGuncelle");
	      
		  HayatinizdanMemnunmusunuz hmForm=hayatinizdanMemnunmusunuzRepository.findByid(anket_id) ;

		  SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
	      Date today = new Date();
	      model.addAttribute("today",format.format(today));
	      
	      modelAndView.addObject("hayatinizdanMemnunmusunuz", hmForm);

	    	return modelAndView;
	     
	    }
	 
	
	 
	 
	 
	 @RequestMapping(value = {"/hguncelle/hmguncelle/{anketid}"}, method = RequestMethod.GET)
	    public String guncellehm(@ModelAttribute HayatinizdanMemnunmusunuz hayatinizdanMemnunmusunuz,@PathVariable(name="anketid") String id, HttpSession session, Model model) throws ParseException 
		 {
		 
		 
		 
		 String adi=hayatinizdanMemnunmusunuz.getAdi();
		 String soyadi=hayatinizdanMemnunmusunuz.getSoyadi();
		 int cinsiyeti=hayatinizdanMemnunmusunuz.getCinsiyeti();
		 String dogumTarihi=hayatinizdanMemnunmusunuz.getDogumTarihi();
		 int mutlulukorani=hayatinizdanMemnunmusunuz.getSutlulukOrani();
		 String siziMutluEdenSeyler = hayatinizdanMemnunmusunuz.getSiziMutluEdenSeyler();
		 String siziMutsuzEdenSeyler = hayatinizdanMemnunmusunuz.getSiziMutsuzEdenSeyler();
		 String aciklama=hayatinizdanMemnunmusunuz.getAciklama();
		 String hmanketorAdi=hayatinizdanMemnunmusunuz.getHmanketorAdi();
		 String hmanketorSoyadi=hayatinizdanMemnunmusunuz.getHmanketorSoyadi();
		 
		 HayatinizdanMemnunmusunuz hmexist= hayatinizdanMemnunmusunuzRepository.findByid(Long.valueOf(id));
		 hmexist.setAdi(adi);
		 hmexist.setSoyadi(soyadi);
		 hmexist.setCinsiyeti(cinsiyeti);
		 hmexist.setDogumTarihi(dogumTarihi);
		 hmexist.setMutlulukOrani(mutlulukorani);
		 hmexist.setSiziMutluEdenSeyler(siziMutluEdenSeyler);
		 hmexist.setSiziMutsuzEdenSeyler(siziMutsuzEdenSeyler);
		 hmexist.setAciklama(aciklama);
		 hmexist.setHmanketorAdi(hmanketorAdi);
		 hmexist.setHmanketorSoyadi(hmanketorSoyadi);
		 hayatinizdanMemnunmusunuzRepository.save(hmexist);
		 
		 
		 
		 
		 return "HayatınızdanMemnunmusunuzListe";
		 
		 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 @RequestMapping(value = {"/tguncelle/{anketid}"}, method= RequestMethod.GET)
	    public ModelAndView getTTAnketGuncelle(Model model,HttpSession session,
	    		@PathVariable(name="anketid")String id) {
		 System.out.println(id);
		  long anket_id=Long.parseLong(id);
		  ModelAndView modelAndView = new ModelAndView("TuttugunuzTakimGuncelle");
	      
		  TuttugunuzTakim ttForm=tuttugunuzTakimRepository.findByid(anket_id) ;
		  
		  SimpleDateFormat format= new SimpleDateFormat("yyyy-MM-dd");
	      Date today = new Date();
	      model.addAttribute("today",format.format(today));
	      
	      modelAndView.addObject("tuttugunuzTakim", ttForm);

	    	return modelAndView;
	     
	    }
	 
	
	 
	 
	 
	 @RequestMapping(value = {"/tguncelle/ttguncelle/{anketid}"}, method = RequestMethod.GET)
	    public String guncellett(@ModelAttribute TuttugunuzTakim tuttugunuzTakim,@PathVariable(name="anketid") String id, HttpSession session, Model model) throws ParseException 
		 {
		 
		 
		 String adi=tuttugunuzTakim.getAdi();
		 String soyadi=tuttugunuzTakim.getSoyadi();
		 int cinsiyet=tuttugunuzTakim.getCinsiyeti();
		 String dogumTarihi=tuttugunuzTakim.getDogumTarihi();
		 String tuttuguTakim=tuttugunuzTakim.getTuttuguTakim();
		 String aciklamasi=tuttugunuzTakim.getAciklamasi();
		 String ttanketorAdi=tuttugunuzTakim.getTtanketorAdi();
		 String ttanketorSoyadi=tuttugunuzTakim.getTtanketorSoyadi();
		
		 
		 TuttugunuzTakim ttexist= tuttugunuzTakimRepository.findByid(Long.valueOf(id));
		 ttexist.setAdi(adi);
		 ttexist.setSoyadi(soyadi);
		 ttexist.setCinsiyeti(cinsiyet);
		 ttexist.setDogumTarihi(dogumTarihi);
		 ttexist.setTuttuguTakim(tuttuguTakim);
		 ttexist.setAciklamasi(aciklamasi);
		 ttexist.setTtanketorAdi(ttanketorAdi);
		 ttexist.setTtanketorSoyadi(ttanketorSoyadi);
		 
		 tuttugunuzTakimRepository.save(ttexist);
		 

		 
		 return "TuttuğuTakımListe";
		 
		 }
	 
	
	 
	
	 @RequestMapping(value = {"/anket/anketler/{anketorid}"}, method= RequestMethod.GET)
	    public String getAnketListele(Model model,HttpSession session,
	    		@PathVariable(name="anketorid")String id)
	    {
		 System.out.println(id);
		  long anketler_id=Long.parseLong(id);
     
	    if(anketler_id==2) {
	    	 model.addAttribute("ttListe",tuttugunuzTakimRepository.findAll());
	    	 return "TuttuğuTakımListe";
	    }else {
	    	 model.addAttribute("hmListe",hayatinizdanMemnunmusunuzRepository.findAll());
	    	return "HayatınızdanMemnunmusunuzListe";
	    }
	     
	    }
	 
	
	 
	 
	 @RequestMapping(value = {"/anket/katil/ttekle"}, method = RequestMethod.POST)
	    public String ttCreate(Model model, @ModelAttribute("ttform") TuttugunuzTakim takim,HttpSession session)
	    {
		 
		 String adi=takim.getAdi();
		 String soyadi=takim.getSoyadi();
		 int cinsiyet=takim.getCinsiyeti();
		 String dogumTarihi=takim.getDogumTarihi();
		 String tuttuguTakim=takim.getTuttuguTakim();
		 String aciklamasi=takim.getAciklamasi();
		 String ttanketorAdi=takim.getTtanketorAdi();
		 String ttanketorSoyadi=takim.getTtanketorSoyadi();
		 
		
		
		 
		 tuttugunuzTakimRepository.save(takim);
		 return "redirect:/Anketler";

	    }
	 
	 
	 
	 @RequestMapping(value = {"/anket/katil/hmekle"}, method = RequestMethod.POST)
	    public String hmCreate(Model model, @ModelAttribute("hmform") HayatinizdanMemnunmusunuz memnunmusunuz ,HttpSession session)
	    {	 
		 String adi=memnunmusunuz.getAdi();
		 String soyadi=memnunmusunuz.getSoyadi();
		 int cinsiyeti=memnunmusunuz.getCinsiyeti();
		 String dogumTarihi=memnunmusunuz.getDogumTarihi();
		 int mutlulukorani=memnunmusunuz.getSutlulukOrani();
		 String siziMutluEdenSeyler = memnunmusunuz.getSiziMutluEdenSeyler();
		 String siziMutsuzEdenSeyler = memnunmusunuz.getSiziMutsuzEdenSeyler();
		 String aciklama=memnunmusunuz.getAciklama();
		 String hmanketorAdi=memnunmusunuz.getHmanketorAdi();
		 String hmanketorSoyadi=memnunmusunuz.getHmanketorSoyadi();

		 
		 hayatinizdanMemnunmusunuzRepository.save(memnunmusunuz);
		 return "redirect:/Anketler";
		

	    }
	 
	 @RequestMapping(value = {"/hmsil/{anket_id}"}, method = RequestMethod.GET)
	    public String hmAnketsil(Model model, HttpSession session ,
	                               @PathVariable(name="anket_id")String id)
	    {
		 long anket_id=Long.parseLong(id);
		 HayatinizdanMemnunmusunuz sil=hayatinizdanMemnunmusunuzRepository.findByid(anket_id);
		 hayatinizdanMemnunmusunuzRepository.deleteById(anket_id);
		 
		 return "HayatınızdanMemnunmusunuzListe";
	    }
	 
	 
	 @RequestMapping(value = {"/ttsil/{ankets_id}"}, method = RequestMethod.GET)
	    public String ttAnketsil(Model model, HttpSession session ,
	                               @PathVariable(name="ankets_id")String ttid)
	    {
		 
		 long ttanket_id=Long.parseLong(ttid);
		 TuttugunuzTakim ttsil=tuttugunuzTakimRepository.findByid(ttanket_id);
		 tuttugunuzTakimRepository.deleteById(ttanket_id);
		 
		 return "TuttuğuTakımListe";
	    }	 
	 
	 
}
