package br.liferay.marketphone.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Phone}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Phone
 * @generated
 */
public class PhoneWrapper implements Phone, ModelWrapper<Phone> {
    private Phone _phone;

    public PhoneWrapper(Phone phone) {
        _phone = phone;
    }

    @Override
    public Class<?> getModelClass() {
        return Phone.class;
    }

    @Override
    public String getModelClassName() {
        return Phone.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("idPhone", getIdPhone());
        attributes.put("name", getName());
        attributes.put("brand", getBrand());
        attributes.put("description", getDescription());
        attributes.put("releaseDate", getReleaseDate());
        attributes.put("price", getPrice());
        attributes.put("imgUrl", getImgUrl());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long idPhone = (Long) attributes.get("idPhone");

        if (idPhone != null) {
            setIdPhone(idPhone);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String brand = (String) attributes.get("brand");

        if (brand != null) {
            setBrand(brand);
        }

        String description = (String) attributes.get("description");

        if (description != null) {
            setDescription(description);
        }

        Date releaseDate = (Date) attributes.get("releaseDate");

        if (releaseDate != null) {
            setReleaseDate(releaseDate);
        }

        Double price = (Double) attributes.get("price");

        if (price != null) {
            setPrice(price);
        }

        String imgUrl = (String) attributes.get("imgUrl");

        if (imgUrl != null) {
            setImgUrl(imgUrl);
        }
    }

    /**
    * Returns the primary key of this Phone.
    *
    * @return the primary key of this Phone
    */
    @Override
    public long getPrimaryKey() {
        return _phone.getPrimaryKey();
    }

    /**
    * Sets the primary key of this Phone.
    *
    * @param primaryKey the primary key of this Phone
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _phone.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the id phone of this Phone.
    *
    * @return the id phone of this Phone
    */
    @Override
    public long getIdPhone() {
        return _phone.getIdPhone();
    }

    /**
    * Sets the id phone of this Phone.
    *
    * @param idPhone the id phone of this Phone
    */
    @Override
    public void setIdPhone(long idPhone) {
        _phone.setIdPhone(idPhone);
    }

    /**
    * Returns the name of this Phone.
    *
    * @return the name of this Phone
    */
    @Override
    public java.lang.String getName() {
        return _phone.getName();
    }

    /**
    * Returns the localized name of this Phone in the language. Uses the default language if no localization exists for the requested language.
    *
    * @param locale the locale of the language
    * @return the localized name of this Phone
    */
    @Override
    public java.lang.String getName(java.util.Locale locale) {
        return _phone.getName(locale);
    }

    /**
    * Returns the localized name of this Phone in the language, optionally using the default language if no localization exists for the requested language.
    *
    * @param locale the local of the language
    * @param useDefault whether to use the default language if no localization exists for the requested language
    * @return the localized name of this Phone. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
    */
    @Override
    public java.lang.String getName(java.util.Locale locale, boolean useDefault) {
        return _phone.getName(locale, useDefault);
    }

    /**
    * Returns the localized name of this Phone in the language. Uses the default language if no localization exists for the requested language.
    *
    * @param languageId the ID of the language
    * @return the localized name of this Phone
    */
    @Override
    public java.lang.String getName(java.lang.String languageId) {
        return _phone.getName(languageId);
    }

    /**
    * Returns the localized name of this Phone in the language, optionally using the default language if no localization exists for the requested language.
    *
    * @param languageId the ID of the language
    * @param useDefault whether to use the default language if no localization exists for the requested language
    * @return the localized name of this Phone
    */
    @Override
    public java.lang.String getName(java.lang.String languageId,
        boolean useDefault) {
        return _phone.getName(languageId, useDefault);
    }

    @Override
    public java.lang.String getNameCurrentLanguageId() {
        return _phone.getNameCurrentLanguageId();
    }

    @Override
    public java.lang.String getNameCurrentValue() {
        return _phone.getNameCurrentValue();
    }

    /**
    * Returns a map of the locales and localized names of this Phone.
    *
    * @return the locales and localized names of this Phone
    */
    @Override
    public java.util.Map<java.util.Locale, java.lang.String> getNameMap() {
        return _phone.getNameMap();
    }

    /**
    * Sets the name of this Phone.
    *
    * @param name the name of this Phone
    */
    @Override
    public void setName(java.lang.String name) {
        _phone.setName(name);
    }

    /**
    * Sets the localized name of this Phone in the language.
    *
    * @param name the localized name of this Phone
    * @param locale the locale of the language
    */
    @Override
    public void setName(java.lang.String name, java.util.Locale locale) {
        _phone.setName(name, locale);
    }

    /**
    * Sets the localized name of this Phone in the language, and sets the default locale.
    *
    * @param name the localized name of this Phone
    * @param locale the locale of the language
    * @param defaultLocale the default locale
    */
    @Override
    public void setName(java.lang.String name, java.util.Locale locale,
        java.util.Locale defaultLocale) {
        _phone.setName(name, locale, defaultLocale);
    }

    @Override
    public void setNameCurrentLanguageId(java.lang.String languageId) {
        _phone.setNameCurrentLanguageId(languageId);
    }

    /**
    * Sets the localized names of this Phone from the map of locales and localized names.
    *
    * @param nameMap the locales and localized names of this Phone
    */
    @Override
    public void setNameMap(
        java.util.Map<java.util.Locale, java.lang.String> nameMap) {
        _phone.setNameMap(nameMap);
    }

    /**
    * Sets the localized names of this Phone from the map of locales and localized names, and sets the default locale.
    *
    * @param nameMap the locales and localized names of this Phone
    * @param defaultLocale the default locale
    */
    @Override
    public void setNameMap(
        java.util.Map<java.util.Locale, java.lang.String> nameMap,
        java.util.Locale defaultLocale) {
        _phone.setNameMap(nameMap, defaultLocale);
    }

    /**
    * Returns the brand of this Phone.
    *
    * @return the brand of this Phone
    */
    @Override
    public java.lang.String getBrand() {
        return _phone.getBrand();
    }

    /**
    * Sets the brand of this Phone.
    *
    * @param brand the brand of this Phone
    */
    @Override
    public void setBrand(java.lang.String brand) {
        _phone.setBrand(brand);
    }

    /**
    * Returns the description of this Phone.
    *
    * @return the description of this Phone
    */
    @Override
    public java.lang.String getDescription() {
        return _phone.getDescription();
    }

    /**
    * Returns the localized description of this Phone in the language. Uses the default language if no localization exists for the requested language.
    *
    * @param locale the locale of the language
    * @return the localized description of this Phone
    */
    @Override
    public java.lang.String getDescription(java.util.Locale locale) {
        return _phone.getDescription(locale);
    }

    /**
    * Returns the localized description of this Phone in the language, optionally using the default language if no localization exists for the requested language.
    *
    * @param locale the local of the language
    * @param useDefault whether to use the default language if no localization exists for the requested language
    * @return the localized description of this Phone. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
    */
    @Override
    public java.lang.String getDescription(java.util.Locale locale,
        boolean useDefault) {
        return _phone.getDescription(locale, useDefault);
    }

    /**
    * Returns the localized description of this Phone in the language. Uses the default language if no localization exists for the requested language.
    *
    * @param languageId the ID of the language
    * @return the localized description of this Phone
    */
    @Override
    public java.lang.String getDescription(java.lang.String languageId) {
        return _phone.getDescription(languageId);
    }

    /**
    * Returns the localized description of this Phone in the language, optionally using the default language if no localization exists for the requested language.
    *
    * @param languageId the ID of the language
    * @param useDefault whether to use the default language if no localization exists for the requested language
    * @return the localized description of this Phone
    */
    @Override
    public java.lang.String getDescription(java.lang.String languageId,
        boolean useDefault) {
        return _phone.getDescription(languageId, useDefault);
    }

    @Override
    public java.lang.String getDescriptionCurrentLanguageId() {
        return _phone.getDescriptionCurrentLanguageId();
    }

    @Override
    public java.lang.String getDescriptionCurrentValue() {
        return _phone.getDescriptionCurrentValue();
    }

    /**
    * Returns a map of the locales and localized descriptions of this Phone.
    *
    * @return the locales and localized descriptions of this Phone
    */
    @Override
    public java.util.Map<java.util.Locale, java.lang.String> getDescriptionMap() {
        return _phone.getDescriptionMap();
    }

    /**
    * Sets the description of this Phone.
    *
    * @param description the description of this Phone
    */
    @Override
    public void setDescription(java.lang.String description) {
        _phone.setDescription(description);
    }

    /**
    * Sets the localized description of this Phone in the language.
    *
    * @param description the localized description of this Phone
    * @param locale the locale of the language
    */
    @Override
    public void setDescription(java.lang.String description,
        java.util.Locale locale) {
        _phone.setDescription(description, locale);
    }

    /**
    * Sets the localized description of this Phone in the language, and sets the default locale.
    *
    * @param description the localized description of this Phone
    * @param locale the locale of the language
    * @param defaultLocale the default locale
    */
    @Override
    public void setDescription(java.lang.String description,
        java.util.Locale locale, java.util.Locale defaultLocale) {
        _phone.setDescription(description, locale, defaultLocale);
    }

    @Override
    public void setDescriptionCurrentLanguageId(java.lang.String languageId) {
        _phone.setDescriptionCurrentLanguageId(languageId);
    }

    /**
    * Sets the localized descriptions of this Phone from the map of locales and localized descriptions.
    *
    * @param descriptionMap the locales and localized descriptions of this Phone
    */
    @Override
    public void setDescriptionMap(
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap) {
        _phone.setDescriptionMap(descriptionMap);
    }

    /**
    * Sets the localized descriptions of this Phone from the map of locales and localized descriptions, and sets the default locale.
    *
    * @param descriptionMap the locales and localized descriptions of this Phone
    * @param defaultLocale the default locale
    */
    @Override
    public void setDescriptionMap(
        java.util.Map<java.util.Locale, java.lang.String> descriptionMap,
        java.util.Locale defaultLocale) {
        _phone.setDescriptionMap(descriptionMap, defaultLocale);
    }

    /**
    * Returns the release date of this Phone.
    *
    * @return the release date of this Phone
    */
    @Override
    public java.util.Date getReleaseDate() {
        return _phone.getReleaseDate();
    }

    /**
    * Sets the release date of this Phone.
    *
    * @param releaseDate the release date of this Phone
    */
    @Override
    public void setReleaseDate(java.util.Date releaseDate) {
        _phone.setReleaseDate(releaseDate);
    }

    /**
    * Returns the price of this Phone.
    *
    * @return the price of this Phone
    */
    @Override
    public double getPrice() {
        return _phone.getPrice();
    }

    /**
    * Sets the price of this Phone.
    *
    * @param price the price of this Phone
    */
    @Override
    public void setPrice(double price) {
        _phone.setPrice(price);
    }

    /**
    * Returns the img url of this Phone.
    *
    * @return the img url of this Phone
    */
    @Override
    public java.lang.String getImgUrl() {
        return _phone.getImgUrl();
    }

    /**
    * Sets the img url of this Phone.
    *
    * @param imgUrl the img url of this Phone
    */
    @Override
    public void setImgUrl(java.lang.String imgUrl) {
        _phone.setImgUrl(imgUrl);
    }

    @Override
    public boolean isNew() {
        return _phone.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _phone.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _phone.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _phone.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _phone.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _phone.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _phone.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _phone.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _phone.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _phone.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _phone.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.String[] getAvailableLanguageIds() {
        return _phone.getAvailableLanguageIds();
    }

    @Override
    public java.lang.String getDefaultLanguageId() {
        return _phone.getDefaultLanguageId();
    }

    @Override
    public void prepareLocalizedFieldsForImport()
        throws com.liferay.portal.LocaleException {
        _phone.prepareLocalizedFieldsForImport();
    }

    @Override
    public void prepareLocalizedFieldsForImport(
        java.util.Locale defaultImportLocale)
        throws com.liferay.portal.LocaleException {
        _phone.prepareLocalizedFieldsForImport(defaultImportLocale);
    }

    @Override
    public java.lang.Object clone() {
        return new PhoneWrapper((Phone) _phone.clone());
    }

    @Override
    public int compareTo(Phone phone) {
        return _phone.compareTo(phone);
    }

    @Override
    public int hashCode() {
        return _phone.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<Phone> toCacheModel() {
        return _phone.toCacheModel();
    }

    @Override
    public Phone toEscapedModel() {
        return new PhoneWrapper(_phone.toEscapedModel());
    }

    @Override
    public Phone toUnescapedModel() {
        return new PhoneWrapper(_phone.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _phone.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _phone.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _phone.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PhoneWrapper)) {
            return false;
        }

        PhoneWrapper phoneWrapper = (PhoneWrapper) obj;

        if (Validator.equals(_phone, phoneWrapper._phone)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Phone getWrappedPhone() {
        return _phone;
    }

    @Override
    public Phone getWrappedModel() {
        return _phone;
    }

    @Override
    public void resetOriginalValues() {
        _phone.resetOriginalValues();
    }
}
