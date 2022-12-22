package cs.dit.mapper;

import java.util.List;

import cs.dit.domain.DdivVO;

public interface DdivMapper {
	
	public List<DdivVO>getList();
	
	public int insert(DdivVO ddiv);
	
	public DdivVO selectOne(Long num);
	
	public int delete(Long num);
	
	public int update(DdivVO ddiv);

	public DdivVO read(Long num);
	
	public int counter();

}
