package com.example.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.example.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obg);
	
	void sendEmail(SimpleMailMessage msg);

}
