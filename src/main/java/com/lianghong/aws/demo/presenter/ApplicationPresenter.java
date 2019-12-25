package com.lianghong.aws.demo.presenter;

import lombok.Data;
import org.joda.time.DateTime;

import java.math.BigDecimal;

import static com.lianghong.aws.demo.utils.DateTimeUtils.convertToString;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Data
public class ApplicationPresenter {
    private String pk;
    private String sk;
    private String data;
    private DateTime lastUpdated;

    public String getLastUpdated() {
        return convertToString(lastUpdated);
    }
}
