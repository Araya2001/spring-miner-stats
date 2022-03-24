package com.aajdev.springminerstats.service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.IdTokenCredentials;
import com.google.auth.oauth2.IdTokenProvider;
import org.springframework.stereotype.Service;

@Service
public class GoogleCloudAuthServiceImpl implements GoogleCloudAuthService {
  @Override
  public String getToken() {
    try {
      GoogleCredentials credentials = GoogleCredentials.getApplicationDefault();
      if (!(credentials instanceof IdTokenProvider)) {
        throw new IllegalArgumentException("Credentials are not an instance of IdTokenProvider.");
      }
       IdTokenCredentials tokenCredential =
          IdTokenCredentials.newBuilder()
              .setIdTokenProvider((IdTokenProvider) credentials)
              .setTargetAudience("https://test-security-5amr3okdga-uc.a.run.app/")
              .build();

      return tokenCredential.getRequestMetadata().get("Authorization").toString().replace("[", "").replace("]", "").replace("Bearer ", "");
    } catch (Exception ex) {
      ex.printStackTrace();
      return ex.toString();
    }
  }
}
