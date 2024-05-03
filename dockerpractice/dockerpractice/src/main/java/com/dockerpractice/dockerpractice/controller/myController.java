package com.sky.fileuploadboard.board.controller;

import com.sky.fileuploadboard.board.dto.BoardDto;
import com.sky.fileuploadboard.board.dto.BoardFileDto;
import com.sky.fileuploadboard.board.service.BoardService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;


import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.net.URLEncoder;
import java.util.List;

@Controller
public class myController {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@RequestMapping("/")
	public String main(Model model) {
	int count = boardMapper.countBoards();
		model.
		return mv;
	}

	}
