package br.com.wecare.we_care_project.repository;

import br.com.wecare.we_care_project.model.LoginModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<LoginModel, Long> {

   @Transactional
   UserDetails findByEmail(String email);
}
