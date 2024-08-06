/*
 * (C) Copyright IBM Corp. 2024.
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

package com.ibm.cloud.watsonxdata.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.OtherEngine;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.model.OtherEngineDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the OtherEngine model.
 */
public class OtherEngineTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testOtherEngine() throws Throwable {
    OtherEngine otherEngineModel = new OtherEngine();
    assertNull(otherEngineModel.getActions());
    assertNull(otherEngineModel.getCreatedBy());
    assertNull(otherEngineModel.getCreatedOn());
    assertNull(otherEngineModel.getDescription());
    assertNull(otherEngineModel.getEngineDetails());
    assertNull(otherEngineModel.getEngineDisplayName());
    assertNull(otherEngineModel.getEngineId());
    assertNull(otherEngineModel.getHostName());
    assertNull(otherEngineModel.getOrigin());
    assertNull(otherEngineModel.getPort());
    assertNull(otherEngineModel.getStatus());
    assertNull(otherEngineModel.getTags());
    assertNull(otherEngineModel.getType());
  }
}