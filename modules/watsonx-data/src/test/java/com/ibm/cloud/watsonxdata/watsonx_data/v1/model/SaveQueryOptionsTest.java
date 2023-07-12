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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.SaveQueryOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SaveQueryOptions model.
 */
public class SaveQueryOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSaveQueryOptions() throws Throwable {
    SaveQueryOptions saveQueryOptionsModel = new SaveQueryOptions.Builder()
      .queryName("testString")
      .createdBy("<username>@<domain>.com")
      .description("query to get expense data")
      .queryString("select expenses from expenditure")
      .createdOn("1608437933")
      .engineId("sampleEngine123")
      .authInstanceId("testString")
      .build();
    assertEquals(saveQueryOptionsModel.queryName(), "testString");
    assertEquals(saveQueryOptionsModel.createdBy(), "<username>@<domain>.com");
    assertEquals(saveQueryOptionsModel.description(), "query to get expense data");
    assertEquals(saveQueryOptionsModel.queryString(), "select expenses from expenditure");
    assertEquals(saveQueryOptionsModel.createdOn(), "1608437933");
    assertEquals(saveQueryOptionsModel.engineId(), "sampleEngine123");
    assertEquals(saveQueryOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSaveQueryOptionsError() throws Throwable {
    new SaveQueryOptions.Builder().build();
  }

}