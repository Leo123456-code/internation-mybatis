package com.xdkt.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xdkt.pojo.Video;
import com.xdkt.pojo.VideoQueryVo;
import com.xdkt.service.VideoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * created by Leo徐忠春
 * created Time 2020/1/10-9:46
 * email 1437665365@qq.com
 */
@Slf4j
@RestController
@RequestMapping("/video")
public class VideoController {
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Autowired
    private VideoService videoService;

    @GetMapping("/findAll")
    public List<Video> findAll(){

        return videoService.findAll();
    }

    @PostMapping("/selectByIdList")
    public List<Video> selectByIdList(@RequestBody VideoQueryVo vo){

//        List<Integer> list = Arrays.asList(4, 5, 6);
        List<Video> videos = videoService.findByIdList(vo.getList());
        log.info("result={}",gson.toJson(videos));
        return videos;
    }
    
    @GetMapping("/update")
    public Object update(Integer id,String title){
        Video video = new Video();

        video.setTitle(title);
//        video.setCoverImg("1548916165");
//        video.setPoint(231313D);
//        video.setViewNum(11212);
//        video.setCreateTime(new Date());
//        video.setOnline(1);
//        video.setPrice(new BigDecimal(155.26));
//        video.setSummary("131645659");
        video.setId(id);

        return videoService.updateByPrimaryKeySelective(video);
    }
    
    @DeleteMapping("/delete")
    public Object delete(Integer id){

        return videoService.deleteByPrimaryKey(id);
    }

    @PostMapping("/insert")
    public Object insert(@RequestBody Video video){


        return videoService.insertSelect(video);
    }

    @PostMapping("/insertTwo")
    public Object insertTwo(@RequestBody Video video){
        return videoService.insert(video);

    }

}


