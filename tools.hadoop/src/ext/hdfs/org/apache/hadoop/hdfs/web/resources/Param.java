/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * Copyright (C) 2013-2016 Peng Li<aqnote@qq.com>.
 * This library is free software; you can redistribute it and/or modify it under the terms of
 * the GNU Lesser General Public License as published by the Free Software Foundation;
 */ org.apache.hadoop.hdfs.web.resources;

import java.util.Arrays;
import java.util.Comparator;


/** Base class of parameters. */
public abstract class Param<T, D extends Param.Domain<T>> {
  static final String NULL = "null";
  
  static final Comparator<Param<?,?>> NAME_CMP = new Comparator<Param<?,?>>() {
    @Override
    public int compare(Param<?, ?> left, Param<?, ?> right) {
      return left.getName().compareTo(right.getName());
    }
  };

  /** Convert the parameters to a sorted String. */
  public static String toSortedString(final String separator,
      final Param<?, ?>... parameters) {
    Arrays.sort(parameters, NAME_CMP);
    final StringBuilder b = new StringBuilder();
    for(Param<?, ?> p : parameters) {
      if (p.getValue() != null) {
        b.append(separator).append(p);
      }
    }
    return b.toString();
  }

  /** The domain of the parameter. */
  final D domain;
  /** The actual parameter value. */
  final T value;

  Param(final D domain, final T value) {
    this.domain = domain;
    this.value = value;
  }

  /** @return the parameter value. */
  public final T getValue() {
    return value;
  }

  /** @return the parameter name. */
  public abstract String getName();

  @Override
  public String toString() {
    return getName() + "=" + value;
  }

  /** Base class of parameter domains. */
  static abstract class Domain<T> {
    /** Parameter name. */
    final String paramName;
    
    Domain(final String paramName) {
      this.paramName = paramName;
    }
 
    /** @return the parameter name. */
    public final String getParamName() {
      return paramName;
    }

    /** @return a string description of the domain of the parameter. */
    public abstract String getDomain();

    /** @return the parameter value represented by the string. */
    abstract T parse(String str);

    /** Parse the given string.
     * @return the parameter value represented by the string.
     */
    public final T parse(final String varName, final String str) {
      try {
        return str != null && str.trim().length() > 0 ? parse(str) : null;
      } catch(Exception e) {
        throw new IllegalArgumentException("Failed to parse \"" + str
            + "\" for the parameter " + varName
            + ".  The value must be in the domain " + getDomain(), e);
      }
    }
  }
}