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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateDataPolicySchema;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.Rule;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.RuleGrantee;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDataPolicySchema model.
 */
public class CreateDataPolicySchemaTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDataPolicySchema() throws Throwable {
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

    CreateDataPolicySchema createDataPolicySchemaModel = new CreateDataPolicySchema.Builder()
      .catalogName("testString")
      .dataArtifact("schema1/table1/(column1|column2)")
      .description("testString")
      .policyName("testString")
      .rules(java.util.Arrays.asList(ruleModel))
      .status("active")
      .build();
    assertEquals(createDataPolicySchemaModel.catalogName(), "testString");
    assertEquals(createDataPolicySchemaModel.dataArtifact(), "schema1/table1/(column1|column2)");
    assertEquals(createDataPolicySchemaModel.description(), "testString");
    assertEquals(createDataPolicySchemaModel.policyName(), "testString");
    assertEquals(createDataPolicySchemaModel.rules(), java.util.Arrays.asList(ruleModel));
    assertEquals(createDataPolicySchemaModel.status(), "active");

    String json = TestUtilities.serialize(createDataPolicySchemaModel);

    CreateDataPolicySchema createDataPolicySchemaModelNew = TestUtilities.deserialize(json, CreateDataPolicySchema.class);
    assertTrue(createDataPolicySchemaModelNew instanceof CreateDataPolicySchema);
    assertEquals(createDataPolicySchemaModelNew.catalogName(), "testString");
    assertEquals(createDataPolicySchemaModelNew.dataArtifact(), "schema1/table1/(column1|column2)");
    assertEquals(createDataPolicySchemaModelNew.description(), "testString");
    assertEquals(createDataPolicySchemaModelNew.policyName(), "testString");
    assertEquals(createDataPolicySchemaModelNew.status(), "active");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataPolicySchemaError() throws Throwable {
    new CreateDataPolicySchema.Builder().build();
  }

}