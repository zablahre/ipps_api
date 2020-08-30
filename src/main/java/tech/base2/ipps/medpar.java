package tech.base2.ipps;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;



@Entity @IdClass(medpar.ippsId.class)
public class medpar {
	
	@Id private String drgdef;
	@Id private Integer id;
	
	private String name;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String region;
	private Integer totaldischarges;
	private float avgcoveredcharge;
	private float avgtotalpayments;
	private float avgmedicarepayments;
	
	
	static class ippsId implements Serializable {
		String drgdef;
		Integer id;
	}
	
	
	public medpar() {
		
	}

	public medpar(String drgdef, Integer id, String name, String address, String city, String state, String zipcode,
			String region, Integer totaldischarges, float avgcoveredcharge, float avgtotalpayments,
			float avgmedicarepayments) {
		super();
		this.drgdef = drgdef;
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.region = region;
		this.totaldischarges = totaldischarges;
		this.avgcoveredcharge = avgcoveredcharge;
		this.avgtotalpayments = avgtotalpayments;
		this.avgmedicarepayments = avgmedicarepayments;
	}

	public String getDrgdef() {
		return drgdef;
	}

	public void setDrgdef(String drgdef) {
		this.drgdef = drgdef;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getTotaldischarges() {
		return totaldischarges;
	}

	public void setTotaldischarges(Integer totaldischarges) {
		this.totaldischarges = totaldischarges;
	}

	public float getAvgcoveredcharge() {
		return avgcoveredcharge;
	}

	public void setAvgcoveredcharge(float avgcoveredcharge) {
		this.avgcoveredcharge = avgcoveredcharge;
	}

	public float getAvgtotalpayments() {
		return avgtotalpayments;
	}

	public void setAvgtotalpayments(float avgtotalpayments) {
		this.avgtotalpayments = avgtotalpayments;
	}

	public float getAvgmedicarepayments() {
		return avgmedicarepayments;
	}

	public void setAvgmedicarepayments(float avgmedicarepayments) {
		this.avgmedicarepayments = avgmedicarepayments;
	}
}
