package com.lianghong.aws.demo.repository.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import com.lianghong.aws.demo.repository.converter.ApplicationIdConverter;
import com.lianghong.aws.demo.repository.converter.DateTimeConverter;
import com.lianghong.aws.demo.repository.converter.SkPrefix;
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
@DynamoDBTable(tableName = "general")
public class ApplicationEntity {

    @DynamoDBTypeConverted(converter = ApplicationIdConverter.class)
    @DynamoDBAttribute(attributeName = "PK")
    @DynamoDBHashKey
    private String pk;

    @DynamoDBAttribute(attributeName = "SK")
    @DynamoDBRangeKey
    private String sk;

//    @DynamoDBAttribute(attributeName = "SK")
//    @DynamoDBTypeConverted(converter = SkPrefix.class)
//    private String skPrefix;

    @DynamoDBAttribute(attributeName = "data")
    private String data;
}
