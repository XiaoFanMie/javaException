package com.ff.javaexception;

public class Demo6 {
    public static void main(String[] args) {
        Demo6 d6 = new Demo6();
        try {
            d6.checkScore(100);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
        public String checkScore ( int score) throws SorcseException {
            if (score < 0 || score > 100) {
            /*当不满足某种条件时,在方法中显示的抛出一个异常对象,执行后后面的代码就不执行
            throw new RuntimeException();*/
                throw new SorcseException("成绩不合法");
            }
            if (score > 90) {
                return "优秀";
            } else {
                return "不优秀";
            }
        }

}