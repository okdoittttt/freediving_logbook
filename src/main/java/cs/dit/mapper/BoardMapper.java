package cs.dit.mapper;

import java.util.List;

import cs.dit.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO>getList();
	
	public int insert(BoardVO board);
	
	public BoardVO selectOne(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO board);

	public BoardVO read(Long bno);
	
	public int counter();
}
