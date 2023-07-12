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
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.WatsonxData;
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
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the WatsonxData service.
 */
public class WatsonxDataTest {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected WatsonxData watsonxDataService;

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    new WatsonxData(serviceName, null);
  }

  // Test the createDbConnUsers operation with a valid options model parameter
  @Test
  public void testCreateDbConnUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}";
    String createDbConnUsersPath = "/access/databases";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the BucketDbConnGroupsMetadata model
    BucketDbConnGroupsMetadata bucketDbConnGroupsMetadataModel = new BucketDbConnGroupsMetadata.Builder()
      .groupId("testString")
      .permission("can_administer")
      .build();

    // Construct an instance of the BucketDbConnUsersMetadata model
    BucketDbConnUsersMetadata bucketDbConnUsersMetadataModel = new BucketDbConnUsersMetadata.Builder()
      .userName("testString")
      .permission("can_administer")
      .build();

    // Construct an instance of the CreateDbConnUsersOptions model
    CreateDbConnUsersOptions createDbConnUsersOptionsModel = new CreateDbConnUsersOptions.Builder()
      .databaseId("testString")
      .groups(java.util.Arrays.asList(bucketDbConnGroupsMetadataModel))
      .users(java.util.Arrays.asList(bucketDbConnUsersMetadataModel))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke createDbConnUsers() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.createDbConnUsers(createDbConnUsersOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDbConnUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDbConnUsers operation with and without retries enabled
  @Test
  public void testCreateDbConnUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateDbConnUsersWOptions();

    watsonxDataService.disableRetries();
    testCreateDbConnUsersWOptions();
  }

  // Test the createDbConnUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDbConnUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createDbConnUsers(null).execute();
  }

  // Test the listDataPolicies operation with a valid options model parameter
  @Test
  public void testListDataPoliciesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"policies\": [{\"rule_count\": 9, \"rules\": [{\"actions\": [\"all\"], \"effect\": \"allow\", \"grantee\": {\"value\": \"value\", \"key\": \"user_name\", \"type\": \"user_identity\"}}], \"status\": \"active\", \"catalog_name\": \"catalogName\", \"data_artifact\": \"schema1/table1/(column1|column2)\", \"metadata\": {\"creator\": \"creator\", \"description\": \"description\", \"modifier\": \"modifier\", \"pid\": \"pid\", \"policy_name\": \"policyName\", \"updated_at\": \"updatedAt\", \"version\": \"version\", \"created_at\": \"createdAt\"}, \"policy_name\": \"policyName\"}], \"total_count\": 10}";
    String listDataPoliciesPath = "/access/data_policies";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataPoliciesOptions model
    ListDataPoliciesOptions listDataPoliciesOptionsModel = new ListDataPoliciesOptions.Builder()
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .catalogName("testString")
      .status("testString")
      .includeMetadata(true)
      .includeRules(true)
      .build();

    // Invoke listDataPolicies() with a valid options model and verify the result
    Response<PolicyListSchema> response = watsonxDataService.listDataPolicies(listDataPoliciesOptionsModel).execute();
    assertNotNull(response);
    PolicyListSchema responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataPoliciesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_name"), "testString");
    assertEquals(query.get("status"), "testString");
    assertEquals(Boolean.valueOf(query.get("include_metadata")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("include_rules")), Boolean.valueOf(true));
  }

  // Test the listDataPolicies operation with and without retries enabled
  @Test
  public void testListDataPoliciesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testListDataPoliciesWOptions();

    watsonxDataService.disableRetries();
    testListDataPoliciesWOptions();
  }

  // Test the createDataPolicy operation with a valid options model parameter
  @Test
  public void testCreateDataPolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"data_policy\": {\"catalog_name\": \"catalogName\", \"data_artifact\": \"schema1/table1/(column1|column2)\", \"description\": \"description\", \"policy_name\": \"policyName\", \"rules\": [{\"actions\": [\"all\"], \"effect\": \"allow\", \"grantee\": {\"value\": \"value\", \"key\": \"user_name\", \"type\": \"user_identity\"}}], \"status\": \"active\"}, \"metadata\": {\"creator\": \"creator\", \"description\": \"description\", \"modifier\": \"modifier\", \"pid\": \"pid\", \"policy_name\": \"policyName\", \"updated_at\": \"updatedAt\", \"version\": \"version\", \"created_at\": \"createdAt\"}, \"response\": {\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}}";
    String createDataPolicyPath = "/access/data_policies";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the RuleGrantee model
    RuleGrantee ruleGranteeModel = new RuleGrantee.Builder()
      .value("testString")
      .key("user_name")
      .type("user_identity")
      .build();

    // Construct an instance of the Rule model
    Rule ruleModel = new Rule.Builder()
      .actions(java.util.Arrays.asList("all"))
      .effect("allow")
      .grantee(ruleGranteeModel)
      .build();

    // Construct an instance of the CreateDataPolicyOptions model
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

    // Invoke createDataPolicy() with a valid options model and verify the result
    Response<CreateDataPolicyCreatedBody> response = watsonxDataService.createDataPolicy(createDataPolicyOptionsModel).execute();
    assertNotNull(response);
    CreateDataPolicyCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDataPolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDataPolicy operation with and without retries enabled
  @Test
  public void testCreateDataPolicyWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateDataPolicyWOptions();

    watsonxDataService.disableRetries();
    testCreateDataPolicyWOptions();
  }

  // Test the createDataPolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataPolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createDataPolicy(null).execute();
  }

  // Test the deleteDataPolicies operation with a valid options model parameter
  @Test
  public void testDeleteDataPoliciesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDataPoliciesPath = "/access/data_policies";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDataPoliciesOptions model
    DeleteDataPoliciesOptions deleteDataPoliciesOptionsModel = new DeleteDataPoliciesOptions.Builder()
      .dataPolicies(java.util.Arrays.asList("testString"))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteDataPolicies() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteDataPolicies(deleteDataPoliciesOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDataPoliciesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDataPolicies operation with and without retries enabled
  @Test
  public void testDeleteDataPoliciesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteDataPoliciesWOptions();

    watsonxDataService.disableRetries();
    testDeleteDataPoliciesWOptions();
  }

  // Test the getEngineUsers operation with a valid options model parameter
  @Test
  public void testGetEngineUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"engine_id\": \"engineId\", \"groups\": [{\"group_id\": \"groupId\", \"permission\": \"can_administer\"}], \"total_count\": 10, \"users\": [{\"permission\": \"can_administer\", \"user_name\": \"userName\"}]}";
    String getEngineUsersPath = "/access/engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetEngineUsersOptions model
    GetEngineUsersOptions getEngineUsersOptionsModel = new GetEngineUsersOptions.Builder()
      .engineId("testString")
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getEngineUsers() with a valid options model and verify the result
    Response<GetEngineUsersSchema> response = watsonxDataService.getEngineUsers(getEngineUsersOptionsModel).execute();
    assertNotNull(response);
    GetEngineUsersSchema responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getEngineUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getEngineUsers operation with and without retries enabled
  @Test
  public void testGetEngineUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetEngineUsersWOptions();

    watsonxDataService.disableRetries();
    testGetEngineUsersWOptions();
  }

  // Test the getEngineUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetEngineUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getEngineUsers(null).execute();
  }

  // Test the deleteEngineUsers operation with a valid options model parameter
  @Test
  public void testDeleteEngineUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteEngineUsersPath = "/access/engines/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteEngineUsersOptions model
    DeleteEngineUsersOptions deleteEngineUsersOptionsModel = new DeleteEngineUsersOptions.Builder()
      .engineId("testString")
      .groups(java.util.Arrays.asList("testString"))
      .users(java.util.Arrays.asList("testString"))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteEngineUsers() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteEngineUsers(deleteEngineUsersOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteEngineUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteEngineUsers operation with and without retries enabled
  @Test
  public void testDeleteEngineUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteEngineUsersWOptions();

    watsonxDataService.disableRetries();
    testDeleteEngineUsersWOptions();
  }

  // Test the deleteEngineUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteEngineUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteEngineUsers(null).execute();
  }

  // Test the updateEngineUsers operation with a valid options model parameter
  @Test
  public void testUpdateEngineUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}";
    String updateEngineUsersPath = "/access/engines/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the EngineGroupsMetadata model
    EngineGroupsMetadata engineGroupsMetadataModel = new EngineGroupsMetadata.Builder()
      .groupId("testString")
      .permission("can_administer")
      .build();

    // Construct an instance of the EngineUsersMetadata model
    EngineUsersMetadata engineUsersMetadataModel = new EngineUsersMetadata.Builder()
      .permission("can_administer")
      .userName("testString")
      .build();

    // Construct an instance of the UpdateEngineUsersOptions model
    UpdateEngineUsersOptions updateEngineUsersOptionsModel = new UpdateEngineUsersOptions.Builder()
      .engineId("testString")
      .groups(java.util.Arrays.asList(engineGroupsMetadataModel))
      .users(java.util.Arrays.asList(engineUsersMetadataModel))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke updateEngineUsers() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.updateEngineUsers(updateEngineUsersOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateEngineUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateEngineUsers operation with and without retries enabled
  @Test
  public void testUpdateEngineUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateEngineUsersWOptions();

    watsonxDataService.disableRetries();
    testUpdateEngineUsersWOptions();
  }

  // Test the updateEngineUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateEngineUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateEngineUsers(null).execute();
  }

  // Test the deleteDbConnUsers operation with a valid options model parameter
  @Test
  public void testDeleteDbConnUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDbConnUsersPath = "/access/databases/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDbConnUsersOptions model
    DeleteDbConnUsersOptions deleteDbConnUsersOptionsModel = new DeleteDbConnUsersOptions.Builder()
      .databaseId("testString")
      .groups(java.util.Arrays.asList("testString"))
      .users(java.util.Arrays.asList("testString"))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteDbConnUsers() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteDbConnUsers(deleteDbConnUsersOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDbConnUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDbConnUsers operation with and without retries enabled
  @Test
  public void testDeleteDbConnUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteDbConnUsersWOptions();

    watsonxDataService.disableRetries();
    testDeleteDbConnUsersWOptions();
  }

  // Test the deleteDbConnUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDbConnUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteDbConnUsers(null).execute();
  }

  // Test the updateDbConnUsers operation with a valid options model parameter
  @Test
  public void testUpdateDbConnUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}";
    String updateDbConnUsersPath = "/access/databases/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the BucketDbConnGroupsMetadata model
    BucketDbConnGroupsMetadata bucketDbConnGroupsMetadataModel = new BucketDbConnGroupsMetadata.Builder()
      .groupId("testString")
      .permission("can_administer")
      .build();

    // Construct an instance of the BucketDbConnUsersMetadata model
    BucketDbConnUsersMetadata bucketDbConnUsersMetadataModel = new BucketDbConnUsersMetadata.Builder()
      .userName("testString")
      .permission("can_administer")
      .build();

    // Construct an instance of the UpdateDbConnUsersOptions model
    UpdateDbConnUsersOptions updateDbConnUsersOptionsModel = new UpdateDbConnUsersOptions.Builder()
      .databaseId("testString")
      .groups(java.util.Arrays.asList(bucketDbConnGroupsMetadataModel))
      .users(java.util.Arrays.asList(bucketDbConnUsersMetadataModel))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke updateDbConnUsers() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.updateDbConnUsers(updateDbConnUsersOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDbConnUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateDbConnUsers operation with and without retries enabled
  @Test
  public void testUpdateDbConnUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateDbConnUsersWOptions();

    watsonxDataService.disableRetries();
    testUpdateDbConnUsersWOptions();
  }

  // Test the updateDbConnUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDbConnUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateDbConnUsers(null).execute();
  }

  // Test the getDbConnUsers operation with a valid options model parameter
  @Test
  public void testGetDbConnUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"groups\": [{\"group_id\": \"groupId\", \"permission\": \"can_administer\"}], \"total_count\": 10, \"users\": [{\"user_name\": \"userName\", \"permission\": \"can_administer\"}], \"database_id\": \"databaseId\"}";
    String getDbConnUsersPath = "/access/databases/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDbConnUsersOptions model
    GetDbConnUsersOptions getDbConnUsersOptionsModel = new GetDbConnUsersOptions.Builder()
      .databaseId("testString")
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getDbConnUsers() with a valid options model and verify the result
    Response<GetDbConnUsersSchema> response = watsonxDataService.getDbConnUsers(getDbConnUsersOptionsModel).execute();
    assertNotNull(response);
    GetDbConnUsersSchema responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDbConnUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDbConnUsers operation with and without retries enabled
  @Test
  public void testGetDbConnUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetDbConnUsersWOptions();

    watsonxDataService.disableRetries();
    testGetDbConnUsersWOptions();
  }

  // Test the getDbConnUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDbConnUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getDbConnUsers(null).execute();
  }

  // Test the createCatalogUsers operation with a valid options model parameter
  @Test
  public void testCreateCatalogUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}";
    String createCatalogUsersPath = "/access/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CatalogGroupsMetadata model
    CatalogGroupsMetadata catalogGroupsMetadataModel = new CatalogGroupsMetadata.Builder()
      .groupId("testString")
      .permission("can_administer")
      .build();

    // Construct an instance of the CatalogUsersMetadata model
    CatalogUsersMetadata catalogUsersMetadataModel = new CatalogUsersMetadata.Builder()
      .permission("can_administer")
      .userName("testString")
      .build();

    // Construct an instance of the CreateCatalogUsersOptions model
    CreateCatalogUsersOptions createCatalogUsersOptionsModel = new CreateCatalogUsersOptions.Builder()
      .catalogName("testString")
      .groups(java.util.Arrays.asList(catalogGroupsMetadataModel))
      .users(java.util.Arrays.asList(catalogUsersMetadataModel))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke createCatalogUsers() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.createCatalogUsers(createCatalogUsersOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createCatalogUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createCatalogUsers operation with and without retries enabled
  @Test
  public void testCreateCatalogUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateCatalogUsersWOptions();

    watsonxDataService.disableRetries();
    testCreateCatalogUsersWOptions();
  }

  // Test the createCatalogUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateCatalogUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createCatalogUsers(null).execute();
  }

  // Test the getCatalogUsers operation with a valid options model parameter
  @Test
  public void testGetCatalogUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"users\": [{\"permission\": \"can_administer\", \"user_name\": \"userName\"}], \"catalog_name\": \"catalogName\", \"groups\": [{\"group_id\": \"groupId\", \"permission\": \"can_administer\"}]}";
    String getCatalogUsersPath = "/access/catalogs/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetCatalogUsersOptions model
    GetCatalogUsersOptions getCatalogUsersOptionsModel = new GetCatalogUsersOptions.Builder()
      .catalogName("testString")
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getCatalogUsers() with a valid options model and verify the result
    Response<GetCatalogUsersSchema> response = watsonxDataService.getCatalogUsers(getCatalogUsersOptionsModel).execute();
    assertNotNull(response);
    GetCatalogUsersSchema responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCatalogUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getCatalogUsers operation with and without retries enabled
  @Test
  public void testGetCatalogUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetCatalogUsersWOptions();

    watsonxDataService.disableRetries();
    testGetCatalogUsersWOptions();
  }

  // Test the getCatalogUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCatalogUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getCatalogUsers(null).execute();
  }

  // Test the deleteCatalogUsers operation with a valid options model parameter
  @Test
  public void testDeleteCatalogUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteCatalogUsersPath = "/access/catalogs/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteCatalogUsersOptions model
    DeleteCatalogUsersOptions deleteCatalogUsersOptionsModel = new DeleteCatalogUsersOptions.Builder()
      .catalogName("testString")
      .groups(java.util.Arrays.asList("testString"))
      .users(java.util.Arrays.asList("testString"))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteCatalogUsers() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteCatalogUsers(deleteCatalogUsersOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteCatalogUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteCatalogUsers operation with and without retries enabled
  @Test
  public void testDeleteCatalogUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteCatalogUsersWOptions();

    watsonxDataService.disableRetries();
    testDeleteCatalogUsersWOptions();
  }

  // Test the deleteCatalogUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteCatalogUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteCatalogUsers(null).execute();
  }

  // Test the updateCatalogUsers operation with a valid options model parameter
  @Test
  public void testUpdateCatalogUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}";
    String updateCatalogUsersPath = "/access/catalogs/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CatalogGroupsMetadata model
    CatalogGroupsMetadata catalogGroupsMetadataModel = new CatalogGroupsMetadata.Builder()
      .groupId("testString")
      .permission("can_administer")
      .build();

    // Construct an instance of the CatalogUsersMetadata model
    CatalogUsersMetadata catalogUsersMetadataModel = new CatalogUsersMetadata.Builder()
      .permission("can_administer")
      .userName("testString")
      .build();

    // Construct an instance of the UpdateCatalogUsersOptions model
    UpdateCatalogUsersOptions updateCatalogUsersOptionsModel = new UpdateCatalogUsersOptions.Builder()
      .catalogName("testString")
      .groups(java.util.Arrays.asList(catalogGroupsMetadataModel))
      .users(java.util.Arrays.asList(catalogUsersMetadataModel))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke updateCatalogUsers() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.updateCatalogUsers(updateCatalogUsersOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateCatalogUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateCatalogUsers operation with and without retries enabled
  @Test
  public void testUpdateCatalogUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateCatalogUsersWOptions();

    watsonxDataService.disableRetries();
    testUpdateCatalogUsersWOptions();
  }

  // Test the updateCatalogUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCatalogUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateCatalogUsers(null).execute();
  }

  // Test the evaluate operation with a valid options model parameter
  @Test
  public void testEvaluateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"resources\": [{\"action\": \"action\", \"resource_name\": \"resourceName\", \"resource_type\": \"resourceType\", \"result\": true}]}";
    String evaluatePath = "/access/evaluation";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ResourcesMetadata model
    ResourcesMetadata resourcesMetadataModel = new ResourcesMetadata.Builder()
      .action("testString")
      .resourceName("testString")
      .resourceType("engine")
      .build();

    // Construct an instance of the EvaluateOptions model
    EvaluateOptions evaluateOptionsModel = new EvaluateOptions.Builder()
      .resources(java.util.Arrays.asList(resourcesMetadataModel))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke evaluate() with a valid options model and verify the result
    Response<EvaluationResultSchema> response = watsonxDataService.evaluate(evaluateOptionsModel).execute();
    assertNotNull(response);
    EvaluationResultSchema responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, evaluatePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the evaluate operation with and without retries enabled
  @Test
  public void testEvaluateWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testEvaluateWOptions();

    watsonxDataService.disableRetries();
    testEvaluateWOptions();
  }

  // Test the getPoliciesList operation with a valid options model parameter
  @Test
  public void testGetPoliciesListWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalog_policies\": [{\"total_count\": 10, \"users\": [{\"permission\": \"can_administer\", \"user_name\": \"userName\"}], \"catalog_name\": \"catalogName\", \"groups\": [{\"group_id\": \"groupId\", \"permission\": \"can_administer\"}]}], \"data_policies\": [{\"rule_count\": 9, \"rules\": [{\"actions\": [\"all\"], \"effect\": \"allow\", \"grantee\": {\"value\": \"value\", \"key\": \"user_name\", \"type\": \"user_identity\"}}], \"status\": \"active\", \"catalog_name\": \"catalogName\", \"data_artifact\": \"schema1/table1/(column1|column2)\", \"metadata\": {\"creator\": \"creator\", \"description\": \"description\", \"modifier\": \"modifier\", \"pid\": \"pid\", \"policy_name\": \"policyName\", \"updated_at\": \"updatedAt\", \"version\": \"version\", \"created_at\": \"createdAt\"}, \"policy_name\": \"policyName\"}], \"engine_policies\": [{\"engine_id\": \"engineId\", \"groups\": [{\"group_id\": \"groupId\", \"permission\": \"can_administer\"}], \"total_count\": 10, \"users\": [{\"permission\": \"can_administer\", \"user_name\": \"userName\"}]}]}";
    String getPoliciesListPath = "/access/policies";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPoliciesListOptions model
    GetPoliciesListOptions getPoliciesListOptionsModel = new GetPoliciesListOptions.Builder()
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .catalogList(java.util.Arrays.asList("testString"))
      .engineList(java.util.Arrays.asList("testString"))
      .dataPoliciesList(java.util.Arrays.asList("testString"))
      .includeDataPolicies(true)
      .build();

    // Invoke getPoliciesList() with a valid options model and verify the result
    Response<PolicySchemaList> response = watsonxDataService.getPoliciesList(getPoliciesListOptionsModel).execute();
    assertNotNull(response);
    PolicySchemaList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPoliciesListPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("catalog_list"), RequestUtils.join(java.util.Arrays.asList("testString"), ","));
    assertEquals(query.get("engine_list"), RequestUtils.join(java.util.Arrays.asList("testString"), ","));
    assertEquals(query.get("data_policies_list"), RequestUtils.join(java.util.Arrays.asList("testString"), ","));
    assertEquals(Boolean.valueOf(query.get("include_data_policies")), Boolean.valueOf(true));
  }

  // Test the getPoliciesList operation with and without retries enabled
  @Test
  public void testGetPoliciesListWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetPoliciesListWOptions();

    watsonxDataService.disableRetries();
    testGetPoliciesListWOptions();
  }

  // Test the createMetastoreUsers operation with a valid options model parameter
  @Test
  public void testCreateMetastoreUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}";
    String createMetastoreUsersPath = "/access/metastores";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GroupsMetadata model
    GroupsMetadata groupsMetadataModel = new GroupsMetadata.Builder()
      .groupId("testString")
      .permission("can_administer")
      .build();

    // Construct an instance of the UsersMetadata model
    UsersMetadata usersMetadataModel = new UsersMetadata.Builder()
      .permission("can_administer")
      .userName("testString")
      .build();

    // Construct an instance of the CreateMetastoreUsersOptions model
    CreateMetastoreUsersOptions createMetastoreUsersOptionsModel = new CreateMetastoreUsersOptions.Builder()
      .metastoreName("testString")
      .groups(java.util.Arrays.asList(groupsMetadataModel))
      .users(java.util.Arrays.asList(usersMetadataModel))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke createMetastoreUsers() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.createMetastoreUsers(createMetastoreUsersOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMetastoreUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createMetastoreUsers operation with and without retries enabled
  @Test
  public void testCreateMetastoreUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateMetastoreUsersWOptions();

    watsonxDataService.disableRetries();
    testCreateMetastoreUsersWOptions();
  }

  // Test the createMetastoreUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMetastoreUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createMetastoreUsers(null).execute();
  }

  // Test the getMetastoreUsers operation with a valid options model parameter
  @Test
  public void testGetMetastoreUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"groups\": [{\"group_id\": \"groupId\", \"permission\": \"can_administer\"}], \"metastore_name\": \"metastoreName\", \"total_count\": 10, \"users\": [{\"permission\": \"can_administer\", \"user_name\": \"userName\"}]}";
    String getMetastoreUsersPath = "/access/metastores/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMetastoreUsersOptions model
    GetMetastoreUsersOptions getMetastoreUsersOptionsModel = new GetMetastoreUsersOptions.Builder()
      .metastoreName("testString")
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getMetastoreUsers() with a valid options model and verify the result
    Response<GetMetastoreUsersSchema> response = watsonxDataService.getMetastoreUsers(getMetastoreUsersOptionsModel).execute();
    assertNotNull(response);
    GetMetastoreUsersSchema responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMetastoreUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getMetastoreUsers operation with and without retries enabled
  @Test
  public void testGetMetastoreUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetMetastoreUsersWOptions();

    watsonxDataService.disableRetries();
    testGetMetastoreUsersWOptions();
  }

  // Test the getMetastoreUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMetastoreUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getMetastoreUsers(null).execute();
  }

  // Test the deleteMetastoreUsers operation with a valid options model parameter
  @Test
  public void testDeleteMetastoreUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteMetastoreUsersPath = "/access/metastores/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteMetastoreUsersOptions model
    DeleteMetastoreUsersOptions deleteMetastoreUsersOptionsModel = new DeleteMetastoreUsersOptions.Builder()
      .metastoreName("testString")
      .groups(java.util.Arrays.asList("testString"))
      .users(java.util.Arrays.asList("testString"))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteMetastoreUsers() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteMetastoreUsers(deleteMetastoreUsersOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteMetastoreUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteMetastoreUsers operation with and without retries enabled
  @Test
  public void testDeleteMetastoreUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteMetastoreUsersWOptions();

    watsonxDataService.disableRetries();
    testDeleteMetastoreUsersWOptions();
  }

  // Test the deleteMetastoreUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteMetastoreUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteMetastoreUsers(null).execute();
  }

  // Test the updateMetastoreUsers operation with a valid options model parameter
  @Test
  public void testUpdateMetastoreUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}";
    String updateMetastoreUsersPath = "/access/metastores/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GroupsMetadata model
    GroupsMetadata groupsMetadataModel = new GroupsMetadata.Builder()
      .groupId("testString")
      .permission("can_administer")
      .build();

    // Construct an instance of the UsersMetadata model
    UsersMetadata usersMetadataModel = new UsersMetadata.Builder()
      .permission("can_administer")
      .userName("testString")
      .build();

    // Construct an instance of the UpdateMetastoreUsersOptions model
    UpdateMetastoreUsersOptions updateMetastoreUsersOptionsModel = new UpdateMetastoreUsersOptions.Builder()
      .metastoreName("testString")
      .groups(java.util.Arrays.asList(groupsMetadataModel))
      .users(java.util.Arrays.asList(usersMetadataModel))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke updateMetastoreUsers() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.updateMetastoreUsers(updateMetastoreUsersOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateMetastoreUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateMetastoreUsers operation with and without retries enabled
  @Test
  public void testUpdateMetastoreUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateMetastoreUsersWOptions();

    watsonxDataService.disableRetries();
    testUpdateMetastoreUsersWOptions();
  }

  // Test the updateMetastoreUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateMetastoreUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateMetastoreUsers(null).execute();
  }

  // Test the createBucketUsers operation with a valid options model parameter
  @Test
  public void testCreateBucketUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}";
    String createBucketUsersPath = "/access/buckets";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the BucketDbConnGroupsMetadata model
    BucketDbConnGroupsMetadata bucketDbConnGroupsMetadataModel = new BucketDbConnGroupsMetadata.Builder()
      .groupId("testString")
      .permission("can_administer")
      .build();

    // Construct an instance of the BucketDbConnUsersMetadata model
    BucketDbConnUsersMetadata bucketDbConnUsersMetadataModel = new BucketDbConnUsersMetadata.Builder()
      .userName("testString")
      .permission("can_administer")
      .build();

    // Construct an instance of the CreateBucketUsersOptions model
    CreateBucketUsersOptions createBucketUsersOptionsModel = new CreateBucketUsersOptions.Builder()
      .bucketId("testString")
      .groups(java.util.Arrays.asList(bucketDbConnGroupsMetadataModel))
      .users(java.util.Arrays.asList(bucketDbConnUsersMetadataModel))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke createBucketUsers() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.createBucketUsers(createBucketUsersOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createBucketUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createBucketUsers operation with and without retries enabled
  @Test
  public void testCreateBucketUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateBucketUsersWOptions();

    watsonxDataService.disableRetries();
    testCreateBucketUsersWOptions();
  }

  // Test the createBucketUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateBucketUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createBucketUsers(null).execute();
  }

  // Test the getDefaultPolicies operation with a valid options model parameter
  @Test
  public void testGetDefaultPoliciesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"grouping_policies\": [{\"domain\": \"domain\", \"inheritor\": \"inheritor\", \"role\": \"role\"}], \"model\": \"model\", \"policies\": [{\"subject\": \"subject\", \"actions\": [\"actions\"], \"domain\": \"domain\", \"object\": \"object\"}]}";
    String getDefaultPoliciesPath = "/access/default_policies";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDefaultPoliciesOptions model
    GetDefaultPoliciesOptions getDefaultPoliciesOptionsModel = new GetDefaultPoliciesOptions.Builder()
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getDefaultPolicies() with a valid options model and verify the result
    Response<DefaultPolicySchema> response = watsonxDataService.getDefaultPolicies(getDefaultPoliciesOptionsModel).execute();
    assertNotNull(response);
    DefaultPolicySchema responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDefaultPoliciesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDefaultPolicies operation with and without retries enabled
  @Test
  public void testGetDefaultPoliciesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetDefaultPoliciesWOptions();

    watsonxDataService.disableRetries();
    testGetDefaultPoliciesWOptions();
  }

  // Test the getPolicyVersion operation with a valid options model parameter
  @Test
  public void testGetPolicyVersionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalog_policies\": [{\"policy_name\": \"policyName\", \"policy_version\": \"policyVersion\"}], \"data_policies\": [{\"associate_catalog\": \"associateCatalog\", \"policy_name\": \"policyName\", \"policy_version\": \"policyVersion\"}], \"database_policies\": [{\"policy_name\": \"policyName\", \"policy_version\": \"policyVersion\"}], \"engine_policies\": [{\"policy_name\": \"policyName\", \"policy_version\": \"policyVersion\"}], \"bucket_policies\": [{\"policy_version\": \"policyVersion\", \"policy_name\": \"policyName\"}]}";
    String getPolicyVersionPath = "/access/policy_versions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetPolicyVersionOptions model
    GetPolicyVersionOptions getPolicyVersionOptionsModel = new GetPolicyVersionOptions.Builder()
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getPolicyVersion() with a valid options model and verify the result
    Response<PolicyVersionResultSchema> response = watsonxDataService.getPolicyVersion(getPolicyVersionOptionsModel).execute();
    assertNotNull(response);
    PolicyVersionResultSchema responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPolicyVersionPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getPolicyVersion operation with and without retries enabled
  @Test
  public void testGetPolicyVersionWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetPolicyVersionWOptions();

    watsonxDataService.disableRetries();
    testGetPolicyVersionWOptions();
  }

  // Test the getDataPolicy operation with a valid options model parameter
  @Test
  public void testGetDataPolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"rule_count\": 9, \"rules\": [{\"actions\": [\"all\"], \"effect\": \"allow\", \"grantee\": {\"value\": \"value\", \"key\": \"user_name\", \"type\": \"user_identity\"}}], \"status\": \"active\", \"catalog_name\": \"catalogName\", \"data_artifact\": \"schema1/table1/(column1|column2)\", \"metadata\": {\"creator\": \"creator\", \"description\": \"description\", \"modifier\": \"modifier\", \"pid\": \"pid\", \"policy_name\": \"policyName\", \"updated_at\": \"updatedAt\", \"version\": \"version\", \"created_at\": \"createdAt\"}, \"policy_name\": \"policyName\"}";
    String getDataPolicyPath = "/access/data_policies/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataPolicyOptions model
    GetDataPolicyOptions getDataPolicyOptionsModel = new GetDataPolicyOptions.Builder()
      .policyName("testString")
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getDataPolicy() with a valid options model and verify the result
    Response<PolicySchema> response = watsonxDataService.getDataPolicy(getDataPolicyOptionsModel).execute();
    assertNotNull(response);
    PolicySchema responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataPolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDataPolicy operation with and without retries enabled
  @Test
  public void testGetDataPolicyWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetDataPolicyWOptions();

    watsonxDataService.disableRetries();
    testGetDataPolicyWOptions();
  }

  // Test the getDataPolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataPolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getDataPolicy(null).execute();
  }

  // Test the replaceDataPolicy operation with a valid options model parameter
  @Test
  public void testReplaceDataPolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"data_policy\": {\"catalog_name\": \"catalogName\", \"data_artifact\": \"schema1/table1/(column1|column2)\", \"description\": \"description\", \"rules\": [{\"actions\": [\"all\"], \"effect\": \"allow\", \"grantee\": {\"value\": \"value\", \"key\": \"user_name\", \"type\": \"user_identity\"}}], \"status\": \"active\"}, \"metadata\": {\"creator\": \"creator\", \"description\": \"description\", \"modifier\": \"modifier\", \"pid\": \"pid\", \"policy_name\": \"policyName\", \"updated_at\": \"updatedAt\", \"version\": \"version\", \"created_at\": \"createdAt\"}, \"response\": {\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}}";
    String replaceDataPolicyPath = "/access/data_policies/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the RuleGrantee model
    RuleGrantee ruleGranteeModel = new RuleGrantee.Builder()
      .value("testString")
      .key("user_name")
      .type("user_identity")
      .build();

    // Construct an instance of the Rule model
    Rule ruleModel = new Rule.Builder()
      .actions(java.util.Arrays.asList("all"))
      .effect("allow")
      .grantee(ruleGranteeModel)
      .build();

    // Construct an instance of the ReplaceDataPolicyOptions model
    ReplaceDataPolicyOptions replaceDataPolicyOptionsModel = new ReplaceDataPolicyOptions.Builder()
      .policyName("testString")
      .catalogName("testString")
      .dataArtifact("schema1/table1/(column1|column2)")
      .rules(java.util.Arrays.asList(ruleModel))
      .description("testString")
      .status("active")
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke replaceDataPolicy() with a valid options model and verify the result
    Response<ReplaceDataPolicyCreatedBody> response = watsonxDataService.replaceDataPolicy(replaceDataPolicyOptionsModel).execute();
    assertNotNull(response);
    ReplaceDataPolicyCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceDataPolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the replaceDataPolicy operation with and without retries enabled
  @Test
  public void testReplaceDataPolicyWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testReplaceDataPolicyWOptions();

    watsonxDataService.disableRetries();
    testReplaceDataPolicyWOptions();
  }

  // Test the replaceDataPolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceDataPolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.replaceDataPolicy(null).execute();
  }

  // Test the deleteDataPolicy operation with a valid options model parameter
  @Test
  public void testDeleteDataPolicyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDataPolicyPath = "/access/data_policies/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDataPolicyOptions model
    DeleteDataPolicyOptions deleteDataPolicyOptionsModel = new DeleteDataPolicyOptions.Builder()
      .policyName("testString")
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteDataPolicy() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteDataPolicy(deleteDataPolicyOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDataPolicyPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDataPolicy operation with and without retries enabled
  @Test
  public void testDeleteDataPolicyWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteDataPolicyWOptions();

    watsonxDataService.disableRetries();
    testDeleteDataPolicyWOptions();
  }

  // Test the deleteDataPolicy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDataPolicyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteDataPolicy(null).execute();
  }

  // Test the createEngineUsers operation with a valid options model parameter
  @Test
  public void testCreateEngineUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}";
    String createEngineUsersPath = "/access/engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the EngineGroupsMetadata model
    EngineGroupsMetadata engineGroupsMetadataModel = new EngineGroupsMetadata.Builder()
      .groupId("testString")
      .permission("can_administer")
      .build();

    // Construct an instance of the EngineUsersMetadata model
    EngineUsersMetadata engineUsersMetadataModel = new EngineUsersMetadata.Builder()
      .permission("can_administer")
      .userName("testString")
      .build();

    // Construct an instance of the CreateEngineUsersOptions model
    CreateEngineUsersOptions createEngineUsersOptionsModel = new CreateEngineUsersOptions.Builder()
      .engineId("testString")
      .groups(java.util.Arrays.asList(engineGroupsMetadataModel))
      .users(java.util.Arrays.asList(engineUsersMetadataModel))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke createEngineUsers() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.createEngineUsers(createEngineUsersOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createEngineUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createEngineUsers operation with and without retries enabled
  @Test
  public void testCreateEngineUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateEngineUsersWOptions();

    watsonxDataService.disableRetries();
    testCreateEngineUsersWOptions();
  }

  // Test the createEngineUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateEngineUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createEngineUsers(null).execute();
  }

  // Test the getBucketUsers operation with a valid options model parameter
  @Test
  public void testGetBucketUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"bucket_id\": \"bucketId\", \"groups\": [{\"group_id\": \"groupId\", \"permission\": \"can_administer\"}], \"total_count\": 10, \"users\": [{\"user_name\": \"userName\", \"permission\": \"can_administer\"}]}";
    String getBucketUsersPath = "/access/buckets/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetBucketUsersOptions model
    GetBucketUsersOptions getBucketUsersOptionsModel = new GetBucketUsersOptions.Builder()
      .bucketId("testString")
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getBucketUsers() with a valid options model and verify the result
    Response<GetBucketUsersSchema> response = watsonxDataService.getBucketUsers(getBucketUsersOptionsModel).execute();
    assertNotNull(response);
    GetBucketUsersSchema responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getBucketUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getBucketUsers operation with and without retries enabled
  @Test
  public void testGetBucketUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetBucketUsersWOptions();

    watsonxDataService.disableRetries();
    testGetBucketUsersWOptions();
  }

  // Test the getBucketUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetBucketUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getBucketUsers(null).execute();
  }

  // Test the deleteBucketUsers operation with a valid options model parameter
  @Test
  public void testDeleteBucketUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteBucketUsersPath = "/access/buckets/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteBucketUsersOptions model
    DeleteBucketUsersOptions deleteBucketUsersOptionsModel = new DeleteBucketUsersOptions.Builder()
      .bucketId("testString")
      .groups(java.util.Arrays.asList("testString"))
      .users(java.util.Arrays.asList("testString"))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteBucketUsers() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteBucketUsers(deleteBucketUsersOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteBucketUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteBucketUsers operation with and without retries enabled
  @Test
  public void testDeleteBucketUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteBucketUsersWOptions();

    watsonxDataService.disableRetries();
    testDeleteBucketUsersWOptions();
  }

  // Test the deleteBucketUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteBucketUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteBucketUsers(null).execute();
  }

  // Test the updateBucketUsers operation with a valid options model parameter
  @Test
  public void testUpdateBucketUsersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}";
    String updateBucketUsersPath = "/access/buckets/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the BucketDbConnGroupsMetadata model
    BucketDbConnGroupsMetadata bucketDbConnGroupsMetadataModel = new BucketDbConnGroupsMetadata.Builder()
      .groupId("testString")
      .permission("can_administer")
      .build();

    // Construct an instance of the BucketDbConnUsersMetadata model
    BucketDbConnUsersMetadata bucketDbConnUsersMetadataModel = new BucketDbConnUsersMetadata.Builder()
      .userName("testString")
      .permission("can_administer")
      .build();

    // Construct an instance of the UpdateBucketUsersOptions model
    UpdateBucketUsersOptions updateBucketUsersOptionsModel = new UpdateBucketUsersOptions.Builder()
      .bucketId("testString")
      .groups(java.util.Arrays.asList(bucketDbConnGroupsMetadataModel))
      .users(java.util.Arrays.asList(bucketDbConnUsersMetadataModel))
      .lhInstanceId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke updateBucketUsers() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.updateBucketUsers(updateBucketUsersOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateBucketUsersPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateBucketUsers operation with and without retries enabled
  @Test
  public void testUpdateBucketUsersWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateBucketUsersWOptions();

    watsonxDataService.disableRetries();
    testUpdateBucketUsersWOptions();
  }

  // Test the updateBucketUsers operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateBucketUsersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateBucketUsers(null).execute();
  }

  // Test the getBuckets operation with a valid options model parameter
  @Test
  public void testGetBucketsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"buckets\": [{\"created_by\": \"<username>@<domain>.com\", \"created_on\": \"1686120645\", \"description\": \"COS bucket for customer data\", \"endpoint\": \"https://s3.<region>.cloud-object-storage.appdomain.cloud/\", \"managed_by\": \"IBM\", \"state\": \"active\", \"tags\": [\"tags\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"bucket_display_name\": \"sample-bucket-displayname\", \"bucket_id\": \"samplebucket123\", \"bucket_name\": \"sample-bucket\", \"bucket_type\": \"ibm_cos\", \"actions\": [\"actions\"]}], \"response\": {\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}}";
    String getBucketsPath = "/buckets";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetBucketsOptions model
    GetBucketsOptions getBucketsOptionsModel = new GetBucketsOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke getBuckets() with a valid options model and verify the result
    Response<GetBucketsOKBody> response = watsonxDataService.getBuckets(getBucketsOptionsModel).execute();
    assertNotNull(response);
    GetBucketsOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getBucketsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getBuckets operation with and without retries enabled
  @Test
  public void testGetBucketsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetBucketsWOptions();

    watsonxDataService.disableRetries();
    testGetBucketsWOptions();
  }

  // Test the getBucketObjects operation with a valid options model parameter
  @Test
  public void testGetBucketObjectsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"objects\": [\"object_1\"], \"response\": {\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}}";
    String getBucketObjectsPath = "/buckets/bucket/objects";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetBucketObjectsOptions model
    GetBucketObjectsOptions getBucketObjectsOptionsModel = new GetBucketObjectsOptions.Builder()
      .bucketId("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getBucketObjects() with a valid options model and verify the result
    Response<GetBucketObjectsOKBody> response = watsonxDataService.getBucketObjects(getBucketObjectsOptionsModel).execute();
    assertNotNull(response);
    GetBucketObjectsOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getBucketObjectsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("bucket_id"), "testString");
  }

  // Test the getBucketObjects operation with and without retries enabled
  @Test
  public void testGetBucketObjectsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetBucketObjectsWOptions();

    watsonxDataService.disableRetries();
    testGetBucketObjectsWOptions();
  }

  // Test the getBucketObjects operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetBucketObjectsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getBucketObjects(null).execute();
  }

  // Test the deactivateBucket operation with a valid options model parameter
  @Test
  public void testDeactivateBucketWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String deactivateBucketPath = "/buckets/bucket/deactivate";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "*/*")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the DeactivateBucketOptions model
    DeactivateBucketOptions deactivateBucketOptionsModel = new DeactivateBucketOptions.Builder()
      .bucketId("samplebucket123")
      .accept("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deactivateBucket() with a valid options model and verify the result
    Response<InputStream> response = watsonxDataService.deactivateBucket(deactivateBucketOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);
    responseObj.close();

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deactivateBucketPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deactivateBucket operation with and without retries enabled
  @Test
  public void testDeactivateBucketWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeactivateBucketWOptions();

    watsonxDataService.disableRetries();
    testDeactivateBucketWOptions();
  }

  // Test the deactivateBucket operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeactivateBucketNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deactivateBucket(null).execute();
  }

  // Test the registerBucket operation with a valid options model parameter
  @Test
  public void testRegisterBucketWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"bucket\": {\"bucket_display_name\": \"bucketDisplayName\", \"bucket_id\": \"bucketId\"}, \"response\": {\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}}";
    String registerBucketPath = "/buckets/bucket";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the BucketDetails model
    BucketDetails bucketDetailsModel = new BucketDetails.Builder()
      .accessKey("<access_key>")
      .bucketName("sample-bucket")
      .endpoint("https://s3.<region>.cloud-object-storage.appdomain.cloud/")
      .secretKey("<secret_key>")
      .build();

    // Construct an instance of the RegisterBucketOptions model
    RegisterBucketOptions registerBucketOptionsModel = new RegisterBucketOptions.Builder()
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

    // Invoke registerBucket() with a valid options model and verify the result
    Response<RegisterBucketCreatedBody> response = watsonxDataService.registerBucket(registerBucketOptionsModel).execute();
    assertNotNull(response);
    RegisterBucketCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, registerBucketPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the registerBucket operation with and without retries enabled
  @Test
  public void testRegisterBucketWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testRegisterBucketWOptions();

    watsonxDataService.disableRetries();
    testRegisterBucketWOptions();
  }

  // Test the registerBucket operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRegisterBucketNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.registerBucket(null).execute();
  }

  // Test the unregisterBucket operation with a valid options model parameter
  @Test
  public void testUnregisterBucketWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String unregisterBucketPath = "/buckets/bucket";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the UnregisterBucketOptions model
    UnregisterBucketOptions unregisterBucketOptionsModel = new UnregisterBucketOptions.Builder()
      .bucketId("bucket_id")
      .authInstanceId("testString")
      .build();

    // Invoke unregisterBucket() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.unregisterBucket(unregisterBucketOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, unregisterBucketPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the unregisterBucket operation with and without retries enabled
  @Test
  public void testUnregisterBucketWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUnregisterBucketWOptions();

    watsonxDataService.disableRetries();
    testUnregisterBucketWOptions();
  }

  // Test the unregisterBucket operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUnregisterBucketNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.unregisterBucket(null).execute();
  }

  // Test the updateBucket operation with a valid options model parameter
  @Test
  public void testUpdateBucketWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}";
    String updateBucketPath = "/buckets/bucket";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateBucketOptions model
    UpdateBucketOptions updateBucketOptionsModel = new UpdateBucketOptions.Builder()
      .bucketId("samplebucket123")
      .accessKey("<access_key>")
      .bucketDisplayName("sample-bucket-displayname")
      .description("COS bucket for customer data")
      .secretKey("<secret_key>")
      .tags(java.util.Arrays.asList("testbucket", "userbucket"))
      .authInstanceId("testString")
      .build();

    // Invoke updateBucket() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.updateBucket(updateBucketOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateBucketPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateBucket operation with and without retries enabled
  @Test
  public void testUpdateBucketWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateBucketWOptions();

    watsonxDataService.disableRetries();
    testUpdateBucketWOptions();
  }

  // Test the updateBucket operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateBucketNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateBucket(null).execute();
  }

  // Test the activateBucket operation with a valid options model parameter
  @Test
  public void testActivateBucketWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String activateBucketPath = "/buckets/bucket/activate";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "*/*")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ActivateBucketOptions model
    ActivateBucketOptions activateBucketOptionsModel = new ActivateBucketOptions.Builder()
      .bucketId("samplebucket123")
      .accept("testString")
      .authInstanceId("testString")
      .build();

    // Invoke activateBucket() with a valid options model and verify the result
    Response<InputStream> response = watsonxDataService.activateBucket(activateBucketOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);
    responseObj.close();

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, activateBucketPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the activateBucket operation with and without retries enabled
  @Test
  public void testActivateBucketWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testActivateBucketWOptions();

    watsonxDataService.disableRetries();
    testActivateBucketWOptions();
  }

  // Test the activateBucket operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testActivateBucketNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.activateBucket(null).execute();
  }

  // Test the getDatabases operation with a valid options model parameter
  @Test
  public void testGetDatabasesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String getDatabasesPath = "/databases";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "*/*")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDatabasesOptions model
    GetDatabasesOptions getDatabasesOptionsModel = new GetDatabasesOptions.Builder()
      .accept("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getDatabases() with a valid options model and verify the result
    Response<InputStream> response = watsonxDataService.getDatabases(getDatabasesOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);
    responseObj.close();

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDatabasesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDatabases operation with and without retries enabled
  @Test
  public void testGetDatabasesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetDatabasesWOptions();

    watsonxDataService.disableRetries();
    testGetDatabasesWOptions();
  }

  // Test the createDatabaseCatalog operation with a valid options model parameter
  @Test
  public void testCreateDatabaseCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String createDatabaseCatalogPath = "/databases/database";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "*/*")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the RegisterDatabaseCatalogBodyDatabaseDetails model
    RegisterDatabaseCatalogBodyDatabaseDetails registerDatabaseCatalogBodyDatabaseDetailsModel = new RegisterDatabaseCatalogBodyDatabaseDetails.Builder()
      .password("samplepassword")
      .port("4553")
      .ssl(true)
      .tables("kafka_table_name")
      .username("sampleuser")
      .databaseName("new_database")
      .hostname("db2@<hostname>.com")
      .build();

    // Construct an instance of the CreateDatabaseCatalogOptions model
    CreateDatabaseCatalogOptions createDatabaseCatalogOptionsModel = new CreateDatabaseCatalogOptions.Builder()
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

    // Invoke createDatabaseCatalog() with a valid options model and verify the result
    Response<InputStream> response = watsonxDataService.createDatabaseCatalog(createDatabaseCatalogOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);
    responseObj.close();

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDatabaseCatalogPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createDatabaseCatalog operation with and without retries enabled
  @Test
  public void testCreateDatabaseCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateDatabaseCatalogWOptions();

    watsonxDataService.disableRetries();
    testCreateDatabaseCatalogWOptions();
  }

  // Test the createDatabaseCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDatabaseCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createDatabaseCatalog(null).execute();
  }

  // Test the deleteDatabaseCatalog operation with a valid options model parameter
  @Test
  public void testDeleteDatabaseCatalogWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDatabaseCatalogPath = "/databases/database";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDatabaseCatalogOptions model
    DeleteDatabaseCatalogOptions deleteDatabaseCatalogOptionsModel = new DeleteDatabaseCatalogOptions.Builder()
      .databaseId("new_db_id")
      .authInstanceId("testString")
      .build();

    // Invoke deleteDatabaseCatalog() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteDatabaseCatalog(deleteDatabaseCatalogOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDatabaseCatalogPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteDatabaseCatalog operation with and without retries enabled
  @Test
  public void testDeleteDatabaseCatalogWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteDatabaseCatalogWOptions();

    watsonxDataService.disableRetries();
    testDeleteDatabaseCatalogWOptions();
  }

  // Test the deleteDatabaseCatalog operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDatabaseCatalogNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteDatabaseCatalog(null).execute();
  }

  // Test the updateDatabase operation with a valid options model parameter
  @Test
  public void testUpdateDatabaseWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String updateDatabasePath = "/databases/database";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "*/*")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateDatabaseBodyDatabaseDetails model
    UpdateDatabaseBodyDatabaseDetails updateDatabaseBodyDatabaseDetailsModel = new UpdateDatabaseBodyDatabaseDetails.Builder()
      .password("samplepassword")
      .username("sampleuser")
      .build();

    // Construct an instance of the UpdateDatabaseOptions model
    UpdateDatabaseOptions updateDatabaseOptionsModel = new UpdateDatabaseOptions.Builder()
      .databaseId("new_db_id")
      .databaseDetails(updateDatabaseBodyDatabaseDetailsModel)
      .databaseDisplayName("new_database")
      .description("External database description")
      .tags(java.util.Arrays.asList("testdatabase", "userdatabase"))
      .accept("testString")
      .authInstanceId("testString")
      .build();

    // Invoke updateDatabase() with a valid options model and verify the result
    Response<InputStream> response = watsonxDataService.updateDatabase(updateDatabaseOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);
    responseObj.close();

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDatabasePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateDatabase operation with and without retries enabled
  @Test
  public void testUpdateDatabaseWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateDatabaseWOptions();

    watsonxDataService.disableRetries();
    testUpdateDatabaseWOptions();
  }

  // Test the updateDatabase operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDatabaseNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateDatabase(null).execute();
  }

  // Test the pauseEngine operation with a valid options model parameter
  @Test
  public void testPauseEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}}";
    String pauseEnginePath = "/engines/engine/pause";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the PauseEngineOptions model
    PauseEngineOptions pauseEngineOptionsModel = new PauseEngineOptions.Builder()
      .engineId("testString")
      .createdBy("testString")
      .authInstanceId("testString")
      .build();

    // Invoke pauseEngine() with a valid options model and verify the result
    Response<PauseEngineCreatedBody> response = watsonxDataService.pauseEngine(pauseEngineOptionsModel).execute();
    assertNotNull(response);
    PauseEngineCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, pauseEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the pauseEngine operation with and without retries enabled
  @Test
  public void testPauseEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testPauseEngineWOptions();

    watsonxDataService.disableRetries();
    testPauseEngineWOptions();
  }

  // Test the pauseEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPauseEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.pauseEngine(null).execute();
  }

  // Test the getEngines operation with a valid options model parameter
  @Test
  public void testGetEnginesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"engines\": [{\"group_id\": \"new_group_id\", \"region\": \"us-south\", \"size_config\": \"starter\", \"created_on\": 9, \"engine_display_name\": \"sampleEngine\", \"origin\": \"ibm\", \"port\": 4, \"type\": \"presto\", \"version\": \"1.2.0\", \"worker\": {\"node_type\": \"worker\", \"quantity\": 8}, \"actions\": [\"actions\"], \"associated_catalogs\": [\"associatedCatalogs\"], \"status\": \"running\", \"tags\": [\"tags\"], \"coordinator\": {\"node_type\": \"worker\", \"quantity\": 8}, \"created_by\": \"<username>@<domain>.com\", \"host_name\": \"ibm-lh-presto-svc.com\", \"status_code\": 10, \"description\": \"presto engine for running sql queries\", \"engine_id\": \"sampleEngine123\"}], \"response\": {\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}}";
    String getEnginesPath = "/engines";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetEnginesOptions model
    GetEnginesOptions getEnginesOptionsModel = new GetEnginesOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke getEngines() with a valid options model and verify the result
    Response<GetEnginesOKBody> response = watsonxDataService.getEngines(getEnginesOptionsModel).execute();
    assertNotNull(response);
    GetEnginesOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getEnginesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getEngines operation with and without retries enabled
  @Test
  public void testGetEnginesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetEnginesWOptions();

    watsonxDataService.disableRetries();
    testGetEnginesWOptions();
  }

  // Test the getDeployments operation with a valid options model parameter
  @Test
  public void testGetDeploymentsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String getDeploymentsPath = "/instance";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "*/*")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDeploymentsOptions model
    GetDeploymentsOptions getDeploymentsOptionsModel = new GetDeploymentsOptions.Builder()
      .accept("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getDeployments() with a valid options model and verify the result
    Response<InputStream> response = watsonxDataService.getDeployments(getDeploymentsOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);
    responseObj.close();

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDeploymentsPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getDeployments operation with and without retries enabled
  @Test
  public void testGetDeploymentsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetDeploymentsWOptions();

    watsonxDataService.disableRetries();
    testGetDeploymentsWOptions();
  }

  // Test the updateEngine operation with a valid options model parameter
  @Test
  public void testUpdateEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String updateEnginePath = "/engines/engine";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "*/*")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the NodeDescription model
    NodeDescription nodeDescriptionModel = new NodeDescription.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("26"))
      .build();

    // Construct an instance of the UpdateEngineOptions model
    UpdateEngineOptions updateEngineOptionsModel = new UpdateEngineOptions.Builder()
      .engineId("sampleEngine123")
      .coordinator(nodeDescriptionModel)
      .description("presto engine updated description")
      .engineDisplayName("sampleEngine")
      .tags(java.util.Arrays.asList("tag1", "tag2"))
      .worker(nodeDescriptionModel)
      .accept("testString")
      .authInstanceId("testString")
      .build();

    // Invoke updateEngine() with a valid options model and verify the result
    Response<InputStream> response = watsonxDataService.updateEngine(updateEngineOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);
    responseObj.close();

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateEngine operation with and without retries enabled
  @Test
  public void testUpdateEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateEngineWOptions();

    watsonxDataService.disableRetries();
    testUpdateEngineWOptions();
  }

  // Test the updateEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateEngine(null).execute();
  }

  // Test the createEngine operation with a valid options model parameter
  @Test
  public void testCreateEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String createEnginePath = "/engines/engine";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "*/*")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the NodeDescriptionBody model
    NodeDescriptionBody nodeDescriptionBodyModel = new NodeDescriptionBody.Builder()
      .nodeType("worker")
      .quantity(Long.valueOf("26"))
      .build();

    // Construct an instance of the EngineDetailsBody model
    EngineDetailsBody engineDetailsBodyModel = new EngineDetailsBody.Builder()
      .worker(nodeDescriptionBodyModel)
      .coordinator(nodeDescriptionBodyModel)
      .sizeConfig("starter")
      .build();

    // Construct an instance of the CreateEngineOptions model
    CreateEngineOptions createEngineOptionsModel = new CreateEngineOptions.Builder()
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

    // Invoke createEngine() with a valid options model and verify the result
    Response<InputStream> response = watsonxDataService.createEngine(createEngineOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);
    responseObj.close();

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createEngine operation with and without retries enabled
  @Test
  public void testCreateEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateEngineWOptions();

    watsonxDataService.disableRetries();
    testCreateEngineWOptions();
  }

  // Test the createEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createEngine(null).execute();
  }

  // Test the deleteEngine operation with a valid options model parameter
  @Test
  public void testDeleteEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteEnginePath = "/engines/engine";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteEngineOptions model
    DeleteEngineOptions deleteEngineOptionsModel = new DeleteEngineOptions.Builder()
      .engineId("eng_if")
      .createdBy("<username>@<domain>.com")
      .authInstanceId("testString")
      .build();

    // Invoke deleteEngine() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteEngine(deleteEngineOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteEngine operation with and without retries enabled
  @Test
  public void testDeleteEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteEngineWOptions();

    watsonxDataService.disableRetries();
    testDeleteEngineWOptions();
  }

  // Test the deleteEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteEngine(null).execute();
  }

  // Test the resumeEngine operation with a valid options model parameter
  @Test
  public void testResumeEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}}";
    String resumeEnginePath = "/engines/engine/resume";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ResumeEngineOptions model
    ResumeEngineOptions resumeEngineOptionsModel = new ResumeEngineOptions.Builder()
      .engineId("eng_id")
      .createdBy("<username>@<domain>.com")
      .authInstanceId("testString")
      .build();

    // Invoke resumeEngine() with a valid options model and verify the result
    Response<ResumeEngineCreatedBody> response = watsonxDataService.resumeEngine(resumeEngineOptionsModel).execute();
    assertNotNull(response);
    ResumeEngineCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, resumeEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the resumeEngine operation with and without retries enabled
  @Test
  public void testResumeEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testResumeEngineWOptions();

    watsonxDataService.disableRetries();
    testResumeEngineWOptions();
  }

  // Test the resumeEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResumeEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.resumeEngine(null).execute();
  }

  // Test the explainAnalyzeStatement operation with a valid options model parameter
  @Test
  public void testExplainAnalyzeStatementWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}, \"result\": \"result\"}";
    String explainAnalyzeStatementPath = "/explainanalyze";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ExplainAnalyzeStatementOptions model
    ExplainAnalyzeStatementOptions explainAnalyzeStatementOptionsModel = new ExplainAnalyzeStatementOptions.Builder()
      .catalogName("sampleCatalog")
      .engineId("sampleEngine1")
      .schemaName("new_schema")
      .statement("show schemas in catalog")
      .verbose(true)
      .authInstanceId("testString")
      .build();

    // Invoke explainAnalyzeStatement() with a valid options model and verify the result
    Response<ExplainAnalyzeStatementCreatedBody> response = watsonxDataService.explainAnalyzeStatement(explainAnalyzeStatementOptionsModel).execute();
    assertNotNull(response);
    ExplainAnalyzeStatementCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, explainAnalyzeStatementPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the explainAnalyzeStatement operation with and without retries enabled
  @Test
  public void testExplainAnalyzeStatementWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testExplainAnalyzeStatementWOptions();

    watsonxDataService.disableRetries();
    testExplainAnalyzeStatementWOptions();
  }

  // Test the explainAnalyzeStatement operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testExplainAnalyzeStatementNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.explainAnalyzeStatement(null).execute();
  }

  // Test the explainStatement operation with a valid options model parameter
  @Test
  public void testExplainStatementWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}, \"result\": \"result\"}";
    String explainStatementPath = "/explain";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ExplainStatementOptions model
    ExplainStatementOptions explainStatementOptionsModel = new ExplainStatementOptions.Builder()
      .engineId("eng_id")
      .statement("show schemas")
      .catalogName("sampleCatalog")
      .format("json")
      .schemaName("new_schema")
      .type("io")
      .authInstanceId("testString")
      .build();

    // Invoke explainStatement() with a valid options model and verify the result
    Response<ExplainStatementCreatedBody> response = watsonxDataService.explainStatement(explainStatementOptionsModel).execute();
    assertNotNull(response);
    ExplainStatementCreatedBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, explainStatementPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the explainStatement operation with and without retries enabled
  @Test
  public void testExplainStatementWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testExplainStatementWOptions();

    watsonxDataService.disableRetries();
    testExplainStatementWOptions();
  }

  // Test the explainStatement operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testExplainStatementNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.explainStatement(null).execute();
  }

  // Test the testLHConsole operation with a valid options model parameter
  @Test
  public void testTestLhConsoleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}";
    String testLHConsolePath = "/ready";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the TestLHConsoleOptions model
    TestLHConsoleOptions testLhConsoleOptionsModel = new TestLHConsoleOptions();

    // Invoke testLHConsole() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.testLHConsole(testLhConsoleOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, testLHConsolePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the testLHConsole operation with and without retries enabled
  @Test
  public void testTestLhConsoleWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testTestLhConsoleWOptions();

    watsonxDataService.disableRetries();
    testTestLhConsoleWOptions();
  }

  // Test the getMetastores operation with a valid options model parameter
  @Test
  public void testGetMetastoresWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"catalogs\": [{\"catalog_name\": \"sampleCatalog\", \"hostname\": \"s3a://samplehost.com\", \"managed_by\": \"ibm\", \"status\": \"running\", \"tags\": [\"tags\"], \"actions\": [\"actions\"], \"associated_buckets\": [\"associatedBuckets\"], \"created_by\": \"<username>@<domain>.com\", \"thrift_uri\": \"thrift://samplehost-metastore:4354\", \"catalog_type\": \"iceberg\", \"description\": \"Iceberg catalog description\", \"associated_databases\": [\"associatedDatabases\"], \"associated_engines\": [\"associatedEngines\"], \"created_on\": \"1602839833\", \"port\": \"3232\"}], \"response\": {\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}}";
    String getMetastoresPath = "/catalogs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMetastoresOptions model
    GetMetastoresOptions getMetastoresOptionsModel = new GetMetastoresOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke getMetastores() with a valid options model and verify the result
    Response<GetMetastoresOKBody> response = watsonxDataService.getMetastores(getMetastoresOptionsModel).execute();
    assertNotNull(response);
    GetMetastoresOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMetastoresPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getMetastores operation with and without retries enabled
  @Test
  public void testGetMetastoresWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetMetastoresWOptions();

    watsonxDataService.disableRetries();
    testGetMetastoresWOptions();
  }

  // Test the getHMS operation with a valid options model parameter
  @Test
  public void testGetHmsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String getHMSPath = "/metastores";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "*/*")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetHMSOptions model
    GetHMSOptions getHmsOptionsModel = new GetHMSOptions.Builder()
      .accept("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getHMS() with a valid options model and verify the result
    Response<InputStream> response = watsonxDataService.getHMS(getHmsOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);
    responseObj.close();

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getHMSPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getHMS operation with and without retries enabled
  @Test
  public void testGetHmsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetHmsWOptions();

    watsonxDataService.disableRetries();
    testGetHmsWOptions();
  }

  // Test the addMetastoreToEngine operation with a valid options model parameter
  @Test
  public void testAddMetastoreToEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String addMetastoreToEnginePath = "/catalogs/add_catalog_to_engine";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "*/*")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the AddMetastoreToEngineOptions model
    AddMetastoreToEngineOptions addMetastoreToEngineOptionsModel = new AddMetastoreToEngineOptions.Builder()
      .catalogName("sampleCatalog")
      .engineId("sampleEngine123")
      .createdBy("<username>@<domain>.com")
      .accept("testString")
      .authInstanceId("testString")
      .build();

    // Invoke addMetastoreToEngine() with a valid options model and verify the result
    Response<InputStream> response = watsonxDataService.addMetastoreToEngine(addMetastoreToEngineOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);
    responseObj.close();

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, addMetastoreToEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the addMetastoreToEngine operation with and without retries enabled
  @Test
  public void testAddMetastoreToEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testAddMetastoreToEngineWOptions();

    watsonxDataService.disableRetries();
    testAddMetastoreToEngineWOptions();
  }

  // Test the addMetastoreToEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddMetastoreToEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.addMetastoreToEngine(null).execute();
  }

  // Test the removeCatalogFromEngine operation with a valid options model parameter
  @Test
  public void testRemoveCatalogFromEngineWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String removeCatalogFromEnginePath = "/catalogs/remove_catalog_from_engine";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "*/*")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the RemoveCatalogFromEngineOptions model
    RemoveCatalogFromEngineOptions removeCatalogFromEngineOptionsModel = new RemoveCatalogFromEngineOptions.Builder()
      .catalogName("testString")
      .engineId("testString")
      .createdBy("testString")
      .accept("testString")
      .authInstanceId("testString")
      .build();

    // Invoke removeCatalogFromEngine() with a valid options model and verify the result
    Response<InputStream> response = watsonxDataService.removeCatalogFromEngine(removeCatalogFromEngineOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);
    responseObj.close();

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, removeCatalogFromEnginePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the removeCatalogFromEngine operation with and without retries enabled
  @Test
  public void testRemoveCatalogFromEngineWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testRemoveCatalogFromEngineWOptions();

    watsonxDataService.disableRetries();
    testRemoveCatalogFromEngineWOptions();
  }

  // Test the removeCatalogFromEngine operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRemoveCatalogFromEngineNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.removeCatalogFromEngine(null).execute();
  }

  // Test the saveQuery operation with a valid options model parameter
  @Test
  public void testSaveQueryWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}";
    String saveQueryPath = "/queries/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the SaveQueryOptions model
    SaveQueryOptions saveQueryOptionsModel = new SaveQueryOptions.Builder()
      .queryName("testString")
      .createdBy("<username>@<domain>.com")
      .description("query to get expense data")
      .queryString("select expenses from expenditure")
      .createdOn("1608437933")
      .engineId("sampleEngine123")
      .authInstanceId("testString")
      .build();

    // Invoke saveQuery() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.saveQuery(saveQueryOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, saveQueryPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the saveQuery operation with and without retries enabled
  @Test
  public void testSaveQueryWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testSaveQueryWOptions();

    watsonxDataService.disableRetries();
    testSaveQueryWOptions();
  }

  // Test the saveQuery operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSaveQueryNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.saveQuery(null).execute();
  }

  // Test the deleteQuery operation with a valid options model parameter
  @Test
  public void testDeleteQueryWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteQueryPath = "/queries/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteQueryOptions model
    DeleteQueryOptions deleteQueryOptionsModel = new DeleteQueryOptions.Builder()
      .queryName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke deleteQuery() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteQuery(deleteQueryOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteQueryPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteQuery operation with and without retries enabled
  @Test
  public void testDeleteQueryWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteQueryWOptions();

    watsonxDataService.disableRetries();
    testDeleteQueryWOptions();
  }

  // Test the deleteQuery operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteQueryNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteQuery(null).execute();
  }

  // Test the updateQuery operation with a valid options model parameter
  @Test
  public void testUpdateQueryWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}";
    String updateQueryPath = "/queries/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateQueryOptions model
    UpdateQueryOptions updateQueryOptionsModel = new UpdateQueryOptions.Builder()
      .queryName("testString")
      .queryString("testString")
      .description("testString")
      .newQueryName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke updateQuery() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.updateQuery(updateQueryOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateQueryPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the updateQuery operation with and without retries enabled
  @Test
  public void testUpdateQueryWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateQueryWOptions();

    watsonxDataService.disableRetries();
    testUpdateQueryWOptions();
  }

  // Test the updateQuery operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateQueryNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateQuery(null).execute();
  }

  // Test the getQueries operation with a valid options model parameter
  @Test
  public void testGetQueriesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"queries\": [{\"created_by\": \"<username>@<domain>.com\", \"created_on\": \"1608437933\", \"description\": \"query to get expense data\", \"engine_id\": \"sampleEngine123\", \"query_name\": \"new_query_name\", \"query_string\": \"select expenses from expenditure\"}], \"response\": {\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}}";
    String getQueriesPath = "/queries";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetQueriesOptions model
    GetQueriesOptions getQueriesOptionsModel = new GetQueriesOptions.Builder()
      .authInstanceId("testString")
      .build();

    // Invoke getQueries() with a valid options model and verify the result
    Response<GetQueriesOKBody> response = watsonxDataService.getQueries(getQueriesOptionsModel).execute();
    assertNotNull(response);
    GetQueriesOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getQueriesPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the getQueries operation with and without retries enabled
  @Test
  public void testGetQueriesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetQueriesWOptions();

    watsonxDataService.disableRetries();
    testGetQueriesWOptions();
  }

  // Test the createSchema operation with a valid options model parameter
  @Test
  public void testCreateSchemaWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}";
    String createSchemaPath = "/schemas/schema";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateSchemaOptions model
    CreateSchemaOptions createSchemaOptionsModel = new CreateSchemaOptions.Builder()
      .catalogName("sampleCatalog")
      .engineId("sampleEngine123")
      .schemaName("new_schema")
      .bucketName("sample-bucket")
      .authInstanceId("testString")
      .build();

    // Invoke createSchema() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.createSchema(createSchemaOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSchemaPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the createSchema operation with and without retries enabled
  @Test
  public void testCreateSchemaWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testCreateSchemaWOptions();

    watsonxDataService.disableRetries();
    testCreateSchemaWOptions();
  }

  // Test the createSchema operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateSchemaNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.createSchema(null).execute();
  }

  // Test the deleteSchema operation with a valid options model parameter
  @Test
  public void testDeleteSchemaWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteSchemaPath = "/schemas/schema";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSchemaOptions model
    DeleteSchemaOptions deleteSchemaOptionsModel = new DeleteSchemaOptions.Builder()
      .catalogName("sampleCatalog")
      .engineId("sampleEngine123")
      .schemaName("new_schema")
      .authInstanceId("testString")
      .build();

    // Invoke deleteSchema() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteSchema(deleteSchemaOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSchemaPath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteSchema operation with and without retries enabled
  @Test
  public void testDeleteSchemaWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteSchemaWOptions();

    watsonxDataService.disableRetries();
    testDeleteSchemaWOptions();
  }

  // Test the deleteSchema operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSchemaNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteSchema(null).execute();
  }

  // Test the getSchemas operation with a valid options model parameter
  @Test
  public void testGetSchemasWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}, \"schemas\": [\"schemas\"]}";
    String getSchemasPath = "/schemas";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSchemasOptions model
    GetSchemasOptions getSchemasOptionsModel = new GetSchemasOptions.Builder()
      .engineId("testString")
      .catalogName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getSchemas() with a valid options model and verify the result
    Response<GetSchemasOKBody> response = watsonxDataService.getSchemas(getSchemasOptionsModel).execute();
    assertNotNull(response);
    GetSchemasOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSchemasPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
    assertEquals(query.get("catalog_name"), "testString");
  }

  // Test the getSchemas operation with and without retries enabled
  @Test
  public void testGetSchemasWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetSchemasWOptions();

    watsonxDataService.disableRetries();
    testGetSchemasWOptions();
  }

  // Test the getSchemas operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSchemasNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getSchemas(null).execute();
  }

  // Test the postQuery operation with a valid options model parameter
  @Test
  public void testPostQueryWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String postQueryPath = "/v1/statement";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "*/*")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PostQueryOptions model
    PostQueryOptions postQueryOptionsModel = new PostQueryOptions.Builder()
      .engine("testString")
      .catalog("testString")
      .schema("testString")
      .sqlQuery("testString")
      .accept("testString")
      .authInstanceId("testString")
      .build();

    // Invoke postQuery() with a valid options model and verify the result
    Response<InputStream> response = watsonxDataService.postQuery(postQueryOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);
    responseObj.close();

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, postQueryPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine"), "testString");
  }

  // Test the postQuery operation with and without retries enabled
  @Test
  public void testPostQueryWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testPostQueryWOptions();

    watsonxDataService.disableRetries();
    testPostQueryWOptions();
  }

  // Test the postQuery operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPostQueryNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.postQuery(null).execute();
  }

  // Test the deleteTable operation with a valid options model parameter
  @Test
  public void testDeleteTableWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteTablePath = "/tables/table";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteTableBodyDeleteTablesItems model
    DeleteTableBodyDeleteTablesItems deleteTableBodyDeleteTablesItemsModel = new DeleteTableBodyDeleteTablesItems.Builder()
      .catalogName("sampleCatalog")
      .schemaName("new_schema")
      .tableName("new_table")
      .build();

    // Construct an instance of the DeleteTableOptions model
    DeleteTableOptions deleteTableOptionsModel = new DeleteTableOptions.Builder()
      .deleteTables(java.util.Arrays.asList(deleteTableBodyDeleteTablesItemsModel))
      .engineId("sampleEngine123")
      .authInstanceId("testString")
      .build();

    // Invoke deleteTable() with a valid options model and verify the result
    Response<Void> response = watsonxDataService.deleteTable(deleteTableOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTablePath);
    // Verify that there is no query string
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);
  }

  // Test the deleteTable operation with and without retries enabled
  @Test
  public void testDeleteTableWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testDeleteTableWOptions();

    watsonxDataService.disableRetries();
    testDeleteTableWOptions();
  }

  // Test the deleteTable operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTableNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.deleteTable(null).execute();
  }

  // Test the updateTable operation with a valid options model parameter
  @Test
  public void testUpdateTableWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String updateTablePath = "/tables/table";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "*/*")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateTableBodyAddColumnsItems model
    UpdateTableBodyAddColumnsItems updateTableBodyAddColumnsItemsModel = new UpdateTableBodyAddColumnsItems.Builder()
      .columnComment("income column")
      .columnName("income")
      .dataType("varchar")
      .build();

    // Construct an instance of the UpdateTableBodyDropColumnsItems model
    UpdateTableBodyDropColumnsItems updateTableBodyDropColumnsItemsModel = new UpdateTableBodyDropColumnsItems.Builder()
      .columnName("expenditure")
      .build();

    // Construct an instance of the UpdateTableBodyRenameColumnsItems model
    UpdateTableBodyRenameColumnsItems updateTableBodyRenameColumnsItemsModel = new UpdateTableBodyRenameColumnsItems.Builder()
      .columnName("expenditure")
      .newColumnName("expenses")
      .build();

    // Construct an instance of the UpdateTableOptions model
    UpdateTableOptions updateTableOptionsModel = new UpdateTableOptions.Builder()
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

    // Invoke updateTable() with a valid options model and verify the result
    Response<InputStream> response = watsonxDataService.updateTable(updateTableOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);
    responseObj.close();

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateTablePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
    assertEquals(query.get("catalog_name"), "testString");
    assertEquals(query.get("schema_name"), "testString");
    assertEquals(query.get("table_name"), "testString");
  }

  // Test the updateTable operation with and without retries enabled
  @Test
  public void testUpdateTableWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUpdateTableWOptions();

    watsonxDataService.disableRetries();
    testUpdateTableWOptions();
  }

  // Test the updateTable operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateTableNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.updateTable(null).execute();
  }

  // Test the getTableSnapshots operation with a valid options model parameter
  @Test
  public void testGetTableSnapshotsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}, \"snapshots\": [{\"operation\": \"alter\", \"snapshot_id\": \"2332342122211222\", \"summary\": {\"anyKey\": \"anyValue\"}, \"committed_at\": \"1609379392\"}]}";
    String getTableSnapshotsPath = "/tables/table/snapshots";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTableSnapshotsOptions model
    GetTableSnapshotsOptions getTableSnapshotsOptionsModel = new GetTableSnapshotsOptions.Builder()
      .engineId("testString")
      .catalogName("testString")
      .schemaName("testString")
      .tableName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getTableSnapshots() with a valid options model and verify the result
    Response<GetTableSnapshotsOKBody> response = watsonxDataService.getTableSnapshots(getTableSnapshotsOptionsModel).execute();
    assertNotNull(response);
    GetTableSnapshotsOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTableSnapshotsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
    assertEquals(query.get("catalog_name"), "testString");
    assertEquals(query.get("schema_name"), "testString");
    assertEquals(query.get("table_name"), "testString");
  }

  // Test the getTableSnapshots operation with and without retries enabled
  @Test
  public void testGetTableSnapshotsWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetTableSnapshotsWOptions();

    watsonxDataService.disableRetries();
    testGetTableSnapshotsWOptions();
  }

  // Test the getTableSnapshots operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTableSnapshotsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getTableSnapshots(null).execute();
  }

  // Test the rollbackSnapshot operation with a valid options model parameter
  @Test
  public void testRollbackSnapshotWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}";
    String rollbackSnapshotPath = "/tables/table/rollback";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the RollbackSnapshotOptions model
    RollbackSnapshotOptions rollbackSnapshotOptionsModel = new RollbackSnapshotOptions.Builder()
      .engineId("testString")
      .catalogName("testString")
      .schemaName("testString")
      .snapshotId("2332342122211222")
      .tableName("new_table")
      .authInstanceId("testString")
      .build();

    // Invoke rollbackSnapshot() with a valid options model and verify the result
    Response<SuccessResponse> response = watsonxDataService.rollbackSnapshot(rollbackSnapshotOptionsModel).execute();
    assertNotNull(response);
    SuccessResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, rollbackSnapshotPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
    assertEquals(query.get("catalog_name"), "testString");
    assertEquals(query.get("schema_name"), "testString");
  }

  // Test the rollbackSnapshot operation with and without retries enabled
  @Test
  public void testRollbackSnapshotWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testRollbackSnapshotWOptions();

    watsonxDataService.disableRetries();
    testRollbackSnapshotWOptions();
  }

  // Test the rollbackSnapshot operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRollbackSnapshotNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.rollbackSnapshot(null).execute();
  }

  // Test the getTables operation with a valid options model parameter
  @Test
  public void testGetTablesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"response\": {\"_messageCode_\": \"<message code>\", \"message\": \"Success\"}, \"tables\": [\"tables\"]}";
    String getTablesPath = "/tables";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetTablesOptions model
    GetTablesOptions getTablesOptionsModel = new GetTablesOptions.Builder()
      .engineId("testString")
      .catalogName("testString")
      .schemaName("testString")
      .authInstanceId("testString")
      .build();

    // Invoke getTables() with a valid options model and verify the result
    Response<GetTablesOKBody> response = watsonxDataService.getTables(getTablesOptionsModel).execute();
    assertNotNull(response);
    GetTablesOKBody responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTablesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine_id"), "testString");
    assertEquals(query.get("catalog_name"), "testString");
    assertEquals(query.get("schema_name"), "testString");
  }

  // Test the getTables operation with and without retries enabled
  @Test
  public void testGetTablesWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testGetTablesWOptions();

    watsonxDataService.disableRetries();
    testGetTablesWOptions();
  }

  // Test the getTables operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTablesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.getTables(null).execute();
  }

  // Test the parseCsv operation with a valid options model parameter
  @Test
  public void testParseCsvWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String parseCsvPath = "/parse/csv";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "*/*")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ParseCsvOptions model
    ParseCsvOptions parseCsvOptionsModel = new ParseCsvOptions.Builder()
      .engine("testString")
      .parseFile("testString")
      .fileType("testString")
      .accept("testString")
      .authInstanceId("testString")
      .build();

    // Invoke parseCsv() with a valid options model and verify the result
    Response<InputStream> response = watsonxDataService.parseCsv(parseCsvOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);
    responseObj.close();

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, parseCsvPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine"), "testString");
  }

  // Test the parseCsv operation with and without retries enabled
  @Test
  public void testParseCsvWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testParseCsvWOptions();

    watsonxDataService.disableRetries();
    testParseCsvWOptions();
  }

  // Test the parseCsv operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testParseCsvNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.parseCsv(null).execute();
  }

  // Test the uplaodCsv operation with a valid options model parameter
  @Test
  public void testUplaodCsvWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String uplaodCsvPath = "/v2/upload/csv";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "*/*")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UplaodCsvOptions model
    UplaodCsvOptions uplaodCsvOptionsModel = new UplaodCsvOptions.Builder()
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

    // Invoke uplaodCsv() with a valid options model and verify the result
    Response<InputStream> response = watsonxDataService.uplaodCsv(uplaodCsvOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);
    responseObj.close();

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, uplaodCsvPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("engine"), "testString");
  }

  // Test the uplaodCsv operation with and without retries enabled
  @Test
  public void testUplaodCsvWRetries() throws Throwable {
    watsonxDataService.enableRetries(4, 30);
    testUplaodCsvWOptions();

    watsonxDataService.disableRetries();
    testUplaodCsvWOptions();
  }

  // Test the uplaodCsv operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUplaodCsvNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    watsonxDataService.uplaodCsv(null).execute();
  }

  // Perform setup needed before each test method
  @BeforeMethod
  public void beforeEachTest() {
    // Start the mock server.
    try {
      server = new MockWebServer();
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }

    // Construct an instance of the service
    constructClientService();
  }

  // Perform tear down after each test method
  @AfterMethod
  public void afterEachTest() throws IOException {
    server.shutdown();
    watsonxDataService = null;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    System.setProperty("TESTSERVICE_AUTH_TYPE", "noAuth");
    final String serviceName = "testService";

    watsonxDataService = WatsonxData.newInstance(serviceName);
    String url = server.url("/").toString();
    watsonxDataService.setServiceUrl(url);
  }
}