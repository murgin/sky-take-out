package com.sky.service;

import com.sky.dto.SetmealDTO;

public interface SetmealService {
    /**
     * 新增套餐和对应的菜品
     * @param setmealDTO
     */
    void saveWithDish(SetmealDTO setmealDTO);
}
