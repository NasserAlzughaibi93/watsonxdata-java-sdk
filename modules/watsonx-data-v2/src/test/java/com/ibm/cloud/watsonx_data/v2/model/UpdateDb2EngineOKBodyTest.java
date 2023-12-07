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

package com.ibm.cloud.watsonx_data.v2.model;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.watsonx_data.v2.model.Db2Engine;
import com.ibm.cloud.watsonx_data.v2.model.Db2EngineDetails;
import com.ibm.cloud.watsonx_data.v2.model.SuccessResponse;
import com.ibm.cloud.watsonx_data.v2.model.UpdateDb2EngineOKBody;
import com.ibm.cloud.watsonx_data.v2.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateDb2EngineOKBody model.
 */
public class UpdateDb2EngineOKBodyTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateDb2EngineOKBody() throws Throwable {
    UpdateDb2EngineOKBody updateDb2EngineOkBodyModel = new UpdateDb2EngineOKBody();
    assertNull(updateDb2EngineOkBodyModel.getDb2Engine());
    assertNull(updateDb2EngineOkBodyModel.getResponse());
  }
}