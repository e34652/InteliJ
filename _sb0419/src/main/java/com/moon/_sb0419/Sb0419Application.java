package com.moon._sb0419;

import com.moon._sb0419.entity.Notice;
import com.moon._sb0419.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.stream.IntStream;

@SpringBootApplication
@RequiredArgsConstructor
public class Sb0419Application {
    private final NoticeRepository noticeRepository;

    public static void main(String[] args) {
        SpringApplication.run(Sb0419Application.class, args);
    }

    @PostConstruct
    private void init() {
        IntStream.rangeClosed(1, 15).forEach(i->{
            Notice notice = Notice.builder()
                    .title("제목"+i)
                    .content("내용"+i)
                    .build();
            noticeRepository.insertNotice(notice);
        });
    }
}
