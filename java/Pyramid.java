// Source code is decompiled from a .class file using FernFlower decompiler.
public class Pyramid {
   public Pyramid() {
   }

   public static void main(String[] var0) {
      byte var1 = 5;

      for(int var2 = 1; var2 <= var1; ++var2) {
         int var3;
         for(var3 = 1; var3 <= var1 - var2; ++var3) {
            System.out.print(" ");
         }

         for(var3 = 1; var3 <= var2; ++var3) {
            System.out.print("" + var2 + " ");
         }

         System.out.println();
      }

   }
}
