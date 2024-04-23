package com.moon._sb0402.repository;

import com.moon._sb0402.entity.MyData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyDataRepository extends JpaRepository<MyData, Long> {

    List<MyData> findByIdBetweenAndId(Long id1, Long id2);
}
