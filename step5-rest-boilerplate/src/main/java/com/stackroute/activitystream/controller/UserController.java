package com.stackroute.activitystream.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stackroute.activitystream.model.User;
import com.stackroute.activitystream.service.UserService;

/*
 * As in this assignment, we are working with creating RESTful web service, hence annotate
 * the class with @RestController annotation.A class annotated with @Controller annotation
 * has handler methods which returns a view. However, if we use @ResponseBody annotation along
 * with @Controller annotation, it will return the data directly in a serialized 
 * format. Starting from Spring 4 and above, we can use @RestController annotation which 
 * is equivalent to using @Controller and @ResposeBody annotation
 */

public class UserController {
	/*
	 * Autowiring should be implemented for the UserService. 
	 * Please note that we should not create any object using the new keyword 
	 */
	


	/* Define a handler method which will list all the available users.
	 * This handler method should return any one of the status messages basis on different
	 * situations:
	 * 1. 200(OK) - If login is successful
	 * 2. 401(UNAUTHORIZED) - If the user is not logged in
	 * 
	 * This handler method should map to the URL "/api/user" using HTTP GET method
	*/

	

	/* Define a handler method which will show details of a specific user.
	 * This handler method should return any one of the status messages basis on different
	 * situations:
	 * 1. 200(OK) - If login is successful
	 * 2. 401(UNAUTHORIZED) - If the user is not logged in
	 * 3. 404(NOT FOUND) - If the user with the searched for is not found
	 * This handler method should map to the URL "/api/user/{username}" using HTTP GET method
	 * where "username" should be replaced by a username without {}
	*/
	

	/* Define a handler method which will create a specific user by reading the 
	 * Serialized object from request body and save the user details in user table 
	 * in database. This handler method should return any one of the status messages
	 *  basis on different situations:
	 * 1. 201(CREATED) - If the user is successfully created
	 * 2. 409(CONFLICT) - If the username conflicts with any existing user
	 * 
	 * Note:
	 * ------
	 * This method can be called without being logged in as well as when a new user will
	 * use the app, he will register himself first before login.
	 * This handler method should map to the URL "/api/user" using HTTP POST method
	*/
	
	

	/* Define a handler method which will update an specific user by reading the 
	 * Serialized object from request body and save the updated user details in user table 
	 * in database. This handler method should return any one of the status messages
	 *  basis on different situations:
	 * 1. 200(OK) - If the user is successfully updated
	 * 2. 404(NOT FOUND) - If the user with specified username is not found
	 * 3. 401(UNAUTHORIZED) - If the user trying to perform the action has not logged in
	 * 
	 * This handler method should map to the URL "/api/user/{username}" using HTTP PUT method
	*/
	
}
