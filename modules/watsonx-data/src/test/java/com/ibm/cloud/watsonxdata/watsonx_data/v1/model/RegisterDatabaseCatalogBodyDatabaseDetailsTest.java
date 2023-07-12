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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.RegisterDatabaseCatalogBodyDatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RegisterDatabaseCatalogBodyDatabaseDetails model.
 */
public class RegisterDatabaseCatalogBodyDatabaseDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRegisterDatabaseCatalogBodyDatabaseDetails() throws Throwable {
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

    String json = TestUtilities.serialize(registerDatabaseCatalogBodyDatabaseDetailsModel);

    RegisterDatabaseCatalogBodyDatabaseDetails registerDatabaseCatalogBodyDatabaseDetailsModelNew = TestUtilities.deserialize(json, RegisterDatabaseCatalogBodyDatabaseDetails.class);
    assertTrue(registerDatabaseCatalogBodyDatabaseDetailsModelNew instanceof RegisterDatabaseCatalogBodyDatabaseDetails);
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.password(), "samplepassword");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.port(), "4553");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.ssl(), Boolean.valueOf(true));
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.tables(), "kafka_table_name");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.username(), "sampleuser");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.databaseName(), "new_database");
    assertEquals(registerDatabaseCatalogBodyDatabaseDetailsModelNew.hostname(), "db2@<hostname>.com");
  }
}