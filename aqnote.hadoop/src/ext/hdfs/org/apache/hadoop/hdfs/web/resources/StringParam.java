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

import java.util.regex.Pattern;

/** String parameter. */
abstract class StringParam extends Param<String, StringParam.Domain> {
  StringParam(final Domain domain, String str) {
    super(domain, domain.parse(str));
  }

  /** The domain of the parameter. */
  static final class Domain extends Param.Domain<String> {
    /** The pattern defining the domain; null . */
    private final Pattern pattern;

    Domain(final String paramName, final Pattern pattern) {
      super(paramName);
      this.pattern = pattern;
    }

    @Override
    public final String getDomain() {
      return pattern == null ? "<String>" : pattern.pattern();
    }

    @Override
    final String parse(final String str) {
      if (pattern != null) {
        if (!pattern.matcher(str).matches()) {
          throw new IllegalArgumentException("Invalid value: \"" + str
              + "\" does not belong to the domain " + getDomain());
        }
      }
      return str;
    }
  }
}