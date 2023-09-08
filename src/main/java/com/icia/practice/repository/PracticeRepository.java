package com.icia.practice.repository;

import com.icia.practice.dto.PracticeDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PracticeRepository {

    @Autowired
    private SqlSessionTemplate sql;
    public void save(PracticeDTO practiceDTO) {
        sql.insert("Practice.save",practiceDTO);
    }

    public PracticeDTO login(PracticeDTO practiceDTO) {
        return sql.selectOne("Practice.login", practiceDTO);
    }
}
