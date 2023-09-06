package org.cydeo.interview;

public class longestPalindromicSubsequence {
    public static void main(String[] args) {
        String s = "bbbab";

        //System.out.println("Longest Palindromic Subsequence Length: " + PLS(s,0,s.length()-1));
        System.out.println("longest palindrome subsequence: "+lops(s));
    }
    public static int PLS(String pal, int left, int right ){
        if (left>right)return 0;
        if (left==right) return 1;
        if (pal.charAt(left)==pal.charAt(right)) return 2+PLS(pal,left+1,right-1);
        return Math.max(PLS(pal,left,right-1),PLS(pal,left+1,right));
    }

    public static int lops(String p){
        int n=p.length();
        int [][] dc= new int [n][n];
        for (int i=0; i<n;i++){
            dc[i][i]=1;
        }
        for (int i = 2; i <=n ; i++) {
            for (int j = 0; j <n-i+1 ; j++) {
                int k= i+j-1;
                if (p.charAt(j)==p.charAt(k)) dc[j][k]=dc[j+1][k-1]+2;
                else dc[j][k]=Math.max(dc[j+1][k],dc[j][k-1]);

            }
        }
        return dc[0][n-1];
    }
}
