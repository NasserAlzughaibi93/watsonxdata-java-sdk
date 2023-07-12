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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateDataPolicyOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.Rule;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.RuleGrantee;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDataPolicyOptions model.
 */
public class CreateDataPolicyOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDataPolicyOptions() throws Throwable {
    RuleGrantee ruleGranteeModel = new RuleGrantee.Builder()
      .value("testString")
      .key("user_name")
      .type("user_identity")
      .build();
    assertEquals(ruleGranteeModel.value(), "testString");
    assertEquals(ruleGranteeModel.key(), "user_name");
    assertEquals(ruleGranteeModel.type(), "user_identity");

    Rule ruleModel = new Rule.Builder()
      .actions(java.util.Arrays.asList("all"))
      .effect("allow")
      .grantee(ruleGranteeModel)
      .build();
    assertEquals(ruleModel.actions(), java.util.Arrays.asList("all"));
    assertEquals(ruleModel.effect(), "allow");
    assertEquals(ruleModel.grantee(), ruleGranteeModel);

    CreateDataPolicyOptions createDataPolicyOptionsModel = new CreateDataPolicyOptions.Builder()
      .catalogName("testString")
      .dataArtifact("schema1/table1/(column1|column2)")
      .policyName("testString")
      .rules(java.util.Arrays.asList(ruleModel))
      .description("testString")
      .status("active")
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();
    assertEquals(createDataPolicyOptionsModel.catalogName(), "testString");
    assertEquals(createDataPolicyOptionsModel.dataArtifact(), "schema1/table1/(column1|column2)");
    assertEquals(createDataPolicyOptionsModel.policyName(), "testString");
    assertEquals(createDataPolicyOptionsModel.rules(), java.util.Arrays.asList(ruleModel));
    assertEquals(createDataPolicyOptionsModel.description(), "testString");
    assertEquals(createDataPolicyOptionsModel.status(), "active");
    assertEquals(createDataPolicyOptionsModel.lhInstanceId(), "testString");
    assertEquals(createDataPolicyOptionsModel.authInstanceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataPolicyOptionsError() throws Throwable {
    new CreateDataPolicyOptions.Builder().build();
  }

}