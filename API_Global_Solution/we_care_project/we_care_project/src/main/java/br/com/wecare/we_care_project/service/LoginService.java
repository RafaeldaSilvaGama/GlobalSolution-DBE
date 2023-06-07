package br.com.wecare.we_care_project.service;

import br.com.wecare.we_care_project.model.LoginModel;
import br.com.wecare.we_care_project.model.UserModel;
import br.com.wecare.we_care_project.repository.LoginRepository;
import br.com.wecare.we_care_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService implements UserDetailsService {

    @Autowired
    private LoginRepository repository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return repository.findByEmail(email);
    }
}

