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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateBucketOptions model.
 */
public class UpdateBucketOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateBucketOptions() throws Throwable {
    UpdateBucketOptions updateBucketOptionsModel = new UpdateBucketOptions.Builder()
      .bucketId("samplebucket123")
      .accessKey("<access_key>")
      .bucketDisplayName("sample-bucket-displayname")
      .description("COS bucket for customer data")
      .secretKey("<secret_key>")
      .tags(java.util.Arrays.asList("testbucket", "userbucket"))
      .authInstanceId("testString")
      .build();
    assertEquals(updateBucketOptionsModel.bucketId(), "samplebucket123");
    assertEquals(updateBucketOptionsModel.accessKey(), "<access_key>");
    assertEquals(updateBucketOptionsModel.bucketDisplayName(), "sample-bucket-displayname");
    assertEquals(updateBucketOptionsModel.description(), "COS bucket for customer data");
    assertEquals(updateBucketOptionsModel.secretKey(), "<secret_key>");
    assertEquals(updateBucketOptionsModel.tags(), java.util.Arrays.asList("testbucket", "userbucket"));
    assertEquals(updateBucketOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateBucketOptionsError() throws Throwable {
    new UpdateBucketOptions.Builder().build();
  }

}