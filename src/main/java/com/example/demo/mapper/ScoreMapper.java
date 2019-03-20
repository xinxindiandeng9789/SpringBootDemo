package com.example.demo.mapper;

import com.example.demo.pojo.Score;
import com.example.demo.pojo.ScoreKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ScoreMapper {
    @Delete({
        "delete from score",
        "where Sno = #{sno,jdbcType=INTEGER}",
          "and Cno = #{cno,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(ScoreKey key);

    @Insert({
        "insert into score (Sno, Cno, Degree)",
        "values (#{sno,jdbcType=INTEGER}, #{cno,jdbcType=CHAR}, #{degree,jdbcType=DECIMAL})"
    })
    int insert(Score record);

    int insertSelective(Score record);

    @Select({
        "select",
        "Sno, Cno, Degree",
        "from score",
        "where Sno = #{sno,jdbcType=INTEGER}",
          "and Cno = #{cno,jdbcType=CHAR}"
    })
    @ResultMap("com.example.demo.mapper.ScoreMapper.BaseResultMap")
    Score selectByPrimaryKey(ScoreKey key);

    int updateByPrimaryKeySelective(Score record);

    @Update({
        "update score",
        "set Degree = #{degree,jdbcType=DECIMAL}",
        "where Sno = #{sno,jdbcType=INTEGER}",
          "and Cno = #{cno,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Score record);
}