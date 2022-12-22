package cs.dit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cs.dit.domain.BoardVO;
import cs.dit.domain.BudyVO;
import cs.dit.domain.DdivVO;
import cs.dit.domain.FdivVO;
import cs.dit.domain.SdivVO;
import cs.dit.service.BoardService;
import cs.dit.service.DdivService;
import cs.dit.service.FdivService;
import cs.dit.service.SdivService;
import cs.dit.service.budyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
@Log4j
public class BoardController {
	
	private final BoardService service;
	private final SdivService sdiv;
	private final FdivService fservice;
	private final DdivService dservice;
	private final budyService budyservice;
	
	
//	Sno Sdiv List ------------------------------------------------------------------------------------------------------
	@GetMapping("/list")
	public void getList(Model model) {	// 게시글을 받아온 후 화면으로 이동하기 위해 model 사용.
		
		log.info("GetList Controller 2.......................................................");
		
		
		int title = 2;
		
		if(title == 1) {
			model.addAttribute("list", service.getList());	// (key, value) | requestScope에 저장하는 것 처럼 Model에 저장하도록 함.
			model.addAttribute("counter", service.counter());	// (key, value) | requestScope에 저장하는 것 처럼 Model에 저장하도록 함.			
		} else {			
			model.addAttribute("slist", sdiv.sgetList());
		}
	}
	
	@GetMapping("/register")
	public void registerGET() {
	}
	
	@PostMapping("/register")
	public String register(SdivVO sdivs, RedirectAttributes rttr) {
		log.info("Controller Insert .......................................................");
		
		int count = sdiv.register(sdivs);
		
		if(count == 1)
			rttr.addFlashAttribute("result", "registered");
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/getOne")
	public void getOne(@RequestParam("num") Long num, Model model) {
		log.info("get.................");
	    
	    model.addAttribute("sdiv", sdiv.get(num));
	
	}
	
	@PostMapping("/modify")
	public String modify(SdivVO sdivs, RedirectAttributes rttr) {
		log.info("Controller Update .......................................................");
		
		int count = sdiv.modify(sdivs);
		
		if(count == 1)
			rttr.addFlashAttribute("result", "modified");
		
		return "redirect:/board/list";
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("num") Long num, RedirectAttributes rttr) {
		
		log.info("Controller delete .......................................................");
		
		int count = sdiv.remove(num);
		
		if(count == 1)
			rttr.addFlashAttribute("result", "removed");
		
		return "redirect:/board/list";
	}
	
//	Fun Div List ------------------------------------------------------------------------------------------------------	
	@GetMapping("/flist")
	public void fgetList(Model model) {	// 게시글을 받아온 후 화면으로 이동하기 위해 model 사용.
		
		log.info("GetList F List OK .......................................................");
		
		model.addAttribute("list", fservice.getList());
	}
	
	@GetMapping("/fregister")
	public void fregisterGET() {
	}
	
	@PostMapping("/fregister")
	public String fregister(FdivVO fdivs, RedirectAttributes rttr) {
		log.info("Controller Insert .......................................................");
		
		int count = fservice.register(fdivs);
		
		if(count == 1)
			rttr.addFlashAttribute("result", "registered");
		
		return "redirect:/board/flist";
	}
	
	@GetMapping("/fgetOne")
	public void fgetOne(@RequestParam("num") Long num, Model model) {
		log.info("get.................");
	    
	    model.addAttribute("sdiv", fservice.get(num));
	
	}
	
	@PostMapping("/fmodify")
	public String modify(FdivVO fdivs, RedirectAttributes rttr) {
		log.info("Controller Update .......................................................");
		
		int count = fservice.modify(fdivs);
		
		if(count == 1)
			rttr.addFlashAttribute("result", "modified");
		
		return "redirect:/board/flist";
	}
	
	@PostMapping("/fremove")
	public String fremove(@RequestParam("num") Long num, RedirectAttributes rttr) {
		
		log.info("Controller delete .......................................................");
		
		int count = fservice.remove(num);
		
		if(count == 1)
			rttr.addFlashAttribute("result", "removed");
		
		return "redirect:/board/flist";
	}
	
//	Deep Div List ------------------------------------------------------------------------------------------------------	
	@GetMapping("/dlist")
	public void dgetList(Model model) {	// 게시글을 받아온 후 화면으로 이동하기 위해 model 사용.
		
		log.info("GetList F List OK .......................................................");
		
		model.addAttribute("list", dservice.getList());
	}
	
	@GetMapping("/dregister")
	public void dregisterGET() {
	}
	
	@PostMapping("/dregister")
	public String dregister(DdivVO ddivs, RedirectAttributes rttr) {
		log.info("Controller Insert .......................................................");
		
		int count = dservice.register(ddivs);
		
		if(count == 1)
			rttr.addFlashAttribute("result", "registered");
		
		return "redirect:/board/dlist";
	}
	
	@GetMapping("/dgetOne")
	public void dgetOne(@RequestParam("num") Long num, Model model) {
		log.info("get.................");
	    
	    model.addAttribute("sdiv", dservice.get(num));
	
	}
	
	@PostMapping("/dmodify")
	public String dmodify(DdivVO ddivs, RedirectAttributes rttr) {
		log.info("Controller Update .......................................................");
		
		int count = dservice.modify(ddivs);
		
		if(count == 1)
			rttr.addFlashAttribute("result", "modified");
		
		return "redirect:/board/flist";
	}
	
	@PostMapping("/dremove")
	public String dremove(@RequestParam("num") Long num, RedirectAttributes rttr) {
		
		log.info("Controller delete .......................................................");
		
		int count = dservice.remove(num);
		
		if(count == 1)
			rttr.addFlashAttribute("result", "removed");
		
		return "redirect:/board/dlist";
	}
	
//	Budy List ------------------------------------------------------------------------------------------------------
	@GetMapping("/budylist")
	public void budygetList(Model model) {	// 게시글을 받아온 후 화면으로 이동하기 위해 model 사용.
		
		log.info("GetList Controller 2.......................................................");
		
		
		int title = 2;
		
		if(title == 1) {
			model.addAttribute("list", budyservice.getList());	// (key, value) | requestScope에 저장하는 것 처럼 Model에 저장하도록 함.
			model.addAttribute("counter", budyservice.counter());	// (key, value) | requestScope에 저장하는 것 처럼 Model에 저장하도록 함.			
		} else {			
			model.addAttribute("budy", budyservice.getList());
		}
	}
	
	@GetMapping("/budyregister")
	public void budyregisterGET() {
	}
	
	@PostMapping("/budyregister")
	public String budyregister(BudyVO budy, RedirectAttributes rttr) {
		log.info("Controller Insert .......................................................");
		
		int count = budyservice.register(budy);
		
		if(count == 1)
			rttr.addFlashAttribute("result", "registered");
		
		return "redirect:/board/budylist";
	}
	
	@GetMapping("/budygetOne")
	public void budygetOne(@RequestParam("num") Long num, Model model) {
		log.info("get.................");
	    
	    model.addAttribute("budy", budyservice.get(num));
	
	}
	
	@PostMapping("/budymodify")
	public String budymodify(BudyVO budy, RedirectAttributes rttr) {
		log.info("Controller Update .......................................................");
		
		int count = budyservice.modify(budy);
		
		if(count == 1)
			rttr.addFlashAttribute("result", "modified");
		
		return "redirect:/board/budylist";
	}
	
	@PostMapping("/budyremove")
	public String budyremove(@RequestParam("num") Long num, RedirectAttributes rttr) {
		
		log.info("Controller delete .......................................................");
		
		int count = budyservice.remove(num);
		
		if(count == 1)
			rttr.addFlashAttribute("result", "removed");
		
		return "redirect:/board/budylist";
	}
	
}
