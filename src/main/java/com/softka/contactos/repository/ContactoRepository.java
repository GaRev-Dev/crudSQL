package com.softka.contactos.repository;

import com.softka.contactos.domain.Contacto;
import org.springframework.data.repository.CrudRepository;

public interface ContactoRepository extends CrudRepository<Contacto, Integer> {
}