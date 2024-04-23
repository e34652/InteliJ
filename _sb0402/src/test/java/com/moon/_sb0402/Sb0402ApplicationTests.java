package com.moon._sb0402;

import com.moon._sb0402.entity.MyData;
import com.moon._sb0402.repository.MyDataRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
class Sb0402ApplicationTests {

    @Autowired
    MyDataRepository myDataRepository;

    @Test
    void contextLoads() {
        IntStream.rangeClosed(1,10).forEach(i->{
            MyData myData = MyData.builder()
                    .age(20+i)
                    .mail("gom"+i+"@korea.com")
                    .name("moon"+i)
                    .memo("메모"+i)
            .build();
            myDataRepository.save(myData);
        });
    }

    @Test
    void updateMyData(){
        MyData myData = MyData.builder()
                .id(1L)
                .age(31)
                .mail("gom@korea.com")
                .name("moon31")
                .memo("메모31")
                .build();
        myDataRepository.save(myData);
    }

    @Test
    void selectMyDataList(){
        List<MyData> list = myDataRepository.findAll();
        list.stream().forEach(m->{
            System.out.println(m);
        });
//        for(MyData myData : list){
//            System.out.println(myData);
//        }
    }

    @Test
    void selectByIdBetween(){
        List<MyData> list = myDataRepository.findByIdBetweenAndId(5L, 10L);
        list.stream().forEach(m->{
            System.out.println(m);
        });
    }
    @Test
    void selectById(){
        Optional<MyData> myData = myDataRepository.findById(100L);
        if(myData.isPresent()) {
            System.out.println(myData.get());
        }else{
            System.out.println("자료없음");
        }
    }

    @Test
    void deleteById(){
        myDataRepository.deleteById(10L);
    }
}
