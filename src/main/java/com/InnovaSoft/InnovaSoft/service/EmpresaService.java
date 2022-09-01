package com.InnovaSoft.InnovaSoft.service;

import com.InnovaSoft.InnovaSoft.modelos.Empresa;
import com.InnovaSoft.InnovaSoft.repositorios.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;// Objeto tipo empresa


    //Metodo para mostrar la lista de empresas
    public List<Empresa> getAllEmpresas(){
        List<Empresa> listadoEmpresas =new ArrayList<>();
        empresaRepository.findAll().forEach(empresa -> listadoEmpresas.add(empresa));
        return listadoEmpresas;
    }

    // Metodo que trae la imformacion asignada en e ID
    public Empresa getEmpresaById(Integer id){
        return empresaRepository.findById(id).get();
    }

    // Metodo para guardar o actualizar objetos de tipo Empresa
    public boolean updateEmpresa(Empresa empresa){
        Empresa emp = empresaRepository.save(empresa);
        if (empresaRepository.findById(emp.getId())!=null){
            return true;
        }
        return false;
    }

    //Metodo delete pendiente
    public boolean deleteEmpresa(Integer id){
        empresaRepository.deleteById(id);  //Eliminar

        if (empresaRepository.findById(id)!=null){  //Verificacion del servicio eliminacion
            return true;
        }
        return false;
    }


}
