package com.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.Usuario;
import com.util.ConnectionGeneric;
import com.util.QueryGeneric;


public class UsuarioDao implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private QueryGeneric<Usuario> query;
	
	public UsuarioDao(){
		
		
	}
	
	public List<Usuario> list() {
		this.query = new QueryGeneric<Usuario>();
		this.query.setQuery("SELECT * FROM candidato");
		this.query.setList(new ArrayList<Usuario>());
		try {
			this.query.setPs(ConnectionGeneric.getConexion().prepareStatement(this.query.getQuery()));
			this.query.setRs(this.query.getPs().executeQuery());
			while (this.query.getRs().next()) {
				this.query.setEntity(new Usuario());
				this.query.getEntity().setNombre(this.query.getRs().getString(1));
				this.query.getEntity().setApellido(this.query.getRs().getString(2));
				this.query.getEntity().setCedula(this.query.getRs().getInt(3));
				this.query.getEntity().setEmail(this.query.getRs().getString(4));
				this.query.getList().add(this.query.getEntity());
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			// ConnectionGeneric.close();
		}
		return this.query.getList();
	}

}
