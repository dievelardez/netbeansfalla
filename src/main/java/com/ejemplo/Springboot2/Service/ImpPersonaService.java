
package com.ejemplo.Springboot2.Service;

import com.ejemplo.Springboot2.Entity.Persona;
import com.ejemplo.Springboot2.Interface.IPersonaService;
import com.ejemplo.Springboot2.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ImpPersonaService implements IPersonaService{
    
    @Autowired IPersonaRepository ipersonaRepository;

   
    @Override
    public List<Persona> getPersona() {
        List <Persona> persona=ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona=(Persona) ipersonaRepository.findById(id);
        return persona;

    }

   
    
}
