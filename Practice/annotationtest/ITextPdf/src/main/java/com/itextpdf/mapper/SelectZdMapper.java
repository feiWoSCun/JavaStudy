package com.itextpdf.mapper;

import com.itextpdf.entity.Rsvo;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface SelectZdMapper {
   /* @MapKey("nr")*/
  List<Rsvo> selectAll(@Param("bdzw") String bdzw);
    List<Map<String,String>> selectBdName();
    List<String> selectTest(@Param("bdzw")String bdzw);
}
