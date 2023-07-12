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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.EngineDetailsBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.NodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateEngineOptions model.
 */
public class CreateEngineOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateEngineOptions() throws Throwable {
    NodeDescriptionBody nodeDescriptionBodyModel = new NodeDescriptionBody.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("26"))
      .build();
    assertEquals(nodeDescriptionBodyModel.nodeType(), "worker");
    assertEquals(nodeDescriptionBodyModel.quantity(), Long.valueOf("26"));

    EngineDetailsBody engineDetailsBodyModel = new EngineDetailsBody.Builder()
      .worker(nodeDescriptionBodyModel)
      .coordinator(nodeDescriptionBodyModel)
      .sizeConfig("starter")
      .build();
    assertEquals(engineDetailsBodyModel.worker(), nodeDescriptionBodyModel);
    assertEquals(engineDetailsBodyModel.coordinator(), nodeDescriptionBodyModel);
    assertEquals(engineDetailsBodyModel.sizeConfig(), "starter");

    CreateEngineOptions createEngineOptionsModel = new CreateEngineOptions.Builder()
      .version("1.2.3")
      .engineDetails(engineDetailsBodyModel)
      .origin("ibm")
      .type("presto")
      .accept("testString")
      .description("presto engine description")
      .engineDisplayName("sampleEngine")
      .firstTimeUse(true)
      .region("us-south")
      .associatedCatalogs(java.util.Arrays.asList("new_catalog_1", "new_catalog_2"))
      .authInstanceId("testString")
      .build();
    assertEquals(createEngineOptionsModel.version(), "1.2.3");
    assertEquals(createEngineOptionsModel.engineDetails(), engineDetailsBodyModel);
    assertEquals(createEngineOptionsModel.origin(), "ibm");
    assertEquals(createEngineOptionsModel.type(), "presto");
    assertEquals(createEngineOptionsModel.accept(), "testString");
    assertEquals(createEngineOptionsModel.description(), "presto engine description");
    assertEquals(createEngineOptionsModel.engineDisplayName(), "sampleEngine");
    assertEquals(createEngineOptionsModel.firstTimeUse(), Boolean.valueOf(true));
    assertEquals(createEngineOptionsModel.region(), "us-south");
    assertEquals(createEngineOptionsModel.associatedCatalogs(), java.util.Arrays.asList("new_catalog_1", "new_catalog_2"));
    assertEquals(createEngineOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateEngineOptionsError() throws Throwable {
    new CreateEngineOptions.Builder().build();
  }

}