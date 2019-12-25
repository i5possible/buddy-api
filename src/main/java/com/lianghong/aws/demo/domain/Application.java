package com.lianghong.aws.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

import java.math.BigDecimal;

/**
 * @author lianghong
 * @date 2019/9/15
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Application {
    private String pk;
    private String sk;
    private String data;
}
