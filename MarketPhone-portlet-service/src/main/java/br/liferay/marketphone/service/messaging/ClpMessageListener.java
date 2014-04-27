package br.liferay.marketphone.service.messaging;

import br.liferay.marketphone.service.ClpSerializer;
import br.liferay.marketphone.service.PhoneLocalServiceUtil;
import br.liferay.marketphone.service.PhoneServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            PhoneLocalServiceUtil.clearService();

            PhoneServiceUtil.clearService();
        }
    }
}
