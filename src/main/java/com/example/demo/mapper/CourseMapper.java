package com.example.demo.mapper;

import com.example.demo.pojo.Course;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface CourseMapper {
    @Delete({
        "delete from course",
        "where Cno = #{cno,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String cno);

    @Insert({
        "insert into course (Cno, Cname, ",
        "Tno)",
        "values (#{cno,jdbcType=CHAR}, #{cname,jdbcType=VARCHAR}, ",
        "#{tno,jdbcType=VARCHAR})"
    })
    int insert(Course record);

    int insertSelective(Course record);

    @Select({
        "select",
        "Cno, Cname, Tno",
        "from course",
        "where Cno = #{cno,jdbcType=CHAR}"
    })
    @ResultMap("com.example.demo.mapper.CourseMapper.BaseResultMap")
    Course selectByPrimaryKey(String cno);

    int updateByPrimaryKeySelective(Course record);

    @Update({
        "update course",
        "set Cname = #{cname,jdbcType=VARCHAR},",
          "Tno = #{tno,jdbcType=VARCHAR}",
        "where Cno = #{cno,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Course record);
}