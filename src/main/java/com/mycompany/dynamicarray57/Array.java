package com.mycompany.dynamicarray57;

public class Array {

    private int data[] = new int[0];

    public boolean addFirst(int element) {
        int temp[] = new int[data.length];
        int index = 0;
        for (int i : data) {
            temp[index] = i;
            index++;
        }
        data = new int[data.length + 1];
        data[0] = element;
        index = 0;
        for (int i = 1; i < data.length; i++) {
            data[i] = temp[index];
            index++;
        }
        return true;
    }

    public boolean addIndex(int element, int dataIndex) {
        int temp[] = new int[data.length];
        int index = 0;
        for (int i : data) {
            temp[index] = i;
            index++;
        }
        data = new int[data.length + 1];
        for (int i = 0; i < dataIndex; i++) {
            data[i] = temp[i];
        }

        data[dataIndex] = element;
        index = dataIndex;
        for (int i = dataIndex + 1; i < data.length; i++) {
            data[i] = temp[index];
            index++;
        }
        return true;
    }

    public boolean addLast(int element) {
        int temp[] = new int[data.length];
        int index = 0;
        for (int i : data) {
            temp[index] = i;
            index++;
        }
        data = new int[data.length + 1];
        index = 0;
        for (int i : temp) {
            data[index] = i;
            index++;
        }
        data[index] = element;

        return true;
    }

    public void print() {
        for (int i : data) {
            System.out.println(i);
        }
    }

    public boolean removeFirst() {
        int temp[] = new int[data.length];
        int index = 0;
        for (int i : data) {
            temp[index] = i;
            index++;
        }

        data[0] = 0;
        data = new int[data.length - 1];
        index = 0;
        for (int i = 1; i < temp.length; i++) {
            data[index] = temp[i];
            index++;
        }
        return true;
    }

    public boolean removeIndex(int dataIndex) {
        int temp[] = new int[data.length];
        int index = 0;
        for (int i : data) {
            temp[index] = i;
            index++;
        }
        data = new int[data.length - 1];
        for (int i = 0; i < dataIndex; i++) {
            data[i] = temp[i];
        }

        index = dataIndex;
        for (int i = dataIndex + 1; i < temp.length; i++) {
            data[index] = temp[i];
            index++;
        }
        return true;
    }

    public boolean removeLast() {
        int temp[] = new int[data.length];
        int index = 0;
        for (int i : data) {
            temp[index] = i;
            index++;
        }

        data = new int[data.length - 1];

        for (int i = 0; i < temp.length - 1; i++) {
            data[i] = temp[i];
        }

        return true;
    }

    public boolean mergeFirst(int newList[]) {
        int totalSize = data.length + newList.length;

        int temp[] = new int[data.length];
        int index = 0;
        for (int i : data) {
            temp[index] = i;
            index++;
        }
        data = new int[totalSize];

        index = 0;

        for (int i : newList) {
            data[index] = i;
            index++;
        }

        for (int i : temp) {
            data[index] = i;
            index++;
        }
        return true;

    }

    public boolean mergeLast(int newList[]) {
        int totalSize = data.length + newList.length;

        int temp[] = new int[data.length];
        int index = 0;
        for (int i : data) {
            temp[index] = i;
            index++;
        }
        data = new int[totalSize];

        index = 0;

        for (int i : temp) {
            data[index] = i;
            index++;
        }
        for (int i : newList) {
            data[index] = i;
            index++;
        }

        return true;

    }

    public boolean mergeIndex(int newList[], int dataIndex) {
        int totalSize = data.length + newList.length;

        int temp[] = new int[data.length];
        int index = 0;
        for (int i : data) {
            temp[index] = i;
            index++;
        }
        data = new int[totalSize];
        index = 0;
        for (int i = 0; i < dataIndex; i++) {
            data[index] = temp[i];
            index++;
        }
        for (int i = 0; i < newList.length; i++) {
            data[index] = newList[i];
            index++;
        }

        for (int i = dataIndex; i < temp.length; i++) {
            data[index] = temp[i];
            index++;
        }

        return true;

    }

    public boolean update(int element, int index) {
        data[index] = element;
        return true;
    }

    public boolean updateFirst(int element) {
        data[0] = element;
        return true;
    }

    public boolean updateLast(int element) {
        data[data.length - 1] = element;
        return true;
    }

    public int linearSearch(int element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int element) {
        sorting();
        int start = 0;
        int last = data.length - 1;
        int total, mid;
        while (last >= start) {
            total = start + last;
            mid = total / 2;

            if (data[mid] == element) {
                return mid;
            } else if (element > data[mid]) {
                start = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }

    public void sorting() {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                int tmp = 0;
                if (data[i] > data[j]) {
                    tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }

    }

    public int getIndex(int element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public boolean equals(int element) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void viewIndex(int index) {
        System.out.println(data[index]);
    }
}
