package com.example.spatra.controller;

import com.example.spatra.entity.MemberResponseDto;
import com.example.spatra.repository.MemberRepository;
import com.example.spatra.service.MemberService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    /**
     * 한 회원의 userId가 주었을때 회원 정보를 조회하는 API
     * @param
     */
    @GetMapping("/member/{id}")
    public MemberResponseDto getMemberInfo(@PathVariable String id) {

        @RequestParam String email;
        @RequestParam String pw;
        @RequestParam String name;

        return name+""+pw+""+email;
    }

    /**
     * 회원의 전체 목록을 조회하는 API
     */
    @GetMapping("/member")
    public List<MemberResponseDto> getMemberList() {
        List<MemberResponseDto> member = MemberRepository.findAll();
    }

}