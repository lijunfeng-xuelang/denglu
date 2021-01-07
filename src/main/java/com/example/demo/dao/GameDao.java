package com.example.demo.dao;

import com.example.demo.domain.Game;

import java.util.List;

public interface GameDao {
    //接口中的方法是依据客户的需求写的（表格内容）
    int saveGame(Game game); //保存游戏
    List<Game> findAllGame(Game game); //查询所有的游戏
}




