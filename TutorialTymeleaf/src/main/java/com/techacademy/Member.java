package com.techacademy;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Lombokアノテーション
 * - @Data getter/setter, toString, hashCode, equalsメソッド生成
 * - @AllArgsConstructor 全フィールドを引数に持つコンストラクタを生成
 * -- getter/setterやコンストラクタの記述を省略できる
 */
@Data
@AllArgsConstructor
public class Member {
    private int id;
    private String name;
    private String gender;
    private int age;
}
