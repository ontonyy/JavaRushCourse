package com.javarush.task.task12.task1228;

/* 
Интерфейсы к классу Human
*/

public class Solution {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public static interface Worker {
        public void workLazy();
    }

    public interface Businessman {
        void workHard();
    }

    public interface Secretary {
        void workLazy();
    }

    public interface Miner {
        void workVeryHard();
    }

    public static class Human implements Businessman, Worker, Secretary{

        public void workHard() {
        }

        public void workLazy() {
        }

    }
}
