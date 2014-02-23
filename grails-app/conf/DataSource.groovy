dataSource {
    pooled = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {    
    development {
      grails {
        mongo {
          hostname = 'localhost'
          port = 27017
          databaseName = 'cloudnotes'
        }
      }
    }
    test {
      grails {
        mongo {
          hostname = 'localhost'
          port = 27017
          databaseName = 'cloudnotes'
        }
      }
    }
    production {
      grails {
        mongo {
          hostname = 'localhost'
          port = 27017
          databaseName = 'cloudnotes'
        }
      }
    }
}
