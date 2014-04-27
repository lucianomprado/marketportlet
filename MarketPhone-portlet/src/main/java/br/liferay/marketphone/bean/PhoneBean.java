package br.liferay.marketphone.bean;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import br.liferay.marketphone.model.Phone;
import br.liferay.marketphone.model.impl.PhoneImpl;

public class PhoneBean {

	public PhoneBean(){
		this.phone = new PhoneImpl();
	}
	public PhoneBean(Phone phone){
		
		if(phone != null){
		
			this.phone = phone;
		}else{
			
			this.phone = new PhoneImpl();
		}
	}
	
	private Phone phone;
	private String price;
	public long getIdPhone(){
		
		return phone.getIdPhone();
	}
	public String getBrand(){
		
		return phone.getBrand();
	}
	public String getDescription(){
		
		return phone.getDescription();
	}
	public String getName(){
		
		return phone.getName();
	}
	public Date getReleaseDate(){
		
		return phone.getReleaseDate();
	}
	public String getPrice(){

		return String.valueOf(this.phone.getPrice());
	}
	public String getImgUrl(){
		
		return phone.getImgUrl();
	}
	
	public void setIdPhone(long idPhone){
		
		phone.setIdPhone(idPhone);
	}
	public void setBrand(String brand){
		
		phone.setBrand(brand);
	}
	public void setDescription(String description){
		
		phone.setDescription(description);
	}
	public void setName(String name){
		
		phone.setName(name);
	}
	public void setReleaseDate(Date releaseDate){
		
		phone.setReleaseDate(releaseDate);
	}
	public void setPrice(String price){

		double dPrice = Double.parseDouble(price != null ? price.replace(".","").replace(",",".") : "0");
		phone.setPrice(dPrice);
	}
	public void setImgUrl(String imgUrl){
		
		phone.setImgUrl(imgUrl);
	}
	public Phone getPhone(){
		
		return this.phone;
	}
}
