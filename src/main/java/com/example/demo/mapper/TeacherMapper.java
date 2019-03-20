package com.example.demo.mapper;

import com.example.demo.pojo.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TeacherMapper {
    @Delete({
        "delete from teacher",
        "where Tno = #{tno,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String tno);

    @Insert({
        "insert into teacher (Tno, Tname, ",
        "Tsex, Tbirthday, ",
        "Prof, Depart)",
        "values (#{tno,jdbcType=VARCHAR}, #{tname,jdbcType=VARCHAR}, ",
        "#{tsex,jdbcType=VARCHAR}, #{tbirthday,jdbcType=TIMESTAMP}, ",
        "#{prof,jdbcType=VARCHAR}, #{depart,jdbcType=VARCHAR})"
    })
    int insert(Teacher record);

    int insertSelective(Teacher record);

    @Select({
        "select",
        "Tno, Tname, Tsex, Tbirthday, Prof, Depart",
        "from teacher",
        "where Tno = #{tno,jdbcType=VARCHAR}"
    })
    @ResultMap("com.example.demo.mapper.TeacherMapper.BaseResultMap")
    Teacher selectByPrimaryKey(String tno);

    int updateByPrimaryKeySelective(Teacher record);

    @Update({
        "update teacher",
        "set Tname = #{tname,jdbcType=VARCHAR},",
          "Tsex = #{tsex,jdbcType=VARCHAR},",
          "Tbirthday = #{tbirthday,jdbcType=TIMESTAMP},",
          "Prof = #{prof,jdbcType=VARCHAR},",
          "Depart = #{depart,jdbcType=VARCHAR}",
        "where Tno = #{tno,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Teacher record);
}