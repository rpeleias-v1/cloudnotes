/*dataSource {
    pooled = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}*/


// environment specific settings
environments {    
    development {
      grails {
        mongo {
          host = 'troup.mongohq.com'
          username = "heroku"
          password = "heroku"
          port = 10005
          databaseName = 'app22540875'
           options {
                  autoConnectRetry = true
                  connectTimeout = 300
              }
        }
      }     
    }
    test {
      grails {
        mongo {
          host = 'troup.mongohq.com'
          username = "heroku"
          password = "heroku"
          port = 10005
          databaseName = 'app22540875'
           options {
                  autoConnectRetry = true
                  connectTimeout = 300
              }
        }
      }     
    }
    production {
      grails {
        mongo {
          host = 'troup.mongohq.com'
          username = "master"
          password = "master"
          port = 10005
          databaseName = 'app22540875'
           options {
                  autoConnectRetry = true
                  connectTimeout = 300
              }
        }
      }
    }
}
  