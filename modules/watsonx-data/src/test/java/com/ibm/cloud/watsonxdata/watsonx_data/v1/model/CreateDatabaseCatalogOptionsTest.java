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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateDatabaseCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.RegisterDatabaseCatalogBodyDatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDatabaseCatalogOptions model.
 */
public class CreateDatabaseCatalogOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDatabaseCatalogOptions() throws Throwable {
    RegisterDatabaseCatalogBodyDatabaseDetails registerDatabaseCatalogBodyDatabaseDetailsModel = new RegisterDatabaseCatalogBodyDatabaseDetails.Builder()
      .password("samplepassword")
      .port("4553")
      .ssl(true)
      .tables("kafka_table_name")
      .username("sampleuser")
      .databaseName("new_database")
      .hostname("db2@<hostname>.com")
      .build();
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.password(), "samplepassword");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.port(), "4553");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.ssl(), Boolean.valueOf(true));
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.tables(), "kafka_table_name");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.username(), "sampleuser");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.databaseName(), "new_database");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModel.hostname(), "db2@<hostname>.com");

    CreateDatabaseCatalogOptions createDatabaseCatalogOptionsModel = new CreateDatabaseCatalogOptions.Builder()
      .databaseDisplayName("new_database")
      .databaseType("db2")
      .catalogName("sampleCatalog")
      .accept("testString")
      .databaseDetails(registerDatabaseCatalogBodyDatabaseDetailsModel)
      .description("db2 extenal database description")
      .tags(java.util.Arrays.asList("tag_1", "tag_2"))
      .createdBy("<username>@<domain>.com")
      .createdOn(Long.valueOf("26"))
      .authInstanceId("testString")
      .build();
    assertEquals(createDatabaseCatalogOptionsModel.databaseDisplayName(), "new_database");
    assertEquals(createDatabaseCatalogOptionsModel.databaseType(), "db2");
    assertEquals(createDatabaseCatalogOptionsModel.catalogName(), "sampleCatalog");
    assertEquals(createDatabaseCatalogOptionsModel.accept(), "testString");
    assertEquals(createDatabaseCatalogOptionsModel.databaseDetails(), registerDatabaseCatalogBodyDatabaseDetailsModel);
    assertEquals(createDatabaseCatalogOptionsModel.description(), "db2 extenal database description");
    assertEquals(createDatabaseCatalogOptionsModel.tags(), java.util.Arrays.asList("tag_1", "tag_2"));
    assertEquals(createDatabaseCatalogOptionsModel.createdBy(), "<username>@<domain>.com");
    assertEquals(createDatabaseCatalogOptionsModel.createdOn(), Long.valueOf("26"));
    assertEquals(createDatabaseCatalogOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDatabaseCatalogOptionsError() throws Throwable {
    new CreateDatabaseCatalogOptions.Builder().build();
  }

}