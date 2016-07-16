package com.github.fandfisf.rheastteos.config

import com.typesafe.scalalogging.LazyLogging
import org.springframework.context.{ApplicationContext, ApplicationContextAware}

/**
  * Created by Prashant S Khanwale @ Suveda LLC  on 7/16/16.
  */
class ContextPrinter extends ApplicationContextAware with LazyLogging{
  override def setApplicationContext(applicationContext: ApplicationContext): Unit = {
    logger.debug(s"Application name[${applicationContext.getApplicationName}]")
    logger.debug(s"Total number of beans [${applicationContext.getBeanDefinitionCount}]")
    val beans = applicationContext.getBeanDefinitionNames
    beans.foreach(name => logger.debug(s"Name [${name}], class [${applicationContext.getBean(name).getClass}]" ))
  }
}

