package com.ff.javaexception;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        try {
            System.out.println(t.checkTriangle(a, b, c));
        } catch (TriangleTest triangleTest) {
            triangleTest.getMessage();
            triangleTest.printStackTrace();
        }
    }

    public String checkTriangle(int x, int y, int z) throws TriangleTest {
        if (x < 0 || y < 0 || z < 0) {
            throw new TriangleTest("输入数值不合法");
        }
        if (x + y >= z && x + z >= y && y + z >= x) {
            return "可以构成三角形";
        }else {
            throw new TriangleTest("无法构成三角形");
        }
    }
}
