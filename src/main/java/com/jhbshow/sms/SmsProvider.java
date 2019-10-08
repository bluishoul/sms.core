package com.jhbshow.sms;

import com.jhbshow.sms.feature.SmsFeature;
import com.jhbshow.sms.message.SmsMessage;
import java.util.List;

/**
 * User: bluishoul Date: 2019-09-26 20:13
 */
public interface SmsProvider {

    /**
     * 运营商名称
     */
    String getProviderName();

    /**
     * 运营商介绍
     */
    String getDescription();

    /**
     * 发送短信
     *
     * @param message 短信内容
     * @return 是否已开始发送
     */
    boolean send(SmsMessage message);

    /**
     * 短信提供商支持的特性，包括是否支持国际短信、语音短信等。
     *
     * @return 特性列表
     */
    List<SmsFeature> getSupportFeatures();
}
