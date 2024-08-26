public class Rainwater {
  public static void main(String[] args) {
    int height[]={4,2,0,6,3,2,5};

    int leftmax[]=new int[height.length];
    int rightmax[]=new int[height.length];
    //left higher value
    leftmax[0]=height[0];

    for(int i=1;i<height.length;i++){
      leftmax[i]=Math.max(height[i], height[i-1]);
    }

    //right higher value.length
    rightmax[height.length-1]=height[height.length-1];

    for(int j=height.length-2;j>=0;j--){
      rightmax[j]=Math.max(height[j], height[j+1]);
    }

    int trappedWater=0;
    int waterlevel;
    for(int k=0;k<height.length;k++){
      waterlevel=Math.min(leftmax[k], rightmax[k]);

      trappedWater+=waterlevel-height[k];
    }
  System.out.println(trappedWater);


  }
  
}
