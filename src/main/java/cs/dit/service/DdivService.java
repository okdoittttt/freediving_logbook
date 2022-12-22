package cs.dit.service;

import java.util.List;

import cs.dit.domain.DdivVO;

public interface DdivService {
	
	public List<DdivVO> getList();
	
	public DdivVO get(Long num);
	
	public int register(DdivVO ddiv);
	
	public int modify(DdivVO ddiv);
	
	public int remove(Long num);
	
	public int counter();

}
