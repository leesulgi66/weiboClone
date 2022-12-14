package com.example.weiboclone.jwt.controller;

import com.example.weiboclone.dto.requestdto.UsersRequestDto;
import com.example.weiboclone.repository.UserRepository;
import com.example.weiboclone.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@AllArgsConstructor
public class UsersController {

    private final UserRepository userRepository;

    private final UsersService usersService;

//    private final BCryptPasswordEncoder bCryptPasswordEncoder;


    @GetMapping("home")
    public String home() {
        return "<h1>home</h1>";
    }


    @PostMapping("token")
    public String token() {
        return "<h1>token</h1>";
    }


    // 회원가입
    @PostMapping("/api/user/signup")
    public String join(@ModelAttribute UsersRequestDto requestDto) throws IOException {
        usersService.join(requestDto);
//        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
//        users.setRoles("ROLE_USER");    // 롤은 기본으로 설정해준다. ROLE_USER로
        return "회원가입완료";
    }


//    // user, manager, admin 권한 접근 가능
//    @GetMapping("/api/v1/user")
//    public String user() {
//        return "user";
//    }
//
//    // manager, admin 권한 접근 가능
//    @GetMapping("/api/v1/manager")
//    public String manager() {
//        return "manager";
//    }
//
//    // admin 권한 접근 가능
//    @GetMapping("/api/v1/admin")
//    public String admin() {
//        return "admin";
//    }
//
}
