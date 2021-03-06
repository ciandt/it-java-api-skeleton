package com.ciandt.skeleton.web.rest.v1.resource;

import com.ciandt.skeleton.core.domain.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.vidolima.ditiow.resource.AbstractResource;
import lombok.Data;

/**
 * This is the {@link User}'s resource representation. This class is responsible for expose the
 * entity as a rest resource including resource validations.
 *
 * @author mvidolin
 * @since Jul 29, 2019
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResource extends AbstractResource<User> {

  private String login;
  private String name;
}
