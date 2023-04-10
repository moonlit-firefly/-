package com.iweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 陈郅治
 * @date 2023/3/21  21:27
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Light {
    private Integer id;
    private String lightIntensity;
    private Date gmtCreated;

    public Light(String lightIntensity, Date gmtCreated) {
        this.lightIntensity = lightIntensity;
        this.gmtCreated = gmtCreated;
    }
}
