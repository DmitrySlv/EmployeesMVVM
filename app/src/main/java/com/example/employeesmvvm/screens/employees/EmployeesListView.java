package com.example.employeesmvvm.screens.employees;

import com.example.employeesmvvm.pojo.Employee;

import java.util.List;

public interface EmployeesListView {
    void showData(List<Employee> employees);
    void showError();
}
