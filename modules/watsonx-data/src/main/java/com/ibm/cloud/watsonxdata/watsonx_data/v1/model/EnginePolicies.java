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
 * EnginePolicies.
 */
public class EnginePolicies extends GenericModel {

  @SerializedName("policy_name")
  protected String policyName;
  @SerializedName("policy_version")
  protected String policyVersion;

  protected EnginePolicies() { }

  /**
   * Gets the policyName.
   *
   * The policy name.
   *
   * @return the policyName
   */
  public String getPolicyName() {
    return policyName;
  }

  /**
   * Gets the policyVersion.
   *
   * Policy version.
   *
   * @return the policyVersion
   */
  public String getPolicyVersion() {
    return policyVersion;
  }
}

