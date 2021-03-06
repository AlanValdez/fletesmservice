package com.bledi.models;

import java.util.Date;

public class Envio {
	
	private int envio_id;
	private int conductor_id;
	private int trailer_id;
	private String tipo_carga;
	private String fecha_salida;
	private String fecha_entrada;
	public int getEnvio_id() {
		return envio_id;
	}

	public void setEnvio_id(int envio_id) {
		this.envio_id = envio_id;
	}

	public String getFecha_entrada() {
		return fecha_entrada;
	}

	public void setFecha_entrada(String fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}
	private String cliente;
	private String estado;
	private String ciudad;
	private String direccion;
	public String getNombreCompleto() {
		return NombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		NombreCompleto = nombreCompleto;
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}
	private String estado_actual;
	private String NombreCompleto;
	private String placas;

	
	public Envio() { }
	
	public Envio(int conductor_id, int trailer_id, String tipo_carga, String cliente, String estado_actual,
			String estado, String ciudad, String direccion, String fecha_salida, String nombreCompleto, String placas) {
		super();
		this.conductor_id = conductor_id;
		this.trailer_id = trailer_id;
		this.tipo_carga = tipo_carga;
		this.cliente = cliente;
		this.estado_actual = estado_actual;
		this.estado = estado;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.fecha_salida = fecha_salida;
		this.NombreCompleto = nombreCompleto;
		this.placas = placas;
	}
	
	public Envio(int envio_id,String fecha_entrada , String fecha_salida, String cliente, int conductor_id, int trailer_id, String NombreCompleto, String placas) {
		super();
		this.conductor_id = conductor_id;
		this.trailer_id = trailer_id;
		this.cliente = cliente;
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.NombreCompleto = NombreCompleto;
		this.placas = placas;
		this.envio_id = envio_id;
	}
	public int getConductor_id() {
		return conductor_id;
	}
	public void setConductor_id(int conductor_id) {
		this.conductor_id = conductor_id;
	}
	public int getTrailer_id() {
		return trailer_id;
	}
	public void setTrailer_id(int trailer_id) {
		this.trailer_id = trailer_id;
	}
	public String getTipo_carga() {
		return tipo_carga;
	}
	public void setTipo_carga(String tipo_carga) {
		this.tipo_carga = tipo_carga;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getEstado_actual() {
		return estado_actual;
	}
	public void setEstado_actual(String estado_actual) {
		this.estado_actual = estado_actual;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getFecha_salida() {
		return fecha_salida;
	}
	public void setFecha_salida(String fecha_salida) {
		this.fecha_salida = fecha_salida;
	}
	
}
