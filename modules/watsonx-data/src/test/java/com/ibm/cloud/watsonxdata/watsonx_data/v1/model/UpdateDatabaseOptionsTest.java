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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateDatabaseBodyDatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateDatabaseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateDatabaseOptions model.
 */
public class UpdateDatabaseOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateDatabaseOptions() throws Throwable {
    UpdateDatabaseBodyDatabaseDetails updateDatabaseBodyDatabaseDetailsModel = new UpdateDatabaseBodyDatabaseDetails.Builder()
      .password("samplepassword")
      .username("sampleuser")
      .build();
    assertEquals(updateDatabaseBodyDatabaseDetailsModel.password(), "samplepassword");
    assertEquals(updateDatabaseBodyDatabaseDetailsModel.username(), "sampleuser");

    UpdateDatabaseOptions updateDatabaseOptionsModel = new UpdateDatabaseOptions.Builder()
      .databaseId("new_db_id")
      .accept("testString")
      .databaseDetails(updateDatabaseBodyDatabaseDetailsModel)
      .databaseDisplayName("new_database")
      .description("External database description")
      .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
      .authInstanceId("testString")
      .build();
    assertEquals(updateDatabaseOptionsModel.databaseId(), "new_db_id");
    assertEquals(updateDatabaseOptionsModel.accept(), "testString");
    assertEquals(updateDatabaseOptionsModel.databaseDetails(), updateDatabaseBodyDatabaseDetailsModel);
    assertEquals(updateDatabaseOptionsModel.databaseDisplayName(), "new_database");
    assertEquals(updateDatabaseOptionsModel.description(), "External database description");
    assertEquals(updateDatabaseOptionsModel.tags(), java.util.Arrays.asList("testdatabase", "userdatabase"));
    assertEquals(updateDatabaseOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDatabaseOptionsError() throws Throwable {
    new UpdateDatabaseOptions.Builder().build();
  }

}