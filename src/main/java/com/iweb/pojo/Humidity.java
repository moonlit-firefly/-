package com.iweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 陈郅治
 * @date 2023/3/21  21:24
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Humidity {
    private Integer id;
    private String humidity;
    private Date gmtCreated;

    public Humidity(String humidity, Date gmtCreated) {
        this.humidity = humidity;
        this.gmtCreated = gmtCreated;
    }
}
