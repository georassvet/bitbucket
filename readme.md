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
       Constructor<br>
       <p>
           IntegerCollection collection = new IntegerCollection();
       </p>
   </li>
    <li>
        void add(Integer value)
        <p>
            collection.add(10);
        </p>
        <dl>
            <dt>Parameters:</dt>
            <dd>value</dd>
            <dt>Throws:</dt>
            <dd>ClassCastException - if the type of the specified element is null</dd>
        </dl>
    </li>
    <li>
        void remove(Integer integer)
        <p>
            collection.remove(10);
        </p>
        <p>
            collection.add(10);
        </p>
        <dl>
            <dt>Parameters:</dt>
            <dd>value</dd>
            <dt>Throws:</dt>
            <dd>NoSuchElementException - if the not found in the collection</dd>
        </dl>
    </li>
    <li>
        Удаление элементов(по значению)
        <p>
            collection.maxValue()
        </p>
    </li>
    <li>
        Удаление элементов(по значению)
        <p>
            collection.remove(10)
        </p>
    </li>
    <li>
        Удаление элементов(по значению)
        <p>
            collection.remove(10)
        </p>
    </li>
    <li>
        Удаление элементов(по значению)
        <p>
            collection.remove(10)
        </p>
    </li>

</ol>