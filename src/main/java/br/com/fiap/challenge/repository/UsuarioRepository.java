package br.com.fiap.challenge.repository;

import br.com.fiap.challenge.model.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Page<Usuario> findByNomeLike(String nome, Pageable pageable);

    Usuario getUsuarioById(long id);

}
