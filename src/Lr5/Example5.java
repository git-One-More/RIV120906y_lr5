package Lr5;

public class Example5 {
    private int i;

    public Example5(int i){
        this.setI(i);
    }

    public void setI() {
        this.i = 0;
    }

    public void setI(int i) {
        this.i = i > 100 ? 100 : i;
    }

    public void checkI(){
        System.out.println("Значение: " + this.i);
    }
}

//Напишите программу с классом, у которого есть закрытое целочисленное
//поле. Значение полю присваивается с помощью открытого метода. Методу
//аргументом может передаваться целое число, а также метод может вызываться
//без аргументов. Если методы вызывается без аргументов, то поле получает
//нулевое значение. Если метод вызывается с целочисленным аргументом, то
//это значение присваивается полю. Однако если переданное аргументом
//методу значение превышает 100, то значением полю присваивается число 100.
//Предусмотрите в классе конструктор, который работает по тому же принципу
//что и метод для присваивания значения полю. Также в классе должен быть
//метод, позволяющий проверить значение поля.