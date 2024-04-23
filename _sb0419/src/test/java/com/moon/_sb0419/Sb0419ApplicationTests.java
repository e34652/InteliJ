package com.moon._sb0419;

import com.moon._sb0419.entity.Notice;
import com.moon._sb0419.repository.NoticeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDateTime;
import java.util.stream.IntStream;

@SpringBootTest
@RequestMapping
class Sb0419ApplicationTests {

    @Autowired
    NoticeRepository noticeRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void insert(){
        IntStream.rangeClosed(1, 100).forEach(i->{
            Notice notice = Notice.builder()
                    .title("제목"+i)
                    .content("내용"+i)
                    .build();
            noticeRepository.save(notice);
        });
    }


    @Test
    void count(){
        System.out.println("-----------------------------");
        System.out.println(noticeRepository.selectCount());
        System.out.println("-----------------------------");


        Pageable pageable = PageRequest.of(9, 10);
        Page<Notice> result = noticeRepository.findAll(pageable);
        System.out.println("-----------------------------");
        System.out.println("총 페이지 수: " + result.getTotalPages());
        System.out.println("다음 페이지: " + result.hasNext());
        System.out.println("현재 페이지: " + result.getNumber());
        System.out.println("-----------------------------");

    }

    @Test
    public void findById(){

        Notice notice = Notice.builder()
                .title("제목")
                .content("내용")
                .regdate(LocalDateTime.now())
                .build();

    noticeRepository.save(notice);
        Notice notice1 = noticeRepository.findById(2L).orElse(null);
        System.out.println("----------------------");
        System.out.println(notice1);
        System.out.println("----------------------");

    }
}
