package com.highgarden.springboot_board.service;

import com.highgarden.springboot_board.dto.BoardDTO;
import com.highgarden.springboot_board.dto.BoardFileDTO;
import com.highgarden.springboot_board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
   private final BoardRepository boardRepository;

    public void save(BoardDTO boardDto) throws IOException {
       if(boardDto.getBoardFile().get(0).isEmpty()) {
           //파일이 없음
           boardDto.setFileAttached(0);
           boardRepository.save(boardDto);
       }else{
           //파일이 존재
           boardDto.setFileAttached(1);
           //board 를 먼저 insert 함
           BoardDTO savedBoard = boardRepository.save(boardDto);
           //파일처리후 boardfile insert
           for(MultipartFile boardFile : boardDto.getBoardFile()){
               String originalFilename = boardFile.getOriginalFilename();
               String storedFilename = System.currentTimeMillis()+ "_"+originalFilename;

               BoardFileDTO boardFileDTO = new BoardFileDTO();
               boardFileDTO.setOriginalFileName(originalFilename);
               boardFileDTO.setStoredFileName(storedFilename);
               boardFileDTO.setBoardId(savedBoard.getId());
               String savePath = "C:\\springboot-board\\src\\main\\resources\\upload_files\\/"+storedFilename;
               //실질적으로 파일이 저장되는 코드
               boardFile.transferTo(new File(savePath));
               boardRepository.saveFile(boardFileDTO);

           }

       }
    }

    public List<BoardDTO> findAll() {
        return boardRepository.findAll();
    }

//클릭횟수
    public void updateHits(Long id) {
        boardRepository.updateHits(id);
    }
    public BoardDTO findById(Long id) {
        return boardRepository.findById(id);
    }

    public void update(BoardDTO boardDTO) {
        boardRepository.update(boardDTO);
    }

    public void delete(Long id) {
        boardRepository.delete(id);
    }

    public List<BoardFileDTO> findFile(Long id) {
        return boardRepository.findFile(id);
    }
}
