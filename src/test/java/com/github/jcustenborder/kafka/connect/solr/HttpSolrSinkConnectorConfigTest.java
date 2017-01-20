/**
 * Copyright © 2016 Jeremy Custenborder (jcustenborder@gmail.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.jcustenborder.kafka.connect.solr;

import com.google.common.collect.ImmutableMap;
import io.confluent.kafka.connect.utils.config.MarkdownFormatter;
import org.junit.jupiter.api.Test;

import java.util.Map;


public class HttpSolrSinkConnectorConfigTest {

  public static Map<String, String> settings() {
    return ImmutableMap.of(
        HttpSolrSinkConnectorConfig.SOLR_URL_CONFIG, "http://localhost:9231",
        HttpSolrSinkConnectorConfig.CORE_NAME_CONFIG, "muffins"

    );
  }

  @Test
  public void doc() {
    System.out.println(MarkdownFormatter.toMarkdown(HttpSolrSinkConnectorConfig.config()));
  }


  @Test
  public void foo() {
    HttpSolrSinkConnectorConfig config = new HttpSolrSinkConnectorConfig(settings());
  }

}