package br.liferay.marketphone.service.persistence;

import br.liferay.marketphone.model.Phone;
import br.liferay.marketphone.service.PhoneLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PhoneActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PhoneActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PhoneLocalServiceUtil.getService());
        setClass(Phone.class);

        setClassLoader(br.liferay.marketphone.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("idPhone");
    }
}
