package com.aula.prog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aula.prog.entity.Cliente;
import com.aula.prog.interfaces.IGenericDao;

@Service
public class ClienteService {

	IGenericDao<Cliente> dao;
	 
   @Autowired
   public void setDao(IGenericDao<Cliente> daoToSet) {
      dao = daoToSet;
   }
	
}
