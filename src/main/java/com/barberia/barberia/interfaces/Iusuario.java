package com.barberia.barberia.interfaces;


import com.barberia.barberia.modelo.usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Iusuario extends CrudRepository<usuario,Integer> {
}
