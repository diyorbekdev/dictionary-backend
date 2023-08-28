package com.diyorbek.dictionarybackend.mapper;

import com.diyorbek.dictionarybackend.beans.StudentsBean;
import com.diyorbek.dictionarybackend.beans.base.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mapper
public interface TeatMapper {
    int selectTestCnt(Map<String, Objects> params);
//    List<StudentsBean> selectStudents(Map<String, Objects> params, RowBounds rowBounds);
    List<StudentsBean> selectStudents(Map<String, Objects> params);
//    List<StudentsBean> selectStudents(RowBounds rowBounds);
//    List<StudentsBean> selectStudents();
    @Select("select 1 from dual ")
    int sdfsads();
}
