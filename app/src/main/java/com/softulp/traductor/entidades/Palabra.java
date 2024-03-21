package com.softulp.traductor.entidades;

public class Palabra {
    private String espanol, ingles;
    private int imagen;

    public  Palabra(String espanol,String ingles, int imagen){
        this.espanol= espanol;
        this.ingles= ingles;
        this.imagen= imagen;

    };

    public String getEspanol() {
        return espanol;
    }

    public void setEspanol(String espanol) {
        this.espanol = espanol;
    }

    public String getIngles() {
        return ingles;
    }

    public void setIngles(String ingles) {
        this.ingles = ingles;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }


}
