class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];

        int count = 1;
        int total = n * n;


int top=0;
int left=0;
int bottom=n-1;
int right=n-1;


int i;
while(count <= total){
for(i=left;i<=right;i++){
mat[top][i]=count;
count++;
}
top++;
for(i=top;i<=bottom;i++){
mat[i][right]=count;
count++;
}
right--;

for(i=right;i>=left;i--){
mat[bottom][i]=count; 
count++;
}
bottom--;

for( i=bottom;i>=top;i--){
mat[i][left]=count;
count++;
}
left++;
}
return mat;
    }

    }
    