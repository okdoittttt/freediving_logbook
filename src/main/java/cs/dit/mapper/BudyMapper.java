package cs.dit.mapper;

import java.util.List;

import cs.dit.domain.BudyVO;

public interface BudyMapper {
	
	public List<BudyVO>getList();
	
	public int insert(BudyVO budy);
	
	public BudyVO selectOne(Long num);
	
	public int delete(Long num);
	
	public int update(BudyVO budy);

	public BudyVO read(Long num);
	
	public int counter();

}
