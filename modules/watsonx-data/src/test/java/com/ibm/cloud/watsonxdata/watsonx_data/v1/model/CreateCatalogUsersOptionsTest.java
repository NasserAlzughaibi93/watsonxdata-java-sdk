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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CatalogGroupsMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CatalogUsersMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateCatalogUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateCatalogUsersOptions model.
 */
public class CreateCatalogUsersOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateCatalogUsersOptions() throws Throwable {
    CatalogGroupsMetadata catalogGroupsMetadataModel = new CatalogGroupsMetadata.Builder()
      .groupId("testString")
      .permission("can_administer")
      .build();
    assertEquals(catalogGroupsMetadataModel.groupId(), "testString");
    assertEquals(catalogGroupsMetadataModel.permission(), "can_administer");

    CatalogUsersMetadata catalogUsersMetadataModel = new CatalogUsersMetadata.Builder()
      .permission("can_administer")
      .userName("testString")
      .build();
    assertEquals(catalogUsersMetadataModel.permission(), "can_administer");
    assertEquals(catalogUsersMetadataModel.userName(), "testString");

    CreateCatalogUsersOptions createCatalogUsersOptionsModel = new CreateCatalogUsersOptions.Builder()
      .catalogName("testString")
      .groups(java.util.Arrays.asList(catalogGroupsMetadataModel))
      .users(java.util.Arrays.asList(catalogUsersMetadataModel))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();
    assertEquals(createCatalogUsersOptionsModel.catalogName(), "testString");
    assertEquals(createCatalogUsersOptionsModel.groups(), java.util.Arrays.asList(catalogGroupsMetadataModel));
    assertEquals(createCatalogUsersOptionsModel.users(), java.util.Arrays.asList(catalogUsersMetadataModel));
    assertEquals(createCatalogUsersOptionsModel.lhInstanceId(), "testString");
    assertEquals(createCatalogUsersOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateCatalogUsersOptionsError() throws Throwable {
    new CreateCatalogUsersOptions.Builder().build();
  }

}