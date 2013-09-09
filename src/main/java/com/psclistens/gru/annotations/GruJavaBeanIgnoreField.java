package com.psclistens.gru.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used by gru to prevent generating getters/setters for fields.
 * Any field marked with this annotation will be ignored by the the GruJavaBean plugin
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
public @interface GruJavaBeanIgnoreField {

}
