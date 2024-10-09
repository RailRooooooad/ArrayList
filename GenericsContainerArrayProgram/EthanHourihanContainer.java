/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenericsContainerArrayProgram;

/**
 * 
 * 
 * 
 * 
 */

public class EthanHourihanContainer<T>
{
    private T[] items;
    private int count=0;
    
    public EthanHourihanContainer(int index)
    {
        items = (T[]) new Object[index];
    }
    
    
    public void add(T item)
    {
        items[count++] = item;
    }
    
    
    public T get(int index)
    {
        return items[index];
    }
            
}
