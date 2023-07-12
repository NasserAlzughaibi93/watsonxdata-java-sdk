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
 * user name, group id or tag value.
 */
public class RuleGrantee extends GenericModel {

  /**
   * grantee key.
   */
  public interface Key {
    /** user_name. */
    String USER_NAME = "user_name";
    /** group_id. */
    String GROUP_ID = "group_id";
    /** attribute_name. */
    String ATTRIBUTE_NAME = "attribute_name";
  }

  /**
   * grantee type.
   */
  public interface Type {
    /** user_identity. */
    String USER_IDENTITY = "user_identity";
    /** tag. */
    String TAG = "tag";
  }

  protected String value;
  protected String key;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private String value;
    private String key;
    private String type;

    /**
     * Instantiates a new Builder from an existing RuleGrantee instance.
     *
     * @param ruleGrantee the instance to initialize the Builder with
     */
    private Builder(RuleGrantee ruleGrantee) {
      this.value = ruleGrantee.value;
      this.key = ruleGrantee.key;
      this.type = ruleGrantee.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param value the value
     * @param key the key
     * @param type the type
     */
    public Builder(String value, String key, String type) {
      this.value = value;
      this.key = key;
      this.type = type;
    }

    /**
     * Builds a RuleGrantee.
     *
     * @return the new RuleGrantee instance
     */
    public RuleGrantee build() {
      return new RuleGrantee(this);
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the RuleGrantee builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * Set the key.
     *
     * @param key the key
     * @return the RuleGrantee builder
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the RuleGrantee builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected RuleGrantee() { }

  protected RuleGrantee(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.value,
      "value cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.key,
      "key cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    value = builder.value;
    key = builder.key;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a RuleGrantee builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the value.
   *
   * grantee value.
   *
   * @return the value
   */
  public String value() {
    return value;
  }

  /**
   * Gets the key.
   *
   * grantee key.
   *
   * @return the key
   */
  public String key() {
    return key;
  }

  /**
   * Gets the type.
   *
   * grantee type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

