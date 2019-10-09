# validator-utils
数据校验工具类
简单的校验工具使用方式

    public static void main(String[] args) {
        ValidatorUtils.builder().on("notnull").notNull("对象1 非空校验").on("").notNull(" 对象2非空校验");

    }

