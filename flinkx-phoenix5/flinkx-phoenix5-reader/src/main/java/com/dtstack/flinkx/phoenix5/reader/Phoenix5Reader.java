/*
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

package com.dtstack.flinkx.phoenix5.reader;

import com.dtstack.flinkx.config.DataTransferConfig;
import com.dtstack.flinkx.phoenix.reader.PhoenixReader;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * Company: www.dtstack.com
 *
 * @author kunni
 */

public class Phoenix5Reader extends PhoenixReader {

    public Phoenix5Reader(DataTransferConfig config, StreamExecutionEnvironment env) {
        super(config, env);
    }
}
