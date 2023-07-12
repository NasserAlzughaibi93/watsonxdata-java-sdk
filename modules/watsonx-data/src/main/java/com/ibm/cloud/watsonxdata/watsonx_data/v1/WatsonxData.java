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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.72.2-2bede9d2-20230601-202845
 */

package com.ibm.cloud.watsonxdata.watsonx_data.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import com.ibm.cloud.watsonx_data.common.SdkCommon;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ActivateBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.AddMetastoreToEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateBucketUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateCatalogUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateDataPolicyCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateDataPolicyOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateDatabaseCatalogOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateDbConnUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateEngineUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateMetastoreUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.CreateSchemaOptions;
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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.DeleteTableOptions;
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
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ListDataPoliciesOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ParseCsvOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.PauseEngineCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.PauseEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.PolicyListSchema;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.PolicySchema;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.PolicySchemaList;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.PolicyVersionResultSchema;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.PostQueryOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.RegisterBucketCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.RegisterBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.RemoveCatalogFromEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ReplaceDataPolicyCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ReplaceDataPolicyOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ResumeEngineCreatedBody;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.ResumeEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.RollbackSnapshotOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.SaveQueryOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.SuccessResponse;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.TestLHConsoleOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UnregisterBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateBucketOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateBucketUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateCatalogUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateDatabaseOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateDbConnUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateEngineOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateEngineUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateMetastoreUsersOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateQueryOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UpdateTableOptions;
import com.ibm.cloud.watsonxdata.watsonx_data.v1.model.UplaodCsvOptions;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.MultipartBody;

/**
 * This is the Public API for IBM watsonx.data.
 *
 * API Version: SaaS-GA-1.0.0
 */
public class WatsonxData extends BaseService {

  /**
   * Default service name used when configuring the `WatsonxData` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "watsonx_data";

  /**
   * Default service endpoint URL.
   */
  public static final String DEFAULT_SERVICE_URL = "https://lakehouse/api/v1";

 /**
   * Class method which constructs an instance of the `WatsonxData` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `WatsonxData` client using external configuration
   */
  public static WatsonxData newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `WatsonxData` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `WatsonxData` client using external configuration
   */
  public static WatsonxData newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    WatsonxData service = new WatsonxData(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `WatsonxData` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public WatsonxData(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * Grant users and groups permission to the db connection.
   *
   * You require can_administer permission to perform this action.
   *
   * @param createDbConnUsersOptions the {@link CreateDbConnUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createDbConnUsers(CreateDbConnUsersOptions createDbConnUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDbConnUsersOptions,
      "createDbConnUsersOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/databases"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "createDbConnUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createDbConnUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", createDbConnUsersOptions.lhInstanceId());
    }
    if (createDbConnUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createDbConnUsersOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("database_id", createDbConnUsersOptions.databaseId());
    if (createDbConnUsersOptions.groups() != null) {
      contentJson.add("groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDbConnUsersOptions.groups()));
    }
    if (createDbConnUsersOptions.users() != null) {
      contentJson.add("users", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDbConnUsersOptions.users()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get policies.
   *
   * Get list of all data policies.
   *
   * @param listDataPoliciesOptions the {@link ListDataPoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyListSchema}
   */
  public ServiceCall<PolicyListSchema> listDataPolicies(ListDataPoliciesOptions listDataPoliciesOptions) {
    if (listDataPoliciesOptions == null) {
      listDataPoliciesOptions = new ListDataPoliciesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/data_policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "listDataPolicies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listDataPoliciesOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", listDataPoliciesOptions.lhInstanceId());
    }
    if (listDataPoliciesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", listDataPoliciesOptions.authInstanceId());
    }
    if (listDataPoliciesOptions.catalogName() != null) {
      builder.query("catalog_name", String.valueOf(listDataPoliciesOptions.catalogName()));
    }
    if (listDataPoliciesOptions.status() != null) {
      builder.query("status", String.valueOf(listDataPoliciesOptions.status()));
    }
    if (listDataPoliciesOptions.includeMetadata() != null) {
      builder.query("include_metadata", String.valueOf(listDataPoliciesOptions.includeMetadata()));
    }
    if (listDataPoliciesOptions.includeRules() != null) {
      builder.query("include_rules", String.valueOf(listDataPoliciesOptions.includeRules()));
    }
    ResponseConverter<PolicyListSchema> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyListSchema>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get policies.
   *
   * Get list of all data policies.
   *
   * @return a {@link ServiceCall} with a result of type {@link PolicyListSchema}
   */
  public ServiceCall<PolicyListSchema> listDataPolicies() {
    return listDataPolicies(null);
  }

  /**
   * Create new data policy.
   *
   * Create new data policy.
   *
   * @param createDataPolicyOptions the {@link CreateDataPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CreateDataPolicyCreatedBody}
   */
  public ServiceCall<CreateDataPolicyCreatedBody> createDataPolicy(CreateDataPolicyOptions createDataPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDataPolicyOptions,
      "createDataPolicyOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/data_policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "createDataPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createDataPolicyOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", createDataPolicyOptions.lhInstanceId());
    }
    if (createDataPolicyOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createDataPolicyOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("catalog_name", createDataPolicyOptions.catalogName());
    contentJson.addProperty("data_artifact", createDataPolicyOptions.dataArtifact());
    contentJson.addProperty("policy_name", createDataPolicyOptions.policyName());
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataPolicyOptions.rules()));
    if (createDataPolicyOptions.description() != null) {
      contentJson.addProperty("description", createDataPolicyOptions.description());
    }
    if (createDataPolicyOptions.status() != null) {
      contentJson.addProperty("status", createDataPolicyOptions.status());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CreateDataPolicyCreatedBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CreateDataPolicyCreatedBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Revoke data policy access management policy.
   *
   * You require catalog can_administer permission to perform this action.
   *
   * @param deleteDataPoliciesOptions the {@link DeleteDataPoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDataPolicies(DeleteDataPoliciesOptions deleteDataPoliciesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDataPoliciesOptions,
      "deleteDataPoliciesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/data_policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "deleteDataPolicies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteDataPoliciesOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", deleteDataPoliciesOptions.lhInstanceId());
    }
    if (deleteDataPoliciesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteDataPoliciesOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (deleteDataPoliciesOptions.dataPolicies() != null) {
      contentJson.add("data_policies", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deleteDataPoliciesOptions.dataPolicies()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Revoke data policy access management policy.
   *
   * You require catalog can_administer permission to perform this action.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDataPolicies() {
    return deleteDataPolicies(null);
  }

  /**
   * Get permission in the engine.
   *
   * Get users and groups permission in the engine.
   *
   * @param getEngineUsersOptions the {@link GetEngineUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetEngineUsersSchema}
   */
  public ServiceCall<GetEngineUsersSchema> getEngineUsers(GetEngineUsersOptions getEngineUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getEngineUsersOptions,
      "getEngineUsersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", getEngineUsersOptions.engineId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/engines/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getEngineUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getEngineUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", getEngineUsersOptions.lhInstanceId());
    }
    if (getEngineUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getEngineUsersOptions.authInstanceId());
    }
    ResponseConverter<GetEngineUsersSchema> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetEngineUsersSchema>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Revoke permission to access engine.
   *
   * You require administrator role or can_administer permission to perform this action.
   *
   * @param deleteEngineUsersOptions the {@link DeleteEngineUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteEngineUsers(DeleteEngineUsersOptions deleteEngineUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteEngineUsersOptions,
      "deleteEngineUsersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", deleteEngineUsersOptions.engineId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/engines/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "deleteEngineUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteEngineUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", deleteEngineUsersOptions.lhInstanceId());
    }
    if (deleteEngineUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteEngineUsersOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (deleteEngineUsersOptions.groups() != null) {
      contentJson.add("groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deleteEngineUsersOptions.groups()));
    }
    if (deleteEngineUsersOptions.users() != null) {
      contentJson.add("users", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deleteEngineUsersOptions.users()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Updates user and groups permission in the engine.
   *
   * You require administrator role or can_administer permission to perform this action.
   *
   * @param updateEngineUsersOptions the {@link UpdateEngineUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> updateEngineUsers(UpdateEngineUsersOptions updateEngineUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateEngineUsersOptions,
      "updateEngineUsersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("engine_id", updateEngineUsersOptions.engineId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/engines/{engine_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "updateEngineUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateEngineUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", updateEngineUsersOptions.lhInstanceId());
    }
    if (updateEngineUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateEngineUsersOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateEngineUsersOptions.groups() != null) {
      contentJson.add("groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateEngineUsersOptions.groups()));
    }
    if (updateEngineUsersOptions.users() != null) {
      contentJson.add("users", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateEngineUsersOptions.users()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Revoke permission to access db connection.
   *
   * You require can_administer permission to perform this action.
   *
   * @param deleteDbConnUsersOptions the {@link DeleteDbConnUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDbConnUsers(DeleteDbConnUsersOptions deleteDbConnUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDbConnUsersOptions,
      "deleteDbConnUsersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("database_id", deleteDbConnUsersOptions.databaseId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/databases/{database_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "deleteDbConnUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteDbConnUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", deleteDbConnUsersOptions.lhInstanceId());
    }
    if (deleteDbConnUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteDbConnUsersOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (deleteDbConnUsersOptions.groups() != null) {
      contentJson.add("groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deleteDbConnUsersOptions.groups()));
    }
    if (deleteDbConnUsersOptions.users() != null) {
      contentJson.add("users", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deleteDbConnUsersOptions.users()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Updates user and groups permission in the db connection.
   *
   * You require can_administer permission to perform this action.
   *
   * @param updateDbConnUsersOptions the {@link UpdateDbConnUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> updateDbConnUsers(UpdateDbConnUsersOptions updateDbConnUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDbConnUsersOptions,
      "updateDbConnUsersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("database_id", updateDbConnUsersOptions.databaseId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/databases/{database_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "updateDbConnUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateDbConnUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", updateDbConnUsersOptions.lhInstanceId());
    }
    if (updateDbConnUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateDbConnUsersOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateDbConnUsersOptions.groups() != null) {
      contentJson.add("groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateDbConnUsersOptions.groups()));
    }
    if (updateDbConnUsersOptions.users() != null) {
      contentJson.add("users", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateDbConnUsersOptions.users()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get permission in the db connection.
   *
   * Get users and groups permission in the db connection.
   *
   * @param getDbConnUsersOptions the {@link GetDbConnUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetDbConnUsersSchema}
   */
  public ServiceCall<GetDbConnUsersSchema> getDbConnUsers(GetDbConnUsersOptions getDbConnUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDbConnUsersOptions,
      "getDbConnUsersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("database_id", getDbConnUsersOptions.databaseId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/databases/{database_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getDbConnUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getDbConnUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", getDbConnUsersOptions.lhInstanceId());
    }
    if (getDbConnUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getDbConnUsersOptions.authInstanceId());
    }
    ResponseConverter<GetDbConnUsersSchema> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetDbConnUsersSchema>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Grant users and groups permission to the catalog.
   *
   * You require can_administer permission to perform this action.
   *
   * @param createCatalogUsersOptions the {@link CreateCatalogUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createCatalogUsers(CreateCatalogUsersOptions createCatalogUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createCatalogUsersOptions,
      "createCatalogUsersOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/catalogs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "createCatalogUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createCatalogUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", createCatalogUsersOptions.lhInstanceId());
    }
    if (createCatalogUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createCatalogUsersOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("catalog_name", createCatalogUsersOptions.catalogName());
    if (createCatalogUsersOptions.groups() != null) {
      contentJson.add("groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createCatalogUsersOptions.groups()));
    }
    if (createCatalogUsersOptions.users() != null) {
      contentJson.add("users", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createCatalogUsersOptions.users()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get users and groups permission in the catalog.
   *
   * Get users and groups permission in the catalog.
   *
   * @param getCatalogUsersOptions the {@link GetCatalogUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetCatalogUsersSchema}
   */
  public ServiceCall<GetCatalogUsersSchema> getCatalogUsers(GetCatalogUsersOptions getCatalogUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getCatalogUsersOptions,
      "getCatalogUsersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_name", getCatalogUsersOptions.catalogName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/catalogs/{catalog_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getCatalogUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getCatalogUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", getCatalogUsersOptions.lhInstanceId());
    }
    if (getCatalogUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getCatalogUsersOptions.authInstanceId());
    }
    ResponseConverter<GetCatalogUsersSchema> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetCatalogUsersSchema>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Revoke multiple users and groups permission to access catalog.
   *
   * You require can_administer permission to perform this action.
   *
   * @param deleteCatalogUsersOptions the {@link DeleteCatalogUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteCatalogUsers(DeleteCatalogUsersOptions deleteCatalogUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteCatalogUsersOptions,
      "deleteCatalogUsersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_name", deleteCatalogUsersOptions.catalogName());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/catalogs/{catalog_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "deleteCatalogUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteCatalogUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", deleteCatalogUsersOptions.lhInstanceId());
    }
    if (deleteCatalogUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteCatalogUsersOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (deleteCatalogUsersOptions.groups() != null) {
      contentJson.add("groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deleteCatalogUsersOptions.groups()));
    }
    if (deleteCatalogUsersOptions.users() != null) {
      contentJson.add("users", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deleteCatalogUsersOptions.users()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Updates user and groups permission in the catalog.
   *
   * You require can_administer permission to perform this action.
   *
   * @param updateCatalogUsersOptions the {@link UpdateCatalogUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> updateCatalogUsers(UpdateCatalogUsersOptions updateCatalogUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateCatalogUsersOptions,
      "updateCatalogUsersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("catalog_name", updateCatalogUsersOptions.catalogName());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/catalogs/{catalog_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "updateCatalogUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateCatalogUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", updateCatalogUsersOptions.lhInstanceId());
    }
    if (updateCatalogUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateCatalogUsersOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateCatalogUsersOptions.groups() != null) {
      contentJson.add("groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateCatalogUsersOptions.groups()));
    }
    if (updateCatalogUsersOptions.users() != null) {
      contentJson.add("users", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateCatalogUsersOptions.users()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Evaluate permission.
   *
   * Evaluate user has permission to access resource or not.
   *
   * @param evaluateOptions the {@link EvaluateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EvaluationResultSchema}
   */
  public ServiceCall<EvaluationResultSchema> evaluate(EvaluateOptions evaluateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(evaluateOptions,
      "evaluateOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/evaluation"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "evaluate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (evaluateOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", evaluateOptions.lhInstanceId());
    }
    if (evaluateOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", evaluateOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (evaluateOptions.resources() != null) {
      contentJson.add("resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(evaluateOptions.resources()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<EvaluationResultSchema> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EvaluationResultSchema>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Evaluate permission.
   *
   * Evaluate user has permission to access resource or not.
   *
   * @return a {@link ServiceCall} with a result of type {@link EvaluationResultSchema}
   */
  public ServiceCall<EvaluationResultSchema> evaluate() {
    return evaluate(null);
  }

  /**
   * Get policies for specific catalog in catalog_name list.
   *
   * Get policies list.
   *
   * @param getPoliciesListOptions the {@link GetPoliciesListOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicySchemaList}
   */
  public ServiceCall<PolicySchemaList> getPoliciesList(GetPoliciesListOptions getPoliciesListOptions) {
    if (getPoliciesListOptions == null) {
      getPoliciesListOptions = new GetPoliciesListOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getPoliciesList");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getPoliciesListOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", getPoliciesListOptions.lhInstanceId());
    }
    if (getPoliciesListOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getPoliciesListOptions.authInstanceId());
    }
    if (getPoliciesListOptions.catalogList() != null) {
      builder.query("catalog_list", RequestUtils.join(getPoliciesListOptions.catalogList(), ","));
    }
    if (getPoliciesListOptions.engineList() != null) {
      builder.query("engine_list", RequestUtils.join(getPoliciesListOptions.engineList(), ","));
    }
    if (getPoliciesListOptions.dataPoliciesList() != null) {
      builder.query("data_policies_list", RequestUtils.join(getPoliciesListOptions.dataPoliciesList(), ","));
    }
    if (getPoliciesListOptions.includeDataPolicies() != null) {
      builder.query("include_data_policies", String.valueOf(getPoliciesListOptions.includeDataPolicies()));
    }
    ResponseConverter<PolicySchemaList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicySchemaList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get policies for specific catalog in catalog_name list.
   *
   * Get policies list.
   *
   * @return a {@link ServiceCall} with a result of type {@link PolicySchemaList}
   */
  public ServiceCall<PolicySchemaList> getPoliciesList() {
    return getPoliciesList(null);
  }

  /**
   * Grant users and groups permission to the metastore.
   *
   * You require administrator role or can_administer permission to perform this action.
   *
   * @param createMetastoreUsersOptions the {@link CreateMetastoreUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createMetastoreUsers(CreateMetastoreUsersOptions createMetastoreUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createMetastoreUsersOptions,
      "createMetastoreUsersOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/metastores"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "createMetastoreUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createMetastoreUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", createMetastoreUsersOptions.lhInstanceId());
    }
    if (createMetastoreUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createMetastoreUsersOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("metastore_name", createMetastoreUsersOptions.metastoreName());
    if (createMetastoreUsersOptions.groups() != null) {
      contentJson.add("groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createMetastoreUsersOptions.groups()));
    }
    if (createMetastoreUsersOptions.users() != null) {
      contentJson.add("users", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createMetastoreUsersOptions.users()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get permission in the metastore.
   *
   * Get users and groups permission in the metastore.
   *
   * @param getMetastoreUsersOptions the {@link GetMetastoreUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetMetastoreUsersSchema}
   */
  public ServiceCall<GetMetastoreUsersSchema> getMetastoreUsers(GetMetastoreUsersOptions getMetastoreUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getMetastoreUsersOptions,
      "getMetastoreUsersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("metastore_name", getMetastoreUsersOptions.metastoreName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/metastores/{metastore_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getMetastoreUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getMetastoreUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", getMetastoreUsersOptions.lhInstanceId());
    }
    if (getMetastoreUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getMetastoreUsersOptions.authInstanceId());
    }
    ResponseConverter<GetMetastoreUsersSchema> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetMetastoreUsersSchema>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Revoke permission to access metastore.
   *
   * You require administrator role or can_administer permission to perform this action.
   *
   * @param deleteMetastoreUsersOptions the {@link DeleteMetastoreUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteMetastoreUsers(DeleteMetastoreUsersOptions deleteMetastoreUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteMetastoreUsersOptions,
      "deleteMetastoreUsersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("metastore_name", deleteMetastoreUsersOptions.metastoreName());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/metastores/{metastore_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "deleteMetastoreUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteMetastoreUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", deleteMetastoreUsersOptions.lhInstanceId());
    }
    if (deleteMetastoreUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteMetastoreUsersOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (deleteMetastoreUsersOptions.groups() != null) {
      contentJson.add("groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deleteMetastoreUsersOptions.groups()));
    }
    if (deleteMetastoreUsersOptions.users() != null) {
      contentJson.add("users", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deleteMetastoreUsersOptions.users()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Updates user and groups permission in the metastore.
   *
   * You require administrator role or can_administer permission to perform this action.
   *
   * @param updateMetastoreUsersOptions the {@link UpdateMetastoreUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> updateMetastoreUsers(UpdateMetastoreUsersOptions updateMetastoreUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateMetastoreUsersOptions,
      "updateMetastoreUsersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("metastore_name", updateMetastoreUsersOptions.metastoreName());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/metastores/{metastore_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "updateMetastoreUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateMetastoreUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", updateMetastoreUsersOptions.lhInstanceId());
    }
    if (updateMetastoreUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateMetastoreUsersOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateMetastoreUsersOptions.groups() != null) {
      contentJson.add("groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateMetastoreUsersOptions.groups()));
    }
    if (updateMetastoreUsersOptions.users() != null) {
      contentJson.add("users", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateMetastoreUsersOptions.users()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Grant users and groups permission to the bucket.
   *
   * You require can_administer permission to perform this action.
   *
   * @param createBucketUsersOptions the {@link CreateBucketUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createBucketUsers(CreateBucketUsersOptions createBucketUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createBucketUsersOptions,
      "createBucketUsersOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/buckets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "createBucketUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createBucketUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", createBucketUsersOptions.lhInstanceId());
    }
    if (createBucketUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createBucketUsersOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("bucket_id", createBucketUsersOptions.bucketId());
    if (createBucketUsersOptions.groups() != null) {
      contentJson.add("groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBucketUsersOptions.groups()));
    }
    if (createBucketUsersOptions.users() != null) {
      contentJson.add("users", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createBucketUsersOptions.users()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get AMS default policies.
   *
   * Get AMS default policies.
   *
   * @param getDefaultPoliciesOptions the {@link GetDefaultPoliciesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DefaultPolicySchema}
   */
  public ServiceCall<DefaultPolicySchema> getDefaultPolicies(GetDefaultPoliciesOptions getDefaultPoliciesOptions) {
    if (getDefaultPoliciesOptions == null) {
      getDefaultPoliciesOptions = new GetDefaultPoliciesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/default_policies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getDefaultPolicies");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getDefaultPoliciesOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", getDefaultPoliciesOptions.lhInstanceId());
    }
    if (getDefaultPoliciesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getDefaultPoliciesOptions.authInstanceId());
    }
    ResponseConverter<DefaultPolicySchema> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DefaultPolicySchema>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get AMS default policies.
   *
   * Get AMS default policies.
   *
   * @return a {@link ServiceCall} with a result of type {@link DefaultPolicySchema}
   */
  public ServiceCall<DefaultPolicySchema> getDefaultPolicies() {
    return getDefaultPolicies(null);
  }

  /**
   * Get AMS policies version.
   *
   * Get AMS policies version.
   *
   * @param getPolicyVersionOptions the {@link GetPolicyVersionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicyVersionResultSchema}
   */
  public ServiceCall<PolicyVersionResultSchema> getPolicyVersion(GetPolicyVersionOptions getPolicyVersionOptions) {
    if (getPolicyVersionOptions == null) {
      getPolicyVersionOptions = new GetPolicyVersionOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/policy_versions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getPolicyVersion");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getPolicyVersionOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", getPolicyVersionOptions.lhInstanceId());
    }
    if (getPolicyVersionOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getPolicyVersionOptions.authInstanceId());
    }
    ResponseConverter<PolicyVersionResultSchema> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicyVersionResultSchema>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get AMS policies version.
   *
   * Get AMS policies version.
   *
   * @return a {@link ServiceCall} with a result of type {@link PolicyVersionResultSchema}
   */
  public ServiceCall<PolicyVersionResultSchema> getPolicyVersion() {
    return getPolicyVersion(null);
  }

  /**
   * Get policy.
   *
   * Get policy detail.
   *
   * @param getDataPolicyOptions the {@link GetDataPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PolicySchema}
   */
  public ServiceCall<PolicySchema> getDataPolicy(GetDataPolicyOptions getDataPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataPolicyOptions,
      "getDataPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_name", getDataPolicyOptions.policyName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/data_policies/{policy_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getDataPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getDataPolicyOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", getDataPolicyOptions.lhInstanceId());
    }
    if (getDataPolicyOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getDataPolicyOptions.authInstanceId());
    }
    ResponseConverter<PolicySchema> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PolicySchema>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Updates data policy.
   *
   * You require catalog can_administer permission to perform this action.
   *
   * @param replaceDataPolicyOptions the {@link ReplaceDataPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReplaceDataPolicyCreatedBody}
   */
  public ServiceCall<ReplaceDataPolicyCreatedBody> replaceDataPolicy(ReplaceDataPolicyOptions replaceDataPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceDataPolicyOptions,
      "replaceDataPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_name", replaceDataPolicyOptions.policyName());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/data_policies/{policy_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "replaceDataPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (replaceDataPolicyOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", replaceDataPolicyOptions.lhInstanceId());
    }
    if (replaceDataPolicyOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", replaceDataPolicyOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("catalog_name", replaceDataPolicyOptions.catalogName());
    contentJson.addProperty("data_artifact", replaceDataPolicyOptions.dataArtifact());
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataPolicyOptions.rules()));
    if (replaceDataPolicyOptions.description() != null) {
      contentJson.addProperty("description", replaceDataPolicyOptions.description());
    }
    if (replaceDataPolicyOptions.status() != null) {
      contentJson.addProperty("status", replaceDataPolicyOptions.status());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ReplaceDataPolicyCreatedBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReplaceDataPolicyCreatedBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Revoke data policy access management policy.
   *
   * You require catalog can_administer permission to perform this action.
   *
   * @param deleteDataPolicyOptions the {@link DeleteDataPolicyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDataPolicy(DeleteDataPolicyOptions deleteDataPolicyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDataPolicyOptions,
      "deleteDataPolicyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("policy_name", deleteDataPolicyOptions.policyName());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/data_policies/{policy_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "deleteDataPolicy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteDataPolicyOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", deleteDataPolicyOptions.lhInstanceId());
    }
    if (deleteDataPolicyOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteDataPolicyOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Grant permission to the engine.
   *
   * You require administrator role or can_administer permission to perform this action.
   *
   * @param createEngineUsersOptions the {@link CreateEngineUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createEngineUsers(CreateEngineUsersOptions createEngineUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createEngineUsersOptions,
      "createEngineUsersOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "createEngineUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createEngineUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", createEngineUsersOptions.lhInstanceId());
    }
    if (createEngineUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createEngineUsersOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("engine_id", createEngineUsersOptions.engineId());
    if (createEngineUsersOptions.groups() != null) {
      contentJson.add("groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createEngineUsersOptions.groups()));
    }
    if (createEngineUsersOptions.users() != null) {
      contentJson.add("users", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createEngineUsersOptions.users()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get permission in the bucket.
   *
   * Get users and groups permission in the bucket.
   *
   * @param getBucketUsersOptions the {@link GetBucketUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetBucketUsersSchema}
   */
  public ServiceCall<GetBucketUsersSchema> getBucketUsers(GetBucketUsersOptions getBucketUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBucketUsersOptions,
      "getBucketUsersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bucket_id", getBucketUsersOptions.bucketId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/buckets/{bucket_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getBucketUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getBucketUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", getBucketUsersOptions.lhInstanceId());
    }
    if (getBucketUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getBucketUsersOptions.authInstanceId());
    }
    ResponseConverter<GetBucketUsersSchema> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetBucketUsersSchema>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Revoke permission to access bucket.
   *
   * You require can_administer permission to perform this action.
   *
   * @param deleteBucketUsersOptions the {@link DeleteBucketUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteBucketUsers(DeleteBucketUsersOptions deleteBucketUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteBucketUsersOptions,
      "deleteBucketUsersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bucket_id", deleteBucketUsersOptions.bucketId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/buckets/{bucket_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "deleteBucketUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteBucketUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", deleteBucketUsersOptions.lhInstanceId());
    }
    if (deleteBucketUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteBucketUsersOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (deleteBucketUsersOptions.groups() != null) {
      contentJson.add("groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deleteBucketUsersOptions.groups()));
    }
    if (deleteBucketUsersOptions.users() != null) {
      contentJson.add("users", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deleteBucketUsersOptions.users()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Updates user and groups permission in the bucket.
   *
   * You require can_administer permission to perform this action.
   *
   * @param updateBucketUsersOptions the {@link UpdateBucketUsersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> updateBucketUsers(UpdateBucketUsersOptions updateBucketUsersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateBucketUsersOptions,
      "updateBucketUsersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("bucket_id", updateBucketUsersOptions.bucketId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/access/buckets/{bucket_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "updateBucketUsers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateBucketUsersOptions.lhInstanceId() != null) {
      builder.header("LhInstanceId", updateBucketUsersOptions.lhInstanceId());
    }
    if (updateBucketUsersOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateBucketUsersOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    if (updateBucketUsersOptions.groups() != null) {
      contentJson.add("groups", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateBucketUsersOptions.groups()));
    }
    if (updateBucketUsersOptions.users() != null) {
      contentJson.add("users", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateBucketUsersOptions.users()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get buckets.
   *
   * Get list of all buckets registered to Lakehouse.
   *
   * @param getBucketsOptions the {@link GetBucketsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetBucketsOKBody}
   */
  public ServiceCall<GetBucketsOKBody> getBuckets(GetBucketsOptions getBucketsOptions) {
    if (getBucketsOptions == null) {
      getBucketsOptions = new GetBucketsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/buckets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getBuckets");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getBucketsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getBucketsOptions.authInstanceId());
    }
    ResponseConverter<GetBucketsOKBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetBucketsOKBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get buckets.
   *
   * Get list of all buckets registered to Lakehouse.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetBucketsOKBody}
   */
  public ServiceCall<GetBucketsOKBody> getBuckets() {
    return getBuckets(null);
  }

  /**
   * Get bucket objects.
   *
   * Fetch all objects from a given bucket.
   *
   * @param getBucketObjectsOptions the {@link GetBucketObjectsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetBucketObjectsOKBody}
   */
  public ServiceCall<GetBucketObjectsOKBody> getBucketObjects(GetBucketObjectsOptions getBucketObjectsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getBucketObjectsOptions,
      "getBucketObjectsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/buckets/bucket/objects"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getBucketObjects");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getBucketObjectsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getBucketObjectsOptions.authInstanceId());
    }
    builder.query("bucket_id", String.valueOf(getBucketObjectsOptions.bucketId()));
    ResponseConverter<GetBucketObjectsOKBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetBucketObjectsOKBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Deactivate bucket.
   *
   * Deactivate an active bucket in Lakehouse.
   *
   * @param deactivateBucketOptions the {@link DeactivateBucketOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> deactivateBucket(DeactivateBucketOptions deactivateBucketOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deactivateBucketOptions,
      "deactivateBucketOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/buckets/bucket/deactivate"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "deactivateBucket");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deactivateBucketOptions.accept() != null) {
      builder.header("Accept", deactivateBucketOptions.accept());
    }
    if (deactivateBucketOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deactivateBucketOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("bucket_id", deactivateBucketOptions.bucketId());
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Register bucket.
   *
   * Register a new bucket in Lakehouse.
   *
   * @param registerBucketOptions the {@link RegisterBucketOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RegisterBucketCreatedBody}
   */
  public ServiceCall<RegisterBucketCreatedBody> registerBucket(RegisterBucketOptions registerBucketOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(registerBucketOptions,
      "registerBucketOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/buckets/bucket"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "registerBucket");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (registerBucketOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", registerBucketOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("bucket_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(registerBucketOptions.bucketDetails()));
    contentJson.addProperty("description", registerBucketOptions.description());
    contentJson.addProperty("table_type", registerBucketOptions.tableType());
    contentJson.addProperty("bucket_type", registerBucketOptions.bucketType());
    contentJson.addProperty("catalog_name", registerBucketOptions.catalogName());
    contentJson.addProperty("managed_by", registerBucketOptions.managedBy());
    if (registerBucketOptions.bucketDisplayName() != null) {
      contentJson.addProperty("bucket_display_name", registerBucketOptions.bucketDisplayName());
    }
    if (registerBucketOptions.bucketTags() != null) {
      contentJson.add("bucket_tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(registerBucketOptions.bucketTags()));
    }
    if (registerBucketOptions.catalogTags() != null) {
      contentJson.add("catalog_tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(registerBucketOptions.catalogTags()));
    }
    if (registerBucketOptions.thriftUri() != null) {
      contentJson.addProperty("thrift_uri", registerBucketOptions.thriftUri());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RegisterBucketCreatedBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RegisterBucketCreatedBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Unregister Bucket.
   *
   * Unregister a bucket from Lakehouse.
   *
   * @param unregisterBucketOptions the {@link UnregisterBucketOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> unregisterBucket(UnregisterBucketOptions unregisterBucketOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(unregisterBucketOptions,
      "unregisterBucketOptions cannot be null");
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/buckets/bucket"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "unregisterBucket");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (unregisterBucketOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", unregisterBucketOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("bucket_id", unregisterBucketOptions.bucketId());
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update bucket.
   *
   * Update bucket details/credentials.
   *
   * @param updateBucketOptions the {@link UpdateBucketOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> updateBucket(UpdateBucketOptions updateBucketOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateBucketOptions,
      "updateBucketOptions cannot be null");
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/buckets/bucket"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "updateBucket");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateBucketOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateBucketOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("bucket_id", updateBucketOptions.bucketId());
    if (updateBucketOptions.accessKey() != null) {
      contentJson.addProperty("access_key", updateBucketOptions.accessKey());
    }
    if (updateBucketOptions.bucketDisplayName() != null) {
      contentJson.addProperty("bucket_display_name", updateBucketOptions.bucketDisplayName());
    }
    if (updateBucketOptions.description() != null) {
      contentJson.addProperty("description", updateBucketOptions.description());
    }
    if (updateBucketOptions.secretKey() != null) {
      contentJson.addProperty("secret_key", updateBucketOptions.secretKey());
    }
    if (updateBucketOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateBucketOptions.tags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Active bucket.
   *
   * Activate an invalid bucket in Lakehouse.
   *
   * @param activateBucketOptions the {@link ActivateBucketOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> activateBucket(ActivateBucketOptions activateBucketOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(activateBucketOptions,
      "activateBucketOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/buckets/bucket/activate"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "activateBucket");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (activateBucketOptions.accept() != null) {
      builder.header("Accept", activateBucketOptions.accept());
    }
    if (activateBucketOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", activateBucketOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("bucket_id", activateBucketOptions.bucketId());
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get databases.
   *
   * Get list of all databases in Lakehouse.
   *
   * @param getDatabasesOptions the {@link GetDatabasesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> getDatabases(GetDatabasesOptions getDatabasesOptions) {
    if (getDatabasesOptions == null) {
      getDatabasesOptions = new GetDatabasesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/databases"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getDatabases");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (getDatabasesOptions.accept() != null) {
      builder.header("Accept", getDatabasesOptions.accept());
    }
    if (getDatabasesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getDatabasesOptions.authInstanceId());
    }
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get databases.
   *
   * Get list of all databases in Lakehouse.
   *
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> getDatabases() {
    return getDatabases(null);
  }

  /**
   * Add/Create database.
   *
   * Add or create a new database in Lakehouse.
   *
   * @param createDatabaseCatalogOptions the {@link CreateDatabaseCatalogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> createDatabaseCatalog(CreateDatabaseCatalogOptions createDatabaseCatalogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDatabaseCatalogOptions,
      "createDatabaseCatalogOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/databases/database"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "createDatabaseCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (createDatabaseCatalogOptions.accept() != null) {
      builder.header("Accept", createDatabaseCatalogOptions.accept());
    }
    if (createDatabaseCatalogOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createDatabaseCatalogOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("database_display_name", createDatabaseCatalogOptions.databaseDisplayName());
    contentJson.addProperty("database_type", createDatabaseCatalogOptions.databaseType());
    contentJson.addProperty("catalog_name", createDatabaseCatalogOptions.catalogName());
    if (createDatabaseCatalogOptions.databaseDetails() != null) {
      contentJson.add("database_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDatabaseCatalogOptions.databaseDetails()));
    }
    if (createDatabaseCatalogOptions.description() != null) {
      contentJson.addProperty("description", createDatabaseCatalogOptions.description());
    }
    if (createDatabaseCatalogOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDatabaseCatalogOptions.tags()));
    }
    if (createDatabaseCatalogOptions.createdBy() != null) {
      contentJson.addProperty("created_by", createDatabaseCatalogOptions.createdBy());
    }
    if (createDatabaseCatalogOptions.createdOn() != null) {
      contentJson.addProperty("created_on", createDatabaseCatalogOptions.createdOn());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete database.
   *
   * Delete a database from Lakehouse.
   *
   * @param deleteDatabaseCatalogOptions the {@link DeleteDatabaseCatalogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDatabaseCatalog(DeleteDatabaseCatalogOptions deleteDatabaseCatalogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDatabaseCatalogOptions,
      "deleteDatabaseCatalogOptions cannot be null");
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/databases/database"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "deleteDatabaseCatalog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteDatabaseCatalogOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteDatabaseCatalogOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("database_id", deleteDatabaseCatalogOptions.databaseId());
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update database.
   *
   * Update database details.
   *
   * @param updateDatabaseOptions the {@link UpdateDatabaseOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> updateDatabase(UpdateDatabaseOptions updateDatabaseOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDatabaseOptions,
      "updateDatabaseOptions cannot be null");
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/databases/database"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "updateDatabase");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (updateDatabaseOptions.accept() != null) {
      builder.header("Accept", updateDatabaseOptions.accept());
    }
    if (updateDatabaseOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateDatabaseOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("database_id", updateDatabaseOptions.databaseId());
    if (updateDatabaseOptions.databaseDetails() != null) {
      contentJson.add("database_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateDatabaseOptions.databaseDetails()));
    }
    if (updateDatabaseOptions.databaseDisplayName() != null) {
      contentJson.addProperty("database_display_name", updateDatabaseOptions.databaseDisplayName());
    }
    if (updateDatabaseOptions.description() != null) {
      contentJson.addProperty("description", updateDatabaseOptions.description());
    }
    if (updateDatabaseOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateDatabaseOptions.tags()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Pause engine.
   *
   * Pause a running engine.
   *
   * @param pauseEngineOptions the {@link PauseEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PauseEngineCreatedBody}
   */
  public ServiceCall<PauseEngineCreatedBody> pauseEngine(PauseEngineOptions pauseEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(pauseEngineOptions,
      "pauseEngineOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/engines/engine/pause"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "pauseEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (pauseEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", pauseEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("engine_id", pauseEngineOptions.engineId());
    if (pauseEngineOptions.createdBy() != null) {
      contentJson.addProperty("created_by", pauseEngineOptions.createdBy());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PauseEngineCreatedBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PauseEngineCreatedBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get engines.
   *
   * Get all engine details.
   *
   * @param getEnginesOptions the {@link GetEnginesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetEnginesOKBody}
   */
  public ServiceCall<GetEnginesOKBody> getEngines(GetEnginesOptions getEnginesOptions) {
    if (getEnginesOptions == null) {
      getEnginesOptions = new GetEnginesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/engines"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getEngines");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getEnginesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getEnginesOptions.authInstanceId());
    }
    ResponseConverter<GetEnginesOKBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetEnginesOKBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get engines.
   *
   * Get all engine details.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetEnginesOKBody}
   */
  public ServiceCall<GetEnginesOKBody> getEngines() {
    return getEngines(null);
  }

  /**
   * Get instance details.
   *
   * Get instance details.
   *
   * @param getDeploymentsOptions the {@link GetDeploymentsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> getDeployments(GetDeploymentsOptions getDeploymentsOptions) {
    if (getDeploymentsOptions == null) {
      getDeploymentsOptions = new GetDeploymentsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/instance"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getDeployments");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (getDeploymentsOptions.accept() != null) {
      builder.header("Accept", getDeploymentsOptions.accept());
    }
    if (getDeploymentsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getDeploymentsOptions.authInstanceId());
    }
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get instance details.
   *
   * Get instance details.
   *
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> getDeployments() {
    return getDeployments(null);
  }

  /**
   * Update engine.
   *
   * Update engine.
   *
   * @param updateEngineOptions the {@link UpdateEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> updateEngine(UpdateEngineOptions updateEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateEngineOptions,
      "updateEngineOptions cannot be null");
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/engines/engine"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "updateEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (updateEngineOptions.accept() != null) {
      builder.header("Accept", updateEngineOptions.accept());
    }
    if (updateEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("engine_id", updateEngineOptions.engineId());
    if (updateEngineOptions.coordinator() != null) {
      contentJson.add("coordinator", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateEngineOptions.coordinator()));
    }
    if (updateEngineOptions.description() != null) {
      contentJson.addProperty("description", updateEngineOptions.description());
    }
    if (updateEngineOptions.engineDisplayName() != null) {
      contentJson.addProperty("engine_display_name", updateEngineOptions.engineDisplayName());
    }
    if (updateEngineOptions.tags() != null) {
      contentJson.add("tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateEngineOptions.tags()));
    }
    if (updateEngineOptions.worker() != null) {
      contentJson.add("worker", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateEngineOptions.worker()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create engine.
   *
   * Create a new engine.
   *
   * @param createEngineOptions the {@link CreateEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> createEngine(CreateEngineOptions createEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createEngineOptions,
      "createEngineOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/engines/engine"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "createEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (createEngineOptions.accept() != null) {
      builder.header("Accept", createEngineOptions.accept());
    }
    if (createEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("version", createEngineOptions.version());
    contentJson.add("engine_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createEngineOptions.engineDetails()));
    contentJson.addProperty("origin", createEngineOptions.origin());
    contentJson.addProperty("type", createEngineOptions.type());
    if (createEngineOptions.description() != null) {
      contentJson.addProperty("description", createEngineOptions.description());
    }
    if (createEngineOptions.engineDisplayName() != null) {
      contentJson.addProperty("engine_display_name", createEngineOptions.engineDisplayName());
    }
    if (createEngineOptions.firstTimeUse() != null) {
      contentJson.addProperty("first_time_use", createEngineOptions.firstTimeUse());
    }
    if (createEngineOptions.region() != null) {
      contentJson.addProperty("region", createEngineOptions.region());
    }
    if (createEngineOptions.associatedCatalogs() != null) {
      contentJson.add("associated_catalogs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createEngineOptions.associatedCatalogs()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete engine.
   *
   * Delete an engine from lakehouse.
   *
   * @param deleteEngineOptions the {@link DeleteEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteEngine(DeleteEngineOptions deleteEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteEngineOptions,
      "deleteEngineOptions cannot be null");
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/engines/engine"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "deleteEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("engine_id", deleteEngineOptions.engineId());
    if (deleteEngineOptions.createdBy() != null) {
      contentJson.addProperty("created_by", deleteEngineOptions.createdBy());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Resume engine.
   *
   * Resume a paused engine.
   *
   * @param resumeEngineOptions the {@link ResumeEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResumeEngineCreatedBody}
   */
  public ServiceCall<ResumeEngineCreatedBody> resumeEngine(ResumeEngineOptions resumeEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(resumeEngineOptions,
      "resumeEngineOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/engines/engine/resume"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "resumeEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (resumeEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", resumeEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("engine_id", resumeEngineOptions.engineId());
    if (resumeEngineOptions.createdBy() != null) {
      contentJson.addProperty("created_by", resumeEngineOptions.createdBy());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ResumeEngineCreatedBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResumeEngineCreatedBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Explain analyze.
   *
   * Return query metrics after query is complete.
   *
   * @param explainAnalyzeStatementOptions the {@link ExplainAnalyzeStatementOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ExplainAnalyzeStatementCreatedBody}
   */
  public ServiceCall<ExplainAnalyzeStatementCreatedBody> explainAnalyzeStatement(ExplainAnalyzeStatementOptions explainAnalyzeStatementOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(explainAnalyzeStatementOptions,
      "explainAnalyzeStatementOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/explainanalyze"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "explainAnalyzeStatement");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (explainAnalyzeStatementOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", explainAnalyzeStatementOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("catalog_name", explainAnalyzeStatementOptions.catalogName());
    contentJson.addProperty("engine_id", explainAnalyzeStatementOptions.engineId());
    contentJson.addProperty("schema_name", explainAnalyzeStatementOptions.schemaName());
    contentJson.addProperty("statement", explainAnalyzeStatementOptions.statement());
    if (explainAnalyzeStatementOptions.verbose() != null) {
      contentJson.addProperty("verbose", explainAnalyzeStatementOptions.verbose());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ExplainAnalyzeStatementCreatedBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ExplainAnalyzeStatementCreatedBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Explain.
   *
   * Explain a query statement.
   *
   * @param explainStatementOptions the {@link ExplainStatementOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ExplainStatementCreatedBody}
   */
  public ServiceCall<ExplainStatementCreatedBody> explainStatement(ExplainStatementOptions explainStatementOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(explainStatementOptions,
      "explainStatementOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/explain"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "explainStatement");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (explainStatementOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", explainStatementOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("engine_id", explainStatementOptions.engineId());
    contentJson.addProperty("statement", explainStatementOptions.statement());
    if (explainStatementOptions.catalogName() != null) {
      contentJson.addProperty("catalog_name", explainStatementOptions.catalogName());
    }
    if (explainStatementOptions.format() != null) {
      contentJson.addProperty("format", explainStatementOptions.format());
    }
    if (explainStatementOptions.schemaName() != null) {
      contentJson.addProperty("schema_name", explainStatementOptions.schemaName());
    }
    if (explainStatementOptions.type() != null) {
      contentJson.addProperty("type", explainStatementOptions.type());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ExplainStatementCreatedBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ExplainStatementCreatedBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Readiness API.
   *
   * Verify lhconsole server is up and running.
   *
   * @param testLhConsoleOptions the {@link TestLHConsoleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> testLHConsole(TestLHConsoleOptions testLhConsoleOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/ready"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "testLHConsole");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Readiness API.
   *
   * Verify lhconsole server is up and running.
   *
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> testLHConsole() {
    return testLHConsole(null);
  }

  /**
   * Get Catalogs.
   *
   * Get list of all registered metastores.
   *
   * @param getMetastoresOptions the {@link GetMetastoresOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetMetastoresOKBody}
   */
  public ServiceCall<GetMetastoresOKBody> getMetastores(GetMetastoresOptions getMetastoresOptions) {
    if (getMetastoresOptions == null) {
      getMetastoresOptions = new GetMetastoresOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getMetastores");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getMetastoresOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getMetastoresOptions.authInstanceId());
    }
    ResponseConverter<GetMetastoresOKBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetMetastoresOKBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get Catalogs.
   *
   * Get list of all registered metastores.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetMetastoresOKBody}
   */
  public ServiceCall<GetMetastoresOKBody> getMetastores() {
    return getMetastores(null);
  }

  /**
   * Get Metastore.
   *
   * Get list of all registered HMS metastores.
   *
   * @param getHmsOptions the {@link GetHMSOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> getHMS(GetHMSOptions getHmsOptions) {
    if (getHmsOptions == null) {
      getHmsOptions = new GetHMSOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/metastores"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getHMS");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (getHmsOptions.accept() != null) {
      builder.header("Accept", getHmsOptions.accept());
    }
    if (getHmsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getHmsOptions.authInstanceId());
    }
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get Metastore.
   *
   * Get list of all registered HMS metastores.
   *
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> getHMS() {
    return getHMS(null);
  }

  /**
   * Add catalog to engine.
   *
   * Associate a catalog to an engine.
   *
   * @param addMetastoreToEngineOptions the {@link AddMetastoreToEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> addMetastoreToEngine(AddMetastoreToEngineOptions addMetastoreToEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addMetastoreToEngineOptions,
      "addMetastoreToEngineOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/add_catalog_to_engine"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "addMetastoreToEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (addMetastoreToEngineOptions.accept() != null) {
      builder.header("Accept", addMetastoreToEngineOptions.accept());
    }
    if (addMetastoreToEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", addMetastoreToEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("catalog_name", addMetastoreToEngineOptions.catalogName());
    contentJson.addProperty("engine_id", addMetastoreToEngineOptions.engineId());
    if (addMetastoreToEngineOptions.createdBy() != null) {
      contentJson.addProperty("created_by", addMetastoreToEngineOptions.createdBy());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove catalog from engine.
   *
   * Remove a catalog from an engine.
   *
   * @param removeCatalogFromEngineOptions the {@link RemoveCatalogFromEngineOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> removeCatalogFromEngine(RemoveCatalogFromEngineOptions removeCatalogFromEngineOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(removeCatalogFromEngineOptions,
      "removeCatalogFromEngineOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/catalogs/remove_catalog_from_engine"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "removeCatalogFromEngine");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (removeCatalogFromEngineOptions.accept() != null) {
      builder.header("Accept", removeCatalogFromEngineOptions.accept());
    }
    if (removeCatalogFromEngineOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", removeCatalogFromEngineOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("catalog_name", removeCatalogFromEngineOptions.catalogName());
    contentJson.addProperty("engine_id", removeCatalogFromEngineOptions.engineId());
    if (removeCatalogFromEngineOptions.createdBy() != null) {
      contentJson.addProperty("created_by", removeCatalogFromEngineOptions.createdBy());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Save query.
   *
   * Save a new query.
   *
   * @param saveQueryOptions the {@link SaveQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> saveQuery(SaveQueryOptions saveQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(saveQueryOptions,
      "saveQueryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("query_name", saveQueryOptions.queryName());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/queries/{query_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "saveQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (saveQueryOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", saveQueryOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("created_by", saveQueryOptions.createdBy());
    contentJson.addProperty("description", saveQueryOptions.description());
    contentJson.addProperty("query_string", saveQueryOptions.queryString());
    if (saveQueryOptions.createdOn() != null) {
      contentJson.addProperty("created_on", saveQueryOptions.createdOn());
    }
    if (saveQueryOptions.engineId() != null) {
      contentJson.addProperty("engine_id", saveQueryOptions.engineId());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete query.
   *
   * Delete a saved query.
   *
   * @param deleteQueryOptions the {@link DeleteQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteQuery(DeleteQueryOptions deleteQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteQueryOptions,
      "deleteQueryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("query_name", deleteQueryOptions.queryName());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/queries/{query_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "deleteQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteQueryOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteQueryOptions.authInstanceId());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update query.
   *
   * Update a saved query.
   *
   * @param updateQueryOptions the {@link UpdateQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> updateQuery(UpdateQueryOptions updateQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateQueryOptions,
      "updateQueryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("query_name", updateQueryOptions.queryName());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/queries/{query_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "updateQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateQueryOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateQueryOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("query_string", updateQueryOptions.queryString());
    contentJson.addProperty("description", updateQueryOptions.description());
    contentJson.addProperty("new_query_name", updateQueryOptions.newQueryName());
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get queries.
   *
   * List all saved queries.
   *
   * @param getQueriesOptions the {@link GetQueriesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetQueriesOKBody}
   */
  public ServiceCall<GetQueriesOKBody> getQueries(GetQueriesOptions getQueriesOptions) {
    if (getQueriesOptions == null) {
      getQueriesOptions = new GetQueriesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/queries"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getQueries");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getQueriesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getQueriesOptions.authInstanceId());
    }
    ResponseConverter<GetQueriesOKBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetQueriesOKBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get queries.
   *
   * List all saved queries.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetQueriesOKBody}
   */
  public ServiceCall<GetQueriesOKBody> getQueries() {
    return getQueries(null);
  }

  /**
   * Create schema.
   *
   * Create a new schema.
   *
   * @param createSchemaOptions the {@link CreateSchemaOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> createSchema(CreateSchemaOptions createSchemaOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSchemaOptions,
      "createSchemaOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/schemas/schema"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "createSchema");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createSchemaOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", createSchemaOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("catalog_name", createSchemaOptions.catalogName());
    contentJson.addProperty("engine_id", createSchemaOptions.engineId());
    contentJson.addProperty("schema_name", createSchemaOptions.schemaName());
    if (createSchemaOptions.bucketName() != null) {
      contentJson.addProperty("bucket_name", createSchemaOptions.bucketName());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete schema.
   *
   * Delete a schema.
   *
   * @param deleteSchemaOptions the {@link DeleteSchemaOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteSchema(DeleteSchemaOptions deleteSchemaOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSchemaOptions,
      "deleteSchemaOptions cannot be null");
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/schemas/schema"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "deleteSchema");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteSchemaOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteSchemaOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("catalog_name", deleteSchemaOptions.catalogName());
    contentJson.addProperty("engine_id", deleteSchemaOptions.engineId());
    contentJson.addProperty("schema_name", deleteSchemaOptions.schemaName());
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get schemas.
   *
   * List schemas in catalog.
   *
   * @param getSchemasOptions the {@link GetSchemasOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetSchemasOKBody}
   */
  public ServiceCall<GetSchemasOKBody> getSchemas(GetSchemasOptions getSchemasOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSchemasOptions,
      "getSchemasOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/schemas"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getSchemas");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSchemasOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getSchemasOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(getSchemasOptions.engineId()));
    builder.query("catalog_name", String.valueOf(getSchemasOptions.catalogName()));
    ResponseConverter<GetSchemasOKBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetSchemasOKBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Run SQL statement.
   *
   * Using this API to run a SQL statement.
   *
   * @param postQueryOptions the {@link PostQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> postQuery(PostQueryOptions postQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(postQueryOptions,
      "postQueryOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v1/statement"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "postQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (postQueryOptions.accept() != null) {
      builder.header("Accept", postQueryOptions.accept());
    }
    if (postQueryOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", postQueryOptions.authInstanceId());
    }
    builder.query("engine", String.valueOf(postQueryOptions.engine()));
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    multipartBuilder.addFormDataPart("catalog", postQueryOptions.catalog());
    multipartBuilder.addFormDataPart("schema", postQueryOptions.schema());
    multipartBuilder.addFormDataPart("sqlQuery", postQueryOptions.sqlQuery());
    builder.body(multipartBuilder.build());
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete table.
   *
   * Delete one or multiple tables for a given schema and catalog.
   *
   * @param deleteTableOptions the {@link DeleteTableOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTable(DeleteTableOptions deleteTableOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTableOptions,
      "deleteTableOptions cannot be null");
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tables/table"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "deleteTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteTableOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", deleteTableOptions.authInstanceId());
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("delete_tables", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deleteTableOptions.deleteTables()));
    contentJson.addProperty("engine_id", deleteTableOptions.engineId());
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update table.
   *
   * Update the given table - rename table, add/drop/rename columns.
   *
   * @param updateTableOptions the {@link UpdateTableOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> updateTable(UpdateTableOptions updateTableOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateTableOptions,
      "updateTableOptions cannot be null");
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tables/table"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "updateTable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (updateTableOptions.accept() != null) {
      builder.header("Accept", updateTableOptions.accept());
    }
    if (updateTableOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", updateTableOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(updateTableOptions.engineId()));
    builder.query("catalog_name", String.valueOf(updateTableOptions.catalogName()));
    builder.query("schema_name", String.valueOf(updateTableOptions.schemaName()));
    builder.query("table_name", String.valueOf(updateTableOptions.tableName()));
    final JsonObject contentJson = new JsonObject();
    if (updateTableOptions.addColumns() != null) {
      contentJson.add("add_columns", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateTableOptions.addColumns()));
    }
    if (updateTableOptions.dropColumns() != null) {
      contentJson.add("drop_columns", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateTableOptions.dropColumns()));
    }
    if (updateTableOptions.newTableName() != null) {
      contentJson.addProperty("new_table_name", updateTableOptions.newTableName());
    }
    if (updateTableOptions.renameColumns() != null) {
      contentJson.add("rename_columns", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateTableOptions.renameColumns()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get table snapshots.
   *
   * List all table snapshots.
   *
   * @param getTableSnapshotsOptions the {@link GetTableSnapshotsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetTableSnapshotsOKBody}
   */
  public ServiceCall<GetTableSnapshotsOKBody> getTableSnapshots(GetTableSnapshotsOptions getTableSnapshotsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTableSnapshotsOptions,
      "getTableSnapshotsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tables/table/snapshots"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getTableSnapshots");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getTableSnapshotsOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getTableSnapshotsOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(getTableSnapshotsOptions.engineId()));
    builder.query("catalog_name", String.valueOf(getTableSnapshotsOptions.catalogName()));
    builder.query("schema_name", String.valueOf(getTableSnapshotsOptions.schemaName()));
    builder.query("table_name", String.valueOf(getTableSnapshotsOptions.tableName()));
    ResponseConverter<GetTableSnapshotsOKBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetTableSnapshotsOKBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Rollback snapshot.
   *
   * Rollback to a table snapshot.
   *
   * @param rollbackSnapshotOptions the {@link RollbackSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuccessResponse}
   */
  public ServiceCall<SuccessResponse> rollbackSnapshot(RollbackSnapshotOptions rollbackSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(rollbackSnapshotOptions,
      "rollbackSnapshotOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tables/table/rollback"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "rollbackSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (rollbackSnapshotOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", rollbackSnapshotOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(rollbackSnapshotOptions.engineId()));
    builder.query("catalog_name", String.valueOf(rollbackSnapshotOptions.catalogName()));
    builder.query("schema_name", String.valueOf(rollbackSnapshotOptions.schemaName()));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("snapshot_id", rollbackSnapshotOptions.snapshotId());
    contentJson.addProperty("table_name", rollbackSnapshotOptions.tableName());
    builder.bodyJson(contentJson);
    ResponseConverter<SuccessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuccessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get tables.
   *
   * List all tables in a schema in a catalog for a given engine.
   *
   * @param getTablesOptions the {@link GetTablesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetTablesOKBody}
   */
  public ServiceCall<GetTablesOKBody> getTables(GetTablesOptions getTablesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTablesOptions,
      "getTablesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/tables"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "getTables");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getTablesOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", getTablesOptions.authInstanceId());
    }
    builder.query("engine_id", String.valueOf(getTablesOptions.engineId()));
    builder.query("catalog_name", String.valueOf(getTablesOptions.catalogName()));
    builder.query("schema_name", String.valueOf(getTablesOptions.schemaName()));
    ResponseConverter<GetTablesOKBody> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetTablesOKBody>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Parse CSV for table creation.
   *
   * When creating a tabble, parse the CSV file.
   *
   * @param parseCsvOptions the {@link ParseCsvOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> parseCsv(ParseCsvOptions parseCsvOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(parseCsvOptions,
      "parseCsvOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/parse/csv"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "parseCsv");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (parseCsvOptions.accept() != null) {
      builder.header("Accept", parseCsvOptions.accept());
    }
    if (parseCsvOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", parseCsvOptions.authInstanceId());
    }
    builder.query("engine", String.valueOf(parseCsvOptions.engine()));
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    multipartBuilder.addFormDataPart("parse_file", parseCsvOptions.parseFile());
    multipartBuilder.addFormDataPart("file_type", parseCsvOptions.fileType());
    builder.body(multipartBuilder.build());
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Upload CSV for table creation.
   *
   * When creating a table, upload a CSV file.
   *
   * @param uplaodCsvOptions the {@link UplaodCsvOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> uplaodCsv(UplaodCsvOptions uplaodCsvOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(uplaodCsvOptions,
      "uplaodCsvOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/upload/csv"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("watsonx_data", "v1", "uplaodCsv");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (uplaodCsvOptions.accept() != null) {
      builder.header("Accept", uplaodCsvOptions.accept());
    }
    if (uplaodCsvOptions.authInstanceId() != null) {
      builder.header("AuthInstanceId", uplaodCsvOptions.authInstanceId());
    }
    builder.query("engine", String.valueOf(uplaodCsvOptions.engine()));
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    multipartBuilder.addFormDataPart("catalog", uplaodCsvOptions.catalog());
    multipartBuilder.addFormDataPart("schema", uplaodCsvOptions.schema());
    multipartBuilder.addFormDataPart("tableName", uplaodCsvOptions.tableName());
    multipartBuilder.addFormDataPart("ingestionJobName", uplaodCsvOptions.ingestionJobName());
    multipartBuilder.addFormDataPart("scheduled", uplaodCsvOptions.scheduled());
    multipartBuilder.addFormDataPart("created_by", uplaodCsvOptions.createdBy());
    multipartBuilder.addFormDataPart("targetTable", uplaodCsvOptions.targetTable());
    multipartBuilder.addFormDataPart("headers", uplaodCsvOptions.headers());
    multipartBuilder.addFormDataPart("csv", uplaodCsvOptions.csv());
    builder.body(multipartBuilder.build());
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

}
