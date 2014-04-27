package br.liferay.marketphone.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PhoneService}.
 *
 * @author Brian Wing Shun Chan
 * @see PhoneService
 * @generated
 */
public class PhoneServiceWrapper implements PhoneService,
    ServiceWrapper<PhoneService> {
    private PhoneService _phoneService;

    public PhoneServiceWrapper(PhoneService phoneService) {
        _phoneService = phoneService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _phoneService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _phoneService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _phoneService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PhoneService getWrappedPhoneService() {
        return _phoneService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPhoneService(PhoneService phoneService) {
        _phoneService = phoneService;
    }

    @Override
    public PhoneService getWrappedService() {
        return _phoneService;
    }

    @Override
    public void setWrappedService(PhoneService phoneService) {
        _phoneService = phoneService;
    }
}
