package com.greenleaf.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.greenleaf.auth.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
