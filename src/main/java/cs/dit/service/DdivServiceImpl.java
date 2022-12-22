package cs.dit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cs.dit.domain.DdivVO;
import cs.dit.mapper.DdivMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DdivServiceImpl implements DdivService {

	private final DdivMapper mapper;
	
	@Override
	public List<DdivVO> getList() {
		// TODO Auto-generated method stub
		return mapper.getList();
	}

	@Override
	public DdivVO get(Long num) {
		// TODO Auto-generated method stub
		return mapper.read(num);
	}

	@Override
	public int register(DdivVO ddiv) {
		// TODO Auto-generated method stub
		return mapper.insert(ddiv);
	}

	@Override
	public int modify(DdivVO ddiv) {
		// TODO Auto-generated method stub
		return mapper.update(ddiv);
	}

	@Override
	public int remove(Long num) {
		// TODO Auto-generated method stub
		return mapper.delete(num);
	}

	@Override
	public int counter() {
		// TODO Auto-generated method stub
		return mapper.counter();
	}

}
