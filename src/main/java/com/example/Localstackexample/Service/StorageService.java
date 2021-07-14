package com.example.Localstackexample.Service;

import com.example.Localstackexample.Model.DownloadedResource;
import org.springframework.web.multipart.MultipartFile;

public interface StorageService {
    String upload(MultipartFile multipartFile);
    DownloadedResource download(String id);

}
