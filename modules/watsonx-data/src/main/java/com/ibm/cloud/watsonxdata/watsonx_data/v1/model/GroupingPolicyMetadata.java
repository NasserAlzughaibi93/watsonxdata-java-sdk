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
 * GroupingPolicyMetadata.
 */
public class GroupingPolicyMetadata extends GenericModel {

  protected String domain;
  protected String inheritor;
  protected String role;

  protected GroupingPolicyMetadata() { }

  /**
   * Gets the domain.
   *
   * domain.
   *
   * @return the domain
   */
  public String getDomain() {
    return domain;
  }

  /**
   * Gets the inheritor.
   *
   * inheritor.
   *
   * @return the inheritor
   */
  public String getInheritor() {
    return inheritor;
  }

  /**
   * Gets the role.
   *
   * role.
   *
   * @return the role
   */
  public String getRole() {
    return role;
  }
}

