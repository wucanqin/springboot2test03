package com.wcq.admin;

import org.junit.jupiter.api.*;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("junit5功能测试类")
public class Junit5Test {

    JdbcTemplate jdbcTemplate;

    @DisplayName("测试简单断言")
    @Test
    @Tag("种类1")
    void testSimpleAssertions() {
        int cal = cal(1, 3);
        assertEquals(4, cal, "计算问题");
    }

    @DisplayName("测试简单断言")
    @Test
    @Tag("种类2")
    void testSimpleAssertions1() {
        int cal = cal(1, 3);
        assertEquals(4, cal, "计算问题");
    }

    @DisplayName("测试简单断言2")
    @Test
    @Tag("种类1")
    void testSimpleAssertions2() {
        int cal = cal(1, 3);
        assertEquals(4, cal, "计算问题");
    }

    @DisplayName("测试前置条件")
    @Test
    void testAssumptions(){
        Assumptions.assumeTrue(false, "结果不是true");
        System.out.println("1111111112");
    }

    int cal(int i, int j) {
        return i + j;
    }

    int arith() {
        return 1 / 0;
    }

    // 用来测试数据库插入非正产数据的时候会不会报异常
    @Test
    void testArith() {
        assertThrows(ArithmeticException.class, () -> arith(), "计算错误");
    }

    @Test
    void testFail(){
        if (1 == 1) {
            // fail("测试快速失败");
        }
        System.out.println("------");
    }

    @BeforeEach
    @DisplayName("组合断言")
    @Test
    void preTest() {
        /**
         * 所有的断言全部成功才能往下走
         */

        System.out.println("开始单个测试");
        assertAll("test", () -> assertTrue(true && true));


    }

    @BeforeAll
    static void preall() {
        System.out.println("开始总测试");
    }

    @AfterAll
    static void after() {
        System.out.println("结束总测试");
    }


}
