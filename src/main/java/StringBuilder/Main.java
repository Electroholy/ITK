package StringBuilder;

public class Main {
    public static void main(String[] args) {
        AltStringBuilder sb = new AltStringBuilder();

        sb.append("Dog");
        System.out.println(sb);

        sb.append(" Cat");
        System.out.println(sb);

        sb.append(" Owl");
        System.out.println(sb);

        sb.append(" Lion");
        System.out.println(sb);

        sb.undo();
        System.out.println(sb);

        sb.undo();
        System.out.println(sb);

        sb.undo();
        System.out.println(sb);
    }
}
