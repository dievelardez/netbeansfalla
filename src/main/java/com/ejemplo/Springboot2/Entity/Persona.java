
package com.ejemplo.Springboot2.Entity;

import com.sun.istack.NotNull;
import jakarta.validation.constraints.Size;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 

public class Persona implements Serializable {
    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private Long id;
    
    
    
    @NotNull
    @Size(min=1,max=50,message ="no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min=1,max=50,message ="no cumple con la longitud")
    private String apellido;
    
    
    
    @Size(min=1,max=50,message ="no cumple con la longitud")
    private String img;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido(String nuevoApellido) {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    
    
    
    

}
