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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateSyncCatalog options.
 */
public class UpdateSyncCatalogOptions extends GenericModel {

  protected String catalogId;
  protected Map<String, Object> body;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogId;
    private Map<String, Object> body;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateSyncCatalogOptions instance.
     *
     * @param updateSyncCatalogOptions the instance to initialize the Builder with
     */
    private Builder(UpdateSyncCatalogOptions updateSyncCatalogOptions) {
      this.catalogId = updateSyncCatalogOptions.catalogId;
      this.body = updateSyncCatalogOptions.body;
      this.authInstanceId = updateSyncCatalogOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogId the catalogId
     * @param body the body
     */
    public Builder(String catalogId, Map<String, Object> body) {
      this.catalogId = catalogId;
      this.body = body;
    }

    /**
     * Builds a UpdateSyncCatalogOptions.
     *
     * @return the new UpdateSyncCatalogOptions instance
     */
    public UpdateSyncCatalogOptions build() {
      return new UpdateSyncCatalogOptions(this);
    }

    /**
     * Set the catalogId.
     *
     * @param catalogId the catalogId
     * @return the UpdateSyncCatalogOptions builder
     */
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    /**
     * Set the body.
     *
     * @param body the body
     * @return the UpdateSyncCatalogOptions builder
     */
    public Builder body(Map<String, Object> body) {
      this.body = body;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateSyncCatalogOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateSyncCatalogOptions() { }

  protected UpdateSyncCatalogOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.catalogId,
      "catalogId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.body,
      "body cannot be null");
    catalogId = builder.catalogId;
    body = builder.body;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdateSyncCatalogOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogId.
   *
   * catalog ID.
   *
   * @return the catalogId
   */
  public String catalogId() {
    return catalogId;
  }

  /**
   * Gets the body.
   *
   * Request body.
   *
   * @return the body
   */
  public Map<String, Object> body() {
    return body;
  }

  /**
   * Gets the authInstanceId.
   *
   * CRN.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

