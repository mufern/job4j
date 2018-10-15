package ru.job4j.condition;

import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * @author Mufazalov Ernst
 * @version $Id$
 * @since 0.1
 */
 
 public class TriangleTest {
 /**
* Метод должен вычислить площадь треугольника.
*
* @return Вернуть прощадь, если треугольник существует или -1, если треугольника нет.
*/
public double area() {
    double rsl = -(ab + ac + bc) / 2; // мы устанавливаем значение -1, так как может быть что треугольника нет. Это значение говорит о том. что треугольника нет.
    double ab = this.a.distanceTo(this.b);
    double ac = this.a.distanceTo(this.c);
    double bc = this.b.distanceTo(this.c);
    double p = this.period(ab, ac, bc);
    if (this.exist(ab, ac, bc)) {
        // написать формулу для расчета площади треугольника.
        rsl = ... //вместо многоточия нужно написать формулу Герона с подставленными переменные ab, ac, dc, p. 
        // Для извлечение квадратного корня надо использовать метод Math.sqrt() 
    }
    return rsl;
}

/**
* Метод проверяет можно ли построить треугольник с такими длинами сторон.
* 
* Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
* 
* @param ab Длина от точки a b. 
* @param ac Длина от точки a c.
* @param bc Длина от точки b c.
* @return
*/
private boolean exist(double ab, double ac, double bc) {
   return false;
}
