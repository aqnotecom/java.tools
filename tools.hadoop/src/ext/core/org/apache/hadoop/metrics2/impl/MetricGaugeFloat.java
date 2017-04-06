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
 * Copyright (C) 2013-2016 aqnote.com<aqnote.com@gmail.com>.
 * This library is free software; you can redistribute it and/or modify it under the terms of
 * the GNU Lesser General Public License as published by the Free Software Foundation;
 */ org.apache.hadoop.metrics2.impl;

import org.apache.hadoop.metrics2.MetricGauge;
import org.apache.hadoop.metrics2.MetricsVisitor;

class MetricGaugeFloat extends MetricGauge<Float> {

  final float value;

  MetricGaugeFloat(String name, String description, float value) {
    super(name, description);
    this.value = value;
  }

  public Float value() {
    return value;
  }

  public void visit(MetricsVisitor visitor) {
    visitor.gauge(this, value);
  }

}
