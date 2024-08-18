package com.controller;

import com.mapper.LesserFileMgrMapper;
import com.model.Result;
import com.pojo.result.LesserFileInfoResult;
import com.services.LesserPanUploadFileService;
import com.services.SegmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.io.InputStream;

@Controller
@RequestMapping("/root")
public class LesserPanController {

    @Autowired
    private LesserPanUploadFileService lesserPanUploadFileService;

    @Autowired
    private LesserFileMgrMapper mgrMapper;

    @Autowired
    private SegmentService segmentService;

    @RequestMapping(value = "/healtchk", method = RequestMethod.GET)
    @ResponseBody
    public String lesserHealthChk () {
        return "it's ok!!!";
    }

    @RequestMapping(value = "/fileId", method = RequestMethod.GET)
    @ResponseBody
    public LesserFileInfoResult qryByLesserFileId (@RequestParam("fileId") String fileId) {
        return mgrMapper.qryByFileId(fileId);
    }


    @RequestMapping(value = "/uploadFile", method = RequestMethod.GET)
    @ResponseBody
    public void uploadFile (MultipartFile file) throws IOException {
        lesserPanUploadFileService.fileUpload(file);
    }

    @RequestMapping(value = "/getGenId", method = RequestMethod.GET)
    @ResponseBody
    public Result getId () {
        return segmentService.getId("FileId");
    }


}
