package reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.*;

public class ReflectionTests {

    @Test
    void classReflection() throws ClassNotFoundException {
        Class student = Class.forName("reflection.Student");
        Constructor[] declaredConstructors = student.getDeclaredConstructors();
        Constructor[] constructors = student.getConstructors();
        Field[] declaredFields = student.getDeclaredFields();
        Field[] fields = student.getFields();
        Method[] declaredMethods = student.getDeclaredMethods();
        Method[] methods = student.getMethods();

        for(Constructor dc : declaredConstructors) {
            System.out.println("Declared Constructor " + dc.getName());
        }
        for (Constructor c : constructors) {
            System.out.println("Constructor " + c.getName());
        }
        for (Field df : declaredFields) {
            System.out.println("Declared Field " + df.getName());
        }
        for (Field f : fields) {
            System.out.println("Field " + f.getName());
        }
        for (Method dm : declaredMethods) {
            System.out.println("Declared Method " + dm.getName());
        }
        for (Method m : methods) {
            System.out.println("Method " + m.getName());
        }
    }

    @Test
    void classModifiers() {
        Student student = new Student("Gennady", "Chursov");
        Class clazz = student.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            int modifiers = field.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                System.out.print("public ");
            }
            if (Modifier.isProtected(modifiers)) {
                System.out.print("protected ");
            }
            if (Modifier.isPrivate(modifiers)) {
                System.out.print("private ");
            }
            if (Modifier.isStatic(modifiers)) {
                System.out.print("static ");
            }
            if (Modifier.isFinal(modifiers)) {
                System.out.print("final ");
            }

            System.out.print(field.getType() + " ");
            System.out.println(field.getName());
        }
    }

    @Test
    void getFieldValue() throws IllegalAccessException {
        Student student = new Student("Gennady", "Chursov");
        Class clazz = student.getClass();
        Field[] fields = clazz.getDeclaredFields();

//        for (Field field : fields) {
//            System.out.println(field.getName() + " " + field.get(student));
//        }
        //class reflection.ReflectionTests cannot access a member of class reflection.Student with modifiers "private"

        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName() + " " + field.get(student));
        }
    }

    @Test
    void setFieldValue() throws IllegalAccessException {
        Student student = new Student("Gennady", "Chursov");
        Class clazz = student.getClass();
        Field[] fields = clazz.getDeclaredFields();

//        for (Field field : fields) {
//            field.setAccessible(true);
//            field.set(student, field.get(student));
//            System.out.println(field.getName() + " " + field.get(student));
//        }
        //Can not set static final int field reflection.Student.maxNumberOfStudent to java.lang.Integer

        for (Field field : fields) {
            field.setAccessible(true);
            if (!Modifier.isFinal(field.getModifiers())) {
                if (field.getType() == int.class) {
                    field.set(student, (int) field.get(student) + 1);
                } else {
                    field.set(student, field.get(student) + " new");
                }
            }
            System.out.println(field.getName() + " " + field.get(student));
        }
    }

    @Test
    void invokeMethods() throws InvocationTargetException, IllegalAccessException {
        Student student = new Student("Gennady", "Chursov");
        Class clazz = student.getClass();

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            //System.out.println(method.invoke(student));//java.lang.IllegalArgumentException: wrong number of argument
            System.out.println(method.invoke(student, "123"));
        }
    }

    @Test
    void createInstance() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Student student = new Student("Gennady", "Chursov");
        Class clazz = student.getClass();
        Constructor[] constructors = clazz.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            Class[] params = constructor.getParameterTypes();
            System.out.println("Constructor:");
            if (params.length == 0) {
                System.out.println("No params");
                continue;
            }

            for (Class param : params) {
                System.out.println(param);
            }

            System.out.println("//////////////////");
        }

        Constructor constructor = clazz.getDeclaredConstructor(String.class, String.class);
        Object instance = constructor.newInstance("name", "surname");
        System.out.println(instance.getClass().getField("firstName").get(instance));
        System.out.println(instance.getClass().getField("lastName").get(instance));
    }
}
