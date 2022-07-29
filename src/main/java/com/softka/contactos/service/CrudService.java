package com.softka.contactos.service;

import com.softka.contactos.domain.Contacto;
import com.softka.contactos.repository.ContactoRepository;
import com.softka.contactos.service.interfaces.ICrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;

@Service
public class CrudService implements ICrud {
    @Autowired
    private ContactoRepository contactoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Contacto> getList() {
        return (List<Contacto>) contactoRepository.findAll();
    }

    @Override
    @Transactional
    public Contacto createContacto(Contacto newContacto) {
        return contactoRepository.save(newContacto);
    }

    @Override
    @Transactional
    public Contacto deleteContacto(Integer id) {
        var contacto = contactoRepository.findById(id);
        if (contacto.isPresent()) {
            contactoRepository.delete(contacto.get());
            return contacto.get();
        } else {
            return null;
        }
    }

    @Override
    @Transactional
    public Contacto updateContacto(Integer id, Contacto contacto) {
        contacto.setId(id);
        return contactoRepository.save(contacto);
    }

}
