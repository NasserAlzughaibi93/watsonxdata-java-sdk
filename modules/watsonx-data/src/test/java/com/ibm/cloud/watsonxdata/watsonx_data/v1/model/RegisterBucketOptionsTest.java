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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.BucketDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.RegisterBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RegisterBucketOptions model.
 */
public class RegisterBucketOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRegisterBucketOptions() throws Throwable {
    BucketDetails bucketDetailsModel = new BucketDetails.Builder()
      .accessKey("<access_key>")
      .bucketName("sample-bucket")
      .endpoint("https://s3.<region>.cloud-object-storage.appdomain.cloud/")
      .secretKey("<secret_key>")
      .build();
    assertEquals(bucketDetailsModel.accessKey(), "<access_key>");
    assertEquals(bucketDetailsModel.bucketName(), "sample-bucket");
    assertEquals(bucketDetailsModel.endpoint(), "https://s3.<region>.cloud-object-storage.appdomain.cloud/");
    assertEquals(bucketDetailsModel.secretKey(), "<secret_key>");

    RegisterBucketOptions registerBucketOptionsModel = new RegisterBucketOptions.Builder()
      .bucketDetails(bucketDetailsModel)
      .description("COS bucket for customer data")
      .tableType("iceberg")
      .bucketType("ibm_cos")
      .catalogName("sampleCatalog")
      .managedBy("ibm")
      .bucketDisplayName("sample-bucket-displayname")
      .bucketTags(java.util.Arrays.asList("read customer data", "write customer data'"))
      .catalogTags(java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"))
      .thriftUri("thrift://samplehost-metastore:4354")
      .authInstanceId("testString")
      .build();
    assertEquals(registerBucketOptionsModel.bucketDetails(), bucketDetailsModel);
    assertEquals(registerBucketOptionsModel.description(), "COS bucket for customer data");
    assertEquals(registerBucketOptionsModel.tableType(), "iceberg");
    assertEquals(registerBucketOptionsModel.bucketType(), "ibm_cos");
    assertEquals(registerBucketOptionsModel.catalogName(), "sampleCatalog");
    assertEquals(registerBucketOptionsModel.managedBy(), "ibm");
    assertEquals(registerBucketOptionsModel.bucketDisplayName(), "sample-bucket-displayname");
    assertEquals(registerBucketOptionsModel.bucketTags(), java.util.Arrays.asList("read customer data", "write customer data'"));
    assertEquals(registerBucketOptionsModel.catalogTags(), java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"));
    assertEquals(registerBucketOptionsModel.thriftUri(), "thrift://samplehost-metastore:4354");
    assertEquals(registerBucketOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRegisterBucketOptionsError() throws Throwable {
    new RegisterBucketOptions.Builder().build();
  }

}