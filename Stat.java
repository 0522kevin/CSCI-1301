public class Stat {

    //creates a private instance variable
    //declares a double array called data
    private double[] data;

    //default constructor
    public Stat() {
        //creates an empty array with no information
        data = new double[0];
    }

    //overloaded constructors
    public Stat(double[] d) {
        //creates variable reference[]
        double[] reference;

        //if the parameter is not null
        if(d != null) {
            //sets reference to have the same length as d using d.length
            reference = new double[d.length];

            //copies the information of d[] to reference
            for(int i = 0; i < d.length; i++) {
                reference[i] = d[i];
            }

            //assigns the memory location of reference to data
            data = reference;
        }
        //if the parameter is null
        else {
            //reference is an empty array
            reference = new double[0];

            //assigns the memory location of reference to data
            data = reference;
        }
    }

    public Stat(int[] i) {
        //creates variable reference[]
        double[] reference;

        //if the parameter is not null
        if(i != null) {
            //sets reference to have the same length as i using i.length
            reference = new double[i.length];

            //copies the information of i[] to reference
            for(int j = 0; j < i.length; j++) {
                reference[j] = i[j];
            }

            //assigns the memory location of reference to data
            data = reference;
        }
        //if the parameter is null
        else {
            //reference is an empty array
            reference = new double[0];

            //assigns the memory location of reference to data
            data = reference;
        }
    }

    public Stat(long[] lo) {
        //creates variable reference[]
        double[] reference;

        //if the parameter is not null
        if(lo != null) {
            //sets reference to have the same length as lo[] using lo.length
            reference = new double[lo.length];

            //copies the information of lo[] to reference
            for(int i = 0; i < lo.length; i++) {
                reference[i] = lo[i];
            }

            //assigns the memory location of reference to data
            data = reference;
        }
        //if the parameter is null
        else {
            //reference is an empty array
            reference = new double[0];

            //assigns the memory location of reference to data
            data = reference;
        }
    }

    public Stat(float[] f) {
        //creates variable reference[]
        double[] reference;

        //if the parameter is not null
        if(f != null) {
            //sets reference to have the same length as f[] using f.length
            reference = new double[f.length];

            //copies the information of f[] to reference
            for(int i = 0; i < f.length; i++) {
                reference[i] = f[i];
            }

            //assigns the memory location of reference to data
            data = reference;
        }
        //if the parameter is null
        else {
            //reference is an empty array
            reference = new double[0];

            //assigns the memory location of reference to data
            data = reference;
        }
    }

    //getter method
    public double[] getData() {
        //creates a double array called toBeReturned
        double[] toBeReturned = new double[data.length];

        //copies the information of data[]
        for(int i = 0; i < data.length; i++) {
            toBeReturned[i] = data[i];
        }

        //returns the memory location of reference array
        return toBeReturned;
    }

    //setter method
    public void setData(double[] d) {
        //creates variable reference[]
        double[] reference;

        //if the parameter is not null
        if(d != null) {
            //sets reference to have the same length as d using d.length
            reference = new double[d.length];

            //copies the information of d[] to reference
            for(int i = 0; i < d.length; i++) {
                reference[i] = d[i];
            }

            //assigns the memory location of reference to data
            data = reference;
        }
        //if the parameter is null
        else {
            //reference is an empty array
            reference = new double[0];

            //assigns the memory location of reference to data
            data = reference;
        }
    }

    public void setData(int[] i) {
        //creates variable reference[]
        double[] reference;

        //if the parameter is not null
        if(i != null) {
            //sets reference to have the same length as i using i.length
            reference = new double[i.length];

            //copies the information of i[] to reference
            for(int j = 0; j < i.length; j++) {
                reference[j] = i[j];
            }

            //assigns the memory location of reference to data
            data = reference;
        }
        //if the parameter is null
        else {
            //reference is an empty array
            reference = new double[0];

            //assigns the memory location of reference to data
            data = reference;
        }
    }

    public void setData(long[] lo) {
        //creates variable reference[]
        double[] reference;

        //if the parameter is not null
        if(lo != null) {
            //sets reference to have the same length as lo[] using lo.length
            reference = new double[lo.length];

            //copies the information of lo[] to reference
            for(int i = 0; i < lo.length; i++) {
                reference[i] = lo[i];
            }

            //assigns the memory location of reference to data
            data = reference;
        }
        //if the parameter is null
        else {
            //reference is an empty array
            reference = new double[0];

            //assigns the memory location of reference to data
            data = reference;
        }
    }

    public void setData(float[] f) {
        //creates variable reference[]
        double[] reference;

        //if the parameter is not null
        if(f != null) {
            //sets reference to have the same length as f[] using f.length
            reference = new double[f.length];

            //copies the information of f[] to reference
            for(int i = 0; i < f.length; i++) {
                reference[i] = f[i];
            }

            //assigns the memory location of reference to data
            data = reference;
        }
        //if the parameter is null
        else {
            //reference is an empty array
            reference = new double[0];

            //assigns the memory location of reference to data
            data = reference;
        }
    }

    public boolean equals(Stat s) {
        //if s's data[] is null
        if(s == null) {
            //equals() returns false
            return false;
        }

        //if s's data[] is not null
        else {
            //creates the local variables that are needed for this method
            double threshold = 0.000000001;
            int equalsCount = 0;

            //compares the length of the two arrays
            if(data.length == s.getData().length) {
                for(int i = 0; i < data.length; i++) {
                    //compares the values inside the two arrays
                    //used threshold to compare two double values
                    if(Math.abs(data[i] - s.getData()[i]) < threshold) {
                        equalsCount++;
                    }
                }

                //if the number of equal indexes match the length of the array
                //or all the indexes match
                if(equalsCount == data.length) {
                    return true;
                }
                //if the number of equal indexes don't match the length of the array
                //or all the indexes don't match
                else {
                    return false;
                }
            }
            //if the length of two arrays are not equal
            else {
                return false;
            }
        }
    }

    //method to reset data[]
    public void reset() {
        //creates reference[], which is an empty array
        double[] reference = new double[0];

        //assigns the memory address of reference to data
        data = reference;
    }

    public void append(double[] d) {
        double[] reference;
        int indexCount = 0;

        if(d != null) {
            reference = new double[data.length + d.length];

            //copes the information of data[] to reference
            for(int i = 0; i < data.length; i++) {
                reference[i] = data[i];
            }

            //copies the information of d[] to reference
            for(int i = data.length; i < data.length + d.length; i++) {
                reference[i] = d[indexCount];
                indexCount++;
            }

            //assigns the memory location of reference to data
            data = reference;
        }
    }

    public void append(int[] i) {
        double[] reference;
        int indexCount = 0;

        if(i != null) {
            reference = new double[data.length + i.length];

            //copes the information of data[] to reference
            for(int j = 0; j < data.length; j++) {
                reference[j] = data[j];
            }

            //copies the information of i[] to reference
            for(int j = data.length; j < data.length + i.length; j++) {
                reference[j] = i[indexCount];
                indexCount++;
            }

            //assigns the memory location of reference to data
            data = reference;
        }
    }

    public void append(long[] lo) {
        double[] reference;
        int indexCount = 0;

        if(lo != null) {
            reference = new double[data.length + lo.length];

            //copes the information of data[] to reference
            for(int i = 0; i < data.length; i++) {
                reference[i] = data[i];
            }

            //copies the information of lo[] to reference
            for(int j = data.length; j < data.length + lo.length; j++) {
                reference[j] = lo[indexCount];
                indexCount++;
            }

            //assigns the memory location of reference to data
            data = reference;
        }
    }

    public void append(float[] f) {
        double[] reference;
        int indexCount = 0;

        if(f != null) {
            reference = new double[data.length + f.length];

            //copes the information of data[] to reference
            for(int i = 0; i < data.length; i++) {
                reference[i] = data[i];
            }

            //copies the information of f[] to reference
            for(int i = data.length; i < data.length + f.length; i++) {
                reference[i] = f[indexCount];
                indexCount++;
            }

            //assigns the memory location of reference to data
            data = reference;
        }
    }

    public boolean isEmpty() {
        //if the length of data[] is 0
        if(data.length == 0) {
            return true;
        }
        //if data[] is not empty
        else {
            return false;
        }
    }

    //method to print the information in the array
    public String toString() {
        //prints the first bracket
        String toBeReturned = "[";

        for(int i = 0; i < data.length; i++) {
            //if the loop is not at its last occurrence
            if(i != data.length - 1) {
                //include ", " between numbers
                toBeReturned = toBeReturned + data[i] + ", ";
            }
            //if the loop is at its last occurrence
            else {
                toBeReturned = toBeReturned + data[i];
            }
        }

        //prints the last bracket
        toBeReturned = toBeReturned + "]";

        //returns the formatted array in the form of String
        return toBeReturned;
    }

    //finds the minimum value of the array
    public double min() {
        //if data[] is not empty
        if(data.length != 0) {
            double min = data[0];

            for(int i = 1; i < data.length; i++) {
                //compares double values by subtracting and comparing it to 0
                if(data[i] - min < 0) {
                    min = data[i];
                }
            }

            //returns the minimum value
            return min;
        }
        //if data[] is empty
        else {
            return Double.NaN;
        }
    }

    //finds the maximum value of the array
    public double max() {
        //if data[] is not empty
        if(data.length != 0) {
            double max = data[0];

            for(int i = 0; i < data.length; i++) {
                //compares double values by subtracting and comparing it to 0 just like min()
                if(data[i] - max > 0) {
                    max = data[i];
                }
            }

            //returns the maximum value
            return max;
        }
        //if data[] is empty
        else {
            return Double.NaN;
        }
    }

    //calculates the average of the values within data[]
    public double average() {
        //if data[] is not empty
        if(data.length != 0) {
            double average = 0.0;

            //this for loop adds all the values within the array
            for(int i = 0; i < data.length; i++) {
                average += data[i];
            }

            //calculates the average by diving the sum by the number of indexes
            average = average / data.length;

            //returns the calculated average
            return average;
        }
        //if data[] is empty
        else {
            return Double.NaN;
        }
    }

    //prints the value of most frequent value
    public double mode() {
        //creates variables that are needed for mode()

        int tempCount;
        int count = 0;
        double mostFrequent = Double.NaN;
        double threshold = 0.000000001;

        //if data[] has one index
        if(data.length == 1) {
            mostFrequent = data[0];
            return mostFrequent;
        }

        for(int i = 0; i < data.length; i++) {
            //gathers the occurrence of data[i]
            tempCount = occursNumberOfTimes(data[i]);

            //if the occurrence of data[i] is greater than count
            if(tempCount > count) {
                //mostFrequent is set to data[i]
                mostFrequent = data[i];
                //count is set to tempCount
                count = tempCount;
            }

            //if the occurrence of data[i] equals count
            if(tempCount == count) {
                //if mostFrequent and data[i] does not equal
                if(Math.abs(mostFrequent - data[i]) >= threshold) {
                    mostFrequent = Double.NaN;
                }
            }
        }

        return mostFrequent;
    }

    private int occursNumberOfTimes(double value) {
        double threshold = 0.000000001;
        int valueCheck = 0;

        for(int i = 0; i < data.length; i++) {
            //if value and data[i] equal, valueCheck adds 1 to itself
            if(Math.abs(value - data[i]) < threshold) {
                valueCheck++;
            }
        }

        return valueCheck;
    }

    public double variance() {
        double average = average();
        double variance = 0.0;

        for(int i = 0; i < data.length; i++) {
            //variance adds the square of the absolute value of the difference between data[i] and average to itself
            variance += (Math.abs(data[i] - average)) * (Math.abs(data[i] - average));
        }

        //variance divides itself by data.length
        variance = variance / data.length;

        return variance;
    }

    public double standardDeviation() {
        if(data == null) {
            return Double.NaN;
        }
        //if data[] is not null
        else {
            //returns the square root of variance()
            return Math.sqrt(variance());
        }
    }
}
