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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.BucketDbConnGroupsMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BucketDbConnGroupsMetadata model.
 */
public class BucketDbConnGroupsMetadataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBucketDbConnGroupsMetadata() throws Throwable {
    BucketDbConnGroupsMetadata bucketDbConnGroupsMetadataModel = new BucketDbConnGroupsMetadata.Builder()
      .groupId("testString")
      .permission("can_administer")
      .build();
    assertEquals(bucketDbConnGroupsMetadataModel.groupId(), "testString");
    assertEquals(bucketDbConnGroupsMetadataModel.permission(), "can_administer");

    String json = TestUtilities.serialize(bucketDbConnGroupsMetadataModel);

    BucketDbConnGroupsMetadata bucketDbConnGroupsMetadataModelNew = TestUtilities.deserialize(json, BucketDbConnGroupsMetadata.class);
    assertTrue(bucketDbConnGroupsMetadataModelNew instanceof BucketDbConnGroupsMetadata);
    assertEquals(bucketDbConnGroupsMetadataModelNew.groupId(), "testString");
    assertEquals(bucketDbConnGroupsMetadataModelNew.permission(), "can_administer");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBucketDbConnGroupsMetadataError() throws Throwable {
    new BucketDbConnGroupsMetadata.Builder().build();
  }

}