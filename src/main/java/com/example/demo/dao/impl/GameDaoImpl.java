package com.example.demo.dao.impl;

import com.example.demo.dao.GameDao;
import com.example.demo.domain.Game;
import com.example.demo.util.BashDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GameDaoImpl extends BashDao implements GameDao {
    @Override
    public int saveGame(Game game) {
      String sql = "insert into games(gameName,gameType,gameCompany,gameYear)values(?,?,?,?);";
        return executeUpdate(sql, game.getGameName(), game.getGameType(),
                game.getGameCompany(), game.getGameYear());
    }

    @Override
    public List<Game> findAllGame(Game game) {
       StringBuffer sql = new StringBuffer("select * from games where 1 = 1");
        List<Object> params = new  ArrayList<>(); //储存输入查询的内容
        if (game.getGameName() != null && !"".equals(game.getGameName())){
            sql.append(" and gameName = ?");
            params.add(game.getGameName());
        }
        if (game.getGameType() != null && !"".equals(game.getGameType())){
            sql.append(" and gameType = ?");
            params.add(game.getGameType());
        }
        if (game.getGameCompany() != null && !"".equals(game.getGameCompany())){
            sql.append(" and gameCompany = ?");
            params.add(game.getGameCompany());
        }
        if (game.getGameYear() >=1000&&game.getGameYear()<=9999){
            sql.append("and gameYear = ?");
            params.add(game.getGameYear());
        }
        ResultSet resultSet = executeQuery(sql.toString(),params.toArray());//获取sql和params的内容
        List<Game> games = new ArrayList<>();
        if (resultSet != null)
               try {
                   while (resultSet.next()) {
                   games.add(new Game(
                           resultSet.getInt(1),
                           resultSet.getString(2),
                           resultSet.getString(3),
                           resultSet.getString(4),
                           resultSet.getInt(5)

                   ));
               }
           } catch (SQLException throwables) {
                   throwables.printStackTrace();
               }
            return games;
    }


}

