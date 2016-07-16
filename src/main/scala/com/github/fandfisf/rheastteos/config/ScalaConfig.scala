package com.github.fandfisf.rheastteos.config

import org.springframework.context.annotation.{Bean, Configuration}

/**
  * Created by Prashant S Khanwale @ Suveda LLC  on 7/16/16.
  */
@Configuration
class ScalaConfig {
  @Bean
  def contextPrinter = new ContextPrinter
}
