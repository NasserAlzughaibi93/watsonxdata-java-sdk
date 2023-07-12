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
 * DataPolicyMetadata.
 */
public class DataPolicyMetadata extends GenericModel {

  protected String creator;
  protected String description;
  protected String modifier;
  protected String pid;
  @SerializedName("policy_name")
  protected String policyName;
  @SerializedName("updated_at")
  protected String updatedAt;
  protected String version;
  @SerializedName("created_at")
  protected String createdAt;

  protected DataPolicyMetadata() { }

  /**
   * Gets the creator.
   *
   * an identifier for the creator of the policy.
   *
   * @return the creator
   */
  public String getCreator() {
    return creator;
  }

  /**
   * Gets the description.
   *
   * a more detailed description of the rule.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the modifier.
   *
   * an identifier for the last modifier of the policy.
   *
   * @return the modifier
   */
  public String getModifier() {
    return modifier;
  }

  /**
   * Gets the pid.
   *
   * an unique identifier for the policy.
   *
   * @return the pid
   */
  public String getPid() {
    return pid;
  }

  /**
   * Gets the policyName.
   *
   * policy name.
   *
   * @return the policyName
   */
  public String getPolicyName() {
    return policyName;
  }

  /**
   * Gets the updatedAt.
   *
   * time when the policy was last updated.
   *
   * @return the updatedAt
   */
  public String getUpdatedAt() {
    return updatedAt;
  }

  /**
   * Gets the version.
   *
   * data policy version.
   *
   * @return the version
   */
  public String getVersion() {
    return version;
  }

  /**
   * Gets the createdAt.
   *
   * time when the policy was created.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }
}

