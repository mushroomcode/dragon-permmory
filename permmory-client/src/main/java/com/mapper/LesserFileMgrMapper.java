package com.mapper;

import com.pojo.dto.FileInfoDTO;
import com.pojo.result.LesserFileInfoResult;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LesserFileMgrMapper {

    @Select("SELECT FILE_ID AS fileId, FILE_NAME AS fileName FROM haas.PREMMORY_FILE_INFO WHERE FILE_ID = #{fileId} ")
    LesserFileInfoResult qryByFileId(@Param("fileId") String fileId);

    @Insert("INSERT INTO haas.PREMMORY_FILE_INFO (FILE_ID, FILE_NAME,TYPE,FILE_PATH,UPLOAD_USER, UPLOAD_TIMR,STATUS) " +
            "value (#{fileInfoDTO.fileId}, #{fileInfoDTO.fileName}, #{fileInfoDTO.type}, " +
            "#{fileInfoDTO.filePath}, #{fileInfoDTO.uploadUser}, #{fileInfoDTO.uploadTime}, " +
            "#{fileInfoDTO.status})  ")
    int insertFile (@Param("fileInfoDTO") FileInfoDTO fileInfoDTO);

}
