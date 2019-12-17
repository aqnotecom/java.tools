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
 */ org.apache.hadoop.mapred;

import java.io.IOException;

import org.apache.hadoop.io.Text;

/**
 * This class is similar to SequenceFileInputFormat, except it generates SequenceFileAsTextRecordReader 
 * which converts the input keys and values to their String forms by calling toString() method. 
 */
public class SequenceFileAsTextInputFormat
  extends SequenceFileInputFormat<Text, Text> {

  public SequenceFileAsTextInputFormat() {
    super();
  }

  public RecordReader<Text, Text> getRecordReader(InputSplit split,
                                                  JobConf job,
                                                  Reporter reporter)
    throws IOException {

    reporter.setStatus(split.toString());

    return new SequenceFileAsTextRecordReader(job, (FileSplit) split);
  }
}