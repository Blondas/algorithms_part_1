package com.krisdrum;

public class QuickFindUF {
    private int [] id;

    public QuickFindUF(int n) {
        id = new int[n];

        for (int i = 0; i < id.length; i++) {
            id[i] = 0;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

}
