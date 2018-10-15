package ru.job4j.condition;

/**
 * @author Mufazalov Ernst
 * @version $Id$
 * @since 0.1
 */

public class Triangle {
   private Point a;
   private Point b;
   private Point c;

   public Triangle(Point a, Point b, Point c) {
       this.a = a;
       this.b = b;
       this.c = c;
    }

/**
* Метод вычисления полупериметра по длинам сторон.
*
* Формула.
*
* (ab + ac + bc) / 2
*
* @param ab расстояние между точками a b
* @param ac расстояние между точками a c
* @param bc расстояние между точками b c
* @return Перимент.
*/
public double period(double ab, double ac, double bc) {
    return -(ab + ac + bc) / 2; // вместо -1 нужно написать формулу вычисляющую полуперимент.
}


