package com.xdkt.serviceImpl;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xdkt.pojo.Video;
import com.xdkt.service.VideoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2020/1/10-9:31
 * email 1437665365@qq.com
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class VideoServiceImplTest {
    @Autowired
    private VideoService videoService;

    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Test
    public void findAll() {
        List<Video> videos = videoService.findAll();
        log.info("result={}",gson.toJson(videos));
        Assert.assertNotNull(videos);

    }
    @Test
    public void insert() {
        Video video = new Video();
        video.setId(11);
        video.setCoverImg("我爱你");
        video.setOnline(188);
        video.setPoint(1.89d);
        video.setPrice(new BigDecimal(189.98));
        video.setSummary("我为中国");
        video.setTitle("啊去");
        video.setViewNum(189);
        video.setCreateTime(new Date());
         videoService.insert(video);


    }

    @Test
    public void updateByPrimaryKeySelective(Integer id) {
        Video video = new Video();
        video.setId(189);
        video.setTitle("189");
        int row = videoService.updateByPrimaryKeySelective(video);

        if(row==0){
            throw new RuntimeException();
        }
        Assert.assertNotEquals(0,row);
    }

    @Test
    public void deleteByPrimaryKey() {
        int row = videoService.deleteByPrimaryKey(2);
        if(row==0){
            throw new RuntimeException();
        }
        Assert.assertNotEquals(0,row);
    }
}