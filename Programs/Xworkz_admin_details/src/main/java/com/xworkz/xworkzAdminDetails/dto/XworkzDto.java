package com.xworkz.xworkzAdminDetails.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class XworkzDto {
    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private String  password;
    private String confirmPassword;
    private Long mobNo;
}
