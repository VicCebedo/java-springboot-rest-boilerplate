/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viccebedo.boilerplate.dao;

import com.viccebedo.boilerplate.model.SqlUser;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author vcebedo
 */
public interface SqlUserRepository extends CrudRepository<SqlUser, Object> {

}
