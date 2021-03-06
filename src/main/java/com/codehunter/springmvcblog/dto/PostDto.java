package com.codehunter.springmvcblog.dto;

import java.time.Instant;

import lombok.Data;

@Data
public class PostDto {
  private String id;
  private String title;
  private String content;
  private Instant createdDate;
}
