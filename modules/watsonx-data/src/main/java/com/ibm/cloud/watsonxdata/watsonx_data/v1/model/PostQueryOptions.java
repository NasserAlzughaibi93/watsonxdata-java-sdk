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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The postQuery options.
 */
public class PostQueryOptions extends GenericModel {

  protected String engine;
  protected String catalog;
  protected String schema;
  protected String sqlQuery;
  protected String accept;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engine;
    private String catalog;
    private String schema;
    private String sqlQuery;
    private String accept;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing PostQueryOptions instance.
     *
     * @param postQueryOptions the instance to initialize the Builder with
     */
    private Builder(PostQueryOptions postQueryOptions) {
      this.engine = postQueryOptions.engine;
      this.catalog = postQueryOptions.catalog;
      this.schema = postQueryOptions.schema;
      this.sqlQuery = postQueryOptions.sqlQuery;
      this.accept = postQueryOptions.accept;
      this.authInstanceId = postQueryOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param engine the engine
     * @param catalog the catalog
     * @param schema the schema
     * @param sqlQuery the sqlQuery
     */
    public Builder(String engine, String catalog, String schema, String sqlQuery) {
      this.engine = engine;
      this.catalog = catalog;
      this.schema = schema;
      this.sqlQuery = sqlQuery;
    }

    /**
     * Builds a PostQueryOptions.
     *
     * @return the new PostQueryOptions instance
     */
    public PostQueryOptions build() {
      return new PostQueryOptions(this);
    }

    /**
     * Set the engine.
     *
     * @param engine the engine
     * @return the PostQueryOptions builder
     */
    public Builder engine(String engine) {
      this.engine = engine;
      return this;
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the PostQueryOptions builder
     */
    public Builder catalog(String catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Set the schema.
     *
     * @param schema the schema
     * @return the PostQueryOptions builder
     */
    public Builder schema(String schema) {
      this.schema = schema;
      return this;
    }

    /**
     * Set the sqlQuery.
     *
     * @param sqlQuery the sqlQuery
     * @return the PostQueryOptions builder
     */
    public Builder sqlQuery(String sqlQuery) {
      this.sqlQuery = sqlQuery;
      return this;
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the PostQueryOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the PostQueryOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected PostQueryOptions() { }

  protected PostQueryOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engine,
      "engine cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalog,
      "catalog cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.schema,
      "schema cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.sqlQuery,
      "sqlQuery cannot be null");
    engine = builder.engine;
    catalog = builder.catalog;
    schema = builder.schema;
    sqlQuery = builder.sqlQuery;
    accept = builder.accept;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a PostQueryOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engine.
   *
   * Presto engine name.
   *
   * @return the engine
   */
  public String engine() {
    return engine;
  }

  /**
   * Gets the catalog.
   *
   * Catalog name.
   *
   * @return the catalog
   */
  public String catalog() {
    return catalog;
  }

  /**
   * Gets the schema.
   *
   * Schema name.
   *
   * @return the schema
   */
  public String schema() {
    return schema;
  }

  /**
   * Gets the sqlQuery.
   *
   * SQL Query.
   *
   * @return the sqlQuery
   */
  public String sqlQuery() {
    return sqlQuery;
  }

  /**
   * Gets the accept.
   *
   * The type of the response:  or *_/_*.
   *
   * @return the accept
   */
  public String accept() {
    return accept;
  }

  /**
   * Gets the authInstanceId.
   *
   * Instance ID.
   *
   * @return the authInstanceId
   */
  public String authInstanceId() {
    return authInstanceId;
  }
}

