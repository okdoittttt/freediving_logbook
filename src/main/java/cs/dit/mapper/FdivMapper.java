package cs.dit.mapper;

import java.util.List;

import cs.dit.domain.FdivVO;

public interface FdivMapper {
	
	public List<FdivVO>getList();
	
	public int insert(FdivVO fdiv);
	
	public FdivVO selectOne(Long num);
	
	public int delete(Long num);
	
	public int update(FdivVO fdiv);

	public FdivVO read(Long num);
	
	public int counter();

}
