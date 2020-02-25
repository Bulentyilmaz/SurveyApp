package com.bulentyilmaz.surveyApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Anketor")
@Table(name="anketorler")
public class Anketor {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private String anketorAdi;
	private String anketorSoyadi;
	private String anketAdi;
	
	public Anketor() {}

	public Anketor(long id, String anketorAdi, String anketorSoyadi,String anketAdi) {
		super();
		this.id = id;
		this.anketorAdi = anketorAdi;
		this.anketorSoyadi = anketorSoyadi;
		this.anketAdi=anketAdi;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAnketorAdi() {
		return anketorAdi;
	}

	public void setAnketorAdi(String anketorAdi) {
		anketorAdi = anketorAdi;
	}
	
	public String getAnketAdi() {
		return anketAdi;
	}

	public void setAnketAdi(String anketorAdi) {
		anketAdi = anketAdi;
	}

	public String getAnketorSoyadi() {
		return anketorSoyadi;
	}

	public void setAnketorSoyadi(String anketorSoyadi) {
		anketorSoyadi = anketorSoyadi;
	}
	
	
	
	
}
