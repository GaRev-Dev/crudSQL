package com.softka.contactos.repository;

import com.softka.contactos.domain.Contacto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactoRepository extends CrudRepository<Contacto, Integer> {
    @Query(value = "SELECT cnt " +
            "FROM Contacto cnt " +
            "WHERE cnt.nombre LIKE %:dataToSearch%")
    public List<Contacto> findByNombre(@Param("dataToSearch") String dataToSearch);
}