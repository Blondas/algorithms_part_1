package com.krisdrum.week1UnionFind;

public class QuickUnionUF {
    private int [] id;

    public QuickUnionUF(int n) {
        id = new int[n];

        for (int i = 0; i < id.length; i++) {
            id[i] = 0;
        }
    }

    private int root(int i) {
        while (id[i] != i) i = id[i];
        return i;
    }

    private int rootRec(int i) {
        if (id[i] != i) return rootRec(id[i]);
        else return i;
    }

    boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        id[root(p)] = root(q);
    }
}
