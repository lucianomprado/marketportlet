package br.liferay.marketphone.service.persistence;

import br.liferay.marketphone.NoSuchPhoneException;
import br.liferay.marketphone.model.Phone;
import br.liferay.marketphone.model.impl.PhoneImpl;
import br.liferay.marketphone.model.impl.PhoneModelImpl;
import br.liferay.marketphone.service.persistence.PhonePersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the Phone service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PhonePersistence
 * @see PhoneUtil
 * @generated
 */
public class PhonePersistenceImpl extends BasePersistenceImpl<Phone>
    implements PhonePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PhoneUtil} to access the Phone persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PhoneImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PhoneModelImpl.ENTITY_CACHE_ENABLED,
            PhoneModelImpl.FINDER_CACHE_ENABLED, PhoneImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PhoneModelImpl.ENTITY_CACHE_ENABLED,
            PhoneModelImpl.FINDER_CACHE_ENABLED, PhoneImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PhoneModelImpl.ENTITY_CACHE_ENABLED,
            PhoneModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME = new FinderPath(PhoneModelImpl.ENTITY_CACHE_ENABLED,
            PhoneModelImpl.FINDER_CACHE_ENABLED, PhoneImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByName",
            new String[] {
                String.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME = new FinderPath(PhoneModelImpl.ENTITY_CACHE_ENABLED,
            PhoneModelImpl.FINDER_CACHE_ENABLED, PhoneImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByName",
            new String[] { String.class.getName() },
            PhoneModelImpl.NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_NAME = new FinderPath(PhoneModelImpl.ENTITY_CACHE_ENABLED,
            PhoneModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByName",
            new String[] { String.class.getName() });
    private static final String _FINDER_COLUMN_NAME_NAME_1 = "phone.name IS NULL";
    private static final String _FINDER_COLUMN_NAME_NAME_2 = "phone.name = ?";
    private static final String _FINDER_COLUMN_NAME_NAME_3 = "(phone.name IS NULL OR phone.name = '')";
    private static final String _SQL_SELECT_PHONE = "SELECT phone FROM Phone phone";
    private static final String _SQL_SELECT_PHONE_WHERE = "SELECT phone FROM Phone phone WHERE ";
    private static final String _SQL_COUNT_PHONE = "SELECT COUNT(phone) FROM Phone phone";
    private static final String _SQL_COUNT_PHONE_WHERE = "SELECT COUNT(phone) FROM Phone phone WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "phone.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Phone exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Phone exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PhonePersistenceImpl.class);
    private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
                "idPhone", "name", "brand", "description", "releaseDate",
                "price", "imgUrl"
            });
    private static Phone _nullPhone = new PhoneImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Phone> toCacheModel() {
                return _nullPhoneCacheModel;
            }
        };

    private static CacheModel<Phone> _nullPhoneCacheModel = new CacheModel<Phone>() {
            @Override
            public Phone toEntityModel() {
                return _nullPhone;
            }
        };

    public PhonePersistenceImpl() {
        setModelClass(Phone.class);
    }

    /**
     * Returns all the Phones where name = &#63;.
     *
     * @param name the name
     * @return the matching Phones
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Phone> findByName(String name) throws SystemException {
        return findByName(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Phone> findByName(String name, int start, int end)
        throws SystemException {
        return findByName(name, start, end, null);
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
    @Override
    public List<Phone> findByName(String name, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME;
            finderArgs = new Object[] { name };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NAME;
            finderArgs = new Object[] { name, start, end, orderByComparator };
        }

        List<Phone> list = (List<Phone>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Phone phone : list) {
                if (!Validator.equals(name, phone.getName())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_PHONE_WHERE);

            boolean bindName = false;

            if (name == null) {
                query.append(_FINDER_COLUMN_NAME_NAME_1);
            } else if (name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_NAME_3);
            } else {
                bindName = true;

                query.append(_FINDER_COLUMN_NAME_NAME_2);
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PhoneModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindName) {
                    qPos.add(name);
                }

                if (!pagination) {
                    list = (List<Phone>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Phone>(list);
                } else {
                    list = (List<Phone>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Phone findByName_First(String name,
        OrderByComparator orderByComparator)
        throws NoSuchPhoneException, SystemException {
        Phone phone = fetchByName_First(name, orderByComparator);

        if (phone != null) {
            return phone;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("name=");
        msg.append(name);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPhoneException(msg.toString());
    }

    /**
     * Returns the first Phone in the ordered set where name = &#63;.
     *
     * @param name the name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching Phone, or <code>null</code> if a matching Phone could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Phone fetchByName_First(String name,
        OrderByComparator orderByComparator) throws SystemException {
        List<Phone> list = findByName(name, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Phone findByName_Last(String name,
        OrderByComparator orderByComparator)
        throws NoSuchPhoneException, SystemException {
        Phone phone = fetchByName_Last(name, orderByComparator);

        if (phone != null) {
            return phone;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("name=");
        msg.append(name);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPhoneException(msg.toString());
    }

    /**
     * Returns the last Phone in the ordered set where name = &#63;.
     *
     * @param name the name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching Phone, or <code>null</code> if a matching Phone could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Phone fetchByName_Last(String name,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByName(name);

        if (count == 0) {
            return null;
        }

        List<Phone> list = findByName(name, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Phone[] findByName_PrevAndNext(long idPhone, String name,
        OrderByComparator orderByComparator)
        throws NoSuchPhoneException, SystemException {
        Phone phone = findByPrimaryKey(idPhone);

        Session session = null;

        try {
            session = openSession();

            Phone[] array = new PhoneImpl[3];

            array[0] = getByName_PrevAndNext(session, phone, name,
                    orderByComparator, true);

            array[1] = phone;

            array[2] = getByName_PrevAndNext(session, phone, name,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Phone getByName_PrevAndNext(Session session, Phone phone,
        String name, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PHONE_WHERE);

        boolean bindName = false;

        if (name == null) {
            query.append(_FINDER_COLUMN_NAME_NAME_1);
        } else if (name.equals(StringPool.BLANK)) {
            query.append(_FINDER_COLUMN_NAME_NAME_3);
        } else {
            bindName = true;

            query.append(_FINDER_COLUMN_NAME_NAME_2);
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(PhoneModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        if (bindName) {
            qPos.add(name);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(phone);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Phone> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the Phones where name = &#63; from the database.
     *
     * @param name the name
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByName(String name) throws SystemException {
        for (Phone phone : findByName(name, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(phone);
        }
    }

    /**
     * Returns the number of Phones where name = &#63;.
     *
     * @param name the name
     * @return the number of matching Phones
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByName(String name) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_NAME;

        Object[] finderArgs = new Object[] { name };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PHONE_WHERE);

            boolean bindName = false;

            if (name == null) {
                query.append(_FINDER_COLUMN_NAME_NAME_1);
            } else if (name.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_NAME_NAME_3);
            } else {
                bindName = true;

                query.append(_FINDER_COLUMN_NAME_NAME_2);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                if (bindName) {
                    qPos.add(name);
                }

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the Phone in the entity cache if it is enabled.
     *
     * @param phone the Phone
     */
    @Override
    public void cacheResult(Phone phone) {
        EntityCacheUtil.putResult(PhoneModelImpl.ENTITY_CACHE_ENABLED,
            PhoneImpl.class, phone.getPrimaryKey(), phone);

        phone.resetOriginalValues();
    }

    /**
     * Caches the Phones in the entity cache if it is enabled.
     *
     * @param phones the Phones
     */
    @Override
    public void cacheResult(List<Phone> phones) {
        for (Phone phone : phones) {
            if (EntityCacheUtil.getResult(PhoneModelImpl.ENTITY_CACHE_ENABLED,
                        PhoneImpl.class, phone.getPrimaryKey()) == null) {
                cacheResult(phone);
            } else {
                phone.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all Phones.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PhoneImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PhoneImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the Phone.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Phone phone) {
        EntityCacheUtil.removeResult(PhoneModelImpl.ENTITY_CACHE_ENABLED,
            PhoneImpl.class, phone.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Phone> phones) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Phone phone : phones) {
            EntityCacheUtil.removeResult(PhoneModelImpl.ENTITY_CACHE_ENABLED,
                PhoneImpl.class, phone.getPrimaryKey());
        }
    }

    /**
     * Creates a new Phone with the primary key. Does not add the Phone to the database.
     *
     * @param idPhone the primary key for the new Phone
     * @return the new Phone
     */
    @Override
    public Phone create(long idPhone) {
        Phone phone = new PhoneImpl();

        phone.setNew(true);
        phone.setPrimaryKey(idPhone);

        return phone;
    }

    /**
     * Removes the Phone with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param idPhone the primary key of the Phone
     * @return the Phone that was removed
     * @throws br.liferay.marketphone.NoSuchPhoneException if a Phone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Phone remove(long idPhone)
        throws NoSuchPhoneException, SystemException {
        return remove((Serializable) idPhone);
    }

    /**
     * Removes the Phone with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the Phone
     * @return the Phone that was removed
     * @throws br.liferay.marketphone.NoSuchPhoneException if a Phone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Phone remove(Serializable primaryKey)
        throws NoSuchPhoneException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Phone phone = (Phone) session.get(PhoneImpl.class, primaryKey);

            if (phone == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPhoneException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(phone);
        } catch (NoSuchPhoneException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Phone removeImpl(Phone phone) throws SystemException {
        phone = toUnwrappedModel(phone);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(phone)) {
                phone = (Phone) session.get(PhoneImpl.class,
                        phone.getPrimaryKeyObj());
            }

            if (phone != null) {
                session.delete(phone);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (phone != null) {
            clearCache(phone);
        }

        return phone;
    }

    @Override
    public Phone updateImpl(br.liferay.marketphone.model.Phone phone)
        throws SystemException {
        phone = toUnwrappedModel(phone);

        boolean isNew = phone.isNew();

        PhoneModelImpl phoneModelImpl = (PhoneModelImpl) phone;

        Session session = null;

        try {
            session = openSession();

            if (phone.isNew()) {
                session.save(phone);

                phone.setNew(false);
            } else {
                session.merge(phone);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PhoneModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((phoneModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] { phoneModelImpl.getOriginalName() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
                    args);

                args = new Object[] { phoneModelImpl.getName() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NAME, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NAME,
                    args);
            }
        }

        EntityCacheUtil.putResult(PhoneModelImpl.ENTITY_CACHE_ENABLED,
            PhoneImpl.class, phone.getPrimaryKey(), phone);

        return phone;
    }

    protected Phone toUnwrappedModel(Phone phone) {
        if (phone instanceof PhoneImpl) {
            return phone;
        }

        PhoneImpl phoneImpl = new PhoneImpl();

        phoneImpl.setNew(phone.isNew());
        phoneImpl.setPrimaryKey(phone.getPrimaryKey());

        phoneImpl.setIdPhone(phone.getIdPhone());
        phoneImpl.setName(phone.getName());
        phoneImpl.setBrand(phone.getBrand());
        phoneImpl.setDescription(phone.getDescription());
        phoneImpl.setReleaseDate(phone.getReleaseDate());
        phoneImpl.setPrice(phone.getPrice());
        phoneImpl.setImgUrl(phone.getImgUrl());

        return phoneImpl;
    }

    /**
     * Returns the Phone with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the Phone
     * @return the Phone
     * @throws br.liferay.marketphone.NoSuchPhoneException if a Phone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Phone findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPhoneException, SystemException {
        Phone phone = fetchByPrimaryKey(primaryKey);

        if (phone == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPhoneException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return phone;
    }

    /**
     * Returns the Phone with the primary key or throws a {@link br.liferay.marketphone.NoSuchPhoneException} if it could not be found.
     *
     * @param idPhone the primary key of the Phone
     * @return the Phone
     * @throws br.liferay.marketphone.NoSuchPhoneException if a Phone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Phone findByPrimaryKey(long idPhone)
        throws NoSuchPhoneException, SystemException {
        return findByPrimaryKey((Serializable) idPhone);
    }

    /**
     * Returns the Phone with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the Phone
     * @return the Phone, or <code>null</code> if a Phone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Phone fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Phone phone = (Phone) EntityCacheUtil.getResult(PhoneModelImpl.ENTITY_CACHE_ENABLED,
                PhoneImpl.class, primaryKey);

        if (phone == _nullPhone) {
            return null;
        }

        if (phone == null) {
            Session session = null;

            try {
                session = openSession();

                phone = (Phone) session.get(PhoneImpl.class, primaryKey);

                if (phone != null) {
                    cacheResult(phone);
                } else {
                    EntityCacheUtil.putResult(PhoneModelImpl.ENTITY_CACHE_ENABLED,
                        PhoneImpl.class, primaryKey, _nullPhone);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PhoneModelImpl.ENTITY_CACHE_ENABLED,
                    PhoneImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return phone;
    }

    /**
     * Returns the Phone with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param idPhone the primary key of the Phone
     * @return the Phone, or <code>null</code> if a Phone with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Phone fetchByPrimaryKey(long idPhone) throws SystemException {
        return fetchByPrimaryKey((Serializable) idPhone);
    }

    /**
     * Returns all the Phones.
     *
     * @return the Phones
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Phone> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Phone> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Phone> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Phone> list = (List<Phone>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PHONE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PHONE;

                if (pagination) {
                    sql = sql.concat(PhoneModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Phone>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Phone>(list);
                } else {
                    list = (List<Phone>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the Phones from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Phone phone : findAll()) {
            remove(phone);
        }
    }

    /**
     * Returns the number of Phones.
     *
     * @return the number of Phones
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_PHONE);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    @Override
    protected Set<String> getBadColumnNames() {
        return _badColumnNames;
    }

    /**
     * Initializes the Phone persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.br.liferay.marketphone.model.Phone")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Phone>> listenersList = new ArrayList<ModelListener<Phone>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Phone>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PhoneImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
