/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaceschallenge;

import java.util.List;

/**
 *
 * @author simbongile.mbombo
 */
public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
