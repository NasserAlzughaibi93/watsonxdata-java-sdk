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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetPoliciesListOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetPoliciesListOptions model.
 */
public class GetPoliciesListOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetPoliciesListOptions() throws Throwable {
    GetPoliciesListOptions getPoliciesListOptionsModel = new GetPoliciesListOptions.Builder()
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .catalogList(java.util.Arrays.asList("testString"))
      .engineList(java.util.Arrays.asList("testString"))
      .dataPoliciesList(java.util.Arrays.asList("testString"))
      .includeDataPolicies(true)
      .build();
    assertEquals(getPoliciesListOptionsModel.lhInstanceId(), "testString");
    assertEquals(getPoliciesListOptionsModel.authInstanceId(), "testString");
    assertEquals(getPoliciesListOptionsModel.catalogList(), java.util.Arrays.asList("testString"));
    assertEquals(getPoliciesListOptionsModel.engineList(), java.util.Arrays.asList("testString"));
    assertEquals(getPoliciesListOptionsModel.dataPoliciesList(), java.util.Arrays.asList("testString"));
    assertEquals(getPoliciesListOptionsModel.includeDataPolicies(), Boolean.valueOf(true));
  }
}