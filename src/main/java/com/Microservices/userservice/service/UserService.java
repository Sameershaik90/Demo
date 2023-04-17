/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Microservices.userservice.service;

import com.Microservices.userservice.DTO.ResponseDto;
import com.Microservices.userservice.entity.User;

/**
 *
 * @author ULTCPU20
 */
public interface UserService {
    
    User saveUser(User user);
    
    ResponseDto getUser(Long userId);
}
