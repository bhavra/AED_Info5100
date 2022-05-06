package com.company;

public class Main {

    public static void main(String[] args) {
        char[][] input = {
        {'1', '1', '1'},
        {'1', '1', '0'},
        {'0', '0', '1'}
    };
        //System.out.println(input[][]);
        System.out.println(numIslands(input));
    }

    public static int numIslands(char[][] grid){
        int count = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j] == '1'){
                    count+=1;
                    checkSides(grid, i , j);
                }
            }
        }
        return count;
    }

    public static void checkSides(char[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0')
            return;
        grid[i][j] = '0';
        checkSides(grid, i , j-1); //left
        checkSides(grid, i , j+1); //right
        checkSides(grid, i-1 , j); //up
        checkSides(grid, i+1 , j); //down
    }
}
