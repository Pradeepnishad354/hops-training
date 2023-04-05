package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

@RestController

public class MyController {

	@Autowired
	private UserService userService;

	// save user
	@PostMapping("/add")
	public ResponseEntity<User> addForm(@RequestBody User user) {

		return new ResponseEntity<User>(userService.addUser(user), HttpStatus.CREATED);
	}

	@GetMapping("/find")
	public ResponseEntity<?> findUser() {

		List<User> user = userService.getUser();
		if (user.size() > 0) {

			return new ResponseEntity<List<User>>(user, HttpStatus.OK);
		} else {
			return new ResponseEntity<>("no data is available ", HttpStatus.NOT_FOUND);
		}

		// return new ResponseEntity<List<User>>(userService.getUser(), HttpStatus.OK);

	}

	@GetMapping("/find/{id}")
	public ResponseEntity<User> findUser(@PathVariable("id") String id) {

		try {
			return new ResponseEntity<User>(userService.findById(id), HttpStatus.OK);
		} catch (Exception e) {

			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}

	}

	// delete
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteData(@PathVariable("id") String id) {
		try {

			userService.delete(id);

			return new ResponseEntity<>("successfully delete with id" + id, HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);

		}
	}

	// update user
	@PutMapping("/update/{id}")
	public ResponseEntity<User> updateUsers(@RequestBody User user, @PathVariable("id") String id) {

		userService.updateUser(user, id);

		return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);

	}

}
