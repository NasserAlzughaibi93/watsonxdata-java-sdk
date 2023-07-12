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
 * Rename_columns items.
 */
public class UpdateTableBodyRenameColumnsItems extends GenericModel {

  @SerializedName("column_name")
  protected String columnName;
  @SerializedName("new_column_name")
  protected String newColumnName;

  /**
   * Builder.
   */
  public static class Builder {
    private String columnName;
    private String newColumnName;

    /**
     * Instantiates a new Builder from an existing UpdateTableBodyRenameColumnsItems instance.
     *
     * @param updateTableBodyRenameColumnsItems the instance to initialize the Builder with
     */
    private Builder(UpdateTableBodyRenameColumnsItems updateTableBodyRenameColumnsItems) {
      this.columnName = updateTableBodyRenameColumnsItems.columnName;
      this.newColumnName = updateTableBodyRenameColumnsItems.newColumnName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateTableBodyRenameColumnsItems.
     *
     * @return the new UpdateTableBodyRenameColumnsItems instance
     */
    public UpdateTableBodyRenameColumnsItems build() {
      return new UpdateTableBodyRenameColumnsItems(this);
    }

    /**
     * Set the columnName.
     *
     * @param columnName the columnName
     * @return the UpdateTableBodyRenameColumnsItems builder
     */
    public Builder columnName(String columnName) {
      this.columnName = columnName;
      return this;
    }

    /**
     * Set the newColumnName.
     *
     * @param newColumnName the newColumnName
     * @return the UpdateTableBodyRenameColumnsItems builder
     */
    public Builder newColumnName(String newColumnName) {
      this.newColumnName = newColumnName;
      return this;
    }
  }

  protected UpdateTableBodyRenameColumnsItems() { }

  protected UpdateTableBodyRenameColumnsItems(Builder builder) {
    columnName = builder.columnName;
    newColumnName = builder.newColumnName;
  }

  /**
   * New builder.
   *
   * @return a UpdateTableBodyRenameColumnsItems builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the columnName.
   *
   * Column name.
   *
   * @return the columnName
   */
  public String columnName() {
    return columnName;
  }

  /**
   * Gets the newColumnName.
   *
   * New column name.
   *
   * @return the newColumnName
   */
  public String newColumnName() {
    return newColumnName;
  }
}

