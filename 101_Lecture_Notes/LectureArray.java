/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        int [] arr = {5, 7, 8, 3, 2, 8, 4, 9};
        int i = 0;
        while(i<arr.length){
            System.out.print(arr[i] + " ");
            i = i + 2;
        }
	}
}