package br.com.wecare.we_care_project.controller;


import br.com.wecare.we_care_project.dtos.LoginDto;
import br.com.wecare.we_care_project.dtos.UserDto;
import br.com.wecare.we_care_project.security.AuthenticationResponse;
import br.com.wecare.we_care_project.security.AuthenticationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Login", description = "API para gerenciamento e autorização de usuarios e login")
@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final AuthenticationService service;

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody LoginDto loginDto) {
        return ResponseEntity.ok(service.authenticate(loginDto));
    }
}
