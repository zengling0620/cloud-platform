package com.it;

import cn.hutool.core.date.DateUtil;
import com.it.core.utils.LocalDateUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

/**
 * @desc: ${类描叙}
 * @author: 90003995
 * @date: 2022-01-11 10:30
 */
@Slf4j
public class LocalDateUtilTest {

    @Test
    public void test(){
        LocalDate localDate = LocalDate.parse("2022-01-01");
        Date date = LocalDateUtil.localDateToDate(localDate);
        int week = DateUtil.weekOfYear(date);
        log.info("result:{}",week);
    }
}
