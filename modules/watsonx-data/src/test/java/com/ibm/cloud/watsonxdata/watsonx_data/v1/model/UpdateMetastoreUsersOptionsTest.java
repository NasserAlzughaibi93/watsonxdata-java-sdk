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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GroupsMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateMetastoreUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UsersMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateMetastoreUsersOptions model.
 */
public class UpdateMetastoreUsersOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateMetastoreUsersOptions() throws Throwable {
    GroupsMetadata groupsMetadataModel = new GroupsMetadata.Builder()
      .groupId("testString")
      .permission("can_administer")
      .build();
    assertEquals(groupsMetadataModel.groupId(), "testString");
    assertEquals(groupsMetadataModel.permission(), "can_administer");

    UsersMetadata usersMetadataModel = new UsersMetadata.Builder()
      .permission("can_administer")
      .userName("testString")
      .build();
    assertEquals(usersMetadataModel.permission(), "can_administer");
    assertEquals(usersMetadataModel.userName(), "testString");

    UpdateMetastoreUsersOptions updateMetastoreUsersOptionsModel = new UpdateMetastoreUsersOptions.Builder()
      .metastoreName("testString")
      .groups(java.util.Arrays.asList(groupsMetadataModel))
      .users(java.util.Arrays.asList(usersMetadataModel))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();
    assertEquals(updateMetastoreUsersOptionsModel.metastoreName(), "testString");
    assertEquals(updateMetastoreUsersOptionsModel.groups(), java.util.Arrays.asList(groupsMetadataModel));
    assertEquals(updateMetastoreUsersOptionsModel.users(), java.util.Arrays.asList(usersMetadataModel));
    assertEquals(updateMetastoreUsersOptionsModel.lhInstanceId(), "testString");
    assertEquals(updateMetastoreUsersOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateMetastoreUsersOptionsError() throws Throwable {
    new UpdateMetastoreUsersOptions.Builder().build();
  }

}