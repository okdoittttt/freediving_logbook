package cs.dit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cs.dit.domain.BudyVO;
import cs.dit.mapper.BudyMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BudyServiceImpl implements budyService {
	
	private final BudyMapper mapper;

	@Override
	public List<BudyVO> getList() {

		return mapper.getList();
	}

	@Override
	public BudyVO get(Long num) {

		return mapper.read(num);
	}

	@Override
	public int register(BudyVO budy) {

		return mapper.insert(budy);
	}

	@Override
	public int modify(BudyVO budy) {

		return mapper.update(budy);
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
