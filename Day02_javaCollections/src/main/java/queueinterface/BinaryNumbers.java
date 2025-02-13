package queueinterface;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbers {
    public static void main(String[] args) {
        int n =5;
        System.out.println(binarynumber(n));
    }
    public static Queue<String> binarynumber(int n){
        Queue<String> queue = new LinkedList<>();
            String s="";
            for(int i=0;i<n;i++){
                s = Integer.toBinaryString(i);
                queue.offer(s);
            }
            return queue;
        }
    }

