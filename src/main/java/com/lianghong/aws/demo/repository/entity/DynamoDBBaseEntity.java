package com.lianghong.aws.demo.repository.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import com.lianghong.aws.demo.repository.converter.DateTimeConverter;
import lombok.Data;
import org.joda.time.DateTime;

/**
 * @author lianghong
 * @date 2019/12/25
 */

@Data
public class DynamoDBBaseEntity {

    @DynamoDBTypeConverted(converter = DateTimeConverter.class)
    private DateTime lastUpdated;
}
