package cs.dit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cs.dit.domain.SdivVO;
import cs.dit.mapper.SdivMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SdivServiceImpl implements SdivService {

	private final SdivMapper mapper;
	
	@Override
	public List<SdivVO> sgetList() {
		
		return mapper.sgetList();
	}
	
	@Override
	public SdivVO get(Long num) {
		
		return mapper.read(num);
	}
	@Override
	public int register(SdivVO sdiv) {

		return mapper.insert(sdiv);
	}

	@Override
	public int modify(SdivVO sdiv) {

		return mapper.update(sdiv);
	}

	@Override
	public int remove(Long num) {
		
		return mapper.delete(num);
	}

	@Override
	public int counter() {
		
		return mapper.counter();
	}

}
