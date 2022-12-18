
package com.ejemplo.Springboot2.Interface;

import com.ejemplo.Springboot2.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List <Persona> getPersona();
    
    //guardar un objeto del tipo persona
    
    public void savePersona (Persona persona);
    
    public void deletePersona (Long id);
    
    public Persona findPersona(Long id);
    
    
}
