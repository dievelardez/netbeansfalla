
package com.ejemplo.Springboot2.Repository;

import com.ejemplo.Springboot2.Entity.Persona;
import java.util.List;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository <Persona,Long>{

    public List<Persona> findAll();

    public void save(Persona persona);

    public void deleteById(Long id);

    public Object findById(Long id);
    
}
