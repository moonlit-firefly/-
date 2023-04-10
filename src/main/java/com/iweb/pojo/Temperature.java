package com.iweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 陈郅治
 * @date 2023/3/21  21:19
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Temperature {
    private Integer id;
    private String temperature;
    private Date gmtCreated;

    public Temperature(String temperature, Date gmtCreated) {
        this.temperature = temperature;
        this.gmtCreated = gmtCreated;
    }
}
