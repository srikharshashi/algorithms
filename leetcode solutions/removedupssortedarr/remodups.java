class remodups {
    public int removeDuplicates(int[] arr) {
        if(arr.length==1)
            return 1;
        
        if(arr.length==2)
        {
            if(arr[0]==arr[1])
                return 1;
            
            else 
                return 2;
            
        }
        
        int i=0;
        int j=1;
        for(int k=0;k<=arr.length-2;k++)
        {
            if(arr[i]==arr[j]){
                j++;
            }
            else{
                i++;
                arr[i]=arr[j];
                j++;
            }
        }
       return i+1;
    }
    
}