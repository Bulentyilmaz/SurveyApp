package com.bulentyilmaz.surveyApp.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;


@Entity(name="SurveyTT")
@Table(name="TuttugunuzTakim")
public class TuttugunuzTakim implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String adi;
    private String soyadi;
    private int  cinsiyeti;
    private String dogumTarihi;
    private String tuttuguTakim;
    private String aciklamasi;
    private String ttanketorAdi;
    private String ttanketorSoyadi;
    
    
    public TuttugunuzTakim() {}


	public TuttugunuzTakim(long id, String adi, String soyadi, int cinsiyeti, String dogumTarihi, String tuttuguTakim,
			String aciklamasi,String ttanketorAdi,String ttanketorSoyadi) {
		super();
		this.id = id;
		this.adi = adi;
		this.soyadi = soyadi;
		this.cinsiyeti = cinsiyeti;
		this.dogumTarihi = dogumTarihi;
		this.tuttuguTakim = tuttuguTakim;
		this.aciklamasi = aciklamasi;
		this.ttanketorAdi = ttanketorAdi;
		this.ttanketorSoyadi = ttanketorSoyadi;
	}

	

	public String getTtanketorAdi() {
		return ttanketorAdi;
	}


	public void setTtanketorAdi(String ttanketorAdi) {
		this.ttanketorAdi = ttanketorAdi;
	}


	public String getTtanketorSoyadi() {
		return ttanketorSoyadi;
	}


	public void setTtanketorSoyadi(String ttanketorSoyadi) {
		this.ttanketorSoyadi = ttanketorSoyadi;
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


	public String getTuttuguTakim() {
		return tuttuguTakim;
	}


	public void setTuttuguTakim(String tuttuguTakim) {
		this.tuttuguTakim = tuttuguTakim;
	}


	public String getAciklamasi() {
		return aciklamasi;
	}


	public void setAciklamasi(String aciklamasi) {
		this.aciklamasi = aciklamasi;
	}


	


	

	
	
}
