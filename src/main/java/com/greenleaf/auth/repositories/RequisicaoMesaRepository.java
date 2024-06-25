package com.greenleaf.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.greenleaf.auth.models.RequisicaoMesa;

@Repository
public interface RequisicaoMesaRepository extends JpaRepository<RequisicaoMesa, Integer> {
}
