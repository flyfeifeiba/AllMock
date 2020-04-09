package com.example.demo.util;

/**
 * @ClassName ClassUtil
 * @Description TODO
 * @Author yuanyuan.wang
 * @Date 2020/4/9 17:08
 * @Version 1.0
 */
public class ClassUtil {
    /**
     * 判断是否是基础类型
     * @param clazz 类型
     * @return
     */
    public static boolean isPrimitive(Class clazz) {
        return clazz.isPrimitive();
    }


    /**
     * 判断是否是基础类型的包装类型
     * @param clazz 类型
     * @return
     */
    public static boolean isWrapPrimitive(Class clazz) {
        try {
            return ((Class) clazz.getField("TYPE").get(null)).isPrimitive();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * 判断是否是基础类型或者其包装类型
     * @param clazz
     * @return
     */
    public static boolean isPrimitiveOrWarpPrimitive(Class clazz) {
        return isPrimitive(clazz) || isWrapPrimitive(clazz);
    }



}
