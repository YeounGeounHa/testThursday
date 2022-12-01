package com.example.spatra.repository;

import com.example.spatra.entity.MemberResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<MemberResponseDto, Long> {

}
