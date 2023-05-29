public final class PersonKt {
   public static final void main() {
      final Ref.IntRef x = new Ref.IntRef();
      x.element = 1;

      @Metadata(
         mv = {1, 7, 1},
         k = 1,
         d1 = {"\u0000\u0013\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"},
         d2 = {"PersonKt$main$Counter", "", "(Lkotlin/jvm/internal/Ref$IntRef;)V", "increment", "", "untitled1.main"}
      )
      final class Counter {
         public final void increment() {
            int var10001 = x.element++;
         }

         public Counter() {
         }
      }

      (new Counter()).increment();
      int var1 = x.element;
      System.out.println(var1);
   }
}
