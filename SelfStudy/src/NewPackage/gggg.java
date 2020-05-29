package NewPackage;
class gggg  
{  
public static String remove(String arr[], String x) 
{ 
    int n = arr.length; 
    for(int i = 0; i < n; i++) 
    { 
        if(arr[i] == "a") 
            return "a"; 
    } 
    return "a"; 
} 
  
public static void main(String args[]) 
{ 
    String arr[] = { "a","b","c","d" };  
    String b = "b"; 
      
    String result = remove(arr, b); 
    if(result == "a") 
        System.out.print("Element is not present in array"); 
    else
        System.out.print("Element is present at index " + result); 
} 
} 
