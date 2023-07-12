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
 * Drop_columns items.
 */
public class UpdateTableBodyDropColumnsItems extends GenericModel {

  @SerializedName("column_name")
  protected String columnName;

  /**
   * Builder.
   */
  public static class Builder {
    private String columnName;

    /**
     * Instantiates a new Builder from an existing UpdateTableBodyDropColumnsItems instance.
     *
     * @param updateTableBodyDropColumnsItems the instance to initialize the Builder with
     */
    private Builder(UpdateTableBodyDropColumnsItems updateTableBodyDropColumnsItems) {
      this.columnName = updateTableBodyDropColumnsItems.columnName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateTableBodyDropColumnsItems.
     *
     * @return the new UpdateTableBodyDropColumnsItems instance
     */
    public UpdateTableBodyDropColumnsItems build() {
      return new UpdateTableBodyDropColumnsItems(this);
    }

    /**
     * Set the columnName.
     *
     * @param columnName the columnName
     * @return the UpdateTableBodyDropColumnsItems builder
     */
    public Builder columnName(String columnName) {
      this.columnName = columnName;
      return this;
    }
  }

  protected UpdateTableBodyDropColumnsItems() { }

  protected UpdateTableBodyDropColumnsItems(Builder builder) {
    columnName = builder.columnName;
  }

  /**
   * New builder.
   *
   * @return a UpdateTableBodyDropColumnsItems builder
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
}

