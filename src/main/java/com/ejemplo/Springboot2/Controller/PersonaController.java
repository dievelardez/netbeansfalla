
package com.ejemplo.Springboot2.Controller;

import com.ejemplo.Springboot2.Entity.Persona;
import com.ejemplo.Springboot2.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
   
    @GetMapping ("personas/traer")
    
   
    public List <Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    @PostMapping("personas/crear")
    public String createPersona (@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/personas/corrar/(id)")
    public String deletePersona (@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
        
    }
    //URL:PUERTO/personas/
    @PutMapping ("/personas/editar/(id)")
    public Persona editPersona (@PathVariable Long id,
            @RequestParam ("nombre") String nuevoNombre,
            @RequestParam ("apellido") String nuevoApellido,
            @RequestParam ("img") String nuevoImg){
        Persona persona=ipersonaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.getApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        
        
        ipersonaService.savePersona(persona);
        return persona;
        
        
    }
}
