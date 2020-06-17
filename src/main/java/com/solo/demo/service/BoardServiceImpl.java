package com.solo.demo.service;

import com.solo.demo.entity.Board;

import com.solo.demo.repository.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BoardServiceImpl implements BoardService {
    @Autowired
    private BoardDAO dao;
    @Override
    public void register(Board board) throws Exception {
        dao.create(board);
    }
    @Override
    public Board read(Integer boardNo) throws Exception {
        return dao.read(boardNo);
    }
    @Override
    public void modify(Board board) throws Exception {
        dao.update(board);
    }
    @Override
    public void remove(Integer boardNo) throws Exception {
        dao.delete(boardNo);
    }
    @Override
    public List<Board> list() throws Exception {
        return dao.list();
    }
}
