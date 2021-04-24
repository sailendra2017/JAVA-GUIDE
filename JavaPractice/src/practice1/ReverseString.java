package practice1;

//Class of ReverseString
class ReverseString {
 public static void main(String[] args)
 {
     String input = "I am good boy";
     String[] input_arr = input.split(" ");
     
     int n = input_arr.length;
     String[] reverse_arr = new String[n]; 
     int j = n; 
     for (int i = 0; i < n; i++) { 
     	reverse_arr[j - 1] = input_arr[i]; 
         j = j - 1; 
     } 
     
     
     StringBuffer sb = new StringBuffer();
     for(int i = 0; i < reverse_arr.length; i++) {
        sb.append(reverse_arr[i]+" ");
     }
     String str = sb.toString();
     System.out.println(str);
 }
}
