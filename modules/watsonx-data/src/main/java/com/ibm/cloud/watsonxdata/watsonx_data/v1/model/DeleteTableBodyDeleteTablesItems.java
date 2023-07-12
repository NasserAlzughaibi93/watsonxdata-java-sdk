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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Delete tables items.
 */
public class DeleteTableBodyDeleteTablesItems extends GenericModel {

  @SerializedName("catalog_name")
  protected String catalogName;
  @SerializedName("schema_name")
  protected String schemaName;
  @SerializedName("table_name")
  protected String tableName;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogName;
    private String schemaName;
    private String tableName;

    /**
     * Instantiates a new Builder from an existing DeleteTableBodyDeleteTablesItems instance.
     *
     * @param deleteTableBodyDeleteTablesItems the instance to initialize the Builder with
     */
    private Builder(DeleteTableBodyDeleteTablesItems deleteTableBodyDeleteTablesItems) {
      this.catalogName = deleteTableBodyDeleteTablesItems.catalogName;
      this.schemaName = deleteTableBodyDeleteTablesItems.schemaName;
      this.tableName = deleteTableBodyDeleteTablesItems.tableName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DeleteTableBodyDeleteTablesItems.
     *
     * @return the new DeleteTableBodyDeleteTablesItems instance
     */
    public DeleteTableBodyDeleteTablesItems build() {
      return new DeleteTableBodyDeleteTablesItems(this);
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the DeleteTableBodyDeleteTablesItems builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the DeleteTableBodyDeleteTablesItems builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the tableName.
     *
     * @param tableName the tableName
     * @return the DeleteTableBodyDeleteTablesItems builder
     */
    public Builder tableName(String tableName) {
      this.tableName = tableName;
      return this;
    }
  }

  protected DeleteTableBodyDeleteTablesItems() { }

  protected DeleteTableBodyDeleteTablesItems(Builder builder) {
    catalogName = builder.catalogName;
    schemaName = builder.schemaName;
    tableName = builder.tableName;
  }

  /**
   * New builder.
   *
   * @return a DeleteTableBodyDeleteTablesItems builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
}

