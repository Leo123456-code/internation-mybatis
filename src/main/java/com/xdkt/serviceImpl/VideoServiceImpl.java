package com.xdkt.serviceImpl;

import com.xdkt.dao.VideoMapper;
import com.xdkt.pojo.Video;
import com.xdkt.service.VideoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2020/1/10-9:30
 * email 1437665365@qq.com
 */
@Service
@Slf4j
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> findAll() {

        return videoMapper.findAll();
    }

    @Override
    public List<Video> findByIdList(List<Integer> videoIdList) {

        return videoMapper.selectvideoIdList(videoIdList);
    }

    @Override
    public Object insert(Video video) {

        video.setCoverImg("我爱你");
        video.setOnline(188);
        video.setPoint(1.89d);
        video.setViewNum(189);
        video.setCreateTime(new Date());
        return videoMapper.insert(video);
    }

    @Override
    public int updateByPrimaryKeySelective(Video video) {

        return videoMapper.updateByPrimaryKeySelective(video);
    }


    @Override
    public int deleteByPrimaryKey(Integer id) {
        int row = videoMapper.deleteByPrimaryKey(id);
        if(row==0){
           throw new RuntimeException();
        }
        return row;
    }

    @Override
    public Object insertSelect(Video video) {
       video.setPrice(new BigDecimal(15898.5));
       video.setOnline(1);
       video.setPoint(8.8D);
        return videoMapper.insertSelective(video);
    }

}
