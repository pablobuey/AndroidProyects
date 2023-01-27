package com.example.actividad64_;

public class Encapsulador {

    private int imagen;
    private String titulo;
    private String texto;
    private boolean dato1;

    public Encapsulador(int idImagen,String textoTitulo,String textoContenido,boolean favorito){
        this.imagen=idImagen;
        this.titulo=textoTitulo;
        this.texto=textoContenido;
        this.dato1=favorito;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean get_checkBox1() {
        return dato1;
    }

    public void set_checkBox1(boolean dato1) {
        this.dato1 = dato1;
    }




}//fin clase encapsulador

