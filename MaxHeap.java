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
void insertKey(int x){
    if(heapSize==maxSize){
        System.out.println("Heap Overflow");
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
}