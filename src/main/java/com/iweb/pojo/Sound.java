package com.iweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 陈郅治
 * @date 2023/3/21  21:26
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sound {
    private Integer id;
    private String soundIntensity;
    private Date gmtCreated;

    public Sound(String soundIntensity, Date gmtCreated) {
        this.soundIntensity = soundIntensity;
        this.gmtCreated = gmtCreated;
    }
}
