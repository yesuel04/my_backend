package study.project_study.Repository;

import org.springframework.data.repository.CrudRepository;
import study.project_study.entity.Member;

import java.util.ArrayList;

public interface MemberRepository extends CrudRepository<Member, Long> {

    @Override
//    Optional<Member> findById(Long id);
    ArrayList<Member> findAll();
}
