/*
You should bundle Types cin a package for several reasons, including the following:

You and other programmers can easily determine that these types are related.
You and other programmers know where to find types that can provide graphics-related functions.
The names of your types won't conflict with the type names in other packages because the package creates a new namespace.
You can allow types within the package to have unrestricted access to one another yet still restrict access for types outside the package.
* */
package com.janbask.packages;

public interface Computable {

    float computeResult(float[] values);
}


