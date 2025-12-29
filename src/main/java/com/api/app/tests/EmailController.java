package com.api.app.tests;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
@RequiredArgsConstructor
public class EmailController {

    private final EmailService emailService;

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail() {
        emailService.enviarCorreo(
                "182935@unsaac.edu.pe",
                "Correo desde Render 🚀",
                "Esto ya funciona en PRODUCCIÓN"
        );
        return ResponseEntity.ok("Correo enviado");
    }
}
