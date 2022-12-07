package com.example.tester48

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    var math: Math? = null

    @Before
    fun init() {
        math = Math()
    }

    @Test
    fun simpleAdd() {
        assertEquals("4", math?.add("2", "2"))
    }

    @Test
    fun symbolAdd() {
        assertEquals("Нельзя писать буквы", math?.add("2aa#", "2"))
    }

    @Test
    fun doubleAdd() {
        assertEquals("4.4", math?.add("2.4", "2.0"))
    }

    @Test
    fun negativeMinusAdd() {
        assertEquals("Нельзя писать отрицательное", math?.add("-2", "2"))
    }

    @Test
    fun minusAdd() {
        assertEquals("2", math?.minus("4", "2"))
    }

    @Test
    fun simpleDivide(){
        assertEquals("2",math?.divide("4","2"))
    }

    @Test
    fun zeroDivide(){
        assertEquals("Делить на ноль невозможно",math?.divide("4","0"))
    }

    @After
    fun detach() {
        math = null
    }
}