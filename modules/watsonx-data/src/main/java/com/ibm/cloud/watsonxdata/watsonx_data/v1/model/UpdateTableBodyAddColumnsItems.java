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
 * Add_columns items.
 */
public class UpdateTableBodyAddColumnsItems extends GenericModel {

  @SerializedName("column_comment")
  protected String columnComment;
  @SerializedName("column_name")
  protected String columnName;
  @SerializedName("data_type")
  protected String dataType;

  /**
   * Builder.
   */
  public static class Builder {
    private String columnComment;
    private String columnName;
    private String dataType;

    /**
     * Instantiates a new Builder from an existing UpdateTableBodyAddColumnsItems instance.
     *
     * @param updateTableBodyAddColumnsItems the instance to initialize the Builder with
     */
    private Builder(UpdateTableBodyAddColumnsItems updateTableBodyAddColumnsItems) {
      this.columnComment = updateTableBodyAddColumnsItems.columnComment;
      this.columnName = updateTableBodyAddColumnsItems.columnName;
      this.dataType = updateTableBodyAddColumnsItems.dataType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateTableBodyAddColumnsItems.
     *
     * @return the new UpdateTableBodyAddColumnsItems instance
     */
    public UpdateTableBodyAddColumnsItems build() {
      return new UpdateTableBodyAddColumnsItems(this);
    }

    /**
     * Set the columnComment.
     *
     * @param columnComment the columnComment
     * @return the UpdateTableBodyAddColumnsItems builder
     */
    public Builder columnComment(String columnComment) {
      this.columnComment = columnComment;
      return this;
    }

    /**
     * Set the columnName.
     *
     * @param columnName the columnName
     * @return the UpdateTableBodyAddColumnsItems builder
     */
    public Builder columnName(String columnName) {
      this.columnName = columnName;
      return this;
    }

    /**
     * Set the dataType.
     *
     * @param dataType the dataType
     * @return the UpdateTableBodyAddColumnsItems builder
     */
    public Builder dataType(String dataType) {
      this.dataType = dataType;
      return this;
    }
  }

  protected UpdateTableBodyAddColumnsItems() { }

  protected UpdateTableBodyAddColumnsItems(Builder builder) {
    columnComment = builder.columnComment;
    columnName = builder.columnName;
    dataType = builder.dataType;
  }

  /**
   * New builder.
   *
   * @return a UpdateTableBodyAddColumnsItems builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the columnComment.
   *
   * Comment.
   *
   * @return the columnComment
   */
  public String columnComment() {
    return columnComment;
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
   * Gets the dataType.
   *
   * Data type.
   *
   * @return the dataType
   */
  public String dataType() {
    return dataType;
  }
}

