package com.solo_prj.controller;

import com.solo_prj.domain.Player;
import com.solo_prj.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService service;

    @GetMapping("/create")
    public String create() {
        return "player/create";
    }

    @PostMapping("/create")
    public String createPost(Player player, Authentication authentication, RedirectAttributes rttr) {

        service.create(player, authentication);

        rttr.addAttribute("id", player.getId());


        return "redirect:/player";
    }

    @GetMapping("/player")
    public String view(Integer id, Model model) {
        Player player = service.get(id);
        model.addAttribute("player", player);
        return "player/view";
    }

}
