/*================================================================================================
Study Center....: Universidad Técnica Nacional
Campus..........: Pacífico (JRMP)
College career..: Ingeniería en Tecnologías de la Información
Period..........: 2C-2024
Course..........: ITI-221 - Programación I
Document........: class_06 - cls_Idxper.java
Goals...........: Structure that contains the specifications to create index file
Professor.......: Jorge Ruiz (york)
Student.........: Braylin Peraza Alfaro
================================================================================================*/

// Call external libraries
import java.io.Serializable;


public class cls_Idxper implements Serializable {
    //Declare local properties
    int cedula, posicion;

    //Create default constructor
    public cls_Idxper() {
    }

    //Create parametrized constructor
    public cls_Idxper(int cedula, int posicion) {
        this.cedula = cedula;
        this.posicion = posicion;
    }

    //Create all getter and setter functions
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}