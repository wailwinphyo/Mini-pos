/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.service;

import com.turingtraining.pos.model.Stock;

/**
 *
 * @author wailwinphyo
 */
public interface StockService {

    void reduceStock(Stock s) throws Exception;

    void refillStock(Stock s) throws Exception;
    
}
