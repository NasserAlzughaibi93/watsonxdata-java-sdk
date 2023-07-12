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
 * The uplaodCsv options.
 */
public class UplaodCsvOptions extends GenericModel {

  protected String engine;
  protected String catalog;
  protected String schema;
  protected String tableName;
  protected String ingestionJobName;
  protected String scheduled;
  protected String createdBy;
  protected String targetTable;
  protected String headers;
  protected String csv;
  protected String accept;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engine;
    private String catalog;
    private String schema;
    private String tableName;
    private String ingestionJobName;
    private String scheduled;
    private String createdBy;
    private String targetTable;
    private String headers;
    private String csv;
    private String accept;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UplaodCsvOptions instance.
     *
     * @param uplaodCsvOptions the instance to initialize the Builder with
     */
    private Builder(UplaodCsvOptions uplaodCsvOptions) {
      this.engine = uplaodCsvOptions.engine;
      this.catalog = uplaodCsvOptions.catalog;
      this.schema = uplaodCsvOptions.schema;
      this.tableName = uplaodCsvOptions.tableName;
      this.ingestionJobName = uplaodCsvOptions.ingestionJobName;
      this.scheduled = uplaodCsvOptions.scheduled;
      this.createdBy = uplaodCsvOptions.createdBy;
      this.targetTable = uplaodCsvOptions.targetTable;
      this.headers = uplaodCsvOptions.headers;
      this.csv = uplaodCsvOptions.csv;
      this.accept = uplaodCsvOptions.accept;
      this.authInstanceId = uplaodCsvOptions.authInstanceId;
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
     * @param tableName the tableName
     * @param ingestionJobName the ingestionJobName
     * @param scheduled the scheduled
     * @param createdBy the createdBy
     * @param targetTable the targetTable
     * @param headers the headers
     * @param csv the csv
     */
    public Builder(String engine, String catalog, String schema, String tableName, String ingestionJobName, String scheduled, String createdBy, String targetTable, String headers, String csv) {
      this.engine = engine;
      this.catalog = catalog;
      this.schema = schema;
      this.tableName = tableName;
      this.ingestionJobName = ingestionJobName;
      this.scheduled = scheduled;
      this.createdBy = createdBy;
      this.targetTable = targetTable;
      this.headers = headers;
      this.csv = csv;
    }

    /**
     * Builds a UplaodCsvOptions.
     *
     * @return the new UplaodCsvOptions instance
     */
    public UplaodCsvOptions build() {
      return new UplaodCsvOptions(this);
    }

    /**
     * Set the engine.
     *
     * @param engine the engine
     * @return the UplaodCsvOptions builder
     */
    public Builder engine(String engine) {
      this.engine = engine;
      return this;
    }

    /**
     * Set the catalog.
     *
     * @param catalog the catalog
     * @return the UplaodCsvOptions builder
     */
    public Builder catalog(String catalog) {
      this.catalog = catalog;
      return this;
    }

    /**
     * Set the schema.
     *
     * @param schema the schema
     * @return the UplaodCsvOptions builder
     */
    public Builder schema(String schema) {
      this.schema = schema;
      return this;
    }

    /**
     * Set the tableName.
     *
     * @param tableName the tableName
     * @return the UplaodCsvOptions builder
     */
    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }

    /**
     * Set the ingestionJobName.
     *
     * @param ingestionJobName the ingestionJobName
     * @return the UplaodCsvOptions builder
     */
    public Builder ingestionJobName(String ingestionJobName) {
      this.ingestionJobName = ingestionJobName;
      return this;
    }

    /**
     * Set the scheduled.
     *
     * @param scheduled the scheduled
     * @return the UplaodCsvOptions builder
     */
    public Builder scheduled(String scheduled) {
      this.scheduled = scheduled;
      return this;
    }

    /**
     * Set the createdBy.
     *
     * @param createdBy the createdBy
     * @return the UplaodCsvOptions builder
     */
    public Builder createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     * Set the targetTable.
     *
     * @param targetTable the targetTable
     * @return the UplaodCsvOptions builder
     */
    public Builder targetTable(String targetTable) {
      this.targetTable = targetTable;
      return this;
    }

    /**
     * Set the headers.
     *
     * @param headers the headers
     * @return the UplaodCsvOptions builder
     */
    public Builder headers(String headers) {
      this.headers = headers;
      return this;
    }

    /**
     * Set the csv.
     *
     * @param csv the csv
     * @return the UplaodCsvOptions builder
     */
    public Builder csv(String csv) {
      this.csv = csv;
      return this;
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the UplaodCsvOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UplaodCsvOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UplaodCsvOptions() { }

  protected UplaodCsvOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engine,
      "engine cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalog,
      "catalog cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.schema,
      "schema cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tableName,
      "tableName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ingestionJobName,
      "ingestionJobName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.scheduled,
      "scheduled cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.createdBy,
      "createdBy cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.targetTable,
      "targetTable cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.headers,
      "headers cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.csv,
      "csv cannot be null");
    engine = builder.engine;
    catalog = builder.catalog;
    schema = builder.schema;
    tableName = builder.tableName;
    ingestionJobName = builder.ingestionJobName;
    scheduled = builder.scheduled;
    createdBy = builder.createdBy;
    targetTable = builder.targetTable;
    headers = builder.headers;
    csv = builder.csv;
    accept = builder.accept;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UplaodCsvOptions builder
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
   * Gets the tableName.
   *
   * table name.
   *
   * @return the tableName
   */
  public String tableName() {
    return tableName;
  }

  /**
   * Gets the ingestionJobName.
   *
   * ingestion job name.
   *
   * @return the ingestionJobName
   */
  public String ingestionJobName() {
    return ingestionJobName;
  }

  /**
   * Gets the scheduled.
   *
   * Scheduled.
   *
   * @return the scheduled
   */
  public String scheduled() {
    return scheduled;
  }

  /**
   * Gets the createdBy.
   *
   * Created by.
   *
   * @return the createdBy
   */
  public String createdBy() {
    return createdBy;
  }

  /**
   * Gets the targetTable.
   *
   * Target table.
   *
   * @return the targetTable
   */
  public String targetTable() {
    return targetTable;
  }

  /**
   * Gets the headers.
   *
   * Headers.
   *
   * @return the headers
   */
  public String headers() {
    return headers;
  }

  /**
   * Gets the csv.
   *
   * csv.
   *
   * @return the csv
   */
  public String csv() {
    return csv;
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

