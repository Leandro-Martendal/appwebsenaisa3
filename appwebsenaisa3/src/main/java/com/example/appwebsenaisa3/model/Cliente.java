package com.example.appwebsenaisa3.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
    public String name;
    public void setName (String name){
        this.name = name;
    }

    public String endereco;
    public void setEndereco (String endereco){
        this.endereco = endereco;
    }
@Id
    public long id;
    public void setId(long id) {
        this.id = id;
    }

    public long matricula;
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String modalidade;
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getName(){
        return name;
    }
    public String getEndereco(){
        return endereco;
    }
    public long getId(){
        return id;
    }
    public String getModalidade(){
        return modalidade;
    }
    public long getMatricula() { return matricula; }
}
