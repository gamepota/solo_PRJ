package com.solo_prj.mapper;

import com.solo_prj.domain.Player;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PlayerMapper {

    @Insert("""
            INSERT INTO player(nickName, ancestry, classes, level, religion)
            VALUES (#{nickName},#{ancestry},#{classes},#{level},#{religion})
                        """)
    int insert(Player player);

    @Select("""
            SELECT *
            FROM player
            """)
    Player selectById(Integer id);
}
