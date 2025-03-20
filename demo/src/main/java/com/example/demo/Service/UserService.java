package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.dto.ChangePasswordRequest;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repositories.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;

    public User register(User user){
        if(userRepo.findByEmail(user.getEmail()).isPresent()){
            throw new IllegalStateException("Email already taken");
        }
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            user.setRole(User.Role.USER);
            return userRepo.save(user);

    }
    public User getUserByEmail(String email){
        return userRepo.findByEmail(email).orElseThrow(()->new ResourceNotFoundException("User Not Found"));
    }
    public void changePassword(String email, ChangePasswordRequest request){
        User user=getUserByEmail(email);
        if(!passwordEncoder.matches(request.getCurrentPassword(),user.getPassword())){
            throw new BadCredentialsException("Current password is incorrect");
        }
        user.setPassword(passwordEncoder.encode(request.getNewPassword()));
        userRepo.save(user);

    }
}
