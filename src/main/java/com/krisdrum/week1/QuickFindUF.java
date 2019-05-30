package com.krisdrum.week1;

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

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];

        if (pid != qid) {
            for (int i = 0; i < id.length; i++) {
                if (id[i] == pid) id[i] = qid;
            }
        }
    }

}
