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
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkApplicationConfig;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkApplicationDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkApplicationEnv;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineApplicationStatus;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineApplicationStatusRuntime;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkEngineApplicationStatusStateDetailsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.SparkVolumeDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SparkEngineApplicationStatus model.
 */
public class SparkEngineApplicationStatusTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSparkEngineApplicationStatus() throws Throwable {
    SparkEngineApplicationStatus sparkEngineApplicationStatusModel = new SparkEngineApplicationStatus();
    assertNull(sparkEngineApplicationStatusModel.getApplicationDetails());
    assertNull(sparkEngineApplicationStatusModel.getApplicationId());
    assertNull(sparkEngineApplicationStatusModel.getAutoTerminationTime());
    assertNull(sparkEngineApplicationStatusModel.getCreationTime());
    assertNull(sparkEngineApplicationStatusModel.getDeployMode());
    assertNull(sparkEngineApplicationStatusModel.getEndTime());
    assertNull(sparkEngineApplicationStatusModel.getFailedTime());
    assertNull(sparkEngineApplicationStatusModel.getFinishTime());
    assertNull(sparkEngineApplicationStatusModel.getId());
    assertNull(sparkEngineApplicationStatusModel.getJobEndpoint());
    assertNull(sparkEngineApplicationStatusModel.getReturnCode());
    assertNull(sparkEngineApplicationStatusModel.getRuntime());
    assertNull(sparkEngineApplicationStatusModel.getServiceInstanceId());
    assertNull(sparkEngineApplicationStatusModel.getSparkApplicationId());
    assertNull(sparkEngineApplicationStatusModel.getSparkApplicationName());
    assertNull(sparkEngineApplicationStatusModel.getSparkVersion());
    assertNull(sparkEngineApplicationStatusModel.getStartTime());
    assertNull(sparkEngineApplicationStatusModel.getState());
    assertNull(sparkEngineApplicationStatusModel.getStateDetails());
    assertNull(sparkEngineApplicationStatusModel.getSubmissionTime());
    assertNull(sparkEngineApplicationStatusModel.getTemplateId());
    assertNull(sparkEngineApplicationStatusModel.getType());
    assertNull(sparkEngineApplicationStatusModel.getVolumes());
    assertNull(sparkEngineApplicationStatusModel.getWxdApplicationUiEndpoint());
  }
}