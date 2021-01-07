package com.example.demo.servlet;

import com.example.demo.dao.GameDao;
import com.example.demo.dao.impl.GameDaoImpl;
import com.example.demo.domain.Game;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/save.do")
public class SaveGamServlet extends HttpServlet { //保存游戏
    private final GameDao gameDao = new GameDaoImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Game game = new Game();
        game.setGameName(req.getParameter("gameName"));
        game.setGameType(req.getParameter("gameType"));
        game.setGameCompany(req.getParameter("gameCompany"));
        game.setGameYear(Integer.valueOf(req.getParameter("gameYear")));
        gameDao.saveGame(game);
        resp.sendRedirect("index.jsp");
    }
}
