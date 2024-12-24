package study.project_study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import study.project_study.Repository.MemberRepository;
import study.project_study.dto.MemberForm;
import study.project_study.entity.Member;

import java.util.List;

@Controller
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;


    @GetMapping("/member/new")
    public String member(){

        return "/member/m_new";
    }

    @PostMapping("/member/create")
    public String create_mem(MemberForm form){
        System.out.println(form.toString());

        Member member = form.toEntity();
        System.out.println(member.toString());

        Member saved = memberRepository.save(member);
        System.out.println(saved.toString());

        return "redirect:/member/" + saved.getId();
//        return "redirect:/member";
    }

    @GetMapping("/member")
    public String index_mem(Model model){
        List<Member> memberEntityList = memberRepository.findAll();
        model.addAttribute("memberList", memberEntityList);

        return "/member/m_index";
    }

    @GetMapping("/member/{id}")
    public String show_mem(@PathVariable Long id, Model model){
        System.out.println("id = "+id);

        Member memberEntity = memberRepository.findById(id).orElse(null);
        model.addAttribute("member", memberEntity);

        return "member/m_show";
    }
}
