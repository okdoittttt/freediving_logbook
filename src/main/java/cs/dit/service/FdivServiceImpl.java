package cs.dit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cs.dit.domain.FdivVO;
import cs.dit.mapper.FdivMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FdivServiceImpl implements FdivService {
	
	private final FdivMapper mapper;

	@Override
	public List<FdivVO> getList() {

		return mapper.getList();
	}

	@Override
	public FdivVO get(Long num) {
		
		return mapper.read(num);
	}

	@Override
	public int register(FdivVO fdiv) {
		
		return mapper.insert(fdiv);
	}

	@Override
	public int modify(FdivVO fdiv) {
		
		return mapper.update(fdiv);
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
