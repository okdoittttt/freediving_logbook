package cs.dit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cs.dit.service.FdivService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
@Log4j
public class FdivController {
	
//	private final FdivService service;
//	
//	@GetMapping("/flist")
//	public void getList(Model model) {	// 게시글을 받아온 후 화면으로 이동하기 위해 model 사용.
//		
//		log.info("GetList F List OK .......................................................");
//		
//		model.addAttribute("list", service.getList());
//	}

}
