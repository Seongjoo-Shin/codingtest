package codingTest.March.mar22;

import java.util.Scanner;

class Main{
    
    static int N;
    static String[][] MAP;
    static int nogreen = 0;
    static int green = 0;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        
        MAP = new String[N][N];
        
        for(int i=0; i<N; i++){
            String[] tmp = sc.nextLine().split(""); 
            for(int j=0; j<N; j++){
                MAP[i][j] = tmp[j];
            }
        }
        
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(MAP[i][j].equals("R")) {
                	if(dfsRed(i, j)) {
                    	nogreen++;
                    }	
                } else if(MAP[i][j].equals("B")) {
                	if(dfsBlue(i, j)) {
                    	nogreen++;
                    }	
                }  else if(MAP[i][j].equals("G")) {
                	if(dfsGreen(i, j)) {
                    	green++;
                    }	
                }
            	
            }
        }
        System.out.println((nogreen+green) + " " + nogreen);
        
    }
    
    public static boolean dfsRed(int r, int c){
        if(r < 0 || c < 0 || r >= N || c >= N)
            return false;
        
        if(MAP[r][c].equals("R")){
            MAP[r][c] = "V";
            dfsRed(r+1, c);
            dfsRed(r-1, c);
            dfsRed(r, c+1);
            dfsRed(r, c-1);
            return true;
        }
        return false;
    }
    public static boolean dfsBlue(int r, int c){
        if(r < 0 || c < 0 || r >= N || c >= N)
            return false;
        
        if(MAP[r][c].equals("B")){
            MAP[r][c] = "V";
            dfsBlue(r+1, c);
            dfsBlue(r-1, c);
            dfsBlue(r, c+1);
            dfsBlue(r, c-1);
            return true;
        }
        return false;
    }
    public static boolean dfsGreen(int r, int c){
        if(r < 0 || c < 0 || r >= N || c >= N)
            return false;
        
        if(MAP[r][c].equals("G")){
            MAP[r][c] = "V";
            dfsGreen(r+1, c);
            dfsGreen(r-1, c);
            dfsGreen(r, c+1);
            dfsGreen(r, c-1);
            return true;
        }
        return false;
    }
}