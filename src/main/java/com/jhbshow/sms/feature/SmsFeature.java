package com.jhbshow.sms.feature;

import java.io.Serializable;
import lombok.Data;

/**
 * User: bluishoul Date: 2019-09-27 10:54
 */
@Data
public class SmsFeature implements Serializable {
    private String name;
    private boolean globe;
    private boolean onlyChina;

    public SmsFeature(String name, boolean globe) {
        this.name = name;
        this.globe = globe;
        this.onlyChina = !globe;
    }

    public SmsFeature(String name) {
        this(name, false);
    }

    public static final boolean GlobeAvailable = true;
    public static final SmsFeature PlainTextSMS = new SmsFeature("PlainTextSMS");
    public static final SmsFeature PhoneCallSMS = new SmsFeature("PhoneCallSMS");
    public static final SmsFeature CaptchaSMS = new SmsFeature("CaptchaSMS");
    public static final SmsFeature GlobeSupport = new SmsFeature("GlobeSupport", GlobeAvailable);
}
