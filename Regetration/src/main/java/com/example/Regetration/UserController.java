package com.example.Regetration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
@Autowired	
private UserRepository userRepository;

	@PostMapping("/user")
	public ResponseEntity<User> registerUser(@RequestBody User user ) {	
		return ResponseEntity.ok(userRepository.save(user));
	
	}
	
	

}

