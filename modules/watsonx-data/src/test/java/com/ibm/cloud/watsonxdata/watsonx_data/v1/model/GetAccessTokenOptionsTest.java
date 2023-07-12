/*
 * (C) Copyright IBM Corp. 2023.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.watsonxdata.watsonx_data.v1.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetAccessTokenOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetAccessTokenOptions model.
 */
public class GetAccessTokenOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetAccessTokenOptions() throws Throwable {
    GetAccessTokenOptions getAccessTokenOptionsModel = new GetAccessTokenOptions.Builder()
      .instanceName("testString")
      .password("testString")
      .username("admin ibmlhapikey_admin ibmlhtoken_admin ibmlhapikey ibmlhtoken")
      .instanceId("testString")
      .authInstanceId("testString")
      .setCookie(true)
      .build();
    assertEquals(getAccessTokenOptionsModel.instanceName(), "testString");
    assertEquals(getAccessTokenOptionsModel.password(), "testString");
    assertEquals(getAccessTokenOptionsModel.username(), "admin ibmlhapikey_admin ibmlhtoken_admin ibmlhapikey ibmlhtoken");
    assertEquals(getAccessTokenOptionsModel.instanceId(), "testString");
    assertEquals(getAccessTokenOptionsModel.authInstanceId(), "testString");
    assertEquals(getAccessTokenOptionsModel.setCookie(), Boolean.valueOf(true));
  }
}