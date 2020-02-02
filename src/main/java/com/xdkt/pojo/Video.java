package com.xdkt.pojo;


import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Video {
    private Integer id;

    private String title;

    private String summary;

    private String coverImg;

    private Integer viewNum;

    private BigDecimal price;

    private Date createTime;

    private Integer online;

    private Double point;


}