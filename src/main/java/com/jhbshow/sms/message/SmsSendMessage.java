package com.jhbshow.sms.message;

import com.jhbshow.sms.feature.SmsFeature;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * User: bluishoul Date: 2019-09-27 10:49
 */
@Data
@AllArgsConstructor
public class SmsSendMessage implements Serializable {
    private SmsMessage message;
    private List<SmsFeature> featuresRequired;
}
