public class Main {
    public static void main(String[] args) {
       TwoStacks twoStacks = new TwoStacks(6);
       twoStacks.push1(1);
       twoStacks.push1(2);
       twoStacks.push1(3);
       twoStacks.push1(4);
       twoStacks.push1(5);
       twoStacks.push1(6);
        System.out.println(twoStacks.pop1());
        System.out.println(twoStacks.pop2());

    }

}