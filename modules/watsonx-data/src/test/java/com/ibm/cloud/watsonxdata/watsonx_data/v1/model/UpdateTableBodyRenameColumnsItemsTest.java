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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateTableBodyRenameColumnsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateTableBodyRenameColumnsItems model.
 */
public class UpdateTableBodyRenameColumnsItemsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateTableBodyRenameColumnsItems() throws Throwable {
    UpdateTableBodyRenameColumnsItems updateTableBodyRenameColumnsItemsModel = new UpdateTableBodyRenameColumnsItems.Builder()
      .columnName("expenditure")
      .newColumnName("expenses")
      .build();
    assertEquals(updateTableBodyRenameColumnsItemsModel.columnName(), "expenditure");
    assertEquals(updateTableBodyRenameColumnsItemsModel.newColumnName(), "expenses");

    String json = TestUtilities.serialize(updateTableBodyRenameColumnsItemsModel);

    UpdateTableBodyRenameColumnsItems updateTableBodyRenameColumnsItemsModelNew = TestUtilities.deserialize(json, UpdateTableBodyRenameColumnsItems.class);
    assertTrue(updateTableBodyRenameColumnsItemsModelNew instanceof UpdateTableBodyRenameColumnsItems);
    assertEquals(updateTableBodyRenameColumnsItemsModelNew.columnName(), "expenditure");
    assertEquals(updateTableBodyRenameColumnsItemsModelNew.newColumnName(), "expenses");
  }
}