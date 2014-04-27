package br.liferay.marketphone.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link br.liferay.marketphone.service.http.PhoneServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see br.liferay.marketphone.service.http.PhoneServiceSoap
 * @generated
 */
public class PhoneSoap implements Serializable {
    private long _idPhone;
    private String _name;
    private String _brand;
    private String _description;
    private Date _releaseDate;
    private double _price;
    private String _imgUrl;

    public PhoneSoap() {
    }

    public static PhoneSoap toSoapModel(Phone model) {
        PhoneSoap soapModel = new PhoneSoap();

        soapModel.setIdPhone(model.getIdPhone());
        soapModel.setName(model.getName());
        soapModel.setBrand(model.getBrand());
        soapModel.setDescription(model.getDescription());
        soapModel.setReleaseDate(model.getReleaseDate());
        soapModel.setPrice(model.getPrice());
        soapModel.setImgUrl(model.getImgUrl());

        return soapModel;
    }

    public static PhoneSoap[] toSoapModels(Phone[] models) {
        PhoneSoap[] soapModels = new PhoneSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PhoneSoap[][] toSoapModels(Phone[][] models) {
        PhoneSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PhoneSoap[models.length][models[0].length];
        } else {
            soapModels = new PhoneSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PhoneSoap[] toSoapModels(List<Phone> models) {
        List<PhoneSoap> soapModels = new ArrayList<PhoneSoap>(models.size());

        for (Phone model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PhoneSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _idPhone;
    }

    public void setPrimaryKey(long pk) {
        setIdPhone(pk);
    }

    public long getIdPhone() {
        return _idPhone;
    }

    public void setIdPhone(long idPhone) {
        _idPhone = idPhone;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getBrand() {
        return _brand;
    }

    public void setBrand(String brand) {
        _brand = brand;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public Date getReleaseDate() {
        return _releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        _releaseDate = releaseDate;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        _price = price;
    }

    public String getImgUrl() {
        return _imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        _imgUrl = imgUrl;
    }
}
