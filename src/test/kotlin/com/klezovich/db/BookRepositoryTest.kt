package com.klezovich.db

import io.quarkus.test.common.QuarkusTestResource
import io.quarkus.test.h2.H2DatabaseTestResource
import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import javax.inject.Inject
import javax.transaction.Transactional

@QuarkusTest
@Transactional
class BookRepositoryTest {

    @Inject
    lateinit var bookRepository:BookRepository;

    @Test
    fun testCanSaveAndReadBook() {
        var b = Book()
        b.name="War and piece"

        bookRepository.persist(b)

        assertEquals(1,bookRepository.count())
    }
}