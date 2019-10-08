package com.jhbshow.sms;

import com.jhbshow.sms.message.SmsSendMessage;
import java.util.concurrent.Future;

/**
 * User: bluishoul Date: 2019-09-30 17:04
 */
public interface SmsTemplate {
    Future<Boolean> send(SmsSendMessage message);
}
