package com.doromv.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @author Doromv
 * @create 2022-03-06-13:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private  String name;
    private  int age;
    private  String sex;
}
