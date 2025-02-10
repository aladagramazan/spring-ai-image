package com.rem.springaiimage.service;

import com.rem.springaiimage.model.Question;
import org.springframework.web.multipart.MultipartFile;

public interface OpenAIService {

    byte[] getImage(Question question);

    String getDescription(MultipartFile file);

    byte[] getSpeech(Question question);
}
