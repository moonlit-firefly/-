package com.iweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 陈郅治
 * @date 2023/3/21  21:16
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manager {
    private Integer id;
    private String managerName;
    private String managerPassword;

    public Manager(String managerName, String managerPassword) {
        this.managerName = managerName;
        this.managerPassword = managerPassword;
    }
}
