package com.example.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.example.cursomc.domain.Pedido;

public interface EmailService {
	
<<<<<<< HEAD
	void sendOrderConfirmationEmail(Pedido obg);
	
	void sendEmail(SimpleMailMessage msg);
=======
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg); 
>>>>>>> bdb6ad7268c1d591c19c6e31d549225b661a5de0

}
