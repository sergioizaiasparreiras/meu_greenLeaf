package com.greenleaf.auth.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.greenleaf.auth.models.Mesa;

@Repository
public interface MesaRepository extends JpaRepository<Mesa, Integer> {
}
