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

package com.ibm.cloud.watsonxdata.watsonx_data.v1;

import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.watsonx_data.test.SdkIntegrationTestBase;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ActivateBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.AddMetastoreToEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.Bucket;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.BucketDbConnGroupsMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.BucketDbConnUsersMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.BucketDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.BucketPolicies;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CatalogGroupsMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CatalogPolicies;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CatalogUsersMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateBucketUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateCatalogUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateDataPolicyCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateDataPolicyOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateDataPolicySchema;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateDatabaseCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateDbConnUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateEngineUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateMetastoreUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateSchemaOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DataPolicies;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DataPolicyMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DbConnPolicies;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DeactivateBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DefaultPolicySchema;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DeleteBucketUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DeleteCatalogUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DeleteDataPoliciesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DeleteDataPolicyOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DeleteDatabaseCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DeleteDbConnUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DeleteEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DeleteEngineUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DeleteMetastoreUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DeleteQueryOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DeleteSchemaOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DeleteTableBodyDeleteTablesItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DeleteTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.EngineDetail;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.EngineDetailsBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.EngineGroupsMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.EnginePolicies;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.EngineUsersMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.EvaluateOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.EvaluationResultSchema;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ExplainAnalyzeStatementCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ExplainAnalyzeStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ExplainStatementCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ExplainStatementOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetBucketObjectsOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetBucketObjectsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetBucketUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetBucketUsersSchema;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetBucketsOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetBucketsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetCatalogUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetCatalogUsersSchema;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetDataPolicyOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetDatabasesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetDbConnUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetDbConnUsersSchema;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetDefaultPoliciesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetDeploymentsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetEngineUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetEngineUsersSchema;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetEnginesOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetEnginesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetHMSOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetMetastoreUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetMetastoreUsersSchema;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetMetastoresOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetMetastoresOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetPoliciesListOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetPolicyVersionOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetQueriesOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetQueriesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetSchemasOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetSchemasOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetTableSnapshotsOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetTableSnapshotsOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetTablesOKBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GetTablesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GroupingPolicyMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.GroupsMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ListDataPoliciesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.Metastore;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.NodeDescription;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.NodeDescriptionBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ParseCsvOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.PauseEngineCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.PauseEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.PolicyListSchema;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.PolicyMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.PolicySchema;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.PolicySchemaList;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.PolicyVersionResultSchema;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.PostQueryOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.Query;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.RegisterBucketCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.RegisterBucketCreatedBodyBucket;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.RegisterBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.RegisterDatabaseCatalogBodyDatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.RemoveCatalogFromEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ReplaceDataPolicyCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ReplaceDataPolicyOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ReplaceDataPolicySchema;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ResourceWithResult;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ResourcesMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ResumeEngineCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ResumeEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.RollbackSnapshotOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.Rule;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.RuleGrantee;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.SaveQueryOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.SuccessResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.TableSnapshot;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.TestLHConsoleOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UnregisterBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateBucketUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateCatalogUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateDatabaseBodyDatabaseDetails;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateDatabaseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateDbConnUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateEngineUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateMetastoreUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateQueryOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateTableBodyAddColumnsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateTableBodyDropColumnsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateTableBodyRenameColumnsItems;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UplaodCsvOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UsersMetadata;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.utils.TestUtilities;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the WatsonxData service.
 */
public class WatsonxDataIT extends SdkIntegrationTestBase {
  public WatsonxData service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../watsonx_data_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = WatsonxData.newInstance();
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(WatsonxData.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testCreateDbConnUsers() throws Exception {
    try {
      BucketDbConnGroupsMetadata bucketDbConnGroupsMetadataModel = new BucketDbConnGroupsMetadata.Builder()
        .groupId("testString")
        .permission("can_administer")
        .build();

      BucketDbConnUsersMetadata bucketDbConnUsersMetadataModel = new BucketDbConnUsersMetadata.Builder()
        .userName("testString")
        .permission("can_administer")
        .build();

      CreateDbConnUsersOptions createDbConnUsersOptions = new CreateDbConnUsersOptions.Builder()
        .databaseId("testString")
        .groups(java.util.Arrays.asList(bucketDbConnGroupsMetadataModel))
        .users(java.util.Arrays.asList(bucketDbConnUsersMetadataModel))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.createDbConnUsers(createDbConnUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();

      assertNotNull(successResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDbConnUsers" })
  public void testListDataPolicies() throws Exception {
    try {
      ListDataPoliciesOptions listDataPoliciesOptions = new ListDataPoliciesOptions.Builder()
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .catalogName("testString")
        .status("testString")
        .includeMetadata(true)
        .includeRules(true)
        .build();

      // Invoke operation
      Response<PolicyListSchema> response = service.listDataPolicies(listDataPoliciesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PolicyListSchema policyListSchemaResult = response.getResult();

      assertNotNull(policyListSchemaResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataPolicies" })
  public void testCreateDataPolicy() throws Exception {
    try {
      RuleGrantee ruleGranteeModel = new RuleGrantee.Builder()
        .value("testString")
        .key("user_name")
        .type("user_identity")
        .build();

      Rule ruleModel = new Rule.Builder()
        .actions(java.util.Arrays.asList("all"))
        .effect("allow")
        .grantee(ruleGranteeModel)
        .build();

      CreateDataPolicyOptions createDataPolicyOptions = new CreateDataPolicyOptions.Builder()
        .catalogName("testString")
        .dataArtifact("schema1/table1/(column1|column2)")
        .policyName("testString")
        .rules(java.util.Arrays.asList(ruleModel))
        .description("testString")
        .status("active")
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<CreateDataPolicyCreatedBody> response = service.createDataPolicy(createDataPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      CreateDataPolicyCreatedBody createDataPolicyCreatedBodyResult = response.getResult();

      assertNotNull(createDataPolicyCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDataPolicy" })
  public void testGetEngineUsers() throws Exception {
    try {
      GetEngineUsersOptions getEngineUsersOptions = new GetEngineUsersOptions.Builder()
        .engineId("testString")
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetEngineUsersSchema> response = service.getEngineUsers(getEngineUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetEngineUsersSchema getEngineUsersSchemaResult = response.getResult();

      assertNotNull(getEngineUsersSchemaResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetEngineUsers" })
  public void testUpdateEngineUsers() throws Exception {
    try {
      EngineGroupsMetadata engineGroupsMetadataModel = new EngineGroupsMetadata.Builder()
        .groupId("testString")
        .permission("can_administer")
        .build();

      EngineUsersMetadata engineUsersMetadataModel = new EngineUsersMetadata.Builder()
        .permission("can_administer")
        .userName("testString")
        .build();

      UpdateEngineUsersOptions updateEngineUsersOptions = new UpdateEngineUsersOptions.Builder()
        .engineId("testString")
        .groups(java.util.Arrays.asList(engineGroupsMetadataModel))
        .users(java.util.Arrays.asList(engineUsersMetadataModel))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.updateEngineUsers(updateEngineUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();

      assertNotNull(successResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateEngineUsers" })
  public void testUpdateDbConnUsers() throws Exception {
    try {
      BucketDbConnGroupsMetadata bucketDbConnGroupsMetadataModel = new BucketDbConnGroupsMetadata.Builder()
        .groupId("testString")
        .permission("can_administer")
        .build();

      BucketDbConnUsersMetadata bucketDbConnUsersMetadataModel = new BucketDbConnUsersMetadata.Builder()
        .userName("testString")
        .permission("can_administer")
        .build();

      UpdateDbConnUsersOptions updateDbConnUsersOptions = new UpdateDbConnUsersOptions.Builder()
        .databaseId("testString")
        .groups(java.util.Arrays.asList(bucketDbConnGroupsMetadataModel))
        .users(java.util.Arrays.asList(bucketDbConnUsersMetadataModel))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.updateDbConnUsers(updateDbConnUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();

      assertNotNull(successResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDbConnUsers" })
  public void testGetDbConnUsers() throws Exception {
    try {
      GetDbConnUsersOptions getDbConnUsersOptions = new GetDbConnUsersOptions.Builder()
        .databaseId("testString")
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetDbConnUsersSchema> response = service.getDbConnUsers(getDbConnUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetDbConnUsersSchema getDbConnUsersSchemaResult = response.getResult();

      assertNotNull(getDbConnUsersSchemaResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDbConnUsers" })
  public void testCreateCatalogUsers() throws Exception {
    try {
      CatalogGroupsMetadata catalogGroupsMetadataModel = new CatalogGroupsMetadata.Builder()
        .groupId("testString")
        .permission("can_administer")
        .build();

      CatalogUsersMetadata catalogUsersMetadataModel = new CatalogUsersMetadata.Builder()
        .permission("can_administer")
        .userName("testString")
        .build();

      CreateCatalogUsersOptions createCatalogUsersOptions = new CreateCatalogUsersOptions.Builder()
        .catalogName("testString")
        .groups(java.util.Arrays.asList(catalogGroupsMetadataModel))
        .users(java.util.Arrays.asList(catalogUsersMetadataModel))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.createCatalogUsers(createCatalogUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();

      assertNotNull(successResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateCatalogUsers" })
  public void testGetCatalogUsers() throws Exception {
    try {
      GetCatalogUsersOptions getCatalogUsersOptions = new GetCatalogUsersOptions.Builder()
        .catalogName("testString")
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetCatalogUsersSchema> response = service.getCatalogUsers(getCatalogUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetCatalogUsersSchema getCatalogUsersSchemaResult = response.getResult();

      assertNotNull(getCatalogUsersSchemaResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetCatalogUsers" })
  public void testUpdateCatalogUsers() throws Exception {
    try {
      CatalogGroupsMetadata catalogGroupsMetadataModel = new CatalogGroupsMetadata.Builder()
        .groupId("testString")
        .permission("can_administer")
        .build();

      CatalogUsersMetadata catalogUsersMetadataModel = new CatalogUsersMetadata.Builder()
        .permission("can_administer")
        .userName("testString")
        .build();

      UpdateCatalogUsersOptions updateCatalogUsersOptions = new UpdateCatalogUsersOptions.Builder()
        .catalogName("testString")
        .groups(java.util.Arrays.asList(catalogGroupsMetadataModel))
        .users(java.util.Arrays.asList(catalogUsersMetadataModel))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.updateCatalogUsers(updateCatalogUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();

      assertNotNull(successResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateCatalogUsers" })
  public void testEvaluate() throws Exception {
    try {
      ResourcesMetadata resourcesMetadataModel = new ResourcesMetadata.Builder()
        .action("testString")
        .resourceName("testString")
        .resourceType("engine")
        .build();

      EvaluateOptions evaluateOptions = new EvaluateOptions.Builder()
        .resources(java.util.Arrays.asList(resourcesMetadataModel))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<EvaluationResultSchema> response = service.evaluate(evaluateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      EvaluationResultSchema evaluationResultSchemaResult = response.getResult();

      assertNotNull(evaluationResultSchemaResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testEvaluate" })
  public void testGetPoliciesList() throws Exception {
    try {
      GetPoliciesListOptions getPoliciesListOptions = new GetPoliciesListOptions.Builder()
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .catalogList(java.util.Arrays.asList("testString"))
        .engineList(java.util.Arrays.asList("testString"))
        .dataPoliciesList(java.util.Arrays.asList("testString"))
        .includeDataPolicies(true)
        .build();

      // Invoke operation
      Response<PolicySchemaList> response = service.getPoliciesList(getPoliciesListOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PolicySchemaList policySchemaListResult = response.getResult();

      assertNotNull(policySchemaListResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPoliciesList" })
  public void testCreateMetastoreUsers() throws Exception {
    try {
      GroupsMetadata groupsMetadataModel = new GroupsMetadata.Builder()
        .groupId("testString")
        .permission("can_administer")
        .build();

      UsersMetadata usersMetadataModel = new UsersMetadata.Builder()
        .permission("can_administer")
        .userName("testString")
        .build();

      CreateMetastoreUsersOptions createMetastoreUsersOptions = new CreateMetastoreUsersOptions.Builder()
        .metastoreName("testString")
        .groups(java.util.Arrays.asList(groupsMetadataModel))
        .users(java.util.Arrays.asList(usersMetadataModel))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.createMetastoreUsers(createMetastoreUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();

      assertNotNull(successResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateMetastoreUsers" })
  public void testGetMetastoreUsers() throws Exception {
    try {
      GetMetastoreUsersOptions getMetastoreUsersOptions = new GetMetastoreUsersOptions.Builder()
        .metastoreName("testString")
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetMetastoreUsersSchema> response = service.getMetastoreUsers(getMetastoreUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetMetastoreUsersSchema getMetastoreUsersSchemaResult = response.getResult();

      assertNotNull(getMetastoreUsersSchemaResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetMetastoreUsers" })
  public void testUpdateMetastoreUsers() throws Exception {
    try {
      GroupsMetadata groupsMetadataModel = new GroupsMetadata.Builder()
        .groupId("testString")
        .permission("can_administer")
        .build();

      UsersMetadata usersMetadataModel = new UsersMetadata.Builder()
        .permission("can_administer")
        .userName("testString")
        .build();

      UpdateMetastoreUsersOptions updateMetastoreUsersOptions = new UpdateMetastoreUsersOptions.Builder()
        .metastoreName("testString")
        .groups(java.util.Arrays.asList(groupsMetadataModel))
        .users(java.util.Arrays.asList(usersMetadataModel))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.updateMetastoreUsers(updateMetastoreUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();

      assertNotNull(successResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateMetastoreUsers" })
  public void testCreateBucketUsers() throws Exception {
    try {
      BucketDbConnGroupsMetadata bucketDbConnGroupsMetadataModel = new BucketDbConnGroupsMetadata.Builder()
        .groupId("testString")
        .permission("can_administer")
        .build();

      BucketDbConnUsersMetadata bucketDbConnUsersMetadataModel = new BucketDbConnUsersMetadata.Builder()
        .userName("testString")
        .permission("can_administer")
        .build();

      CreateBucketUsersOptions createBucketUsersOptions = new CreateBucketUsersOptions.Builder()
        .bucketId("testString")
        .groups(java.util.Arrays.asList(bucketDbConnGroupsMetadataModel))
        .users(java.util.Arrays.asList(bucketDbConnUsersMetadataModel))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.createBucketUsers(createBucketUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();

      assertNotNull(successResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateBucketUsers" })
  public void testGetDefaultPolicies() throws Exception {
    try {
      GetDefaultPoliciesOptions getDefaultPoliciesOptions = new GetDefaultPoliciesOptions.Builder()
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<DefaultPolicySchema> response = service.getDefaultPolicies(getDefaultPoliciesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DefaultPolicySchema defaultPolicySchemaResult = response.getResult();

      assertNotNull(defaultPolicySchemaResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDefaultPolicies" })
  public void testGetPolicyVersion() throws Exception {
    try {
      GetPolicyVersionOptions getPolicyVersionOptions = new GetPolicyVersionOptions.Builder()
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PolicyVersionResultSchema> response = service.getPolicyVersion(getPolicyVersionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PolicyVersionResultSchema policyVersionResultSchemaResult = response.getResult();

      assertNotNull(policyVersionResultSchemaResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetPolicyVersion" })
  public void testGetDataPolicy() throws Exception {
    try {
      GetDataPolicyOptions getDataPolicyOptions = new GetDataPolicyOptions.Builder()
        .policyName("testString")
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PolicySchema> response = service.getDataPolicy(getDataPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PolicySchema policySchemaResult = response.getResult();

      assertNotNull(policySchemaResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataPolicy" })
  public void testReplaceDataPolicy() throws Exception {
    try {
      RuleGrantee ruleGranteeModel = new RuleGrantee.Builder()
        .value("testString")
        .key("user_name")
        .type("user_identity")
        .build();

      Rule ruleModel = new Rule.Builder()
        .actions(java.util.Arrays.asList("all"))
        .effect("allow")
        .grantee(ruleGranteeModel)
        .build();

      ReplaceDataPolicyOptions replaceDataPolicyOptions = new ReplaceDataPolicyOptions.Builder()
        .policyName("testString")
        .catalogName("testString")
        .dataArtifact("schema1/table1/(column1|column2)")
        .rules(java.util.Arrays.asList(ruleModel))
        .description("testString")
        .status("active")
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ReplaceDataPolicyCreatedBody> response = service.replaceDataPolicy(replaceDataPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ReplaceDataPolicyCreatedBody replaceDataPolicyCreatedBodyResult = response.getResult();

      assertNotNull(replaceDataPolicyCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceDataPolicy" })
  public void testCreateEngineUsers() throws Exception {
    try {
      EngineGroupsMetadata engineGroupsMetadataModel = new EngineGroupsMetadata.Builder()
        .groupId("testString")
        .permission("can_administer")
        .build();

      EngineUsersMetadata engineUsersMetadataModel = new EngineUsersMetadata.Builder()
        .permission("can_administer")
        .userName("testString")
        .build();

      CreateEngineUsersOptions createEngineUsersOptions = new CreateEngineUsersOptions.Builder()
        .engineId("testString")
        .groups(java.util.Arrays.asList(engineGroupsMetadataModel))
        .users(java.util.Arrays.asList(engineUsersMetadataModel))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.createEngineUsers(createEngineUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();

      assertNotNull(successResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateEngineUsers" })
  public void testGetBucketUsers() throws Exception {
    try {
      GetBucketUsersOptions getBucketUsersOptions = new GetBucketUsersOptions.Builder()
        .bucketId("testString")
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetBucketUsersSchema> response = service.getBucketUsers(getBucketUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetBucketUsersSchema getBucketUsersSchemaResult = response.getResult();

      assertNotNull(getBucketUsersSchemaResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetBucketUsers" })
  public void testUpdateBucketUsers() throws Exception {
    try {
      BucketDbConnGroupsMetadata bucketDbConnGroupsMetadataModel = new BucketDbConnGroupsMetadata.Builder()
        .groupId("testString")
        .permission("can_administer")
        .build();

      BucketDbConnUsersMetadata bucketDbConnUsersMetadataModel = new BucketDbConnUsersMetadata.Builder()
        .userName("testString")
        .permission("can_administer")
        .build();

      UpdateBucketUsersOptions updateBucketUsersOptions = new UpdateBucketUsersOptions.Builder()
        .bucketId("testString")
        .groups(java.util.Arrays.asList(bucketDbConnGroupsMetadataModel))
        .users(java.util.Arrays.asList(bucketDbConnUsersMetadataModel))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.updateBucketUsers(updateBucketUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();

      assertNotNull(successResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateBucketUsers" })
  public void testGetBuckets() throws Exception {
    try {
      GetBucketsOptions getBucketsOptions = new GetBucketsOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetBucketsOKBody> response = service.getBuckets(getBucketsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetBucketsOKBody getBucketsOkBodyResult = response.getResult();

      assertNotNull(getBucketsOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetBuckets" })
  public void testGetBucketObjects() throws Exception {
    try {
      GetBucketObjectsOptions getBucketObjectsOptions = new GetBucketObjectsOptions.Builder()
        .bucketId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetBucketObjectsOKBody> response = service.getBucketObjects(getBucketObjectsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetBucketObjectsOKBody getBucketObjectsOkBodyResult = response.getResult();

      assertNotNull(getBucketObjectsOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetBucketObjects" })
  public void testDeactivateBucket() throws Exception {
    try {
      DeactivateBucketOptions deactivateBucketOptions = new DeactivateBucketOptions.Builder()
        .bucketId("samplebucket123")
        .accept("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<InputStream> response = service.deactivateBucket(deactivateBucketOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeactivateBucket" })
  public void testRegisterBucket() throws Exception {
    try {
      BucketDetails bucketDetailsModel = new BucketDetails.Builder()
        .accessKey("<access_key>")
        .bucketName("sample-bucket")
        .endpoint("https://s3.<region>.cloud-object-storage.appdomain.cloud/")
        .secretKey("<secret_key>")
        .build();

      RegisterBucketOptions registerBucketOptions = new RegisterBucketOptions.Builder()
        .bucketDetails(bucketDetailsModel)
        .description("COS bucket for customer data")
        .tableType("iceberg")
        .bucketType("ibm_cos")
        .catalogName("sampleCatalog")
        .managedBy("ibm")
        .bucketDisplayName("sample-bucket-displayname")
        .bucketTags(java.util.Arrays.asList("read customer data", "write customer data'"))
        .catalogTags(java.util.Arrays.asList("catalog_tag_1", "catalog_tag_2"))
        .thriftUri("thrift://samplehost-metastore:4354")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<RegisterBucketCreatedBody> response = service.registerBucket(registerBucketOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      RegisterBucketCreatedBody registerBucketCreatedBodyResult = response.getResult();

      assertNotNull(registerBucketCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRegisterBucket" })
  public void testUpdateBucket() throws Exception {
    try {
      UpdateBucketOptions updateBucketOptions = new UpdateBucketOptions.Builder()
        .bucketId("samplebucket123")
        .accessKey("<access_key>")
        .bucketDisplayName("sample-bucket-displayname")
        .description("COS bucket for customer data")
        .secretKey("<secret_key>")
        .tags(java.util.Arrays.asList("testbucket", "userbucket"))
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.updateBucket(updateBucketOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();

      assertNotNull(successResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateBucket" })
  public void testActivateBucket() throws Exception {
    try {
      ActivateBucketOptions activateBucketOptions = new ActivateBucketOptions.Builder()
        .bucketId("samplebucket123")
        .accept("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<InputStream> response = service.activateBucket(activateBucketOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testActivateBucket" })
  public void testGetDatabases() throws Exception {
    try {
      GetDatabasesOptions getDatabasesOptions = new GetDatabasesOptions.Builder()
        .accept("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<InputStream> response = service.getDatabases(getDatabasesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDatabases" })
  public void testCreateDatabaseCatalog() throws Exception {
    try {
      RegisterDatabaseCatalogBodyDatabaseDetails registerDatabaseCatalogBodyDatabaseDetailsModel = new RegisterDatabaseCatalogBodyDatabaseDetails.Builder()
        .password("samplepassword")
        .port("4553")
        .ssl(true)
        .tables("kafka_table_name")
        .username("sampleuser")
        .databaseName("new_database")
        .hostname("db2@<hostname>.com")
        .build();

      CreateDatabaseCatalogOptions createDatabaseCatalogOptions = new CreateDatabaseCatalogOptions.Builder()
        .databaseDisplayName("new_database")
        .databaseType("db2")
        .catalogName("sampleCatalog")
        .databaseDetails(registerDatabaseCatalogBodyDatabaseDetailsModel)
        .description("db2 extenal database description")
        .tags(java.util.Arrays.asList("tag_1", "tag_2"))
        .createdBy("<username>@<domain>.com")
        .createdOn(Long.valueOf("26"))
        .accept("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<InputStream> response = service.createDatabaseCatalog(createDatabaseCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDatabaseCatalog" })
  public void testUpdateDatabase() throws Exception {
    try {
      UpdateDatabaseBodyDatabaseDetails updateDatabaseBodyDatabaseDetailsModel = new UpdateDatabaseBodyDatabaseDetails.Builder()
        .password("samplepassword")
        .username("sampleuser")
        .build();

      UpdateDatabaseOptions updateDatabaseOptions = new UpdateDatabaseOptions.Builder()
        .databaseId("new_db_id")
        .databaseDetails(updateDatabaseBodyDatabaseDetailsModel)
        .databaseDisplayName("new_database")
        .description("External database description")
        .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
        .accept("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<InputStream> response = service.updateDatabase(updateDatabaseOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDatabase" })
  public void testPauseEngine() throws Exception {
    try {
      PauseEngineOptions pauseEngineOptions = new PauseEngineOptions.Builder()
        .engineId("testString")
        .createdBy("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<PauseEngineCreatedBody> response = service.pauseEngine(pauseEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PauseEngineCreatedBody pauseEngineCreatedBodyResult = response.getResult();

      assertNotNull(pauseEngineCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPauseEngine" })
  public void testGetEngines() throws Exception {
    try {
      GetEnginesOptions getEnginesOptions = new GetEnginesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetEnginesOKBody> response = service.getEngines(getEnginesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetEnginesOKBody getEnginesOkBodyResult = response.getResult();

      assertNotNull(getEnginesOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetEngines" })
  public void testGetDeployments() throws Exception {
    try {
      GetDeploymentsOptions getDeploymentsOptions = new GetDeploymentsOptions.Builder()
        .accept("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<InputStream> response = service.getDeployments(getDeploymentsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDeployments" })
  public void testUpdateEngine() throws Exception {
    try {
      NodeDescription nodeDescriptionModel = new NodeDescription.Builder()
        .nodeType("worker")
        .quantity(Long.valueOf("26"))
        .build();

      UpdateEngineOptions updateEngineOptions = new UpdateEngineOptions.Builder()
        .engineId("sampleEngine123")
        .coordinator(nodeDescriptionModel)
        .description("presto engine updated description")
        .engineDisplayName("sampleEngine")
        .tags(java.util.Arrays.asList("tag1", "tag2"))
        .worker(nodeDescriptionModel)
        .accept("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<InputStream> response = service.updateEngine(updateEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateEngine" })
  public void testCreateEngine() throws Exception {
    try {
      NodeDescriptionBody nodeDescriptionBodyModel = new NodeDescriptionBody.Builder()
        .nodeType("worker")
        .quantity(Long.valueOf("26"))
        .build();

      EngineDetailsBody engineDetailsBodyModel = new EngineDetailsBody.Builder()
        .worker(nodeDescriptionBodyModel)
        .coordinator(nodeDescriptionBodyModel)
        .sizeConfig("starter")
        .build();

      CreateEngineOptions createEngineOptions = new CreateEngineOptions.Builder()
        .version("1.2.3")
        .engineDetails(engineDetailsBodyModel)
        .origin("ibm")
        .type("presto")
        .description("presto engine description")
        .engineDisplayName("sampleEngine")
        .firstTimeUse(true)
        .region("us-south")
        .associatedCatalogs(java.util.Arrays.asList("new_catalog_1", "new_catalog_2"))
        .accept("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<InputStream> response = service.createEngine(createEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateEngine" })
  public void testResumeEngine() throws Exception {
    try {
      ResumeEngineOptions resumeEngineOptions = new ResumeEngineOptions.Builder()
        .engineId("eng_id")
        .createdBy("<username>@<domain>.com")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ResumeEngineCreatedBody> response = service.resumeEngine(resumeEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ResumeEngineCreatedBody resumeEngineCreatedBodyResult = response.getResult();

      assertNotNull(resumeEngineCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testResumeEngine" })
  public void testExplainAnalyzeStatement() throws Exception {
    try {
      ExplainAnalyzeStatementOptions explainAnalyzeStatementOptions = new ExplainAnalyzeStatementOptions.Builder()
        .catalogName("sampleCatalog")
        .engineId("sampleEngine1")
        .schemaName("new_schema")
        .statement("show schemas in catalog")
        .verbose(true)
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ExplainAnalyzeStatementCreatedBody> response = service.explainAnalyzeStatement(explainAnalyzeStatementOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ExplainAnalyzeStatementCreatedBody explainAnalyzeStatementCreatedBodyResult = response.getResult();

      assertNotNull(explainAnalyzeStatementCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testExplainAnalyzeStatement" })
  public void testExplainStatement() throws Exception {
    try {
      ExplainStatementOptions explainStatementOptions = new ExplainStatementOptions.Builder()
        .engineId("eng_id")
        .statement("show schemas")
        .catalogName("sampleCatalog")
        .format("json")
        .schemaName("new_schema")
        .type("io")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<ExplainStatementCreatedBody> response = service.explainStatement(explainStatementOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ExplainStatementCreatedBody explainStatementCreatedBodyResult = response.getResult();

      assertNotNull(explainStatementCreatedBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testExplainStatement" })
  public void testTestLhConsole() throws Exception {
    try {
      TestLHConsoleOptions testLhConsoleOptions = new TestLHConsoleOptions();

      // Invoke operation
      Response<SuccessResponse> response = service.testLHConsole(testLhConsoleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();

      assertNotNull(successResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testTestLhConsole" })
  public void testGetMetastores() throws Exception {
    try {
      GetMetastoresOptions getMetastoresOptions = new GetMetastoresOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetMetastoresOKBody> response = service.getMetastores(getMetastoresOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetMetastoresOKBody getMetastoresOkBodyResult = response.getResult();

      assertNotNull(getMetastoresOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetMetastores" })
  public void testGetHms() throws Exception {
    try {
      GetHMSOptions getHmsOptions = new GetHMSOptions.Builder()
        .accept("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<InputStream> response = service.getHMS(getHmsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetHms" })
  public void testAddMetastoreToEngine() throws Exception {
    try {
      AddMetastoreToEngineOptions addMetastoreToEngineOptions = new AddMetastoreToEngineOptions.Builder()
        .catalogName("sampleCatalog")
        .engineId("sampleEngine123")
        .createdBy("<username>@<domain>.com")
        .accept("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<InputStream> response = service.addMetastoreToEngine(addMetastoreToEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testAddMetastoreToEngine" })
  public void testRemoveCatalogFromEngine() throws Exception {
    try {
      RemoveCatalogFromEngineOptions removeCatalogFromEngineOptions = new RemoveCatalogFromEngineOptions.Builder()
        .catalogName("testString")
        .engineId("testString")
        .createdBy("testString")
        .accept("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<InputStream> response = service.removeCatalogFromEngine(removeCatalogFromEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRemoveCatalogFromEngine" })
  public void testSaveQuery() throws Exception {
    try {
      SaveQueryOptions saveQueryOptions = new SaveQueryOptions.Builder()
        .queryName("testString")
        .createdBy("<username>@<domain>.com")
        .description("query to get expense data")
        .queryString("select expenses from expenditure")
        .createdOn("1608437933")
        .engineId("sampleEngine123")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.saveQuery(saveQueryOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SuccessResponse successResponseResult = response.getResult();

      assertNotNull(successResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testSaveQuery" })
  public void testUpdateQuery() throws Exception {
    try {
      UpdateQueryOptions updateQueryOptions = new UpdateQueryOptions.Builder()
        .queryName("testString")
        .queryString("testString")
        .description("testString")
        .newQueryName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.updateQuery(updateQueryOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuccessResponse successResponseResult = response.getResult();

      assertNotNull(successResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateQuery" })
  public void testGetQueries() throws Exception {
    try {
      GetQueriesOptions getQueriesOptions = new GetQueriesOptions.Builder()
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetQueriesOKBody> response = service.getQueries(getQueriesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetQueriesOKBody getQueriesOkBodyResult = response.getResult();

      assertNotNull(getQueriesOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetQueries" })
  public void testCreateSchema() throws Exception {
    try {
      CreateSchemaOptions createSchemaOptions = new CreateSchemaOptions.Builder()
        .catalogName("sampleCatalog")
        .engineId("sampleEngine123")
        .schemaName("new_schema")
        .bucketName("sample-bucket")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.createSchema(createSchemaOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SuccessResponse successResponseResult = response.getResult();

      assertNotNull(successResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSchema" })
  public void testGetSchemas() throws Exception {
    try {
      GetSchemasOptions getSchemasOptions = new GetSchemasOptions.Builder()
        .engineId("testString")
        .catalogName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetSchemasOKBody> response = service.getSchemas(getSchemasOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSchemasOKBody getSchemasOkBodyResult = response.getResult();

      assertNotNull(getSchemasOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSchemas" })
  public void testPostQuery() throws Exception {
    try {
      PostQueryOptions postQueryOptions = new PostQueryOptions.Builder()
        .engine("testString")
        .catalog("testString")
        .schema("testString")
        .sqlQuery("testString")
        .accept("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<InputStream> response = service.postQuery(postQueryOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPostQuery" })
  public void testUpdateTable() throws Exception {
    try {
      UpdateTableBodyAddColumnsItems updateTableBodyAddColumnsItemsModel = new UpdateTableBodyAddColumnsItems.Builder()
        .columnComment("income column")
        .columnName("income")
        .dataType("varchar")
        .build();

      UpdateTableBodyDropColumnsItems updateTableBodyDropColumnsItemsModel = new UpdateTableBodyDropColumnsItems.Builder()
        .columnName("expenditure")
        .build();

      UpdateTableBodyRenameColumnsItems updateTableBodyRenameColumnsItemsModel = new UpdateTableBodyRenameColumnsItems.Builder()
        .columnName("expenditure")
        .newColumnName("expenses")
        .build();

      UpdateTableOptions updateTableOptions = new UpdateTableOptions.Builder()
        .engineId("testString")
        .catalogName("testString")
        .schemaName("testString")
        .tableName("testString")
        .addColumns(java.util.Arrays.asList(updateTableBodyAddColumnsItemsModel))
        .dropColumns(java.util.Arrays.asList(updateTableBodyDropColumnsItemsModel))
        .newTableName("updated_table_name")
        .renameColumns(java.util.Arrays.asList(updateTableBodyRenameColumnsItemsModel))
        .accept("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<InputStream> response = service.updateTable(updateTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateTable" })
  public void testGetTableSnapshots() throws Exception {
    try {
      GetTableSnapshotsOptions getTableSnapshotsOptions = new GetTableSnapshotsOptions.Builder()
        .engineId("testString")
        .catalogName("testString")
        .schemaName("testString")
        .tableName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetTableSnapshotsOKBody> response = service.getTableSnapshots(getTableSnapshotsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetTableSnapshotsOKBody getTableSnapshotsOkBodyResult = response.getResult();

      assertNotNull(getTableSnapshotsOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetTableSnapshots" })
  public void testRollbackSnapshot() throws Exception {
    try {
      RollbackSnapshotOptions rollbackSnapshotOptions = new RollbackSnapshotOptions.Builder()
        .engineId("testString")
        .catalogName("testString")
        .schemaName("testString")
        .snapshotId("2332342122211222")
        .tableName("new_table")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<SuccessResponse> response = service.rollbackSnapshot(rollbackSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SuccessResponse successResponseResult = response.getResult();

      assertNotNull(successResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRollbackSnapshot" })
  public void testGetTables() throws Exception {
    try {
      GetTablesOptions getTablesOptions = new GetTablesOptions.Builder()
        .engineId("testString")
        .catalogName("testString")
        .schemaName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<GetTablesOKBody> response = service.getTables(getTablesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetTablesOKBody getTablesOkBodyResult = response.getResult();

      assertNotNull(getTablesOkBodyResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetTables" })
  public void testParseCsv() throws Exception {
    try {
      ParseCsvOptions parseCsvOptions = new ParseCsvOptions.Builder()
        .engine("testString")
        .parseFile("testString")
        .fileType("testString")
        .accept("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<InputStream> response = service.parseCsv(parseCsvOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testParseCsv" })
  public void testUplaodCsv() throws Exception {
    try {
      UplaodCsvOptions uplaodCsvOptions = new UplaodCsvOptions.Builder()
        .engine("testString")
        .catalog("testString")
        .schema("testString")
        .tableName("testString")
        .ingestionJobName("testString")
        .scheduled("testString")
        .createdBy("testString")
        .targetTable("testString")
        .headers("testString")
        .csv("testString")
        .accept("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<InputStream> response = service.uplaodCsv(uplaodCsvOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUplaodCsv" })
  public void testDeleteDataPolicies() throws Exception {
    try {
      DeleteDataPoliciesOptions deleteDataPoliciesOptions = new DeleteDataPoliciesOptions.Builder()
        .dataPolicies(java.util.Arrays.asList("testString"))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDataPolicies(deleteDataPoliciesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDataPolicies" })
  public void testDeleteEngineUsers() throws Exception {
    try {
      DeleteEngineUsersOptions deleteEngineUsersOptions = new DeleteEngineUsersOptions.Builder()
        .engineId("testString")
        .groups(java.util.Arrays.asList("testString"))
        .users(java.util.Arrays.asList("testString"))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteEngineUsers(deleteEngineUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteEngineUsers" })
  public void testDeleteDbConnUsers() throws Exception {
    try {
      DeleteDbConnUsersOptions deleteDbConnUsersOptions = new DeleteDbConnUsersOptions.Builder()
        .databaseId("testString")
        .groups(java.util.Arrays.asList("testString"))
        .users(java.util.Arrays.asList("testString"))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDbConnUsers(deleteDbConnUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDbConnUsers" })
  public void testDeleteCatalogUsers() throws Exception {
    try {
      DeleteCatalogUsersOptions deleteCatalogUsersOptions = new DeleteCatalogUsersOptions.Builder()
        .catalogName("testString")
        .groups(java.util.Arrays.asList("testString"))
        .users(java.util.Arrays.asList("testString"))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteCatalogUsers(deleteCatalogUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteCatalogUsers" })
  public void testDeleteMetastoreUsers() throws Exception {
    try {
      DeleteMetastoreUsersOptions deleteMetastoreUsersOptions = new DeleteMetastoreUsersOptions.Builder()
        .metastoreName("testString")
        .groups(java.util.Arrays.asList("testString"))
        .users(java.util.Arrays.asList("testString"))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteMetastoreUsers(deleteMetastoreUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteMetastoreUsers" })
  public void testDeleteDataPolicy() throws Exception {
    try {
      DeleteDataPolicyOptions deleteDataPolicyOptions = new DeleteDataPolicyOptions.Builder()
        .policyName("testString")
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDataPolicy(deleteDataPolicyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDataPolicy" })
  public void testDeleteBucketUsers() throws Exception {
    try {
      DeleteBucketUsersOptions deleteBucketUsersOptions = new DeleteBucketUsersOptions.Builder()
        .bucketId("testString")
        .groups(java.util.Arrays.asList("testString"))
        .users(java.util.Arrays.asList("testString"))
        .lhInstanceId("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteBucketUsers(deleteBucketUsersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteBucketUsers" })
  public void testUnregisterBucket() throws Exception {
    try {
      UnregisterBucketOptions unregisterBucketOptions = new UnregisterBucketOptions.Builder()
        .bucketId("bucket_id")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.unregisterBucket(unregisterBucketOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUnregisterBucket" })
  public void testDeleteDatabaseCatalog() throws Exception {
    try {
      DeleteDatabaseCatalogOptions deleteDatabaseCatalogOptions = new DeleteDatabaseCatalogOptions.Builder()
        .databaseId("new_db_id")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDatabaseCatalog(deleteDatabaseCatalogOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDatabaseCatalog" })
  public void testDeleteEngine() throws Exception {
    try {
      DeleteEngineOptions deleteEngineOptions = new DeleteEngineOptions.Builder()
        .engineId("eng_if")
        .createdBy("<username>@<domain>.com")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteEngine(deleteEngineOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteEngine" })
  public void testDeleteQuery() throws Exception {
    try {
      DeleteQueryOptions deleteQueryOptions = new DeleteQueryOptions.Builder()
        .queryName("testString")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteQuery(deleteQueryOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteQuery" })
  public void testDeleteSchema() throws Exception {
    try {
      DeleteSchemaOptions deleteSchemaOptions = new DeleteSchemaOptions.Builder()
        .catalogName("sampleCatalog")
        .engineId("sampleEngine123")
        .schemaName("new_schema")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteSchema(deleteSchemaOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSchema" })
  public void testDeleteTable() throws Exception {
    try {
      DeleteTableBodyDeleteTablesItems deleteTableBodyDeleteTablesItemsModel = new DeleteTableBodyDeleteTablesItems.Builder()
        .catalogName("sampleCatalog")
        .schemaName("new_schema")
        .tableName("new_table")
        .build();

      DeleteTableOptions deleteTableOptions = new DeleteTableOptions.Builder()
        .deleteTables(java.util.Arrays.asList(deleteTableBodyDeleteTablesItemsModel))
        .engineId("sampleEngine123")
        .authInstanceId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteTable(deleteTableOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
