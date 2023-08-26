package com.barberia.barberia.servicios;

import com.barberia.barberia.interfaces.Iusuario;
import com.barberia.barberia.interfacesServicios.IServicesUsuario;
import com.barberia.barberia.modelo.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio implements IServicesUsuario {
    @Autowired
    private Iusuario data;

    @Override
    public int save(usuario log) {
        int res = 0;
        usuario usuario = data.save(log);
        if(!usuario.equals(null)) {
            res = 1;
        }
            return 0;

    }
}
