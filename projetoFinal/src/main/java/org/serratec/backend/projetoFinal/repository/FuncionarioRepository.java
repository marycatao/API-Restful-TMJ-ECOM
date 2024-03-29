package org.serratec.backend.projetoFinal.repository;

import org.serratec.backend.projetoFinal.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}

