package cs.dit.mapper;

import java.util.List;

import cs.dit.domain.SdivVO;

public interface SdivMapper {
	
	public List<SdivVO>sgetList();
	
	public int insert(SdivVO sdiv);

	public SdivVO selectOne(Long num);
	
	public int delete(Long num);
	
	public int update(SdivVO sdiv);
	
	public SdivVO read(Long num);
	
	public int counter();

}
