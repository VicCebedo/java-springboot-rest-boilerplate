/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viccebedo.boilerplate.db;

import com.viccebedo.boilerplate.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author vcebedo
 */
public interface UserRepository extends CrudRepository<User, Object> {

}
