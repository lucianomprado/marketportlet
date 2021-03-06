package br.liferay.marketphone.service.base;

import br.liferay.marketphone.model.Phone;
import br.liferay.marketphone.service.PhoneLocalService;
import br.liferay.marketphone.service.persistence.PhonePersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the Phone local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link br.liferay.marketphone.service.impl.PhoneLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see br.liferay.marketphone.service.impl.PhoneLocalServiceImpl
 * @see br.liferay.marketphone.service.PhoneLocalServiceUtil
 * @generated
 */
public abstract class PhoneLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements PhoneLocalService, IdentifiableBean {
    @BeanReference(type = br.liferay.marketphone.service.PhoneLocalService.class)
    protected br.liferay.marketphone.service.PhoneLocalService phoneLocalService;
    @BeanReference(type = br.liferay.marketphone.service.PhoneService.class)
    protected br.liferay.marketphone.service.PhoneService phoneService;
    @BeanReference(type = PhonePersistence.class)
    protected PhonePersistence phonePersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private PhoneLocalServiceClpInvoker _clpInvoker = new PhoneLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link br.liferay.marketphone.service.PhoneLocalServiceUtil} to access the Phone local service.
     */

    /**
     * Adds the Phone to the database. Also notifies the appropriate model listeners.
     *
     * @param phone the Phone
     * @return the Phone that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Phone addPhone(Phone phone) throws SystemException {
        phone.setNew(true);

        return phonePersistence.update(phone);
    }

    /**
     * Creates a new Phone with the primary key. Does not add the Phone to the database.
     *
     * @param idPhone the primary key for the new Phone
     * @return the new Phone
     */
    @Override
    public Phone createPhone(long idPhone) {
        return phonePersistence.create(idPhone);
    }

    /**
     * Deletes the Phone with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param idPhone the primary key of the Phone
     * @return the Phone that was removed
     * @throws PortalException if a Phone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Phone deletePhone(long idPhone)
        throws PortalException, SystemException {
        return phonePersistence.remove(idPhone);
    }

    /**
     * Deletes the Phone from the database. Also notifies the appropriate model listeners.
     *
     * @param phone the Phone
     * @return the Phone that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Phone deletePhone(Phone phone) throws SystemException {
        return phonePersistence.remove(phone);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Phone.class,
            clazz.getClassLoader());
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
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return phonePersistence.findWithDynamicQuery(dynamicQuery);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return phonePersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return phonePersistence.findWithDynamicQuery(dynamicQuery, start, end,
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return phonePersistence.countWithDynamicQuery(dynamicQuery);
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return phonePersistence.countWithDynamicQuery(dynamicQuery, projection);
    }

    @Override
    public Phone fetchPhone(long idPhone) throws SystemException {
        return phonePersistence.fetchByPrimaryKey(idPhone);
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
    public Phone getPhone(long idPhone) throws PortalException, SystemException {
        return phonePersistence.findByPrimaryKey(idPhone);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return phonePersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<Phone> getPhones(int start, int end) throws SystemException {
        return phonePersistence.findAll(start, end);
    }

    /**
     * Returns the number of Phones.
     *
     * @return the number of Phones
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getPhonesCount() throws SystemException {
        return phonePersistence.countAll();
    }

    /**
     * Updates the Phone in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param phone the Phone
     * @return the Phone that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Phone updatePhone(Phone phone) throws SystemException {
        return phonePersistence.update(phone);
    }

    /**
     * Returns the Phone local service.
     *
     * @return the Phone local service
     */
    public br.liferay.marketphone.service.PhoneLocalService getPhoneLocalService() {
        return phoneLocalService;
    }

    /**
     * Sets the Phone local service.
     *
     * @param phoneLocalService the Phone local service
     */
    public void setPhoneLocalService(
        br.liferay.marketphone.service.PhoneLocalService phoneLocalService) {
        this.phoneLocalService = phoneLocalService;
    }

    /**
     * Returns the Phone remote service.
     *
     * @return the Phone remote service
     */
    public br.liferay.marketphone.service.PhoneService getPhoneService() {
        return phoneService;
    }

    /**
     * Sets the Phone remote service.
     *
     * @param phoneService the Phone remote service
     */
    public void setPhoneService(
        br.liferay.marketphone.service.PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    /**
     * Returns the Phone persistence.
     *
     * @return the Phone persistence
     */
    public PhonePersistence getPhonePersistence() {
        return phonePersistence;
    }

    /**
     * Sets the Phone persistence.
     *
     * @param phonePersistence the Phone persistence
     */
    public void setPhonePersistence(PhonePersistence phonePersistence) {
        this.phonePersistence = phonePersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("br.liferay.marketphone.model.Phone",
            phoneLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "br.liferay.marketphone.model.Phone");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Phone.class;
    }

    protected String getModelClassName() {
        return Phone.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = phonePersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
