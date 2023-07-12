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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DeleteTableBodyDeleteTablesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DeleteTableBodyDeleteTablesItems model.
 */
public class DeleteTableBodyDeleteTablesItemsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeleteTableBodyDeleteTablesItems() throws Throwable {
    DeleteTableBodyDeleteTablesItems deleteTableBodyDeleteTablesItemsModel = new DeleteTableBodyDeleteTablesItems.Builder()
      .catalogName("sampleCatalog")
      .schemaName("new_schema")
      .tableName("new_table")
      .build();
    assertEquals(deleteTableBodyDeleteTablesItemsModel.catalogName(), "sampleCatalog");
    assertEquals(deleteTableBodyDeleteTablesItemsModel.schemaName(), "new_schema");
    assertEquals(deleteTableBodyDeleteTablesItemsModel.tableName(), "new_table");

    String json = TestUtilities.serialize(deleteTableBodyDeleteTablesItemsModel);

    DeleteTableBodyDeleteTablesItems deleteTableBodyDeleteTablesItemsModelNew = TestUtilities.deserialize(json, DeleteTableBodyDeleteTablesItems.class);
    assertTrue(deleteTableBodyDeleteTablesItemsModelNew instanceof DeleteTableBodyDeleteTablesItems);
    assertEquals(deleteTableBodyDeleteTablesItemsModelNew.catalogName(), "sampleCatalog");
    assertEquals(deleteTableBodyDeleteTablesItemsModelNew.schemaName(), "new_schema");
    assertEquals(deleteTableBodyDeleteTablesItemsModelNew.tableName(), "new_table");
  }
}