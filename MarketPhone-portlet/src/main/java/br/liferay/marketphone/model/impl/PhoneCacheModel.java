package br.liferay.marketphone.model.impl;

import br.liferay.marketphone.model.Phone;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Phone in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Phone
 * @generated
 */
public class PhoneCacheModel implements CacheModel<Phone>, Externalizable {
    public long idPhone;
    public String name;
    public String brand;
    public String description;
    public long releaseDate;
    public double price;
    public String imgUrl;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{idPhone=");
        sb.append(idPhone);
        sb.append(", name=");
        sb.append(name);
        sb.append(", brand=");
        sb.append(brand);
        sb.append(", description=");
        sb.append(description);
        sb.append(", releaseDate=");
        sb.append(releaseDate);
        sb.append(", price=");
        sb.append(price);
        sb.append(", imgUrl=");
        sb.append(imgUrl);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Phone toEntityModel() {
        PhoneImpl phoneImpl = new PhoneImpl();

        phoneImpl.setIdPhone(idPhone);

        if (name == null) {
            phoneImpl.setName(StringPool.BLANK);
        } else {
            phoneImpl.setName(name);
        }

        if (brand == null) {
            phoneImpl.setBrand(StringPool.BLANK);
        } else {
            phoneImpl.setBrand(brand);
        }

        if (description == null) {
            phoneImpl.setDescription(StringPool.BLANK);
        } else {
            phoneImpl.setDescription(description);
        }

        if (releaseDate == Long.MIN_VALUE) {
            phoneImpl.setReleaseDate(null);
        } else {
            phoneImpl.setReleaseDate(new Date(releaseDate));
        }

        phoneImpl.setPrice(price);

        if (imgUrl == null) {
            phoneImpl.setImgUrl(StringPool.BLANK);
        } else {
            phoneImpl.setImgUrl(imgUrl);
        }

        phoneImpl.resetOriginalValues();

        return phoneImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        idPhone = objectInput.readLong();
        name = objectInput.readUTF();
        brand = objectInput.readUTF();
        description = objectInput.readUTF();
        releaseDate = objectInput.readLong();
        price = objectInput.readDouble();
        imgUrl = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(idPhone);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (brand == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(brand);
        }

        if (description == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(description);
        }

        objectOutput.writeLong(releaseDate);
        objectOutput.writeDouble(price);

        if (imgUrl == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(imgUrl);
        }
    }
}
