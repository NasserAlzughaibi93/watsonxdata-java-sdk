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
 * The explainStatement options.
 */
public class ExplainStatementOptions extends GenericModel {

  /**
   * Format.
   */
  public interface Format {
    /** text. */
    String TEXT = "text";
    /** graphviz. */
    String GRAPHVIZ = "graphviz";
    /** json. */
    String JSON = "json";
  }

  /**
   * Type.
   */
  public interface Type {
    /** logical. */
    String LOGICAL = "logical";
    /** distributed. */
    String DISTRIBUTED = "distributed";
    /** validate. */
    String VALIDATE = "validate";
    /** io. */
    String IO = "io";
  }

  protected String engineId;
  protected String statement;
  protected String catalogName;
  protected String format;
  protected String schemaName;
  protected String type;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engineId;
    private String statement;
    private String catalogName;
    private String format;
    private String schemaName;
    private String type;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ExplainStatementOptions instance.
     *
     * @param explainStatementOptions the instance to initialize the Builder with
     */
    private Builder(ExplainStatementOptions explainStatementOptions) {
      this.engineId = explainStatementOptions.engineId;
      this.statement = explainStatementOptions.statement;
      this.catalogName = explainStatementOptions.catalogName;
      this.format = explainStatementOptions.format;
      this.schemaName = explainStatementOptions.schemaName;
      this.type = explainStatementOptions.type;
      this.authInstanceId = explainStatementOptions.authInstanceId;
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
     * @param statement the statement
     */
    public Builder(String engineId, String statement) {
      this.engineId = engineId;
      this.statement = statement;
    }

    /**
     * Builds a ExplainStatementOptions.
     *
     * @return the new ExplainStatementOptions instance
     */
    public ExplainStatementOptions build() {
      return new ExplainStatementOptions(this);
    }

    /**
     * Set the engineId.
     *
     * @param engineId the engineId
     * @return the ExplainStatementOptions builder
     */
    public Builder engineId(String engineId) {
      this.engineId = engineId;
      return this;
    }

    /**
     * Set the statement.
     *
     * @param statement the statement
     * @return the ExplainStatementOptions builder
     */
    public Builder statement(String statement) {
      this.statement = statement;
      return this;
    }

    /**
     * Set the catalogName.
     *
     * @param catalogName the catalogName
     * @return the ExplainStatementOptions builder
     */
    public Builder catalogName(String catalogName) {
      this.catalogName = catalogName;
      return this;
    }

    /**
     * Set the format.
     *
     * @param format the format
     * @return the ExplainStatementOptions builder
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }

    /**
     * Set the schemaName.
     *
     * @param schemaName the schemaName
     * @return the ExplainStatementOptions builder
     */
    public Builder schemaName(String schemaName) {
      this.schemaName = schemaName;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ExplainStatementOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ExplainStatementOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ExplainStatementOptions() { }

  protected ExplainStatementOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engineId,
      "engineId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.statement,
      "statement cannot be null");
    engineId = builder.engineId;
    statement = builder.statement;
    catalogName = builder.catalogName;
    format = builder.format;
    schemaName = builder.schemaName;
    type = builder.type;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ExplainStatementOptions builder
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
   * Gets the statement.
   *
   * Statement.
   *
   * @return the statement
   */
  public String statement() {
    return statement;
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
   * Gets the format.
   *
   * Format.
   *
   * @return the format
   */
  public String format() {
    return format;
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
   * Gets the type.
   *
   * Type.
   *
   * @return the type
   */
  public String type() {
    return type;
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

