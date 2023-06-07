package br.com.wecare.we_care_project.repository;

import br.com.wecare.we_care_project.model.UserModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

    @Transactional
    UserModel findByNameContainingIgnoreCase(String name);

    @Transactional
    UserModel findByCpf(long cpf);

    @Transactional
    UserModel findByEmail(String email);

    @Transactional
    UserModel findByLogin(String login);

}
