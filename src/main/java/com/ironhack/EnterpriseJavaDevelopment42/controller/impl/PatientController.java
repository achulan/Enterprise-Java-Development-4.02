package com.ironhack.EnterpriseJavaDevelopment42.controller.impl;

import com.ironhack.EnterpriseJavaDevelopment42.controller.interfaces.InterfacePatientController;
import com.ironhack.EnterpriseJavaDevelopment42.enums.Status;
import com.ironhack.EnterpriseJavaDevelopment42.model.Patient;

import java.util.List;

public class PatientController implements InterfacePatientController {
    @Override
    public List<Patient> findByName(String name) {
        return null;
    }

    @Override
    public Patient findByPatientId(Integer id) {
        return null;
    }

    @Override
    public List<Patient> findByDoctorName(String admittedBy) {
        return null;
    }

    @Override
    public List<Patient> findByDateOfBirthBetween(String startDate, String dateEnd) {
        return null;
    }

    @Override
    public List<Patient> findByDoctorDepartment(String department) {
        return null;
    }

    @Override
    public List<Patient> findByDoctorStatusOff(Status status) {
        return null;
    }
}