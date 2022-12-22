package cs.dit.service;

import java.util.List;

import cs.dit.domain.SdivVO;

public interface SdivService {
	
	public List<SdivVO> sgetList();
	
	public SdivVO get(Long num);
	
	public int register(SdivVO sdiv);
	
	public int modify(SdivVO sdiv);
	
	public int remove(Long num);
	
	public int counter();
	

}
