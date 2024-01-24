//Allocating the books to n number of students and the pages sum should be minimum

// binary search question diminishing the search space by taking the min zero and max the summ of all book pages
// then applying the binary search by cutting half the search space if there is a possible solution
// then shift end left if not shift start right

public class BookAllocationProblem {
    public static void main(String[] args){
     
    int[] books ={10,20,30,40};
    int students =2;
    System.out.println(distribute(books,students));
    }

    
    public static int distribute(int[] books,int student){
      int start =0;
      int end =0;
      for(int i=0;i<books.length;i++){
          end+=books[i];
      } 
      
      int mid;
      int answer= -1;
    
      while(start<end){
          mid=(start+end)/2;
          if(isPossible(books,student,mid)){
              answer=mid;
              end=mid-1;
          }
          else{
              start=mid+1;
          }



      }
      return answer;

    }
    public static boolean isPossible(int[] arr,int student,int mid){
      int count=0;
      int pageSum=0;
      for(int i=0;i<arr.length;i++){
          if(pageSum+arr[i]<mid){
              pageSum+=arr[i];
          }
          else{
              count++;
              if(count>=student || arr[i]>mid){
              return false;
              }
              pageSum=arr[i];
          }
      }
      return true;
     
    }
}

