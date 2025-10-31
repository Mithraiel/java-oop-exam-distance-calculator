#java-oop-exam-distance-calculator
Java OOP exam task: Calculate the maximum Euclidean distance between points in 2D space. (Full points on code part.)

#OOP2025 – Task 1: Geometry (FernUniversität in Hagen)

This repository contains my **Java solution** for the geometry task from the *Object-Oriented Programming (OOP)* course (**Course 63016**) at **FernUniversität in Hagen**.

The exercise focused on calculating the **maximum Euclidean distance** between points in a 2D space based on two integer arrays representing x and y coordinates.  
Although I did not pass the full exam, I achieved **full marks for the programming part**, demonstrating strong practical skills in Java and OOP principles.

---

#Task Screenshots in: 
![OOP Task Screenshot](OOP2025%20-%20task%201%20-%20Geometrie/OOP2025%20-%20task%201%20-%20Geometrie.png)


> *This screenshot shows the original geometry programming task from the FernUniversität in Hagen (Course 63016).*  
> The task itself belongs to **FernUniversität in Hagen** and is shown here only for educational and illustrative purposes.  
> The **Java solution** in this repository was written by **Michael Kain** and received *full marks for the programming section*.

---

#Task Description
Given two lists of integers — one representing x-coordinates and the other y-coordinates — each index defines a point `(x_i, y_i)`.  
The task was to determine the **maximum Euclidean distance** between any two points.

The distance formula is:

\[
d = \sqrt{(x_1 - x_2)^2 + (y_1 - y_2)^2}
\]


#Java Implementation

```java
public class MaximalerAbstandRechner {

    public static void main(String[] args) {
        int[] xs = new int[] {22,76,37,8,26,5,93,34,3,67,97,47,37,48,66,45,97,75,72,50,44,37,12,51,75,67,36,26,60,23,66,1,59,65,41,27,81,99,19,66,25,68,25,35,3,96,9,49,3,66,30,43,40,19,53,83,89,77,56,90};
        int[] ys = new int[] {45,30,79,56,3,23,43,62,55,64,65,88,97,33,81,58,83,61,77,85,12,30,34,85,53,3,56,22,59,90,73,78,97,59,8,36,77,6,11,20,62,8,19,2,16,92,81,81,41,17,44,70,51,64,8,9,29,81,5,73};

        double maximalerAbstand = 0.0;

        for (int i = 0; i < xs.length; i++) {
            int x1 = xs[i];
            int y1 = ys[i];
            for (int j = i + 1; j < xs.length; j++) {
                int x2 = xs[j];
                int y2 = ys[j];

                double aktuellerAbstand = berechneAbstand(x1, y1, x2, y2);

                if (aktuellerAbstand > maximalerAbstand) {
                    maximalerAbstand = aktuellerAbstand;
                }
            }
        }

        System.out.println("Der maximale euklidische Abstand ist: " + maximalerAbstand);
    }

    public static double berechneAbstand(int x1, int y1, int x2, int y2) {
        double deltaX = x1 - x2;
        double deltaY = y1 - y2;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
}
