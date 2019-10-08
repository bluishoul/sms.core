package com.jhbshow.sms.message;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * User: bluishoul Date: 2019-09-30 15:01
 */
@Data
@AllArgsConstructor
public class SmsMessage implements Serializable {
    private String content;
}
