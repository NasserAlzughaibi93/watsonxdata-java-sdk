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
 * The rollbackSnapshot options.
 */
public class RollbackSnapshotOptions extends GenericModel {

  protected String engineId;
  protected String catalogName;
  protected String schemaName;
  protected String snapshotId;
  protected String tableName;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String catalogName;
    private String schemaName;
    private String snapshotId;
    private String tableName;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing RollbackSnapshotOptions instance.
     *
     * @param rollbackSnapshotOptions the instance to initialize the Builder with
     */
    private Builder(RollbackSnapshotOptions rollbackSnapshotOptions) {
      this.engineId = rollbackSnapshotOptions.engineId;
      this.catalogName = rollbackSnapshotOptions.catalogName;
      this.schemaName = rollbackSnapshotOptions.schemaName;
      this.snapshotId = rollbackSnapshotOptions.snapshotId;
      this.tableName = rollbackSnapshotOptions.tableName;
      this.authInstanceId = rollbackSnapshotOptions.authInstanceId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param engineId the engineId
     * @param catalogName the catalogName
     * @param schemaName the schemaName
     * @param snapshotId the snapshotId
     * @param tableName the tableName
     */
    public Builder(String engineId, String catalogName, String schemaName, String snapshotId, String tableName) {
      this.engineId = engineId;
      this.catalogName = catalogName;
      this.schemaName = schemaName;
      this.snapshotId = snapshotId;
      this.tableName = tableName;
    }

    /**
     * Builds a RollbackSnapshotOptions.
     *
     * @return the new RollbackSnapshotOptions instance
     */
    public RollbackSnapshotOptions build() {
      return new RollbackSnapshotOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the RollbackSnapshotOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the RollbackSnapshotOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the RollbackSnapshotOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the snapshotId.
     *
     * @param snapshotId the snapshotId
     * @return the RollbackSnapshotOptions builder
     */
    public Builder snapshotId(String snapshotId) {
      this.snapshotId = snapshotId;
      return this;
    }

    /**
     * Set the tableName.
     *
     * @param tableName the tableName
     * @return the RollbackSnapshotOptions builder
     */
    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the RollbackSnapshotOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected RollbackSnapshotOptions() { }

  protected RollbackSnapshotOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogName,
      "catalogName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.schemaName,
      "schemaName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.snapshotId,
      "snapshotId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tableName,
      "tableName cannot be null");
    engineId = builder.engineId;
    catalogName = builder.catalogName;
    schemaName = builder.schemaName;
    snapshotId = builder.snapshotId;
    tableName = builder.tableName;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a RollbackSnapshotOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the engineId.
   *
   * Engine name.
   *
   * @return the engineId
   */
  public String engineId() {
    return engineId;
  }

  /**
   * Gets the catalogName.
   *
   * Catalog name.
   *
   * @return the catalogName
   */
  public String catalogName() {
    return catalogName;
  }

  /**
   * Gets the schemaName.
   *
   * Schema name.
   *
   * @return the schemaName
   */
  public String schemaName() {
    return schemaName;
  }

  /**
   * Gets the snapshotId.
   *
   * Snapshot id.
   *
   * @return the snapshotId
   */
  public String snapshotId() {
    return snapshotId;
  }

  /**
   * Gets the tableName.
   *
   * Table name.
   *
   * @return the tableName
   */
  public String tableName() {
    return tableName;
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

