package cs.dit.service;

import java.util.List;

import cs.dit.domain.BudyVO;

public interface budyService {
	
	public List<BudyVO> getList();
	
	public BudyVO get(Long num);
	
	public int register(BudyVO budy);
	
	public int modify(BudyVO budy);
	
	public int remove(Long num);
	
	public int counter();

}
