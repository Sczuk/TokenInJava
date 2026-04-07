package br.com.tokenInJava.token_in_java.controller;

import br.com.tokenInJava.token_in_java.DTO.request.user.userUpdate.UpdateDescriptionRequest;
import br.com.tokenInJava.token_in_java.DTO.request.user.UserRequest;
import br.com.tokenInJava.token_in_java.DTO.response.user.UserResponse;
import br.com.tokenInJava.token_in_java.DTO.response.user.UserStatusResponse;
import br.com.tokenInJava.token_in_java.useCases.userUseCases.DeleteUser;
import br.com.tokenInJava.token_in_java.useCases.userUseCases.GetUser;
import br.com.tokenInJava.token_in_java.useCases.userUseCases.UpdateUser;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private GetUser getUser;

    @Autowired
    private DeleteUser deleteUser;

    @Autowired
    private UpdateUser updateUser;

    @GetMapping("/{email}")
    public ResponseEntity<UserResponse> getUser(@PathVariable String email){
        UserResponse response = getUser.execute(email);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<?> deleteUser(@PathVariable String email){
        deleteUser.execute(email);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/editUser/{email}")
    public ResponseEntity<UserStatusResponse> updateUser(@RequestBody UpdateDescriptionRequest user, @PathVariable String email){
        UserStatusResponse response = updateUser.execute(user,email);
        return ResponseEntity.ok(response);
    }


}
