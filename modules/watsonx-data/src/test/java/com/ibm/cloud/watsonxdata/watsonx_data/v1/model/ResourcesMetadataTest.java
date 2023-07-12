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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ResourcesMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ResourcesMetadata model.
 */
public class ResourcesMetadataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testResourcesMetadata() throws Throwable {
    ResourcesMetadata resourcesMetadataModel = new ResourcesMetadata.Builder()
      .action("testString")
      .resourceName("testString")
      .resourceType("engine")
      .build();
    assertEquals(resourcesMetadataModel.action(), "testString");
    assertEquals(resourcesMetadataModel.resourceName(), "testString");
    assertEquals(resourcesMetadataModel.resourceType(), "engine");

    String json = TestUtilities.serialize(resourcesMetadataModel);

    ResourcesMetadata resourcesMetadataModelNew = TestUtilities.deserialize(json, ResourcesMetadata.class);
    assertTrue(resourcesMetadataModelNew instanceof ResourcesMetadata);
    assertEquals(resourcesMetadataModelNew.action(), "testString");
    assertEquals(resourcesMetadataModelNew.resourceName(), "testString");
    assertEquals(resourcesMetadataModelNew.resourceType(), "engine");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResourcesMetadataError() throws Throwable {
    new ResourcesMetadata.Builder().build();
  }

}