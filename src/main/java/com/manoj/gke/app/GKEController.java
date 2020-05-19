package com.manoj.gke.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GKEController {

	@GetMapping("/gke")
	public String message() {
		return "Welcome GKE";
	}
}
