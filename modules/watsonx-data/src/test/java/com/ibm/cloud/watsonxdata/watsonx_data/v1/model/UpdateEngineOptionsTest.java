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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.NodeDescription;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateEngineOptions model.
 */
public class UpdateEngineOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateEngineOptions() throws Throwable {
    NodeDescription nodeDescriptionModel = new NodeDescription.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("26"))
      .build();
    assertEquals(nodeDescriptionModel.nodeType(), "worker");
    assertEquals(nodeDescriptionModel.quantity(), Long.valueOf("26"));

    UpdateEngineOptions updateEngineOptionsModel = new UpdateEngineOptions.Builder()
      .engineId("sampleEngine123")
      .accept("testString")
      .coordinator(nodeDescriptionModel)
      .description("presto engine updated description")
      .engineDisplayName("sampleEngine")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .worker(nodeDescriptionModel)
      .authInstanceId("testString")
      .build();
    assertEquals(updateEngineOptionsModel.engineId(), "sampleEngine123");
    assertEquals(updateEngineOptionsModel.accept(), "testString");
    assertEquals(updateEngineOptionsModel.coordinator(), nodeDescriptionModel);
    assertEquals(updateEngineOptionsModel.description(), "presto engine updated description");
    assertEquals(updateEngineOptionsModel.engineDisplayName(), "sampleEngine");
    assertEquals(updateEngineOptionsModel.tags(), java.util.Arrays.asList("tag1", "tag2"));
    assertEquals(updateEngineOptionsModel.worker(), nodeDescriptionModel);
    assertEquals(updateEngineOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateEngineOptionsError() throws Throwable {
    new UpdateEngineOptions.Builder().build();
  }

}