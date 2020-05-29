package com.arquitetura.api.equipment.repository;

import com.arquitetura.api.equipment.entity.Equipment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
    Equipment findById(long id);
    Boolean deleteById(long id);
}
