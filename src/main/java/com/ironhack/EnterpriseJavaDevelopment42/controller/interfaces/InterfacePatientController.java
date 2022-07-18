package com.ironhack.EnterpriseJavaDevelopment42.controller.interfaces;

import com.ironhack.EnterpriseJavaDevelopment42.enums.Status;
import com.ironhack.EnterpriseJavaDevelopment42.model.Patient;

import java.util.List;

public interface InterfacePatientController {

    public List<Patient> findByName(String name);
    public Patient findByPatientId(Integer id);
    public List<Patient> findByDoctorName(String admittedBy);
    public List<Patient> findByDateOfBirthBetween(String startDate, String dateEnd);
    public List<Patient> findByDoctorDepartment(String department);
    public List<Patient> findByDoctorStatusOff(Status status);
}
