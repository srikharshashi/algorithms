package BackTracking.maze;

public class maze1 {
    public static void main(String[] args) {
        boolean visited[][]=new boolean[3][3];

//        define the matrix
        for(int i=0;i<3;i++){
            for (int j = 0; j <3 ; j++) {
                visited[i][j]=false;
            }
        }
        int path[][]=new int[3][3];

        getPathMat(0,0,visited,3,path,1);






    }
    static  void getPath(int r,int c,boolean visited[][],int n,String path){
        if(r==n-1 && c==n-1){
            System.out.println(path);
            return;
        }
        if(!visited[r][c]){
            visited[r][c]=true;

            //going down
            if(r<n-1){
                getPath(r+1,c,visited,n,path+"D");
            }

            //going up
            if(r>0){
                getPath(r-1,c,visited,n,path+"U");
            }

            //going forward
            if(c<n-1){
                getPath(r,c+1,visited,n,path+"F");
            }

            //going backward
            if(c>0){
                getPath(r,c-1,visited,n,path+"B");
            }

            visited[r][c]=false;
        }
    }
    static void printPath(int[][] path){
        System.out.println("Path");
        for(int i=0;i<path.length;i++){
            for (int j = 0; j < path[0].length; j++) {
                System.out.print(path[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static  void getPathMat(int r,int c,boolean visited[][],int n,int[][] path,int k ){
        if(r==n-1 && c==n-1){
            path[r][c]=k;
            printPath(path);
            return;
        }
        if(!visited[r][c]){
            visited[r][c]=true;
            path[r][c]=k;
            k++;


            //going down
            if(r<n-1){
                getPathMat(r+1,c,visited,n,path,k);
            }

            //going up
            if(r>0){
                getPathMat(r-1,c,visited,n,path,k);
            }

            //going forward
            if(c<n-1){
                getPathMat(r,c+1,visited,n,path,k);
            }

            //going backward
            if(c>0){
                getPathMat(r,c-1,visited,n,path,k);
            }

            visited[r][c]=false;
            path[r][c]=0;
            k--;
        }
    }
}
