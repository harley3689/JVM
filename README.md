```javascript 
    public class JVM {  ClassLoader загружает класс JVM в MetaSpace.

    public static void main(String[] args) {        1. Создается frame/область памяти в стеке-памяти для метода main. Для каждого метода создается frame/область памяти.
        int i = 1;                                  2. Стек-памяти хранит в себе примитивы(int i=1) и ссылки на объекты в heap/куче, на которые ссылается метод.
        Object o = new Object();                    3. Инициализация объекта и сохранение в frame/области памяти только ссылки на объект, хранящийся в heap/куче и доступный из любой точки программы.
        Integer ii = 2;                             4. Инициализация объекта Integer, создание класса Integer со значением(ii=2) в куче/heap и сохранение ссылки на него во фрейме/frame.
        printAll(o, i, ii);                         5. Для метода printAll будет создана своя область памяти/frame в стеке памяти, где будут храниться переменные (o, i, Integer ii) и их значения.
        System.out.println("finished");             6. Функция System.out хранится в heap/куче, со значением "finished" которое уже в свою очередь хранится в своем frame/области памяти.
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   7. Объект класса Integer создается в куче/heap со значением (uselessVar=700).
        System.out.println(o.toString() + i + ii);  8. Функция System.out так же хранится в куче/heap, а в стеке-памяти создается новый frame/область памяти, где хранятся ссылки на значения(o.toString, i, ii).
    }                                               9. Методы main и printAll полностью выполняются и место в стек-памяти/Stack Memory занятое фреймами освобождается.
}
```