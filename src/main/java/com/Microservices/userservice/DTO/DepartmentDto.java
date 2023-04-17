/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Microservices.userservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ULTCPU20
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {

    private Long id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
