
package ru.geekbrainns.home_work_6;

class Cat extends Animal{
   Cat (int maxRunLength) {
       super (maxRunLength, 0);
//       this.type = "Cat";
    }


     @Override
     public void swim (int length) {
        System.out.println("cat can't swim");
    }



//    @Override
//    public int run() {
//        return "ran";
//    }
//
//    @Override
//     public int swim () {
//        return "cat can't swim";
//    }

}