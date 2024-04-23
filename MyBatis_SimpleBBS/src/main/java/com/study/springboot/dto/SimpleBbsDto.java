package com.study.springboot.dto;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class SimpleBbsDto {
    private int id;
    private String writer;
    private String title;
    private String content;
}
