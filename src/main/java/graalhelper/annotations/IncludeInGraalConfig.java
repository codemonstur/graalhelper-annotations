package graalhelper.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Tag a class with this annotation and Graalhelper will include it in its output file.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface IncludeInGraalConfig {}