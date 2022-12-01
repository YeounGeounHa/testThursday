package com.example.spatra.service;

import com.example.spatra.entity.MemberResponseDto;
import com.example.spatra.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public MemberResponseDto findMember(MemberResponseDto responseDto) {
        MemberResponseDto memberResponseDto = new MemberResponseDto(responseDto);
        memberRepository.save(memberResponseDto);
        return memberResponseDto;
    }

    public List<MemberResponseDto> findAllMember() {
        List<String> words =

    }
}