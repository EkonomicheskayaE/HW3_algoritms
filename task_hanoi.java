// Написать программу, показывающую последовательность действий для игры “Ханойская башня”.

package Task_4_6;

public class task_hanoi {

    public static String hanoi(int nDisk, int fromBase, int toBase) {
        if (nDisk == 1) {
            return fromBase + " -> " + toBase + ";";
        } else {
            String Base1, Base2, Base3;
            int helpBase = 6 - fromBase - toBase;

            Base1 = hanoi(nDisk - 1, fromBase, helpBase);
            Base2 = fromBase + " -> " + toBase + ";";
            Base3 = hanoi(nDisk - 1, helpBase, toBase);

            return Base1 + Base2 + Base3;
        } 
    }
    public static void main(String[] args) {
        int nDisk = 5;
        String stepsToSelString = hanoi(nDisk, 1, 3);

        for (String step : stepsToSelString.split(";")) {
            System.out.println(step);
        }
    }
}
