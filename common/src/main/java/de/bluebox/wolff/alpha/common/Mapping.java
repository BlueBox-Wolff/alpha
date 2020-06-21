package de.bluebox.wolff.alpha.common;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
public @interface Mapping {
  HTTPMapping mapping() default HTTPMapping.GET;

  String path();
}
