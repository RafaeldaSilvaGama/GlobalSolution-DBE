package br.com.wecare.we_care_project.security;

import br.com.wecare.we_care_project.dtos.LoginDto;
import br.com.wecare.we_care_project.dtos.UserDto;
import br.com.wecare.we_care_project.enums.Roles;
import br.com.wecare.we_care_project.model.UserModel;
import br.com.wecare.we_care_project.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository repository;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse authenticate(LoginDto loginDto) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginDto.getEmail(),
                        loginDto.getPassword()
                )
        );
        var user = repository.findByEmail(loginDto.getEmail());
        var jwtToken = jwtService.generateToken((UserDetails) user);
        return AuthenticationResponse.builder()
                .token(jwtToken).build();
    }
}
