package com.sharding.shardingjdbc.config;

import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.*;


/**
 * @program: sharding-jdbc
 * @description: 标准分片算法
 * @author: Mr.He
 * @create: 2021-12-16 09:54
 **/
public class BirthdayAlgorithm  implements PreciseShardingAlgorithm<Date> {
    List<Date> dateList = new ArrayList<>();
    {
        //初始化一些区分的时间
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2021,1,1,0,0,0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2022,1,1,0,0,0);
        dateList.add(calendar1.getTime());
        dateList.add(calendar2.getTime());
    }

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Date> preciseShardingValue) {
        //获取属性数据库的真实值
        Date date = preciseShardingValue.getValue();
        //获取数据源的名称信息列表
        Iterator<String> iterator = collection.iterator();
        String target = null;
        for (Date da: dateList) {
            target = iterator.next();
            if(date.before(da)) {
                break;
            }
        }
        return target;
    }
}
