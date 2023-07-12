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
 * The parseCsv options.
 */
public class ParseCsvOptions extends GenericModel {

  protected String engine;
  protected String parseFile;
  protected String fileType;
  protected String accept;
  protected String authInstanceId;

  /**
   * Builder.
   */
  public static class Builder {
    private String engine;
    private String parseFile;
    private String fileType;
    private String accept;
    private String authInstanceId;

    /**
     * Instantiates a new Builder from an existing ParseCsvOptions instance.
     *
     * @param parseCsvOptions the instance to initialize the Builder with
     */
    private Builder(ParseCsvOptions parseCsvOptions) {
      this.engine = parseCsvOptions.engine;
      this.parseFile = parseCsvOptions.parseFile;
      this.fileType = parseCsvOptions.fileType;
      this.accept = parseCsvOptions.accept;
      this.authInstanceId = parseCsvOptions.authInstanceId;
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
     * @param parseFile the parseFile
     * @param fileType the fileType
     */
    public Builder(String engine, String parseFile, String fileType) {
      this.engine = engine;
      this.parseFile = parseFile;
      this.fileType = fileType;
    }

    /**
     * Builds a ParseCsvOptions.
     *
     * @return the new ParseCsvOptions instance
     */
    public ParseCsvOptions build() {
      return new ParseCsvOptions(this);
    }

    /**
     * Set the engine.
     *
     * @param engine the engine
     * @return the ParseCsvOptions builder
     */
    public Builder engine(String engine) {
      this.engine = engine;
      return this;
    }

    /**
     * Set the parseFile.
     *
     * @param parseFile the parseFile
     * @return the ParseCsvOptions builder
     */
    public Builder parseFile(String parseFile) {
      this.parseFile = parseFile;
      return this;
    }

    /**
     * Set the fileType.
     *
     * @param fileType the fileType
     * @return the ParseCsvOptions builder
     */
    public Builder fileType(String fileType) {
      this.fileType = fileType;
      return this;
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the ParseCsvOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }

    /**
     * Set the authInstanceId.
     *
     * @param authInstanceId the authInstanceId
     * @return the ParseCsvOptions builder
     */
    public Builder authInstanceId(String authInstanceId) {
      this.authInstanceId = authInstanceId;
      return this;
    }
  }

  protected ParseCsvOptions() { }

  protected ParseCsvOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.engine,
      "engine cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.parseFile,
      "parseFile cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.fileType,
      "fileType cannot be null");
    engine = builder.engine;
    parseFile = builder.parseFile;
    fileType = builder.fileType;
    accept = builder.accept;
    authInstanceId = builder.authInstanceId;
  }

  /**
   * New builder.
   *
   * @return a ParseCsvOptions builder
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
   * Gets the parseFile.
   *
   * parse file to data type.
   *
   * @return the parseFile
   */
  public String parseFile() {
    return parseFile;
  }

  /**
   * Gets the fileType.
   *
   * File type.
   *
   * @return the fileType
   */
  public String fileType() {
    return fileType;
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

