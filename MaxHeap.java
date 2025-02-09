import java.util.*;
public class MaxHeap {
    int a[];
    int maxSize,heapSize;

    public MaxHeap(int ms) {
    a=new int[ms];
    maxSize=ms;
    heapSize=0;
    }
int lchild(int i){
    return 2*i+1;
}
int rchild(int i){
    return 2*i+2;
}
int parent(int i){
    return (i-1)/2;
}
int getMax(){
    return a[0];
}
int curSize(){
    return heapSize;
}
void MaxHeapify(int i){
    int l=lchild(i), r=rchild(i), largest = i;
    if (l < heapSize && a[l] > a[i])
    largest = l;
    if (r < heapSize && a[r] > a[largest])
    largest = r;
    if(largest!=i){
        int temp = a[i];
        a[i] = a[largest];
        a[largest] = temp;
        MaxHeapify(largest);
    }
}
void removeMax(){
    if(heapSize==0)
        System.out.println("Heap is empty");
    if(heapSize==1)
        heapSize--;
    else{
        a[0]=a[heapSize-1];
        heapSize--;
        MaxHeapify(0);
    }
}
void insertKey(int x){
    if(heapSize==maxSize){
        System.out.println("Heap Overflow");
        return;
    }
    int i=heapSize;
    a[i]=x;
    heapSize++;
    while(i!=0&&a[parent(i)]<a[i]){
        int temp=a[i];
        a[i]=a[parent(i)];
        a[parent(i)]=temp;
        i=parent(i);
    }
}
public static void main(String[] args) {
    MaxHeap h = new MaxHeap(15);
    int elements[]={3,10,12,8,2,14};
    for(int e:elements)
        h.insertKey(e);
    System.out.println("The Current Size of the heap is : "+h.curSize());
    System.out.println("The Current maximum element is : "+h.getMax());
    h.removeMax();
    System.out.println("The Current Size of the heap is : "+h.curSize());
    h.insertKey(15);
    h.insertKey(5);
    System.out.println("The Current Size of the heap is : "+h.curSize());
    System.out.println("The Current maximum element is : "+h.getMax());
}
}


