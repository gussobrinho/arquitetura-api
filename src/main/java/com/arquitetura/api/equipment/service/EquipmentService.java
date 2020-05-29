package com.arquitetura.api.equipment.service;

import com.arquitetura.api.equipment.entity.Equipment;
import com.arquitetura.api.equipment.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {

    @Autowired
    EquipmentRepository equipmentRepository;

    public List<Equipment> findAll() {
        return equipmentRepository.findAll();
    }

    public Equipment findOne(long id) {
        return equipmentRepository.findById(id);
    }

    public Equipment save(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    public Equipment update(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    public Boolean delete(long id) {
        return equipmentRepository.deleteById(id);
    }

}
