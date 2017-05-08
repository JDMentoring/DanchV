package ua.smartprog.lessons.lesson_11_p2;

class otherPackage {
    otherPackage(){
        ua.smartprog.lessons.lesson_11.Protection p = new ua.smartprog.lessons.lesson_11.Protection();
        System.out.println("Extends class");
        //System.out.println("n =" + p.n);
        //System.out.println("n_pri =" + p.n_pri);
        //System.out.println("n_pro =" + p.n_pro);
        System.out.println("n_pub =" + p.n_pub);
    }

}
