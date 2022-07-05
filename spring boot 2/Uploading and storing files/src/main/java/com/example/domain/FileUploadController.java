package com.example.domain;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

  Integer fileIndex = 0;
  Map<Integer, String> fileList = new HashMap<>();

  public Map<Integer, String> getFileList() {
    return fileList;
  }

  @RequestMapping(value="/upload", method=RequestMethod.GET)
  public @ResponseBody String provideUploadInfo() {
    return "Вы можете загружать файл с использованием того же URL.";
  }

  @RequestMapping(value="file", method=RequestMethod.POST)
  public @ResponseBody String handleFileUpload(@RequestParam("name") String name,
      @RequestParam("file") MultipartFile file){
    if (!file.isEmpty()) {
      if(name != null) {
        try {
          byte[] bytes = file.getBytes();
          BufferedOutputStream stream =
              new BufferedOutputStream(new FileOutputStream(new File(name + " - загружен")));
          stream.write(bytes);
          stream.close();
          fileIndex++;
          fileList.put(fileIndex, name);

          return "Вы удачно загрузили " + name + " в " + name + "-uploaded !";

        } catch (Exception e) {
          return "Вам не удалось загрузить " + name + " => " + e.getMessage();
        }
      }
      else
        return "Введите имя фаила!";

    } else {
      return "Вам не удалось загрузить " + name + " потому что файл пустой.";
    }
  }

}