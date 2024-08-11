package com.mapper;

import com.pojo.result.LesserFileInfoResult;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LesserFileMgrMapper {

    @Select("SELECT FILE_ID AS fileId, FILE_NAME AS fileName FROM haas.PREMMORY_FILE_INFO WHERE FILE_ID = #{fileId} ")
    LesserFileInfoResult qryByFileId(@Param("fileId") String fileId);

    @Insert(" INSERT FROM  ")
    LesserFileInfoResult insertFile ();

}
