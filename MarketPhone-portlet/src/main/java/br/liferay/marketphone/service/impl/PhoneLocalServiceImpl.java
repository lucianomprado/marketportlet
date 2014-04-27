package br.liferay.marketphone.service.impl;

import java.util.List;

import br.liferay.marketphone.model.Phone;
import br.liferay.marketphone.service.base.PhoneLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;


/**
 * The implementation of the Phone local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link br.liferay.marketphone.service.PhoneLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see br.liferay.marketphone.service.base.PhoneLocalServiceBaseImpl
 * @see br.liferay.marketphone.service.PhoneLocalServiceUtil
 */
public class PhoneLocalServiceImpl extends PhoneLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link br.liferay.marketphone.service.PhoneLocalServiceUtil} to access the Phone local service.
     */
	
	public List<Phone> getPhoneForName(String name) throws SystemException{
		
		return this.phonePersistence.findByName(name);
	}
}
