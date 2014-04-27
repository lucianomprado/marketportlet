package br.liferay.marketphone.bean;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.liferay.marketphone.model.Phone;
import br.liferay.marketphone.service.PhoneLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

@ManagedBean(name ="phoneList")
@SessionScoped
public class PhoneList {

	private Map<Long,PhoneBean> phoneBeans;

	private PhoneBean phone;

	public Map<Long,PhoneBean> getPhones(){

		if(phoneBeans == null){

			try {
				List<Phone> phones = PhoneLocalServiceUtil.getPhones(-1, -1);
				phoneBeans = new HashMap<Long,PhoneBean>();
				for(Phone phone: phones){

					
					phoneBeans.put(phone.getIdPhone(),new PhoneBean(phone));
				}

			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return phoneBeans;
	}

	public int getCount(){

		return getPhones().size();
	}
	public PhoneBean getPhone(Long idPhone){

		if(getPhones().containsKey(idPhone)){

			return getPhones().get(idPhone);
		}
		return null;
	}

	public String edit(){

		FacesContext context = FacesContext.getCurrentInstance();
		Map<String, String> paramMap = context.getExternalContext().getRequestParameterMap();
		Long idPhone = Long.parseLong((paramMap.get("idPhone")!=null ? paramMap.get("idPhone") : "0"));
		if(idPhone == 0){
		
			this.phone = new PhoneBean();
		}else{
			this.phone = getPhone(idPhone);
		}
		return "edit";
	}

	public PhoneBean getPhone() {
		return phone;
	}

	public void setPhone(PhoneBean phone) {
		this.phone = phone;
	}

	public String save(){

		Phone phoneModel = phone.getPhone();
		try {
			if(phoneModel.getIdPhone() == 0){


				phoneModel = PhoneLocalServiceUtil.addPhone(phoneModel);
				phoneBeans.put(phoneModel.getIdPhone(), new PhoneBean(phoneModel));
			}else{

				PhoneLocalServiceUtil.updatePhone(phoneModel);
			}
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "view";
	}
	public List<PhoneBean> getPhonesList(){
		
		
		return (getPhones()!=null ? new LinkedList<PhoneBean>(getPhones().values()) : new LinkedList<PhoneBean>());
	}
	public String delete(){
		FacesContext context = FacesContext.getCurrentInstance();
		Map<String, String> paramMap = context.getExternalContext().getRequestParameterMap();
		Long idPhone = Long.parseLong((paramMap.get("idPhone")!=null ? paramMap.get("idPhone") : "0"));
		try {
				
			PhoneLocalServiceUtil.deletePhone(idPhone);
			phoneBeans.remove(idPhone);
			
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "view";
	}
}
