package com.example.spatra.entity;

import com.example.spatra.repository.MemberRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class MemberResponseDto {

    private Long id;
    private String name;
    private String email;
    private String pw;

    public MemberResponseDto(Long id,String name,String email,String pw)
    {
     this.id=id;
     this.name=name;
     this.email=email;
     this.pw=pw;
    }

    public MemberResponseDto(MemberResponseDto responseDto) {
        this.id= responseDto.getId();
        this.email = responseDto.getEmail();
        this.name = responseDto.getName();
        this.pw = responseDto.getPw();
    }
}