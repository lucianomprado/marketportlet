package br.liferay.marketphone.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PhoneLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PhoneLocalService
 * @generated
 */
public class PhoneLocalServiceWrapper implements PhoneLocalService,
    ServiceWrapper<PhoneLocalService> {
    private PhoneLocalService _phoneLocalService;

    public PhoneLocalServiceWrapper(PhoneLocalService phoneLocalService) {
        _phoneLocalService = phoneLocalService;
    }

    /**
    * Adds the Phone to the database. Also notifies the appropriate model listeners.
    *
    * @param phone the Phone
    * @return the Phone that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public br.liferay.marketphone.model.Phone addPhone(
        br.liferay.marketphone.model.Phone phone)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _phoneLocalService.addPhone(phone);
    }

    /**
    * Creates a new Phone with the primary key. Does not add the Phone to the database.
    *
    * @param idPhone the primary key for the new Phone
    * @return the new Phone
    */
    @Override
    public br.liferay.marketphone.model.Phone createPhone(long idPhone) {
        return _phoneLocalService.createPhone(idPhone);
    }

    /**
    * Deletes the Phone with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idPhone the primary key of the Phone
    * @return the Phone that was removed
    * @throws PortalException if a Phone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public br.liferay.marketphone.model.Phone deletePhone(long idPhone)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _phoneLocalService.deletePhone(idPhone);
    }

    /**
    * Deletes the Phone from the database. Also notifies the appropriate model listeners.
    *
    * @param phone the Phone
    * @return the Phone that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public br.liferay.marketphone.model.Phone deletePhone(
        br.liferay.marketphone.model.Phone phone)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _phoneLocalService.deletePhone(phone);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _phoneLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _phoneLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.liferay.marketphone.model.impl.PhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _phoneLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.liferay.marketphone.model.impl.PhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _phoneLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _phoneLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _phoneLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public br.liferay.marketphone.model.Phone fetchPhone(long idPhone)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _phoneLocalService.fetchPhone(idPhone);
    }

    /**
    * Returns the Phone with the primary key.
    *
    * @param idPhone the primary key of the Phone
    * @return the Phone
    * @throws PortalException if a Phone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public br.liferay.marketphone.model.Phone getPhone(long idPhone)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _phoneLocalService.getPhone(idPhone);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _phoneLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the Phones.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.liferay.marketphone.model.impl.PhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Phones
    * @param end the upper bound of the range of Phones (not inclusive)
    * @return the range of Phones
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<br.liferay.marketphone.model.Phone> getPhones(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _phoneLocalService.getPhones(start, end);
    }

    /**
    * Returns the number of Phones.
    *
    * @return the number of Phones
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPhonesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _phoneLocalService.getPhonesCount();
    }

    /**
    * Updates the Phone in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param phone the Phone
    * @return the Phone that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public br.liferay.marketphone.model.Phone updatePhone(
        br.liferay.marketphone.model.Phone phone)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _phoneLocalService.updatePhone(phone);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _phoneLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _phoneLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _phoneLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.util.List<br.liferay.marketphone.model.Phone> getPhoneForName(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _phoneLocalService.getPhoneForName(name);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PhoneLocalService getWrappedPhoneLocalService() {
        return _phoneLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPhoneLocalService(PhoneLocalService phoneLocalService) {
        _phoneLocalService = phoneLocalService;
    }

    @Override
    public PhoneLocalService getWrappedService() {
        return _phoneLocalService;
    }

    @Override
    public void setWrappedService(PhoneLocalService phoneLocalService) {
        _phoneLocalService = phoneLocalService;
    }
}
