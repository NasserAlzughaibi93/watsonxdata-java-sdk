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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ExplainStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ExplainStatementOptions model.
 */
public class ExplainStatementOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testExplainStatementOptions() throws Throwable {
    ExplainStatementOptions explainStatementOptionsModel = new ExplainStatementOptions.Builder()
      .engineId("eng_id")
      .statement("show schemas")
      .catalogName("sampleCatalog")
      .format("json")
      .schemaName("new_schema")
      .type("io")
      .authInstanceId("testString")
      .build();
    assertEquals(explainStatementOptionsModel.engineId(), "eng_id");
    assertEquals(explainStatementOptionsModel.statement(), "show schemas");
    assertEquals(explainStatementOptionsModel.catalogName(), "sampleCatalog");
    assertEquals(explainStatementOptionsModel.format(), "json");
    assertEquals(explainStatementOptionsModel.schemaName(), "new_schema");
    assertEquals(explainStatementOptionsModel.type(), "io");
    assertEquals(explainStatementOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testExplainStatementOptionsError() throws Throwable {
    new ExplainStatementOptions.Builder().build();
  }

}