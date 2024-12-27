package com.highgarden.springboot_board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
@ToString
public class BoardDTO {
    private long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits;
    private String createdAt;
    //아래부터 추가된 필드
    private int fileAttached; //파일 첨부유무
    private List<MultipartFile> boardFile; //업로드시 클라이언드로 부터 넘어오는 파일을 담는다.

}
