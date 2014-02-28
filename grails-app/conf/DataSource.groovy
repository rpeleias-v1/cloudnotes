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
          url =  System.env.MONGOHQ_URL
          pooled = true
          options {
              autoConnectRetry = true
              connectTimeout = 3000
              connectionsPerHost = 500
              socketTimeout = 60000
              threadsAllowedToBlockForConnectionMultiplier = 5
              maxAutoConnectRetryTime=2
              maxWaitTime=120000
          }   
        }
      }
    }
}
  