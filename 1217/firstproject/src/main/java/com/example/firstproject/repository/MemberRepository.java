package com.example.firstproject.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.firstproject.entity.Member;

public interface MemberRepository extends CrudRepository<Member, Long> {
}
