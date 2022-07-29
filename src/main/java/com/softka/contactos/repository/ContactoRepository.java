package com.softka.contactos.repository;

import com.softka.contactos.domain.Contacto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContactoRepository extends CrudRepository<Contacto, Integer> {
}