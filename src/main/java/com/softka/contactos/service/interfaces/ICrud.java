package com.softka.contactos.service.interfaces;

import com.softka.contactos.domain.Contacto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICrud {

    public Contacto createContacto(Contacto newContacto);
    public List<Contacto> getList();

    Contacto updateContacto(Integer id, Contacto contacto);

    Contacto deleteContacto(Integer id);
}
