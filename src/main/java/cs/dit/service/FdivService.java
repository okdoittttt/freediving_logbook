package cs.dit.service;

import java.util.List;

import cs.dit.domain.FdivVO;

public interface FdivService {
	
	public List<FdivVO> getList();
	
	public FdivVO get(Long num);
	
	public int register(FdivVO fdiv);
	
	public int modify(FdivVO fdiv);
	
	public int remove(Long num);
	
	public int counter();

}
