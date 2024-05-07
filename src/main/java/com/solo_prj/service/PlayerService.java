package com.solo_prj.service;


import com.solo_prj.domain.Player;
import com.solo_prj.mapper.PlayerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class PlayerService {

    private final PlayerMapper mapper;

    public void create(Player player, Authentication authentication) {
        mapper.insert(player);
    }

    public Player get(Integer id) {
        return mapper.selectById(id);
    }
}
