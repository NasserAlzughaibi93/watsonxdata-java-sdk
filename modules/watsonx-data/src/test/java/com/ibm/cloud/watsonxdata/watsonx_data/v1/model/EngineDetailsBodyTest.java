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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.EngineDetailsBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.NodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EngineDetailsBody model.
 */
public class EngineDetailsBodyTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEngineDetailsBody() throws Throwable {
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

    String json = TestUtilities.serialize(engineDetailsBodyModel);

    EngineDetailsBody engineDetailsBodyModelNew = TestUtilities.deserialize(json, EngineDetailsBody.class);
    assertTrue(engineDetailsBodyModelNew instanceof EngineDetailsBody);
    assertEquals(engineDetailsBodyModelNew.worker().toString(), nodeDescriptionBodyModel.toString());
    assertEquals(engineDetailsBodyModelNew.coordinator().toString(), nodeDescriptionBodyModel.toString());
    assertEquals(engineDetailsBodyModelNew.sizeConfig(), "starter");
  }
}