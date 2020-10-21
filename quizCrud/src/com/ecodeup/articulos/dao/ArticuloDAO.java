package com.ecodeup.articulos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ecodeup.articulos.model.Articulo;
import com.ecodeup.articulos.model.Conexion;

/*
 * @autor: Elivar Largo
 * @web: www.ecodeup.com
 */

public class ArticuloDAO {
	private Conexion con;
	private Connection connection;

	public ArticuloDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
		System.out.println(jdbcURL);
		con = new Conexion(jdbcURL, jdbcUsername, jdbcPassword);
	}

	// insertar artículo
	public boolean insertar(Articulo articulo) throws SQLException {
		String sql = "INSERT INTO auto (placa,marca,modelo,anio ,cilindraje) VALUES (?,?,?,?,?)";
		
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, articulo.getPlaca());
		statement.setString(2, articulo.getMarca());
		statement.setString(3, articulo.getModelo());
		statement.setString(4, articulo.getAnio());
		statement.setString(5, articulo.getCilindraje());

		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();
		return rowInserted;
	}

	// listar todos los productos
	public List<Articulo> listarArticulos() throws SQLException {

		List<Articulo> listaArticulos = new ArrayList<Articulo>();
		String sql = "SELECT * FROM auto";
		con.conectar();
		connection = con.getJdbcConnection();
		Statement statement = connection.createStatement();
		ResultSet resulSet = statement.executeQuery(sql);

		while (resulSet.next()) {
			int id = resulSet.getInt("id");
			String placa = resulSet.getString("placa");
			String marca = resulSet.getString("marca");
			String modelo = resulSet.getString("modelo");
			String anio = resulSet.getString("anio");
			String cilindraje = resulSet.getString("cilindraje");
			Articulo articulo = new Articulo( id, placa, marca, modelo, anio, cilindraje);
			listaArticulos.add(articulo);
		}
		con.desconectar();
		return listaArticulos;
	}

	// obtener por id
	public Articulo obtenerPorId(int id) throws SQLException {
		Articulo articulo = null;

		String sql = "SELECT * FROM auto WHERE id= ? ";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, id);

		ResultSet res = statement.executeQuery();
		if (res.next()) {
			articulo = new Articulo(res.getInt("id"), res.getString("placa"), res.getString("marca"),res.getString("modelo"), res.getString("anio"), res.getString("cilindraje"));
		}
		res.close();
		con.desconectar();

		return articulo;
	}

	// actualizar
	public boolean actualizar(Articulo articulo) throws SQLException {
		boolean rowActualizar = false;
		String sql = "UPDATE auto SET placa=?,marca=?,modelo=?,anio=?, cilindraje=? WHERE id=?";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, articulo.getPlaca());
		statement.setString(2, articulo.getMarca());
		statement.setString(3, articulo.getModelo());
		statement.setString(4, articulo.getAnio());
		System.out.println(articulo.getCilindraje());
		statement.setString(5, articulo.getCilindraje());
		statement.setInt(6, articulo.getId());

		rowActualizar = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();
		return rowActualizar;
	}
	
	//eliminar
	public boolean eliminar(Articulo articulo) throws SQLException {
		boolean rowEliminar = false;
		String sql = "DELETE FROM auto WHERE ID=?";
		con.conectar();
		connection = con.getJdbcConnection();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, articulo.getId());

		rowEliminar = statement.executeUpdate() > 0;
		statement.close();
		con.desconectar();

		return rowEliminar;
	}

}
