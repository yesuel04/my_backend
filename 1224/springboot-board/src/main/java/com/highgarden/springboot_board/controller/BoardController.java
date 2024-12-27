package com.highgarden.springboot_board.controller;

import com.highgarden.springboot_board.dto.BoardDTO;
import com.highgarden.springboot_board.dto.BoardFileDTO;
import com.highgarden.springboot_board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.util.List;

@Controller
@RequiredArgsConstructor //생성자 주입(DI)
public class BoardController {
    
    //@Autowired - final 빼고 @Autowired 를 넣어도 되고
    private final BoardService boardService;

    @GetMapping("/save")
    public String save(){
        return "save";
    }

    @PostMapping("/save")
    public String save(BoardDTO boardDto) throws IOException {

        boardService.save(boardDto);
        return "redirect:/list";
    }
    //IOException 이  발생 할 수 있으므로 예외를 throws로 던진다.


    @GetMapping("/list")
    public String findAll(Model model){
       List<BoardDTO> boardDTOList = boardService.findAll();
       model.addAttribute("boardList",boardDTOList);
       return "list";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") Long id, Model model) {
        //조회수 처리
        boardService.updateHits(id);
        //상세내용 가져오기
        BoardDTO boardDTO = boardService.findById(id);
        model.addAttribute("board", boardDTO);
        //파일 첨부 추가된 부분
        if(boardDTO.getFileAttached() == 1){
            List<BoardFileDTO> boardFileDTOList= boardService.findFile(id);
            model.addAttribute("boardFileDTOList", boardFileDTOList);
        }

        return "detail";
    }

//수정버튼 클릭시 수정화면으로 넘어가도록 하는 메서드 (Get)
 @GetMapping("/update/{id}")
 public String update(@PathVariable("id") Long id, Model model){
       BoardDTO boardDTO = boardService.findById(id);
       model.addAttribute("board",boardDTO);
       return "update";
 }
//db에 실질적으로 수정내용을 요청하는 메서드(post)
  @PostMapping("/update/{id}")
  public String update(BoardDTO boardDTO, Model model){
        //update 요청
      boardService.update(boardDTO);
      //findById로 수정된 내용을 다시 조회
     BoardDTO dto = boardService.findById(boardDTO.getId());
     model.addAttribute("board",dto);
     return "detail"; //수정한 내용보기

  }  

@GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        boardService.delete(id);
        return "redirect:/list";
}



}
