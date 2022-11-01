package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Class c1 = Class.forName("ch04.Person");

        Person person = (Person)c1.newInstance();
        person.setName("Lee");
        System.out.println(person.toString());

        Class c2 = person.getClass();
        Person p = (Person)c2.newInstance();
        System.out.println(p);


        Class[] parameterTypes = {String.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object[] initargs = {"Kim"};
        Person KimPerson = (Person)cons.newInstance(initargs);
        System.out.println(KimPerson);
        //= Person kim2 = new Person("Kim", 10);
        // local에 Person이라는 class가 없을 때 사용한다!


    }

}
