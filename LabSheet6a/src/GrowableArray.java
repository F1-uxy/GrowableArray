public class GrowableArray {

    private int[] elements;
    private int numberOfElements;

    GrowableArray()
    {
        this.elements = new int[10];
        this.numberOfElements = 0;
    }

    public void addToArray(int newInt)
    {
        if((elements.length - numberOfElements) > 0)
        {
            this.elements[numberOfElements] = newInt;
            numberOfElements += 1;
        }
        if((elements.length - numberOfElements) == 0)
        {
            int newSize = (int)(numberOfElements * 1.5);
            int[] temp = new int[newSize];

            for(int x=0; x < numberOfElements; x++)
            {
                temp[x] = elements[x];
            }
            elements = temp;
            elements[numberOfElements] = newInt;
            numberOfElements += 1;
        }
    }

    public String toString()
    {
        return (numberOfElements + "/" + elements.length);
    }

    public static void main(String[] args)
    {

        GrowableArray growableArray = new GrowableArray();
        for(int i=0; i < 100; i++)
        {
            growableArray.addToArray(i);
            System.out.println(growableArray.toString());

        }
    }

}
