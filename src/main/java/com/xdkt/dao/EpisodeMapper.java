package com.xdkt.dao;

import com.xdkt.pojo.Episode;

public interface EpisodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Episode record);

    int insertSelective(Episode record);

    Episode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Episode record);

    int updateByPrimaryKey(Episode record);
}