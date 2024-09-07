public class SecondLargest {
  //second largest without using sorting ?

  //Brute force approach- sorting it and acces the second largets num
  int arr[]={1,45,78,98,33,42,1,0};
  int largest=arr[0];
  int secondlarge=-1;

  for(int i=0;i<arr.length;i++){
    if(largest<arr[i]){
      largest=arr[i];
    }
  }
  
  System.out.println(largest);
 
  for(int j=0;j<arr.length;j++){
    if(arr[j]>secondlarge && largest!=arr[j]){
      secondlarge=arr[j];
    }
  }
  System.out.println(secondlarge);

}
