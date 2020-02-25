package com.bulentyilmaz.surveyApp.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="SurveyHM")
@Table(name="HayatinizdanMemnunmusunuz")
public class HayatinizdanMemnunmusunuz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String adi;
    private String soyadi;
    private int  cinsiyeti;
    private String dogumTarihi;
    private int  mutlulukOrani;
    private String siziMutluEdenSeyler;
    private String siziMutsuzEdenSeyler;
    private String aciklama;
    private String hmanketorAdi;
    private String hmanketorSoyadi;
   
  



    
    public HayatinizdanMemnunmusunuz() {}
    
    
	


	public HayatinizdanMemnunmusunuz(long id, String adi, String soyadi, int cinsiyeti, String dogumTarihi,int mutlulukOrani,
			 String siziMutluEdenSeyler, String siziMutsuzEdenSeyler, String aciklama,String hmanketorAdi,String hmanketorSoyadi) {
		super();
		this.id = id;
		this.adi = adi;
		this.soyadi = soyadi;
		this.cinsiyeti = cinsiyeti;
		this.dogumTarihi = dogumTarihi;
		this.mutlulukOrani = mutlulukOrani;
		this.siziMutluEdenSeyler = siziMutluEdenSeyler;
		this.siziMutsuzEdenSeyler = siziMutsuzEdenSeyler;
		this.aciklama = aciklama;
		this.hmanketorAdi=hmanketorAdi;
		this.hmanketorSoyadi=hmanketorSoyadi;
	}





	public int getMutlulukOrani() {
		return mutlulukOrani;
	}





	public void setMutlulukOrani(int mutlulukOrani) {
		this.mutlulukOrani = mutlulukOrani;
	}


	public String getHmanketorAdi() {
		return hmanketorAdi;
	}





	public void setHmanketorAdi(String hmanketorAdi) {
		this.hmanketorAdi = hmanketorAdi;
	}





	public String getHmanketorSoyadi() {
		return hmanketorSoyadi;
	}





	public void setHmanketorSoyadi(String hmanketorSoyadi) {
		this.hmanketorSoyadi = hmanketorSoyadi;
	}





	public long getId() {
		return id;
	}





	public void setId(long id) {
		this.id = id;
	}





	public String getAdi() {
		return adi;
	}





	public void setAdi(String adi) {
		this.adi = adi;
	}





	public String getSoyadi() {
		return soyadi;
	}





	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}





	public int getCinsiyeti() {
		return cinsiyeti;
	}





	public void setCinsiyeti(int cinsiyeti) {
		this.cinsiyeti = cinsiyeti;
	}





	public String getDogumTarihi() {
		return dogumTarihi;
	}





	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}





	public int getSutlulukOrani() {
		return mutlulukOrani;
	}





	public void setSutlulukOrani(int sutlulukOrani) {
		this.mutlulukOrani = sutlulukOrani;
	}





	public String getSiziMutluEdenSeyler() {
		return siziMutluEdenSeyler;
	}





	public void setSiziMutluEdenSeyler(String siziMutluEdenSeyler) {
		this.siziMutluEdenSeyler = siziMutluEdenSeyler;
	}





	public String getSiziMutsuzEdenSeyler() {
		return siziMutsuzEdenSeyler;
	}





	public void setSiziMutsuzEdenSeyler(String siziMutsuzEdenSeyler) {
		this.siziMutsuzEdenSeyler = siziMutsuzEdenSeyler;
	}





	public String getAciklama() {
		return aciklama;
	}





	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}



    
    
	
}
