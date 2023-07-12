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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Rule.
 */
public class Rule extends GenericModel {

  public interface Actions {
    /** all. */
    String ALL = "all";
    /** create. */
    String CREATE = "create";
    /** drop. */
    String DROP = "drop";
    /** alter. */
    String ALTER = "alter";
    /** insert. */
    String INSERT = "insert";
    /** grant. */
    String GRANT = "grant";
    /** revoke. */
    String REVOKE = "revoke";
    /** delete. */
    String DELETE = "delete";
    /** select. */
    String SELECT = "select";
    /** use. */
    String USE = "use";
    /** show. */
    String SHOW = "show";
    /** view. */
    String VIEW = "view";
    /** truncate. */
    String TRUNCATE = "truncate";
  }

  /**
   * data policy effect.
   */
  public interface Effect {
    /** allow. */
    String ALLOW = "allow";
    /** deny. */
    String DENY = "deny";
  }

  protected List<String> actions;
  protected String effect;
  protected RuleGrantee grantee;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> actions;
    private String effect;
    private RuleGrantee grantee;

    /**
     * Instantiates a new Builder from an existing Rule instance.
     *
     * @param rule the instance to initialize the Builder with
     */
    private Builder(Rule rule) {
      this.actions = rule.actions;
      this.effect = rule.effect;
      this.grantee = rule.grantee;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param actions the actions
     * @param grantee the grantee
     */
    public Builder(List<String> actions, RuleGrantee grantee) {
      this.actions = actions;
      this.grantee = grantee;
    }

    /**
     * Builds a Rule.
     *
     * @return the new Rule instance
     */
    public Rule build() {
      return new Rule(this);
    }

    /**
     * Adds an actions to actions.
     *
     * @param actions the new actions
     * @return the Rule builder
     */
    public Builder addActions(String actions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(actions,
        "actions cannot be null");
      if (this.actions == null) {
        this.actions = new ArrayList<String>();
      }
      this.actions.add(actions);
      return this;
    }

    /**
     * Set the actions.
     * Existing actions will be replaced.
     *
     * @param actions the actions
     * @return the Rule builder
     */
    public Builder actions(List<String> actions) {
      this.actions = actions;
      return this;
    }

    /**
     * Set the effect.
     *
     * @param effect the effect
     * @return the Rule builder
     */
    public Builder effect(String effect) {
      this.effect = effect;
      return this;
    }

    /**
     * Set the grantee.
     *
     * @param grantee the grantee
     * @return the Rule builder
     */
    public Builder grantee(RuleGrantee grantee) {
      this.grantee = grantee;
      return this;
    }
  }

  protected Rule() { }

  protected Rule(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.actions,
      "actions cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.grantee,
      "grantee cannot be null");
    actions = builder.actions;
    effect = builder.effect;
    grantee = builder.grantee;
  }

  /**
   * New builder.
   *
   * @return a Rule builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the actions.
   *
   * the actions to enforce when the data policy triggers.
   *
   * @return the actions
   */
  public List<String> actions() {
    return actions;
  }

  /**
   * Gets the effect.
   *
   * data policy effect.
   *
   * @return the effect
   */
  public String effect() {
    return effect;
  }

  /**
   * Gets the grantee.
   *
   * user name, group id or tag value.
   *
   * @return the grantee
   */
  public RuleGrantee grantee() {
    return grantee;
  }
}

