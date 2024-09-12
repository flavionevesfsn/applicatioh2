package com.infnet.applicatioh2.repository;

import com.infnet.applicatioh2.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
    // testando a gestão de branchs
}
