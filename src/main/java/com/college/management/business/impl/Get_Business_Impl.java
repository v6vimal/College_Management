package com.college.management.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.management.business.interfaces.Get_Business_Interface;
import com.college.management.dao.interfaces.Get_DataAccess_Interface;

@Service
public class Get_Business_Impl implements Get_Business_Interface
{
	@Autowired
	Get_DataAccess_Interface get_DataAccess_Interface;
	
}
