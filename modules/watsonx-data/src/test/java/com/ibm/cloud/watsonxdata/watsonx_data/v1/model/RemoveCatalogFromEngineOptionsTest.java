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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.RemoveCatalogFromEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RemoveCatalogFromEngineOptions model.
 */
public class RemoveCatalogFromEngineOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRemoveCatalogFromEngineOptions() throws Throwable {
    RemoveCatalogFromEngineOptions removeCatalogFromEngineOptionsModel = new RemoveCatalogFromEngineOptions.Builder()
      .catalogName("sampleCatalog")
      .engineId("sampleEngine123")
      .accept("testString")
      .createdBy("<username>@<domain>.com")
      .authInstanceId("testString")
      .build();
    assertEquals(removeCatalogFromEngineOptionsModel.catalogName(), "sampleCatalog");
    assertEquals(removeCatalogFromEngineOptionsModel.engineId(), "sampleEngine123");
    assertEquals(removeCatalogFromEngineOptionsModel.accept(), "testString");
    assertEquals(removeCatalogFromEngineOptionsModel.createdBy(), "<username>@<domain>.com");
    assertEquals(removeCatalogFromEngineOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRemoveCatalogFromEngineOptionsError() throws Throwable {
    new RemoveCatalogFromEngineOptions.Builder().build();
  }

}