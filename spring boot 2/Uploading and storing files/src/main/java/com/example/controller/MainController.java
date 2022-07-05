package com.example.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MainController {

  @Value("${upload.path}")
  private String uploadPath;

  @PostMapping("/main")
  public String add(
      @RequestParam("file")MultipartFile file) throws IOException {
    if(file != null && !file.isEmpty()) {
      File uploadDir = new File(uploadPath);

      if(!uploadDir.exists()) {
        uploadDir.mkdir();
      }

      String uuidFile = UUID.randomUUID().toString();
      String resultFileName = uuidFile + "." + file.getOriginalFilename();

      file.transferTo(new File(uploadPath + "/" + resultFileName));
    }
    return "main";
  }

}
