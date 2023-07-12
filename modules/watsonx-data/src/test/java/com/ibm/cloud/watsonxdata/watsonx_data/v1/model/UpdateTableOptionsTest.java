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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateTableBodyDropColumnsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateTableBodyRenameColumnsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateTableOptions model.
 */
public class UpdateTableOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateTableOptions() throws Throwable {
    UpdateTableBodyAddColumnsItems updateTableBodyAddColumnsItemsModel = new UpdateTableBodyAddColumnsItems.Builder()
      .columnComment("income column")
      .columnName("income")
      .dataType("varchar")
      .build();
    assertEquals(updateTableBodyAddColumnsItemsModel.columnComment(), "income column");
    assertEquals(updateTableBodyAddColumnsItemsModel.columnName(), "income");
    assertEquals(updateTableBodyAddColumnsItemsModel.dataType(), "varchar");

    UpdateTableBodyDropColumnsItems updateTableBodyDropColumnsItemsModel = new UpdateTableBodyDropColumnsItems.Builder()
      .columnName("expenditure")
      .build();
    assertEquals(updateTableBodyDropColumnsItemsModel.columnName(), "expenditure");

    UpdateTableBodyRenameColumnsItems updateTableBodyRenameColumnsItemsModel = new UpdateTableBodyRenameColumnsItems.Builder()
      .columnName("expenditure")
      .newColumnName("expenses")
      .build();
    assertEquals(updateTableBodyRenameColumnsItemsModel.columnName(), "expenditure");
    assertEquals(updateTableBodyRenameColumnsItemsModel.newColumnName(), "expenses");

    UpdateTableOptions updateTableOptionsModel = new UpdateTableOptions.Builder()
      .engineId("testString")
      .catalogName("testString")
      .schemaName("testString")
      .tableName("testString")
      .accept("testString")
      .addColumns(java.util.Arrays.asList(updateTableBodyAddColumnsItemsModel))
      .dropColumns(java.util.Arrays.asList(updateTableBodyDropColumnsItemsModel))
      .newTableName("updated_table_name")
      .renameColumns(java.util.Arrays.asList(updateTableBodyRenameColumnsItemsModel))
      .authInstanceId("testString")
      .build();
    assertEquals(updateTableOptionsModel.engineId(), "testString");
    assertEquals(updateTableOptionsModel.catalogName(), "testString");
    assertEquals(updateTableOptionsModel.schemaName(), "testString");
    assertEquals(updateTableOptionsModel.tableName(), "testString");
    assertEquals(updateTableOptionsModel.accept(), "testString");
    assertEquals(updateTableOptionsModel.addColumns(), java.util.Arrays.asList(updateTableBodyAddColumnsItemsModel));
    assertEquals(updateTableOptionsModel.dropColumns(), java.util.Arrays.asList(updateTableBodyDropColumnsItemsModel));
    assertEquals(updateTableOptionsModel.newTableName(), "updated_table_name");
    assertEquals(updateTableOptionsModel.renameColumns(), java.util.Arrays.asList(updateTableBodyRenameColumnsItemsModel));
    assertEquals(updateTableOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateTableOptionsError() throws Throwable {
    new UpdateTableOptions.Builder().build();
  }

}