class Generics
{
    public static <josh> void print(josh [] array)
    {
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + ", ");

        System.out.println();
    }

    public static void main(String [] args)
    {
        Integer [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Float [] floatArr = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f, 7.0f, 8.0f, 9.0f, 0.1f};
        Double [] doubleArr = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 0.1};
        Character [] charArr = {'a', 'b', 'c', 'd', 'e', '7', 'g', 'h', 'i', '\0'};

        print (arr);
        print(floatArr);
        print(doubleArr);
        print(charArr);
    }
}
