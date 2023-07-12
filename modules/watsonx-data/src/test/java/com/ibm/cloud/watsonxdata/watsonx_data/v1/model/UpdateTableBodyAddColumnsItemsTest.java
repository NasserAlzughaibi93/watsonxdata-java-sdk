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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateTableBodyAddColumnsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateTableBodyAddColumnsItems model.
 */
public class UpdateTableBodyAddColumnsItemsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateTableBodyAddColumnsItems() throws Throwable {
    UpdateTableBodyAddColumnsItems updateTableBodyAddColumnsItemsModel = new UpdateTableBodyAddColumnsItems.Builder()
      .columnComment("income column")
      .columnName("income")
      .dataType("varchar")
      .build();
    assertEquals(updateTableBodyAddColumnsItemsModel.columnComment(), "income column");
    assertEquals(updateTableBodyAddColumnsItemsModel.columnName(), "income");
    assertEquals(updateTableBodyAddColumnsItemsModel.dataType(), "varchar");

    String json = TestUtilities.serialize(updateTableBodyAddColumnsItemsModel);

    UpdateTableBodyAddColumnsItems updateTableBodyAddColumnsItemsModelNew = TestUtilities.deserialize(json, UpdateTableBodyAddColumnsItems.class);
    assertTrue(updateTableBodyAddColumnsItemsModelNew instanceof UpdateTableBodyAddColumnsItems);
    assertEquals(updateTableBodyAddColumnsItemsModelNew.columnComment(), "income column");
    assertEquals(updateTableBodyAddColumnsItemsModelNew.columnName(), "income");
    assertEquals(updateTableBodyAddColumnsItemsModelNew.dataType(), "varchar");
  }
}