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
 * Resource with result.
 */
public class ResourceWithResult extends GenericModel {

  protected String action;
  @SerializedName("resource_name")
  protected String resourceName;
  @SerializedName("resource_type")
  protected String resourceType;
  protected Boolean result;

  protected ResourceWithResult() { }

  /**
   * Gets the action.
   *
   * action.
   *
   * @return the action
   */
  public String getAction() {
    return action;
  }

  /**
   * Gets the resourceName.
   *
   * Resource name.
   *
   * @return the resourceName
   */
  public String getResourceName() {
    return resourceName;
  }

  /**
   * Gets the resourceType.
   *
   * Resource type.
   *
   * @return the resourceType
   */
  public String getResourceType() {
    return resourceType;
  }

  /**
   * Gets the result.
   *
   * resource evaluation result.
   *
   * @return the result
   */
  public Boolean isResult() {
    return result;
  }
}

