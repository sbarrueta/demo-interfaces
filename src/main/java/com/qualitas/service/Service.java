package com.qualitas.service;

import com.qualitas.dao.ClienteDAO;
import com.qualitas.dao.impl.ClienteDAOImpl;

import com.qualitas.entities.Cliente;
import java.util.List;
import java.util.ArrayList;

import com.qualitas.dao.PolizaDAO;
import com.qualitas.dao.impl.PolizaDAOImpl;
public class Service {
	// dependencias
	private ClienteDAO clienteDAO;
	private PolizaDAO polizaDAO;
	
	public Service() {
		super();
		polizaDAO = new PolizaDAOImpl();
		this.clienteDAO = new ClienteDAOImpl(polizaDAO);
	}

	public List<Cliente>  getClientes(){
		List<Cliente> lista = new ArrayList<Cliente>();
		lista = clienteDAO.consultar();
		
		return lista;
	}
	

}
