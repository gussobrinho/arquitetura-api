package com.arquitetura.api.equipment.controller;

import com.arquitetura.api.core.CrudController;
import com.arquitetura.api.equipment.entity.Equipment;

import com.arquitetura.api.exceptions.GenericException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/equipments")
public class EquipmentController extends CrudController<Equipment> {

    @Override
    @PostMapping
    public ResponseEntity<Equipment> save(@Validated Equipment equipment) {

        if (equipment.getName().equals("")) {
            throw new GenericException("Name is required");
        }

        if (equipment.getDescription().equals("")) {
            throw new GenericException("Description is required");
        }

        if (equipment.getPrice() < 0) {
            throw new GenericException("Price cannot be smaller than 0");
        }

        return new ResponseEntity<>(service.save(equipment), HttpStatus.OK);
    }
}