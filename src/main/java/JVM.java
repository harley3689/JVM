public class JVM {  //ClassLoader загружает класс JVM в MetaSpace.

    public static void main(String[] args) {    //Создается frame/область памяти в стеке-памяти для метода main. Для каждого метода создается frame/область памяти.
        int i = 1;  //Стек-памяти хранит в себе примитивы(int i=1) и ссылки на объекты в heap/куче, на которые ссылается метод.
        Object o = new Object();    //Инициализация объекта и сохранение в frame/области памяти только ссылки на объект, хранящийся в heap/куче и доступный из любой точки программы.
        Integer ii = 2;     //Инициализация объекта Integer, создание класса Integer со значением(ii=2) в куче/heap и сохранение ссылки на него во фрейме/frame.
        printAll(o, i, ii);     //Для метода printAll будет создана своя область памяти/frame в стеке памяти, где будут храниться переменные (o, i, Integer ii) и их значения.
        System.out.println("finished");     //Функция System.out хранится в heap/куче, со значением "finished" которое уже в свою очередь хранится в своем frame/области памяти.
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;       //Объект класса Integer создается в куче/heap со значением (uselessVar=700).
        System.out.println(o.toString() + i + ii);      //Функция System.out так же хранится в куче/heap, а в стеке-памяти создается новый frame/область памяти, где хранятся ссылки на значения(o.toString, i, ii).
    }       //Методы main и printAll полностью выполняются и место в стек-памяти/Stack Memory занятое фреймами освобождается.
}