package io.turntabl.leaderboardservice.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(controllers = LeaderboardController.class)
class LeaderboardControllerTest
{
    @Autowired
    private MockMvc mvc;


    @Test
    public void getLeaderboard()
    {
//        mvc.perform(MockMvcRequestBuilders
//                .get("/leaderboard"))
//                .accep
    }



}
