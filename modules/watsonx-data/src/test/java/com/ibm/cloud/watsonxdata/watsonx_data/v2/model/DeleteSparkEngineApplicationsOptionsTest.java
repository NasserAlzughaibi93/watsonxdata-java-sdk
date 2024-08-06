/*
 * (C) Copyright IBM Corp. 2024.
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

package com.ibm.cloud.watsonxdata.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.DeleteSparkEngineApplicationsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DeleteSparkEngineApplicationsOptions model.
 */
public class DeleteSparkEngineApplicationsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeleteSparkEngineApplicationsOptions() throws Throwable {
    DeleteSparkEngineApplicationsOptions deleteSparkEngineApplicationsOptionsModel = new DeleteSparkEngineApplicationsOptions.Builder()
      .engineId("testString")
      .applicationId("testString")
      .authInstanceId("testString")
      .state(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(deleteSparkEngineApplicationsOptionsModel.engineId(), "testString");
    assertEquals(deleteSparkEngineApplicationsOptionsModel.applicationId(), "testString");
    assertEquals(deleteSparkEngineApplicationsOptionsModel.authInstanceId(), "testString");
    assertEquals(deleteSparkEngineApplicationsOptionsModel.state(), java.util.Arrays.asList("testString"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSparkEngineApplicationsOptionsError() throws Throwable {
    new DeleteSparkEngineApplicationsOptions.Builder().build();
  }

}