package com.luay.DataStructuresAlgorithms.HackerRank.DataStructures.Queues;

import java.io.BufferedInputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    public Node(int x, int y, int turns) {
        this.x = x; this.y = y; this.turns = turns;
    }
    int x, y, turns;
}

public class CastleOnTheGrid {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        int n = Integer.parseInt(stdin.nextLine());
        boolean[][] visited = new boolean[n][n];
        char[][] grid = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = stdin.nextLine();
            for (int j = 0; j < n; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        String[] startAndEnd = stdin.nextLine().split("\\s+");
        Queue<Node> queue = new LinkedList<Node>();
        Node start = new Node(Integer.parseInt(startAndEnd[0]), Integer.parseInt(startAndEnd[1]), 0);
        queue.add(start);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            visited[curr.x][curr.y] = true;

            if (curr.x == Integer.parseInt(startAndEnd[2]) && curr.y == Integer.parseInt(startAndEnd[3])) {
                System.out.println(curr.turns);
                break;
            }
            int newTurnsCount = curr.turns + 1;
            // east
            int exploreY = curr.y;
            while (exploreY + 1 < n && !visited[curr.x][exploreY + 1] && grid[curr.x][exploreY + 1] != 'X') {
                queue.add(new Node(curr.x, exploreY + 1, newTurnsCount));
                exploreY++;
            }
            // west
            exploreY = curr.y;
            while (exploreY - 1 >= 0 && !visited[curr.x][exploreY - 1] && grid[curr.x][exploreY - 1] != 'X') {
                queue.add(new Node(curr.x, exploreY - 1, newTurnsCount));
                exploreY--;
            }
            // south
            int exploreX = curr.x;
            while (exploreX + 1 < n && !visited[exploreX + 1][curr.y] && grid[exploreX + 1][curr.y] != 'X') {
                queue.add(new Node(exploreX + 1, curr.y, newTurnsCount));
                exploreX++;
            }
            // north
            exploreX = curr.x;
            while (exploreX - 1 >= 0 && !visited[exploreX - 1][curr.y] && grid[exploreX - 1][curr.y] != 'X') {
                queue.add(new Node(exploreX - 1, curr.y, newTurnsCount));
                exploreX--;
            }
        }
    }
}