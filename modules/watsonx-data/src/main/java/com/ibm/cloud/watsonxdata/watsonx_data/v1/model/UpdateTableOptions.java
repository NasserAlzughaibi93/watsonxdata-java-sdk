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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateTable options.
 */
public class UpdateTableOptions extends GenericModel {

  protected String engineId;
  protected String catalogName;
  protected String schemaName;
  protected String tableName;
  protected String accept;
  protected List<UpdateTableBodyAddColumnsItems> addColumns;
  protected List<UpdateTableBodyDropColumnsItems> dropColumns;
  protected String newTableName;
  protected List<UpdateTableBodyRenameColumnsItems> renameColumns;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String catalogName;
    private String schemaName;
    private String tableName;
    private String accept;
    private List<UpdateTableBodyAddColumnsItems> addColumns;
    private List<UpdateTableBodyDropColumnsItems> dropColumns;
    private String newTableName;
    private List<UpdateTableBodyRenameColumnsItems> renameColumns;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing UpdateTableOptions instance.
     *
     * @param updateTableOptions the instance to initialize the Builder with
     */
    private Builder(UpdateTableOptions updateTableOptions) {
      this.engineId = updateTableOptions.engineId;
      this.catalogName = updateTableOptions.catalogName;
      this.schemaName = updateTableOptions.schemaName;
      this.tableName = updateTableOptions.tableName;
      this.accept = updateTableOptions.accept;
      this.addColumns = updateTableOptions.addColumns;
      this.dropColumns = updateTableOptions.dropColumns;
      this.newTableName = updateTableOptions.newTableName;
      this.renameColumns = updateTableOptions.renameColumns;
      this.authInstanceId = updateTableOptions.authInstanceId;
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
     * @param tableName the tableName
     */
    public Builder(String engineId, String catalogName, String schemaName, String tableName) {
      this.engineId = engineId;
      this.catalogName = catalogName;
      this.schemaName = schemaName;
      this.tableName = tableName;
    }

    /**
     * Builds a UpdateTableOptions.
     *
     * @return the new UpdateTableOptions instance
     */
    public UpdateTableOptions build() {
      return new UpdateTableOptions(this);
    }

    /**
     * Adds an addColumns to addColumns.
     *
     * @param addColumns the new addColumns
     * @return the UpdateTableOptions builder
     */
    public Builder addAddColumns(UpdateTableBodyAddColumnsItems addColumns) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(addColumns,
        "addColumns cannot be null");
      if (this.addColumns == null) {
        this.addColumns = new ArrayList<UpdateTableBodyAddColumnsItems>();
      }
      this.addColumns.add(addColumns);
      return this;
    }

    /**
     * Adds an dropColumns to dropColumns.
     *
     * @param dropColumns the new dropColumns
     * @return the UpdateTableOptions builder
     */
    public Builder addDropColumns(UpdateTableBodyDropColumnsItems dropColumns) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(dropColumns,
        "dropColumns cannot be null");
      if (this.dropColumns == null) {
        this.dropColumns = new ArrayList<UpdateTableBodyDropColumnsItems>();
      }
      this.dropColumns.add(dropColumns);
      return this;
    }

    /**
     * Adds an renameColumns to renameColumns.
     *
     * @param renameColumns the new renameColumns
     * @return the UpdateTableOptions builder
     */
    public Builder addRenameColumns(UpdateTableBodyRenameColumnsItems renameColumns) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(renameColumns,
        "renameColumns cannot be null");
      if (this.renameColumns == null) {
        this.renameColumns = new ArrayList<UpdateTableBodyRenameColumnsItems>();
      }
      this.renameColumns.add(renameColumns);
      return this;
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the UpdateTableOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the UpdateTableOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the UpdateTableOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the tableName.
     *
     * @param tableName the tableName
     * @return the UpdateTableOptions builder
     */
    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the UpdateTableOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }

    /**
     * Set the addColumns.
     * Existing addColumns will be replaced.
     *
     * @param addColumns the addColumns
     * @return the UpdateTableOptions builder
     */
    public Builder addColumns(List<UpdateTableBodyAddColumnsItems> addColumns) {
      this.addColumns = addColumns;
      return this;
    }

    /**
     * Set the dropColumns.
     * Existing dropColumns will be replaced.
     *
     * @param dropColumns the dropColumns
     * @return the UpdateTableOptions builder
     */
    public Builder dropColumns(List<UpdateTableBodyDropColumnsItems> dropColumns) {
      this.dropColumns = dropColumns;
      return this;
    }

    /**
     * Set the newTableName.
     *
     * @param newTableName the newTableName
     * @return the UpdateTableOptions builder
     */
    public Builder newTableName(String newTableName) {
      this.newTableName = newTableName;
      return this;
    }

    /**
     * Set the renameColumns.
     * Existing renameColumns will be replaced.
     *
     * @param renameColumns the renameColumns
     * @return the UpdateTableOptions builder
     */
    public Builder renameColumns(List<UpdateTableBodyRenameColumnsItems> renameColumns) {
      this.renameColumns = renameColumns;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the UpdateTableOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected UpdateTableOptions() { }

  protected UpdateTableOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.catalogName,
      "catalogName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.schemaName,
      "schemaName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.tableName,
      "tableName cannot be null");
    engineId = builder.engineId;
    catalogName = builder.catalogName;
    schemaName = builder.schemaName;
    tableName = builder.tableName;
    accept = builder.accept;
    addColumns = builder.addColumns;
    dropColumns = builder.dropColumns;
    newTableName = builder.newTableName;
    renameColumns = builder.renameColumns;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a UpdateTableOptions builder
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
   * Gets the addColumns.
   *
   * Add columns.
   *
   * @return the addColumns
   */
  public List<UpdateTableBodyAddColumnsItems> addColumns() {
    return addColumns;
  }

  /**
   * Gets the dropColumns.
   *
   * Drop columns.
   *
   * @return the dropColumns
   */
  public List<UpdateTableBodyDropColumnsItems> dropColumns() {
    return dropColumns;
  }

  /**
   * Gets the newTableName.
   *
   * New table name.
   *
   * @return the newTableName
   */
  public String newTableName() {
    return newTableName;
  }

  /**
   * Gets the renameColumns.
   *
   * Rename columns.
   *
   * @return the renameColumns
   */
  public List<UpdateTableBodyRenameColumnsItems> renameColumns() {
    return renameColumns;
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

