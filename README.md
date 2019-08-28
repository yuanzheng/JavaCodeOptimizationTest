# Code 性能测试

## 集合性能测试
从集合头部位置新增元素<br>
从集合中间位置新增元素<br>
从集合尾部位置新增元素<br>

测试结果 (花费时间)：

ArrayList > LinkedList<br>
ArrayList < LinkedList<br>
ArrayList ≈ LinkedList<br>

当ArrayList 初始化容量足够，排除动态扩容数组容量的情况下进行的测试，如果有动态扩容的情况，ArrayList 的效率也会降低。

-------------------------

从集合头部位置删除元素<br>
从集合中间位置删除元素<br>
从集合尾部位置删除元素<br>

测试结果 (花费时间)：

ArrayList > LinkedList<br>
ArrayList < LinkedList<br>
ArrayList ≈ LinkedList<br>

--------------------------

for(;;) 循环<br>
迭代器迭代循环

测试结果 (花费时间)：

ArrayList < LinkedList<br>
ArrayList ≈ LinkedList<br>

我们可以看到，LinkedList 的 for 循环性能是最差的，而 ArrayList 的 for 循环性能是最好的。

这是因为 LinkedList 基于链表实现的，在使用 for 循环的时候，每一次 for 循环都会去遍历半个 List，所以严重影响了遍历的效率；
```
List.get(i) => node(index).item :

Node<E> node(int index) {
    // assert isElementIndex(index);

    if (index < (size >> 1)) {
        Node<E> x = first;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x;
    } else {
        Node<E> x = last;
        for (int i = size - 1; i > index; i--)
            x = x.prev;
        return x;
    }
}

```
ArrayList 则是基于数组实现的，并且实现了 RandomAccess 接口标志，意味着 ArrayList 可以实现快速随机访问，所以 for 循环效率非常高。

LinkedList 的迭代循环遍历和 ArrayList 的迭代循环遍历性能相当，也不会太差

结果：<br>
ArrayList for(;;)循环花费的时间1<br>
LinkedList for(;;)循环花费的时间15854<br>
ArrayList 迭代器迭代循环花费的时间2<br>
LinkedList 迭代器迭代循环花费的时间3

