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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CatalogUsersMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CatalogUsersMetadata model.
 */
public class CatalogUsersMetadataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCatalogUsersMetadata() throws Throwable {
    CatalogUsersMetadata catalogUsersMetadataModel = new CatalogUsersMetadata.Builder()
      .permission("can_administer")
      .userName("testString")
      .build();
    assertEquals(catalogUsersMetadataModel.permission(), "can_administer");
    assertEquals(catalogUsersMetadataModel.userName(), "testString");

    String json = TestUtilities.serialize(catalogUsersMetadataModel);

    CatalogUsersMetadata catalogUsersMetadataModelNew = TestUtilities.deserialize(json, CatalogUsersMetadata.class);
    assertTrue(catalogUsersMetadataModelNew instanceof CatalogUsersMetadata);
    assertEquals(catalogUsersMetadataModelNew.permission(), "can_administer");
    assertEquals(catalogUsersMetadataModelNew.userName(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCatalogUsersMetadataError() throws Throwable {
    new CatalogUsersMetadata.Builder().build();
  }

}