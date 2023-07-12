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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetMetastoreUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetMetastoreUsersOptions model.
 */
public class GetMetastoreUsersOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetMetastoreUsersOptions() throws Throwable {
    GetMetastoreUsersOptions getMetastoreUsersOptionsModel = new GetMetastoreUsersOptions.Builder()
      .metastoreName("testString")
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();
    assertEquals(getMetastoreUsersOptionsModel.metastoreName(), "testString");
    assertEquals(getMetastoreUsersOptionsModel.lhInstanceId(), "testString");
    assertEquals(getMetastoreUsersOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMetastoreUsersOptionsError() throws Throwable {
    new GetMetastoreUsersOptions.Builder().build();
  }

}