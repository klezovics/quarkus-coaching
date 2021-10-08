package com.klezovich.db

import io.quarkus.test.TestTransaction
import io.quarkus.test.common.QuarkusTestResource
import io.quarkus.test.h2.H2DatabaseTestResource
import io.quarkus.test.junit.QuarkusTest
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import javax.inject.Inject
import javax.transaction.Transactional

@QuarkusTest
@TestTransaction
class BookRepositoryTest {

    @Inject
    lateinit var bookRepository:BookRepository;

    @Test
    fun testInitiallyRepoEmpty() {
        assertEquals(0 ,bookRepository.count())
    }

    @Test
    fun testCanSaveAndReadBook() {
        var b = Book()
        b.name="War and piece"

        bookRepository.persist(b)

        assertEquals(1,bookRepository.count())
    }

    @Test
    fun testCanReadBooksFromDb() {
        var b = Book()
        b.name="11 gnomes"

        bookRepository.persist(b)

        assertEquals(1,bookRepository.count())
    }
}