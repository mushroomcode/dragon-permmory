package com.services;

import com.common.CommonTimeDate;
import com.common.LesserPanUIDGenCommon;
import com.constant.ClientConstant;
import com.mapper.LesserFileMgrMapper;
import com.model.Result;
import com.pojo.dto.FileInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

@Service
public class LesserPanUploadFileService  {

    @Autowired
    private LesserFileMgrMapper lesserFileMgrMapper;

    @Autowired
    private LesserPanUIDGenCommon lesserPanUIDGenCommon;

    @Autowired
    private CommonTimeDate commonTimeDate;

    @Autowired
    private SegmentService segmentService;

    public void fileUpload(MultipartFile file) {
        // 获取文件 Id 信息
        Result result = segmentService.getId("FileId");
        // 添加文件信息表数据
//        long id = result.getId();
        FileInfoDTO fileInfoDTO = new FileInfoDTO();
        fileInfoDTO.setFileId(result.getId());
        fileInfoDTO.setFileName(file.getOriginalFilename());
        fileInfoDTO.setFilePath("");
        fileInfoDTO.setType(ClientConstant.FILE_JPG_SIZE);
        fileInfoDTO.setStatus(ClientConstant.FILE_STATUS_ACTIVE);
        fileInfoDTO.setUploadTime(commonTimeDate.getCurrentTime("yyyy-MM-dd HH:MM:SS"));
        fileInfoDTO.setUploadUser("");
        lesserFileMgrMapper.insertFile(fileInfoDTO);
    }

}
