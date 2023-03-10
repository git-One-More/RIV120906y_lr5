package Lr5;
public class Example4 {
    private char c;
    private int i;

    public Example4(int i, char c){
        this.c = c;
        this.i = i;
    }

    public Example4(double d){
        this.c = (char)((int)d);
        this.i = (int)((d%1)*100);
    }
}

//Напишите программу с классом, у которого есть символьное и
//целочисленное поле. В классе должны быть описаны версии конструктора с
//двумя аргументами (целое число и символ – определяют значения полей), а
//также с одним аргументом типа double. В последнем случае действительная
//часть аргумента определяет код символа (значение символьного поля), а
//дробная часть (с учетом десятых и сотых) определяет значение
//целочисленного поля. Например, если аргументом передается число 65.1267,
//то значением символьного поля будет символ ‘A’ с годом 65, а целочисленное
//поле получит значение 12 (в дробной части учитываются только десятые и
//сотые).
