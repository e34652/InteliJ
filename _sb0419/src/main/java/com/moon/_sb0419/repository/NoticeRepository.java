package com.moon._sb0419.repository;

import com.moon._sb0419.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface NoticeRepository extends JpaRepository<Notice, Long> { //(테이블 명, 기본키 타입)

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO notice(title, content, regdate) VALUES(:#{#notice.title}, :#{#notice.content}, CURRENT_TIMESTAMP)", nativeQuery = true)
    public void insertNotice(@Param("notice") Notice notice);

    @Query(value = "select count(*) from notice", nativeQuery = true) // nativeQuery = 실제 쿼리문과 같다, mybatis와 같은 방식
    public Long selectCount();

    @Query(value = "select * from notice order by seq desc", nativeQuery = true)
    public List<Notice> selectOrderSeq();

    public List<Notice> findAllByOrderBySeqDesc(); // <<쿼리메소드 방식

}
