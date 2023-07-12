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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.EngineGroupsMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.EngineUsersMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateEngineUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateEngineUsersOptions model.
 */
public class UpdateEngineUsersOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateEngineUsersOptions() throws Throwable {
    EngineGroupsMetadata engineGroupsMetadataModel = new EngineGroupsMetadata.Builder()
      .groupId("testString")
      .permission("can_administer")
      .build();
    assertEquals(engineGroupsMetadataModel.groupId(), "testString");
    assertEquals(engineGroupsMetadataModel.permission(), "can_administer");

    EngineUsersMetadata engineUsersMetadataModel = new EngineUsersMetadata.Builder()
      .permission("can_administer")
      .userName("testString")
      .build();
    assertEquals(engineUsersMetadataModel.permission(), "can_administer");
    assertEquals(engineUsersMetadataModel.userName(), "testString");

    UpdateEngineUsersOptions updateEngineUsersOptionsModel = new UpdateEngineUsersOptions.Builder()
      .engineId("testString")
      .groups(java.util.Arrays.asList(engineGroupsMetadataModel))
      .users(java.util.Arrays.asList(engineUsersMetadataModel))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();
    assertEquals(updateEngineUsersOptionsModel.engineId(), "testString");
    assertEquals(updateEngineUsersOptionsModel.groups(), java.util.Arrays.asList(engineGroupsMetadataModel));
    assertEquals(updateEngineUsersOptionsModel.users(), java.util.Arrays.asList(engineUsersMetadataModel));
    assertEquals(updateEngineUsersOptionsModel.lhInstanceId(), "testString");
    assertEquals(updateEngineUsersOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateEngineUsersOptionsError() throws Throwable {
    new UpdateEngineUsersOptions.Builder().build();
  }

}