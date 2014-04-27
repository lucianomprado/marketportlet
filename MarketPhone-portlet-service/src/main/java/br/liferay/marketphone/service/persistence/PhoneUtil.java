package br.liferay.marketphone.service.persistence;

import br.liferay.marketphone.model.Phone;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the Phone service. This utility wraps {@link PhonePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PhonePersistence
 * @see PhonePersistenceImpl
 * @generated
 */
public class PhoneUtil {
    private static PhonePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Phone phone) {
        getPersistence().clearCache(phone);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Phone> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Phone> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Phone> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Phone update(Phone phone) throws SystemException {
        return getPersistence().update(phone);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Phone update(Phone phone, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(phone, serviceContext);
    }

    /**
    * Returns all the Phones where name = &#63;.
    *
    * @param name the name
    * @return the matching Phones
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.liferay.marketphone.model.Phone> findByName(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name);
    }

    /**
    * Returns a range of all the Phones where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.liferay.marketphone.model.impl.PhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of Phones
    * @param end the upper bound of the range of Phones (not inclusive)
    * @return the range of matching Phones
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.liferay.marketphone.model.Phone> findByName(
        java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name, start, end);
    }

    /**
    * Returns an ordered range of all the Phones where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.liferay.marketphone.model.impl.PhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of Phones
    * @param end the upper bound of the range of Phones (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching Phones
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.liferay.marketphone.model.Phone> findByName(
        java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name, start, end, orderByComparator);
    }

    /**
    * Returns the first Phone in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching Phone
    * @throws br.liferay.marketphone.NoSuchPhoneException if a matching Phone could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.liferay.marketphone.model.Phone findByName_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws br.liferay.marketphone.NoSuchPhoneException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName_First(name, orderByComparator);
    }

    /**
    * Returns the first Phone in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching Phone, or <code>null</code> if a matching Phone could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.liferay.marketphone.model.Phone fetchByName_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByName_First(name, orderByComparator);
    }

    /**
    * Returns the last Phone in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching Phone
    * @throws br.liferay.marketphone.NoSuchPhoneException if a matching Phone could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.liferay.marketphone.model.Phone findByName_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws br.liferay.marketphone.NoSuchPhoneException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName_Last(name, orderByComparator);
    }

    /**
    * Returns the last Phone in the ordered set where name = &#63;.
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching Phone, or <code>null</code> if a matching Phone could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.liferay.marketphone.model.Phone fetchByName_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByName_Last(name, orderByComparator);
    }

    /**
    * Returns the Phones before and after the current Phone in the ordered set where name = &#63;.
    *
    * @param idPhone the primary key of the current Phone
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next Phone
    * @throws br.liferay.marketphone.NoSuchPhoneException if a Phone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.liferay.marketphone.model.Phone[] findByName_PrevAndNext(
        long idPhone, java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws br.liferay.marketphone.NoSuchPhoneException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByName_PrevAndNext(idPhone, name, orderByComparator);
    }

    /**
    * Removes all the Phones where name = &#63; from the database.
    *
    * @param name the name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByName(name);
    }

    /**
    * Returns the number of Phones where name = &#63;.
    *
    * @param name the name
    * @return the number of matching Phones
    * @throws SystemException if a system exception occurred
    */
    public static int countByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByName(name);
    }

    /**
    * Caches the Phone in the entity cache if it is enabled.
    *
    * @param phone the Phone
    */
    public static void cacheResult(br.liferay.marketphone.model.Phone phone) {
        getPersistence().cacheResult(phone);
    }

    /**
    * Caches the Phones in the entity cache if it is enabled.
    *
    * @param phones the Phones
    */
    public static void cacheResult(
        java.util.List<br.liferay.marketphone.model.Phone> phones) {
        getPersistence().cacheResult(phones);
    }

    /**
    * Creates a new Phone with the primary key. Does not add the Phone to the database.
    *
    * @param idPhone the primary key for the new Phone
    * @return the new Phone
    */
    public static br.liferay.marketphone.model.Phone create(long idPhone) {
        return getPersistence().create(idPhone);
    }

    /**
    * Removes the Phone with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param idPhone the primary key of the Phone
    * @return the Phone that was removed
    * @throws br.liferay.marketphone.NoSuchPhoneException if a Phone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.liferay.marketphone.model.Phone remove(long idPhone)
        throws br.liferay.marketphone.NoSuchPhoneException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(idPhone);
    }

    public static br.liferay.marketphone.model.Phone updateImpl(
        br.liferay.marketphone.model.Phone phone)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(phone);
    }

    /**
    * Returns the Phone with the primary key or throws a {@link br.liferay.marketphone.NoSuchPhoneException} if it could not be found.
    *
    * @param idPhone the primary key of the Phone
    * @return the Phone
    * @throws br.liferay.marketphone.NoSuchPhoneException if a Phone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.liferay.marketphone.model.Phone findByPrimaryKey(
        long idPhone)
        throws br.liferay.marketphone.NoSuchPhoneException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(idPhone);
    }

    /**
    * Returns the Phone with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param idPhone the primary key of the Phone
    * @return the Phone, or <code>null</code> if a Phone with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.liferay.marketphone.model.Phone fetchByPrimaryKey(
        long idPhone)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(idPhone);
    }

    /**
    * Returns all the Phones.
    *
    * @return the Phones
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.liferay.marketphone.model.Phone> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<br.liferay.marketphone.model.Phone> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the Phones.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.liferay.marketphone.model.impl.PhoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of Phones
    * @param end the upper bound of the range of Phones (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of Phones
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.liferay.marketphone.model.Phone> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the Phones from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of Phones.
    *
    * @return the number of Phones
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PhonePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PhonePersistence) PortletBeanLocatorUtil.locate(br.liferay.marketphone.service.ClpSerializer.getServletContextName(),
                    PhonePersistence.class.getName());

            ReferenceRegistry.registerReference(PhoneUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PhonePersistence persistence) {
    }
}
