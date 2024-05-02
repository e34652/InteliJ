package com.example.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
@ResponseBody
public class youtubeApiController {

            switch (player.getPlayerState()) {
        case YT.PlayerState.PLAYING:
            // Player is playing
            console.log("Player is playing");
            break;
        case YT.PlayerState.PAUSED:
            // Player is paused
            console.log("Player is paused");
            break;
        case YT.PlayerState.ENDED:
            // Player has ended
            console.log("Player has ended");
            break;
        case YT.PlayerState.BUFFERING:
            // Player is buffering
            console.log("Player is buffering");
            break;
        case YT.PlayerState.CUED:
            // Player is cued
            console.log("Player is cued");
            break;
        default:
            // Default case
            console.log("Player state not recognized");
    }
}
