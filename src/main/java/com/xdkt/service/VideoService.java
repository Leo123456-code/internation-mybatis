package com.xdkt.service;

import com.xdkt.pojo.Video;

import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2020/1/10-9:28
 * email 1437665365@qq.com
 */
public interface VideoService {
    //查询所有
    List<Video> findAll();
    //根据Id查询
    List<Video> findByIdList(List<Integer> videoIdList);
    //增加
    Object insert(Video video);
    //修改
    int updateByPrimaryKeySelective(Video video);
    //删除
    int deleteByPrimaryKey(Integer id);
    //新增
    Object insertSelect(Video video);


}
