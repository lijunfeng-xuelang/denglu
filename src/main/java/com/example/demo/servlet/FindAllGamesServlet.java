package com.example.demo.servlet;

import com.example.demo.dao.GameDao;
import com.example.demo.dao.impl.GameDaoImpl;
import com.example.demo.domain.Game;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find.do")
public class FindAllGamesServlet extends HttpServlet {//查询所有的游戏
    private final GameDao gameDao = new GameDaoImpl();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Game game = new Game();
        game.setGameName(req.getParameter("gameName"));
        game.setGameType(req.getParameter("gameType"));
        game.setGameCompany(req.getParameter("gameCompany"));
        try{
            game.setGameYear(Integer.parseInt(req.getParameter("gameYear")));
        } catch (NumberFormatException e) {
            game.setGameYear(-1);
        }
        List<Game> games = gameDao.findAllGame(game);

        req.setAttribute("games", games);
        req.getRequestDispatcher("games.jsp").forward(req, resp);
    }

    }

