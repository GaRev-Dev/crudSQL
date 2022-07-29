package com.softka.contactos.service;

import com.softka.contactos.domain.Contacto;
import com.softka.contactos.repository.ContactoRepository;
import com.softka.contactos.service.interfaces.ICrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional(readOnly = true)
    public List<Contacto> searchContacto(String dataToSearch) {
        return contactoRepository.findByNombre(dataToSearch);
    }

    @Override
    @Transactional
    public Contacto createContacto(Contacto newContacto) {
        return contactoRepository.save(newContacto);
    }

    @Override
    @Transactional
    public Contacto updateContacto(Integer id, Contacto contacto) {
        return null;
    }

    @Override
    @Transactional
    public Contacto deleteContacto(Integer id) {
        return null;
    }
}
