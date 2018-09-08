# Module 1.2 Exercise 1

## Задание
<p>
Необходимо реализовать коллекцию целых чисел, которая позволяет выполнять операции:
<ul>
    <li>добавления</li>
    <li>удаления</li>
    <li>поиска элемента по значению</li>
    <li>поиска элемента по индексу</li>
    <li>поиска максимального элемента</li>
    <li>поиска минимального элемента</li>
    <li>поиска среднего арифметического всех элементов</li>
</ul>

При этом:
<ul>
    <li>при добавлении нового элемента все элементы увеличивают своё значение на добавляемый элемент</li>
    <li>при удалении - уменьшают своё значение на удаляемый элемент</li>
    <li>недопустим ввод в коллекцию null, символов и других значений, кроме целых чисел</li>
    <li>Результатом работы должен быть отдельный репозиторий github/bitbucket с README файлом,</br> который описывает задание, сам класс и содержит инструкции по запуску приложения.</li>
</ul>
    </p>

### Description
<ol>
   <li>
       <strong>Constructor</strong>
       <code>
           IntegerCollection collection = new IntegerCollection();
       </code>
   </li>
    <li>
        <p>
            <strong>void add(Integer value)</strong>
        </p>
        <code>
            collection.add(10);
        </code>
        <dl>
            <dt>Parameters:</dt>
            <dd>value</dd>
            <dt>Throws:</dt>
            <dd>ClassCastException - if the type of the specified element is null</dd>
        </dl>
    </li>
    <li>
        <p>
        <strong>void remove(Integer integer)</strong>
        </p>
        <code>
            collection.remove(10);
        </code>
        <dl>
            <dt>Parameters:</dt>
            <dd>integer</dd>
            <dt>Throws:</dt>
            <dd>NoSuchElementException - if the element not found in the collection</dd>
        </dl>
    </li>
    <li>
        <p>
        <strong>Integer searchByIndex(int index)</strong>
        </p>
            <code>
            Integer result = collection.searchByIndex(0);
        </code>
        <dl>
            <dt>Parameters:</dt>
            <dd>index</dd>
            <dt>Throws:</dt>
            <dd>NoSuchElementException - if the element not found in the collection</dd>
        </dl>
    </li>
    <li>
        <p>
        <strong>Integer searchByValue(Integer value)</strong>
        </p>
            <code>
            collection.searchByValue(10)
        </code>
        <dl>
            <dt>Parameters:</dt>
            <dd>value</dd>
            <dt>Throws:</dt>
            <dd>NoSuchElementException - if the element not found in the collection</dd>
        </dl>
    </li>
    <li>
        <p>
        <strong>int maxValue()</strong>
        </p>
            <code>
            int maxValue = collection.maxValue()
        </code>
    </li>
    <li>
        <p>
            <strong>int minValue()</strong>
        </p>
            <code>
            int minValue = collection.minValue()
        </code>
    </li>
    <li>
        <p>
            <strong>int getAvg()</strong>
        </p>
            <code>
            int avg = collection.getAvg()
        </code>
    </li>
</ol>