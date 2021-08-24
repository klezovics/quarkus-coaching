package com.klezovich.db

import io.quarkus.hibernate.orm.panache.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class BookRepository : PanacheRepository<Book> {
}