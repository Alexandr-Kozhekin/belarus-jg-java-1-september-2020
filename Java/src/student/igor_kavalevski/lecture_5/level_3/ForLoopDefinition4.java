/*
Найдите логическую ошибку в программе и исправьте её:

class ForLoopDefinition4 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i--) {
            System.out.println(i);
        }
    }

}

PS: программа должна выводить на консоль числа от 0 до 9.
 */

package student.igor_kavalevski.lecture_5.level_3;

public class ForLoopDefinition4 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}
