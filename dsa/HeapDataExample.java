package dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HeapDataExample {

    public static void main(String[] args) {

        MyHeap minHeap = new MyHeap();
        minHeap.push(5);
        minHeap.push(4);
        minHeap.push(3);
        minHeap.push(2);
        minHeap.push(1);

        System.out.println(minHeap.pop());
        System.out.println(minHeap.pop());
        System.out.println(minHeap.pop());
        System.out.println(minHeap.pop());
        System.out.println(minHeap.pop());

    }
}

class MyHeap{

    List<Integer> nums = new ArrayList<>();

    void push(int num){
        // add element to last
        nums.add(num);

        //check if the root node is smaller/greater
        int pIndex = (nums.size()+1)/2;
        int cIndex = nums.size();
        while ( pIndex-1 >=0 ){
            if(nums.get(pIndex-1) > nums.get(cIndex-1)){
                Collections.swap(nums, pIndex-1, cIndex-1);
                cIndex = pIndex;
                pIndex= pIndex / 2;
            }
            else{
                break;
            }
        }
    }

    int pop(){

        int itemPop = nums.get(0);
        Collections.swap(nums, 0, nums.size()-1);
        nums.remove(nums.size()-1);

        //now heapify
        int cindex = 0;
        while (cindex< nums.size()){
            int left = cindex*2 +1;
            int right = cindex*2 + 2;
            
        }

        return itemPop;
    }
}
